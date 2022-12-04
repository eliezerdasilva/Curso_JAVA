package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class telaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lnbNome = new JLabel("Nome :");
		lnbNome.setEnabled(false);
		lnbNome.setBounds(30, 36, 46, 14);
		contentPane.add(lnbNome);
		
		JCheckBox chb_MaiorIdade = new JCheckBox("Maior de idade. ");
		chb_MaiorIdade.setBounds(30, 73, 134, 23);
		contentPane.add(chb_MaiorIdade);

		JLabel lblNewLabel = new JLabel("Sexo :");
		lblNewLabel.setBounds(30, 103, 38, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnM = new JRadioButton("Masculino");
		rdbtnM.setBounds(61, 99, 103, 23);
		contentPane.add(rdbtnM);
		
		JRadioButton rdbtnF = new JRadioButton("Feminino");
		rdbtnF.setBounds(159, 99, 109, 23);
		contentPane.add(rdbtnF);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Idade;
				if(chb_MaiorIdade.isSelected()){
					Idade = "Voçê é maior de idade";
				}else {
					Idade = "Voçê é menor de idade";
				}
				String sexo;
				if(rdbtnM.isSelected()) {
					sexo = "Masculino";
				}else if(rdbtnF.isSelected()) {
					sexo = "Feminino";
				}else {
					sexo = "Não informado";
				}
				
				
				JOptionPane.showMessageDialog(rootPane, "Seu nome é: "+ txtNome.getText()+" é "+Idade +" Sexo: "+ sexo, " Alerta ",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnEnviar.setBounds(36, 183, 89, 23);
		contentPane.add(btnEnviar);
		
		txtNome = new JTextField();
		txtNome.setBounds(86, 33, 149, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		
	
		
	
	}
	
}
