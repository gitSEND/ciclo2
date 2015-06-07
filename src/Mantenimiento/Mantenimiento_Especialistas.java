package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mantenimiento_Especialistas extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_Especialistas dialog = new Mantenimiento_Especialistas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_Especialistas() {
		setTitle("Mantenimiento de Especialistas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
	}

}
