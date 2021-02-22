package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class TelaCadastroDescanso {

	private JFrame frmCadastroDeSala;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroDescanso window = new TelaCadastroDescanso();
					window.frmCadastroDeSala.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroDescanso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeSala = new JFrame();
		frmCadastroDeSala.setTitle("Cadastro de Sala de Descanso");
		frmCadastroDeSala.setBounds(100, 100, 745, 403);
		frmCadastroDeSala.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeSala.setLocationRelativeTo(null);
		frmCadastroDeSala.setResizable(false);
		
		JPanel panel = new JPanel();
		frmCadastroDeSala.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cadastro de salas de Descanso");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(36, 11, 664, 54);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome Sala Descanso:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(36, 96, 330, 54);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Capacidade da Sala:");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(36, 180, 330, 54);
		panel.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		textField.setColumns(10);
		textField.setBounds(320, 99, 380, 40);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		textField_1.setColumns(10);
		textField_1.setBounds(320, 188, 380, 40);
		panel.add(textField_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(195, 269, 350, 48);
		panel.add(btnNewButton);
	}

}
