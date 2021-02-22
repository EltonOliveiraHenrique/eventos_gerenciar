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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dialog.ModalExclusionType;

public class TelaCadastroPessoa {

	public JFrame frmCadastroDePessoas;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroPessoa window = new TelaCadastroPessoa();
					window.frmCadastroDePessoas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroPessoa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDePessoas = new JFrame();
		frmCadastroDePessoas.setTitle("Cadastro de pessoas");
		frmCadastroDePessoas.setBounds(100, 100, 745, 363);
		frmCadastroDePessoas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDePessoas.setLocationRelativeTo(null);
		frmCadastroDePessoas.setResizable(false);
		
		JPanel panel = new JPanel();
		frmCadastroDePessoas.getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblVisual = new JLabel("Digite logo abaixo o Nome e o Sobrenome");
		lblVisual.setBounds(21, 11, 700, 45);
		lblVisual.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 25));
		lblVisual.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(30, 88, 200, 45);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBounds(30, 167, 200, 45);
		lblSobrenome.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		
		textField = new JTextField();
		textField.setBounds(215, 88, 493, 45);
		textField.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(215, 167, 493, 45);
		textField_1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 23));
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(215, 235, 338, 45);
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 35));
		panel.setLayout(null);
		panel.add(lblVisual);
		panel.add(lblNewLabel);
		panel.add(lblSobrenome);
		panel.add(textField);
		panel.add(textField_1);
		panel.add(btnNewButton);
	}
}
