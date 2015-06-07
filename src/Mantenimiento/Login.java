package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame implements ActionListener {

	
	int contador_fallos;
	
	private JPanel contentPane;
	private JLabel lblLoginDeUsuarios;
	private JLabel lblUsuario;
	private JLabel lblPassword;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnCerrar;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblLoginDeUsuarios = new JLabel("LOGIN DE USUARIOS");
		lblLoginDeUsuarios.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblLoginDeUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginDeUsuarios.setBounds(10, 11, 347, 28);
		contentPane.add(lblLoginDeUsuarios);

		lblUsuario = new JLabel("USUARIO :");
		lblUsuario.setBounds(86, 86, 83, 20);
		contentPane.add(lblUsuario);

		lblPassword = new JLabel("PASSWORD :");
		lblPassword.setBounds(86, 125, 83, 20);
		contentPane.add(lblPassword);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(179, 86, 99, 24);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(179, 123, 99, 24);
		contentPane.add(txtPassword);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(86, 177, 89, 23);
		contentPane.add(btnCerrar);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(189, 177, 89, 23);
		contentPane.add(btnAceptar);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAceptar) {
			do_btnAceptar_actionPerformed(arg0);
		}
	}

	protected void do_btnAceptar_actionPerformed(ActionEvent arg0) {

		String[] usuario = { "Nelson", "Alessndro" };
		String[] password = { "admin", "123" };

		int pos = 0;
		Boolean encontro = false;

		String usu = txtUsuario.getText();
		String pass = txtPassword.getText();

		while (pos < usuario.length) {
			if (usuario[pos].equalsIgnoreCase(usu)
					&& password[pos].equals(pass)) {
				pos = usuario.length;
				encontro = true;
			}
			pos = pos + 1;
		}
		
		
		if(encontro==true){
			Carga c=new Carga();
			c.setVisible(true);
			this.dispose();
		}else{
			JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrecto");
			contador_fallos+=1;
		}

		
		if(contador_fallos==3){
			JOptionPane.showMessageDialog(null, "Se Cumplió los 3 Intentos, se cerrará el sistema...!!");
			this.dispose();
		}
	}
}
