/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pmarlen.caja.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author alfredo
 */
public class FramePrincipal extends javax.swing.JFrame {

	/**
	 * Creates new form FramePrincipal
	 */
	public FramePrincipal() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panels = new javax.swing.JPanel();
        panelVenta = new PanelVenta();
        panelProductos = new PanelProductos();
        panelVentas = new PanelVentas();
        statusPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        statusConeccion = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        productosMenu = new javax.swing.JMenuItem();
        ventasMenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        salirMenu = new javax.swing.JMenuItem();
        ventaMenu = new javax.swing.JMenu();
        ventaActualMenu = new javax.swing.JMenuItem();
        ventaTerminarMenu = new javax.swing.JMenuItem();
        ventaCancelarMenu = new javax.swing.JMenuItem();
        ventaeliminarProdMenu = new javax.swing.JMenuItem();
        configMenu = new javax.swing.JMenu();
        negocioConfigMenu = new javax.swing.JMenuItem();
        impresoraBTMenu = new javax.swing.JMenuItem();
        usuarioAdminMenu = new javax.swing.JMenuItem();
        usuarioCajaMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caja");

        panels.setLayout(new java.awt.CardLayout());

        panelVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta Actual"));
        panels.add(panelVenta, "panelVenta");

        panelProductos.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos"));
        panels.add(panelProductos, "panelProductos");

        panelVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("Ventas"));
        panels.add(panelVentas, "panelVentas");

        getContentPane().add(panels, java.awt.BorderLayout.CENTER);

        statusPanel.setPreferredSize(new java.awt.Dimension(42, 35));
        statusPanel.setLayout(new java.awt.GridLayout(1, 3));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusPanel.add(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        statusPanel.add(jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        statusConeccion.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        statusConeccion.setForeground(new java.awt.Color(153, 153, 0));
        statusConeccion.setText("...CONECTANDO");
        jPanel3.add(statusConeccion);

        statusPanel.add(jPanel3);

        getContentPane().add(statusPanel, java.awt.BorderLayout.SOUTH);

        archivoMenu.setText("Archivo");

        productosMenu.setText("Productos");
        archivoMenu.add(productosMenu);

        ventasMenu.setText("Ventas");
        archivoMenu.add(ventasMenu);
        archivoMenu.add(jSeparator1);

        salirMenu.setText("Salir");
        archivoMenu.add(salirMenu);

        jMenuBar1.add(archivoMenu);

        ventaMenu.setText("Venta");

        ventaActualMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        ventaActualMenu.setText("Actual");
        ventaMenu.add(ventaActualMenu);

        ventaTerminarMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        ventaTerminarMenu.setText("Terminar");
        ventaMenu.add(ventaTerminarMenu);

        ventaCancelarMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        ventaCancelarMenu.setText("Cancelar");
        ventaMenu.add(ventaCancelarMenu);

        ventaeliminarProdMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.CTRL_MASK));
        ventaeliminarProdMenu.setText("Eliminar Producto");
        ventaMenu.add(ventaeliminarProdMenu);

        jMenuBar1.add(ventaMenu);

        configMenu.setText("Configuración");

        negocioConfigMenu.setText("Datos de Negocio");
        configMenu.add(negocioConfigMenu);

        impresoraBTMenu.setText("Impresora Bluetooth");
        configMenu.add(impresoraBTMenu);

        usuarioAdminMenu.setText("Contraseña Administrador");
        configMenu.add(usuarioAdminMenu);

        usuarioCajaMenu.setText("Contraseña Usuario Caja");
        configMenu.add(usuarioCajaMenu);

        jMenuBar1.add(configMenu);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1018, 679));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FramePrincipal().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenu configMenu;
    private javax.swing.JMenuItem impresoraBTMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem negocioConfigMenu;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelVenta;
    private javax.swing.JPanel panelVentas;
    private javax.swing.JPanel panels;
    private javax.swing.JMenuItem productosMenu;
    private javax.swing.JMenuItem salirMenu;
    private javax.swing.JLabel statusConeccion;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JMenuItem usuarioAdminMenu;
    private javax.swing.JMenuItem usuarioCajaMenu;
    private javax.swing.JMenuItem ventaActualMenu;
    private javax.swing.JMenuItem ventaCancelarMenu;
    private javax.swing.JMenu ventaMenu;
    private javax.swing.JMenuItem ventaTerminarMenu;
    private javax.swing.JMenuItem ventaeliminarProdMenu;
    private javax.swing.JMenuItem ventasMenu;
    // End of variables declaration//GEN-END:variables

	/**
	 * @return the archivoMenu
	 */
	public javax.swing.JMenu getArchivoMenu() {
		return archivoMenu;
	}

	/**
	 * @return the panelVenta
	 */
	public PanelVenta getPanelVenta() {
		return (PanelVenta)panelVenta;
	}

	/**
	 * @return the panels
	 */
	public javax.swing.JPanel getPanels() {
		return panels;
	}

	/**
	 * @return the productosMenu
	 */
	public javax.swing.JMenuItem getProductosMenu() {
		return productosMenu;
	}

	/**
	 * @return the salirMenu
	 */
	public javax.swing.JMenuItem getSalirMenu() {
		return salirMenu;
	}

	/**
	 * @return the ventaCancelarMenu
	 */
	public javax.swing.JMenuItem getVentaCancelarMenu() {
		return ventaCancelarMenu;
	}

	/**
	 * @return the ventaMenu
	 */
	public javax.swing.JMenu getVentaMenu() {
		return ventaMenu;
	}

	/**
	 * @return the ventaActualMenu
	 */
	public javax.swing.JMenuItem getVentaActualMenu() {
		return ventaActualMenu;
	}

	/**
	 * @return the ventaTerminarMenu
	 */
	public javax.swing.JMenuItem getVentaTerminarMenu() {
		return ventaTerminarMenu;
	}

	/**
	 * @return the ventaeliminarProdMenu
	 */
	public javax.swing.JMenuItem getVentaeliminarProdMenu() {
		return ventaeliminarProdMenu;
	}

	/**
	 * @return the ventasMenu
	 */
	public javax.swing.JMenuItem getVentasMenu() {
		return ventasMenu;
	}

	/**
	 * @return the panelProductos
	 */
	public javax.swing.JPanel getPanelProductos() {
		return panelProductos;
	}

	/**
	 * @return the panelVentas
	 */
	public javax.swing.JPanel getPanelVentas() {
		return panelVentas;
	}

	/**
	 * @return the impresoraBTMenu
	 */
	public javax.swing.JMenuItem getImpresoraBTMenu() {
		return impresoraBTMenu;
	}

	/**
	 * @param impresoraBTMenu the impresoraBTMenu to set
	 */
	public void setImpresoraBTMenu(javax.swing.JMenuItem impresoraBTMenu) {
		this.impresoraBTMenu = impresoraBTMenu;
	}

	/**
	 * @return the negocioConfigMenu
	 */
	public javax.swing.JMenuItem getNegocioConfigMenu() {
		return negocioConfigMenu;
	}

	/**
	 * @return the usuarioAdminMenu
	 */
	public javax.swing.JMenuItem getUsuarioAdminMenu() {
		return usuarioAdminMenu;
	}

	/**
	 * @return the usuarioCajaMenu
	 */
	public javax.swing.JMenuItem getUsuarioCajaMenu() {
		return usuarioCajaMenu;
	}

	/**
	 * @return the configMenu
	 */
	public javax.swing.JMenu getConfigMenu() {
		return configMenu;
	}

	public JLabel getStatusConeccion() {
		return statusConeccion;
	}
	
	public void setConectado(){
		statusConeccion.setForeground(Color.GREEN);
		for(int i=0; i< 200; i++) {
			statusConeccion.setText("CONECTADO ("+i+")");			
			statusConeccion.updateUI();
		}
	}
	
	public void setDesconectado(){
		statusConeccion.setForeground(Color.RED);
		for(int i=0; i< 200; i++) {
			statusConeccion.setText("DESCONECTADO ("+i+")");
			
			statusConeccion.updateUI();
		}
	}
	
	public void setFont(Font font){
		panelVenta.setFont(font);
		panelProductos.setFont(font);
		panelVentas.setFont(font);
		statusPanel.setFont(font);
		statusConeccion.setFont(font);
	}
}
