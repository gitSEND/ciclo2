package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mantenimiento_TipoIncidencias extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_TipoIncidencias dialog = new Mantenimiento_TipoIncidencias();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_TipoIncidencias() {
		setTitle("Mantenimiento de Tipos de Incidencias");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
	}

}
