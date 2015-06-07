package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;


public class Carga extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;

	
	
	Timer timer;
	int cont=0;
	private JLabel lblCarga;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carga frame = new Carga();
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
	
	public Carga() {
		
		cargar();timer.start();setLocationRelativeTo(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(SystemColor.text);
		progressBar.setBounds(10, 11, 477, 30);
		contentPane.add(progressBar);
		
		lblCarga = new JLabel("New label");
		lblCarga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCarga.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarga.setBounds(20, 36, 477, 25);
		contentPane.add(lblCarga);
	}
	
	public void cargar(){

		timer=new Timer(60, new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				cont+=1;
				progressBar.setValue(cont);
				lblCarga.setText("Se está cargando al "+cont+" %");
				
				if(cont==100){
					timer.stop();
					JOptionPane.showMessageDialog(null, "Bienvenido al Sistema");
					cerrar();
					MenuPrincipal men=new MenuPrincipal();
					men.setVisible(true);
					
				}
			}

		});
	}
	
	public void cerrar(){
		this.setVisible(false);
	}
	
	
}
