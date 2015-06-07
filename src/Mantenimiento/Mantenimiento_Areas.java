package Mantenimiento;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Mantenimiento_Areas extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Mantenimiento_Areas dialog = new Mantenimiento_Areas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Mantenimiento_Areas() {
		setTitle("Mantenimiento de Areas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
	}

}
