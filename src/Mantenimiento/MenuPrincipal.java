package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import Clases.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmNew;
	private JMenuItem mntmAbrir;
	private JMenuItem mntmCerrar;
	private JMenu mnMantenimiento;
	private JMenuItem mntmUsuario;
	private JMenuItem mntmArea;
	private JMenuItem mntmIncidencia;
	private JMenuItem mntmDocumento;
	private JMenuItem mntmEspecialista;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercaDe;
	private JMenu mnIncidencia;
	private JMenu mnReporte;
	private JMenuItem mntmIngreso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
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
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 507);
		
		setExtendedState(this.MAXIMIZED_BOTH);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("Archivo");
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("Nuevo");
		mnFile.add(mntmNew);
		
		mntmAbrir = new JMenuItem("Abrir");
		mnFile.add(mntmAbrir);
		
		mntmCerrar = new JMenuItem("Cerrar");
		mnFile.add(mntmCerrar);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmUsuario = new JMenuItem("Usuario");
		mntmUsuario.addActionListener(this);
		mnMantenimiento.add(mntmUsuario);
		
		mntmArea = new JMenuItem("Area");
		mntmArea.addActionListener(this);
		mnMantenimiento.add(mntmArea);
		
		mntmIncidencia = new JMenuItem("Tipo de Incidencia");
		mnMantenimiento.add(mntmIncidencia);
		
		mntmDocumento = new JMenuItem("Tipo de Documento");
		mnMantenimiento.add(mntmDocumento);
		
		mntmEspecialista = new JMenuItem("Especialista");
		mnMantenimiento.add(mntmEspecialista);
		
		mnIncidencia = new JMenu("Incidencia");
		menuBar.add(mnIncidencia);
		
		mntmIngreso = new JMenuItem("Registrar");
		mnIncidencia.add(mntmIngreso);
		
		mnReporte = new JMenu("Reporte");
		menuBar.add(mnReporte);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercaDe = new JMenuItem("Acerca de Sistema");
		mnAyuda.add(mntmAcercaDe);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmArea) {
			do_mntmArea_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmUsuario) {
			do_mntmUsuario_actionPerformed(arg0);
		}
	}
	protected void do_mntmUsuario_actionPerformed(ActionEvent arg0) {
		Mantenimiento_Usuarios frm1=new Mantenimiento_Usuarios();
		frm1.setVisible(true);
	}
	protected void do_mntmArea_actionPerformed(ActionEvent arg0) {
		
	}
}
