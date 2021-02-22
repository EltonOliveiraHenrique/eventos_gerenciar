package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGerenciamento {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGerenciamento window = new TelaGerenciamento();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaGerenciamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.setBounds(100, 100, 883, 457);
		frmMenu.getContentPane().setLayout(null);
		frmMenu.setLocationRelativeTo(null);
		frmMenu.setResizable(false);

		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 545, 408);
		frmMenu.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Menu de\n");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 40));
		lblNewLabel_2.setBounds(26, 30, 495, 87);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gerenciamento");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Consolas", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(26, 70, 495, 67);
		panel.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Salas");
		btnNewButton_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(10, 217, 244, 38);
		panel.add(btnNewButton_1);
		
		JButton btnSalasDescanso_1 = new JButton("Salas Descanso");
		btnSalasDescanso_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnSalasDescanso_1.setBounds(10, 280, 244, 38);
		panel.add(btnSalasDescanso_1);
		
		JButton btnPessoas_1 = new JButton("Pessoas");
		btnPessoas_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnPessoas_1.setBounds(10, 342, 244, 38);
		panel.add(btnPessoas_1);
		
		JButton btnNewButton_2 = new JButton("Salas");
		btnNewButton_2.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(298, 217, 237, 38);
		panel.add(btnNewButton_2);
		
		JButton btnSalasDescanso_2 = new JButton("Salas Descanso");
		btnSalasDescanso_2.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnSalasDescanso_2.setBounds(298, 280, 237, 38);
		panel.add(btnSalasDescanso_2);
		
		JButton btnPessoas_2 = new JButton("Pessoas");
		btnPessoas_2.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnPessoas_2.setBounds(298, 342, 237, 38);
		panel.add(btnPessoas_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Visualizar");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_1.setBounds(10, 128, 244, 87);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Excluir");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_1_1.setBounds(298, 128, 237, 87);
		panel.add(lblNewLabel_2_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(565, 11, 304, 408);
		frmMenu.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu de\n");
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 28, 273, 87);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Salas");
		btnNewButton.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(21, 217, 273, 38);
		panel_1.add(btnNewButton);
		
		JButton btnSalasDescanso = new JButton("Salas Descanso");
		btnSalasDescanso.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnSalasDescanso.setBounds(21, 280, 273, 38);
		panel_1.add(btnSalasDescanso);
		
		JButton btnPessoas = new JButton("Pessoas");
		btnPessoas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCadastroPessoa pessoaTela = new TelaCadastroPessoa();
				pessoaTela.frmCadastroDePessoas.show();
				
			}
		});
		btnPessoas.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 20));
		btnPessoas.setBounds(21, 342, 273, 38);
		panel_1.add(btnPessoas);
		
		JLabel lblNewLabel_1 = new JLabel("Cadastros");
		lblNewLabel_1.setFont(new Font("Consolas", Font.BOLD, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(21, 72, 273, 67);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Cadastrar");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Castellar", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2_1_1_1.setBounds(21, 130, 273, 76);
		panel_1.add(lblNewLabel_2_1_1_1);
		
	}
}
