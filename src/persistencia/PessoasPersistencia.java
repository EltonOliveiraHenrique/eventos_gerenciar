package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PessoasPersistencia {
	private String nomePessoa,SobrenomePessoa,SalaPessoa,descansoPessoa;
	private int idPessoa,etapa;
	
	public void criarPessoa(Connection conn) {
		String criarSQL = "INSERT INTO pessoas (nome_pessoa,sobrenome_pessoa,sala_pessoa,descanso_pessoa,etapa_pessoa) VALUES (?,?,?,?,?)";
		PreparedStatement stm = null;
		try {
			stm = (PreparedStatement) conn.prepareStatement(criarSQL);
			stm.setString(1, getNomePessoa());
			stm.setString(2, getSobrenomePessoa());
			stm.setString(3, getSalaPessoa());
			stm.setString(4, getDescansoPessoa());
			stm.setString(5, Integer.toString(getEtapa()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void buscarPessoasNome(Connection conn) {

		String buscarSql = "SELECT id_pessoa,sala_pessoa,descanso_pessoa,etapa_pessoa" + "FROM pessoas WHERE nome_pessoa = ? and sobrenome_pessoa = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, getNomePessoa());
			stm.setString(2, getSobrenomePessoa());

			rs = stm.executeQuery();

			if (rs.next()) {
				this.setIdPessoa(Integer.parseInt(rs.getString(1)));	
				this.setSalaPessoa(rs.getString(2));
				this.setDescansoPessoa(rs.getString(3));
				this.setEtapa(Integer.parseInt(rs.getString(4)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void buscarPessoasEtapa(Connection conn) {

		String buscarSql = "SELECT id_pessoa,nome_pessoa,sobrenome_pessoa,sala_pessoa,descanso_pessoa" + "FROM pessoas WHERE etapa_pessoa = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, Integer.toString(getEtapa()));

			rs = stm.executeQuery();

			if (rs.next()) {
				this.setIdPessoa(Integer.parseInt(rs.getString(1)));
				this.setNomePessoa(rs.getString(2));
				this.setSobrenomePessoa(rs.getString(3));
				this.setSalaPessoa(rs.getString(4));
				this.setDescansoPessoa(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void excluirPessoaNome(Connection conn) {

		String excluirSql = "DELETE FROM pessoas WHERE pessoas.nome_pessoa = ? and pessoas.sobrenome_pessoa = ?";
		PreparedStatement stm = null;

		try {

			stm = (PreparedStatement) conn.prepareStatement(excluirSql);
			stm.setString(1, getNomePessoa());
			stm.setString(2, getSobrenomePessoa());
			stm.execute();
			stm.close();

		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println(e1.getStackTrace());
			}
		} finally {
			if (stm != null) {
				try {
					stm.close();
				} catch (SQLException e1) {
					System.out.println(e1.getStackTrace());
				}
			}
		}
	}

	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getSobrenomePessoa() {
		return SobrenomePessoa;
	}
	public void setSobrenomePessoa(String sobrenomePessoa) {
		SobrenomePessoa = sobrenomePessoa;
	}
	public String getSalaPessoa() {
		return SalaPessoa;
	}
	public void setSalaPessoa(String salaPessoa) {
		SalaPessoa = salaPessoa;
	}
	public String getDescansoPessoa() {
		return descansoPessoa;
	}
	public void setDescansoPessoa(String descansoPessoa) {
		this.descansoPessoa = descansoPessoa;
	}
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public int getEtapa() {
		return etapa;
	}
	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}
}

/*
	id_pessoa int auto_increment primary key,
    nome_pessoa varchar(50) not null,
    sobrenome_pessoa varchar(50) not null,
    sala_pessoa varchar(50) not null,
    descanso_pessoa varchar(50) not null
*/