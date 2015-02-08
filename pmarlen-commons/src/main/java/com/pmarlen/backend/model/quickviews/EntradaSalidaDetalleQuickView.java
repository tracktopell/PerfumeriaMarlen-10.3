/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pmarlen.backend.model.quickviews;

import com.pmarlen.backend.model.EntradaSalidaDetalle;
import com.pmarlen.model.Constants;
import java.text.DecimalFormat;

/**
 *
 * @author alfredo
 */
public class EntradaSalidaDetalleQuickView extends EntradaSalidaDetalle{
	
	private long rowId;
	
	private String productoNombre;
	
	private String productoPresentacion;
	
	private String productoContenido;
	
	private String productoUnidadMedida;
    
    private String productoIndustria;
    
    private String productoLinea;
    
    private String productoMarca;
	
	private int     apTipoAlmacen;
		    
    private int     apCantidad;
	
    private double  apPrecio;
	
	private int canPendteEnOtrosPV;

	
	public EntradaSalidaDetalleQuickView() {
		this.rowId = System.currentTimeMillis();
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public long getRowId() {
		return rowId;
	}
		
	public String toStringShorten() {
		return  "["+
				this.getProductoCodigoBarras() +"] "+
				this.productoNombre  +"/"+
				this.productoPresentacion  +
				Constants.dfCurrency.format(this.getPrecioVenta());
	}

	/**
	 * @return the productoNombre
	 */
	public String getProductoNombre() {
		return productoNombre;
	}

	/**
	 * @param productoNombre the productoNombre to set
	 */
	public void setProductoNombre(String productoNombre) {
		this.productoNombre = productoNombre;
	}

	/**
	 * @return the productoPresentacion
	 */
	public String getProductoPresentacion() {
		return productoPresentacion;
	}

	/**
	 * @param productoPresentacion the productoPresentacion to set
	 */
	public void setProductoPresentacion(String productoPresentacion) {
		this.productoPresentacion = productoPresentacion;
	}

	/**
	 * @return the productoContenido
	 */
	public String getProductoContenido() {
		return productoContenido;
	}

	/**
	 * @param productoContenido the productoContenido to set
	 */
	public void setProductoContenido(String productoContenido) {
		this.productoContenido = productoContenido;
	}

	/**
	 * @return the productoIndustria
	 */
	public String getProductoIndustria() {
		return productoIndustria;
	}

	/**
	 * @param productoIndustria the productoIndustria to set
	 */
	public void setProductoIndustria(String productoIndustria) {
		this.productoIndustria = productoIndustria;
	}

	/**
	 * @return the productoLinea
	 */
	public String getProductoLinea() {
		return productoLinea;
	}

	/**
	 * @param productoLinea the productoLinea to set
	 */
	public void setProductoLinea(String productoLinea) {
		this.productoLinea = productoLinea;
	}

	/**
	 * @return the productoMarca
	 */
	public String getProductoMarca() {
		return productoMarca;
	}

	/**
	 * @param productoMarca the productoMarca to set
	 */
	public void setProductoMarca(String productoMarca) {
		this.productoMarca = productoMarca;
	}

	/**
	 * @return the apTipoAlmacen
	 */
	public int getApTipoAlmacen() {
		return apTipoAlmacen;
	}

	/**
	 * @param apTipoAlmacen the apTipoAlmacen to set
	 */
	public void setApTipoAlmacen(int apTipoAlmacen) {
		this.apTipoAlmacen = apTipoAlmacen;
	}

	/**
	 * @return the apCantidad
	 */
	public int getApCantidad() {
		return apCantidad;
	}

	/**
	 * @param apCantidad the apCantidad to set
	 */
	public void setApCantidad(int apCantidad) {
		this.apCantidad = apCantidad;
	}

	/**
	 * @return the apPrecio
	 */
	public double getApPrecio() {
		return apPrecio;
	}

	/**
	 * @param apPrecio the apPrecio to set
	 */
	public void setApPrecio(double apPrecio) {
		this.apPrecio = apPrecio;
	}

	/**
	 * @return the productoUnidadMedida
	 */
	public String getProductoUnidadMedida() {
		return productoUnidadMedida;
	}

	/**
	 * @param productoUnidadDeMedida the productoUnidadMedida to set
	 */
	public void setProductoUnidadMedida(String productoUnidadDeMedida) {
		this.productoUnidadMedida = productoUnidadDeMedida;
	}

	public void setCanPendteEnOtrosPV(int canPendteEnOtrosPV) {
		this.canPendteEnOtrosPV = canPendteEnOtrosPV;
	}

	public int getCanPendteEnOtrosPV() {
		return canPendteEnOtrosPV;
	}
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}