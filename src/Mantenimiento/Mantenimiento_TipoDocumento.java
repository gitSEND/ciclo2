package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mantenimiento_TipoDocumento extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_TipoDocumento dialog = new Mantenimiento_TipoDocumento();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_TipoDocumento() {
		setTitle("Mantenimiento de Tipos de Documentos");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
	}

}
