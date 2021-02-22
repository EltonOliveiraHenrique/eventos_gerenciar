package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroSalas {

	private JFrame frmCadastroDeSalas;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroSalas window = new TelaCadastroSalas();
					window.frmCadastroDeSalas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroSalas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeSalas = new JFrame();
		frmCadastroDeSalas.setTitle("Cadastro de Salas");
		frmCadastroDeSalas.setBounds(100, 100, 745, 403);
		frmCadastroDeSalas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeSalas.setLocationRelativeTo(null);
		frmCadastroDeSalas.setResizable(false);
		
		JPanel panel = new JPanel();
		frmCadastroDeSalas.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de salas");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(33, 11, 664, 54);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Sala");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(33, 112, 330, 54);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Capacidade da Sala");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(33, 197, 330, 54);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		textField.setBounds(317, 112, 380, 40);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		textField_1.setColumns(10);
		textField_1.setBounds(317, 197, 380, 40);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(190, 283, 350, 48);
		panel.add(btnNewButton);
	}

}
