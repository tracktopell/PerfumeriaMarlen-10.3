/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmarlen.caja.view;

import java.awt.Font;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Softtek
 */
public class DialogLogin extends javax.swing.JDialog {
	private static DialogLogin instance;
	/**
	 * Creates new form DialogConfiguracionBTImpresora
	 */
	private DialogLogin(JFrame parent) {		
		super(parent,true);
		initComponents();
	}

	public static DialogLogin getInstance(JFrame parent) {
		if(instance == null){
			instance = new DialogLogin(parent);
		}
		
		return instance;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        aceptar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelEmail = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        labelContrasena = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Indentificación de Usuario");
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanel3.setLayout(new java.awt.BorderLayout());

        aceptar.setText("Entrar");
        jPanel1.add(aceptar);

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel5.setLayout(new java.awt.GridLayout(4, 0, 0, 5));
        jPanel5.add(jPanel8);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelEmail.setText("CORREO ELECTRÓNICO :");
        labelEmail.setPreferredSize(new java.awt.Dimension(310, 30));
        jPanel4.add(labelEmail);

        email.setColumns(18);
        jPanel4.add(email);

        jPanel5.add(jPanel4);

        jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        labelContrasena.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelContrasena.setText("CONTRASEÑA :");
        labelContrasena.setPreferredSize(new java.awt.Dimension(310, 30));
        jPanel6.add(labelContrasena);

        password.setColumns(10);
        jPanel6.add(password);

        jPanel5.add(jPanel6);
        jPanel5.add(jPanel7);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(140, 200));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(getIcon());
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.WEST);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelContrasena;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

	/**
	 * @return the aceptar
	 */
	public javax.swing.JButton getAceptar() {
		return aceptar;
	}

	private ImageIcon getIcon(){
		ImageIcon icon = null;
		try{
			icon = new ImageIcon(ImageIO.read(getClass().getResourceAsStream("/images/login_security_2.png")));
		} catch(Exception e){
		
		}
		return icon;
	
	}

	public JPasswordField getPassword() {
		return password;
	}

	public JTextField getEmail() {
		return email;
	}

	public JLabel getLabelContrasena() {
		return labelContrasena;
	}

	public JLabel getLabelEmail() {
		return labelEmail;
	}

	@Override
	public void setFont(Font f) {
		super.setFont(f); //To change body of generated methods, choose Tools | Templates.
		if(email != null) {
			email.setFont(f);
			password.setFont(f);
			labelContrasena.setFont(f);
			labelEmail.setFont(f);
			aceptar.setFont(f);			
		}
	}
		
}
