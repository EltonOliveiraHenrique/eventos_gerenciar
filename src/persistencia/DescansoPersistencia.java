package persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DescansoPersistencia {
	private int idDescanso,quantidadeDescanso;
	private String nomeDescanso,salaDescanso;
	
	public void criarDescanso(Connection conn) {
		String criarSQL = "INSERT INTO descanso (nome_descanso,sala_descanso,quantidade_descanso) VALUES (?,?,?)";
		PreparedStatement stm = null;
		try {
			stm = (PreparedStatement) conn.prepareStatement(criarSQL);
			stm.setString(1, getNomeDescanso());
			stm.setString(2, getSalaDescanso());
			stm.setString(3, Integer.toString(getQuantidadeDescanso()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void buscarDescanso(Connection conn) {

		String buscarSql = "SELECT id_descanso,sala_descanso,quantidade_descanso" + "FROM descanso WHERE nome_descanso = ?";
		PreparedStatement stm = null;
		ResultSet rs = null;

		try {
			stm = (PreparedStatement) conn.prepareStatement(buscarSql);
			stm.setString(1, getNomeDescanso());

			rs = stm.executeQuery();

			if (rs.next()) {
				this.setIdDescanso(Integer.parseInt(rs.getString(1)));
				this.setSalaDescanso(rs.getString(2));
				this.setQuantidadeDescanso(Integer.parseInt(rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void excluirEvento(Connection conn) {

		String excluirSql = "DELETE FROM descanso WHERE eventos.nome_descanso = ?";
		PreparedStatement stm = null;

		try {

			stm = (PreparedStatement) conn.prepareStatement(excluirSql);
			stm.setString(1, getNomeDescanso());
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
	
	public int getIdDescanso() {
		return idDescanso;
	}
	public void setIdDescanso(int idDescanso) {
		this.idDescanso = idDescanso;
	}
	public int getQuantidadeDescanso() {
		return quantidadeDescanso;
	}
	public void setQuantidadeDescanso(int quantidadeDescanso) {
		this.quantidadeDescanso = quantidadeDescanso;
	}
	public String getNomeDescanso() {
		return nomeDescanso;
	}
	public void setNomeDescanso(String nomeDescanso) {
		this.nomeDescanso = nomeDescanso;
	}
	public String getSalaDescanso() {
		return salaDescanso;
	}
	public void setSalaDescanso(String salaDescanso) {
		this.salaDescanso = salaDescanso;
	}
}
