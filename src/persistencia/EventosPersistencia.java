package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class EventosPersistencia {

	private String nomeEvento;
	private int quantidadeSalas, IdEventos;

	public void criarEvento(Connection conn) {
		String criarSQL = "INSERT INTO eventos (nome_evento,Qsalas_evento) VALUES (?,?)";
		PreparedStatement stm = null;
		try {
			stm = (PreparedStatement) conn.prepareStatement(criarSQL);
			stm.setString(1, getNomeEvento());
			stm.setString(2, Integer.toString(getQuantidadeSalas()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void buscarEventos(Connection conn) {

		String buscarSql = "SELECT id_evento,Qsalas_evento" + "FROM eventos WHERE nome_evento = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, getNomeEvento());

			rs = stm.executeQuery();

			if (rs.next()) {
				this.setIdEventos(Integer.parseInt(rs.getString(1)));
				this.setQuantidadeSalas(Integer.parseInt(rs.getString(2)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluirEvento(Connection conn) {

		String excluirSql = "DELETE FROM eventos WHERE eventos.nome_evento = ?";
		PreparedStatement stm = null;

		try {

			stm = (PreparedStatement) conn.prepareStatement(excluirSql);
			stm.setString(1, getNomeEvento());
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

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

	public int getQuantidadeSalas() {
		return quantidadeSalas;
	}

	public void setQuantidadeSalas(int quantidadeSalas) {
		this.quantidadeSalas = quantidadeSalas;
	}

	public int getIdEventos() {
		return IdEventos;
	}

	public void setIdEventos(int IdEventos) {
		this.IdEventos = IdEventos;
	}
}
