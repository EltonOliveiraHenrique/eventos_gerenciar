package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

	private static final String URL_MYSQL = "jdbc:mysql://sala-gerenciar.mysql.uhserver.com?useSSL=false";

	private static final String USER = "sala_gerencia";

	private static final String PASS = "elton4312,";

	public static Connection getConnection() {
		System.out.println("Conectando ao Banco de Dados");
		try {
			System.out.println("conectado");
			return DriverManager.getConnection(URL_MYSQL, USER, PASS);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Não conectou");
		}
		return null;
	}
}