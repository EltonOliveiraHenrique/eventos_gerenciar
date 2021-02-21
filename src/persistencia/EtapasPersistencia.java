package persistencia;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class EtapasPersistencia {
	private int numeroEtapa;
	private String nomePessoa,nomeSala,nomeDescanso;
	private ArrayList<String> nomesPessoasEtapa = new ArrayList();
	private ArrayList<String> nomesSalas = new ArrayList();
	private ArrayList<String> nomesDescanso = new ArrayList();
	
	public void criarEtapa(Connection conn) {
		String criarSQL = "INSERT INTO etapas (numero_etapa,pessoa_etapa,sala_etapa,descanso_etapa) VALUES (?,?,?,?)";
		PreparedStatement stm = null;
		try {
			stm = (PreparedStatement) conn.prepareStatement(criarSQL);
			stm.setString(1, Integer.toString(getNumeroEtapa()));
			stm.setString(2, getNomePessoa());
			stm.setString(3, getNomeSala());
			stm.setString(4, getNomeDescanso());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void BuscarPessoaEtapa(Connection conn) {

		String buscarSql = "SELECT pessoa_etapa,sala_etapa,descanso_etapa" + "FROM salas WHERE numero_etapa = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, getNomeSala());

			rs = stm.executeQuery();

			if (rs.next()) {
				this.nomesPessoasEtapa.add(rs.getString(1));
				this.nomesSalas.add(rs.getString(2));
				this.nomesDescanso.add(rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> getNomesPessoasEtapa() {
		return nomesPessoasEtapa;
	}
	public void setNomesPessoasEtapa(ArrayList<String> nomesPessoasEtapa) {
		this.nomesPessoasEtapa = nomesPessoasEtapa;
	}
	public ArrayList<String> getNomesSalas() {
		return nomesSalas;
	}
	public void setNomesSalas(ArrayList<String> nomesSalas) {
		this.nomesSalas = nomesSalas;
	}
	public ArrayList<String> getNomesDescanso() {
		return nomesDescanso;
	}
	public void setNomesDescanso(ArrayList<String> nomesDescanso) {
		this.nomesDescanso = nomesDescanso;
	}
	public int getNumeroEtapa() {
		return numeroEtapa;
	}
	public void setNumeroEtapa(int numeroEtapa) {
		this.numeroEtapa = numeroEtapa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	public String getNomeDescanso() {
		return nomeDescanso;
	}
	public void setNomeDescanso(String nomeDescanso) {
		this.nomeDescanso = nomeDescanso;
	}
}
