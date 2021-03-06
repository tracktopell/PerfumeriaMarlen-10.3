/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmarlen.caja.control;

import com.pmarlen.caja.view.DialogConfiguracionPassword;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Softtek
 */
public class DialogConfiguracionPasswordControl implements ActionListener {

	DialogConfiguracionPassword dialogConfiguracionPassword;
	private static DialogConfiguracionPasswordControl instance;
	public static final int UPDATE_FOR_ADMIN = 1;
	public static final int UPDATE_FOR_USER = 2;
	private int updateMode = 0;

	public static DialogConfiguracionPasswordControl getInstance(JFrame parent, int updateMode) {
		if (instance == null) {
			instance = new DialogConfiguracionPasswordControl(parent);
		}
		instance.updateMode = updateMode;

		return instance;
	}

	private DialogConfiguracionPasswordControl(JFrame parent) {
		this.dialogConfiguracionPassword = new DialogConfiguracionPassword(parent);

		this.dialogConfiguracionPassword.getAceptar().addActionListener(this);
		this.dialogConfiguracionPassword.getCancelar().addActionListener(this);
	}

	public void estadoInicial() {
		if (updateMode == UPDATE_FOR_ADMIN) {
			dialogConfiguracionPassword.setTitle("Cambiar contraseña de Administrador");
		} else if (updateMode == UPDATE_FOR_ADMIN) {
			dialogConfiguracionPassword.setTitle("Cambiar contraseña de Usario de Caja");
		}

		dialogConfiguracionPassword.getActual().setText("");
		dialogConfiguracionPassword.getNuevo().setText("");
		dialogConfiguracionPassword.getRepetir().setText("");

		dialogConfiguracionPassword.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == dialogConfiguracionPassword.getAceptar()) {
			aceptar_actionPerformed();
		} else if (e.getSource() == dialogConfiguracionPassword.getCancelar()) {
			cancelar_actionPerformed();
		}
	}

	private void aceptar_actionPerformed() {
		System.err.println("->>aceptar_actionPerformed: ");
	}

	private void cancelar_actionPerformed() {
		System.err.println("->>cancelar_actionPerformed");
		dialogConfiguracionPassword.dispose();
	}

	private void validate() throws ValidatioException {
	}
}
