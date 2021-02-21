package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class SalasPersistencia {
	private int idSala,lotacaoSala;
	private String nomeSala,eventoSala;
	
	public void criarSala(Connection conn) {
		String criarSQL = "INSERT INTO salas (nome_sala,evento_sala,lotacao_sala) VALUES (?,?,?)";
		PreparedStatement stm = null;
		try {
			stm = (PreparedStatement) conn.prepareStatement(criarSQL);
			stm.setString(1, getNomeSala());
			stm.setString(2, getEventoSala());
			stm.setString(3, Integer.toString(getLotacaoSala()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void buscarSalaNome(Connection conn) {

		String buscarSql = "SELECT id_sala,evento_sala,lotacao_sala" + "FROM salas WHERE nome_sala = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, getNomeSala());

			rs = stm.executeQuery();

			if (rs.next()) {
				this.setIdSala(Integer.parseInt(rs.getString(1)));
				this.setEventoSala(rs.getString(2));
				this.setLotacaoSala(Integer.parseInt(rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void buscarSalaEvento(Connection conn) {

		String buscarSql = "SELECT id_sala,nome_sala,lotacao_sala" + "FROM salas WHERE evento_sala = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, getEventoSala());

			rs = stm.executeQuery();

			if (rs.next()) {
				this.setIdSala(Integer.parseInt(rs.getString(1)));
				this.setNomeSala(rs.getString(2));
				this.setLotacaoSala(Integer.parseInt(rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void excluirSalaNome(Connection conn) {

		String excluirSql = "DELETE FROM salas WHERE salas.nome_sala = ?";
		PreparedStatement stm = null;

		try {

			stm = (PreparedStatement) conn.prepareStatement(excluirSql);
			stm.setString(1, getNomeSala());
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
	public void excluirSalaEvento(Connection conn) {

		String excluirSql = "DELETE FROM salas WHERE salas.evento_sala = ?";
		PreparedStatement stm = null;

		try {

			stm = (PreparedStatement) conn.prepareStatement(excluirSql);
			stm.setString(1, getEventoSala());
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
	
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public int getLotacaoSala() {
		return lotacaoSala;
	}
	public void setLotacaoSala(int lotacaoSala) {
		this.lotacaoSala = lotacaoSala;
	}
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	public String getEventoSala() {
		return eventoSala;
	}
	public void setEventoSala(String eventoSala) {
		this.eventoSala = eventoSala;
	}
}
