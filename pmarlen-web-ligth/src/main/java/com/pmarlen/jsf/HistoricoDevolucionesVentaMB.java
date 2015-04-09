package com.pmarlen.jsf;

import com.pmarlen.backend.dao.ClienteDAO;
import com.pmarlen.backend.dao.DAOException;
import com.pmarlen.backend.dao.EntradaSalidaDAO;
import com.pmarlen.backend.dao.FormaDePagoDAO;
import com.pmarlen.backend.dao.MetodoDePagoDAO;
import com.pmarlen.backend.dao.ProductoDAO;
import com.pmarlen.backend.model.Cliente;
import com.pmarlen.backend.model.FormaDePago;
import com.pmarlen.backend.model.MetodoDePago;
import com.pmarlen.backend.model.Producto;
import com.pmarlen.backend.model.quickviews.EntradaSalidaDetalleQuickView;
import com.pmarlen.backend.model.quickviews.EntradaSalidaQuickView;
import com.pmarlen.model.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import org.primefaces.event.ReorderEvent;

@ManagedBean(name="historicoDevolucionesVentaMB")
@SessionScoped
public class HistoricoDevolucionesVentaMB  {
	private transient static Logger logger = Logger.getLogger(HistoricoDevolucionesVentaMB.class.getSimpleName());
	
	@ManagedProperty(value = "#{editarDevolucionMB}")
	private EditarDevolucionMB editarDevolucionMB;
	
	ArrayList<EntradaSalidaQuickView> devoluciones;
	private int viewRows;
	
	@PostConstruct
	public void init(){
		logger.info("->init:");
		viewRows = 25;
	}
	
	public void refrescar(){
		logger.info("->refrescar:");
		devoluciones = null;
	}

	public void setEditarDevolucionMB(EditarDevolucionMB editarDevolucionMB) {
		this.editarDevolucionMB = editarDevolucionMB;
	}

	public ArrayList<EntradaSalidaQuickView> getDevoluciones() {
		logger.fine("->getDevoluciones");
		if(devoluciones == null) {
			try {
				devoluciones = EntradaSalidaDAO.getInstance().findAllHistoricoDevs();
				if(devoluciones != null){
					logger.config("devoluciones.size()="+devoluciones.size());				 
				}
			}catch(DAOException de){
				logger.severe(de.getMessage());
			}
		}		
		return devoluciones;
	}
	
	public String editarDevolucion(int pedidoVentaId){
		logger.config("->editarPedido:pedidoVentaId="+pedidoVentaId);
		editarDevolucionMB.editar(pedidoVentaId);
		return "/pages/editarDevolucion";
	}
	
	public void onEditarPedido(int pedidoVentaId){
		logger.config("->editarPedido:pedidoVentaId="+pedidoVentaId);
		editarDevolucionMB.editar(pedidoVentaId);
	}
	
	public int getSizeList(){
		logger.fine("->getSizeList()");
		return getDevoluciones().size();
	}

	public int getViewRows() {
		logger.fine("->getViewRows()");
		return viewRows;
	}

	public void setViewRows(int viewRows) {
		logger.fine("->setViewRows("+viewRows+")");
		this.viewRows = viewRows;
	}
	public String getImporteMoneda(double f){
		return Constants.getImporteMoneda(f);
	}

}
