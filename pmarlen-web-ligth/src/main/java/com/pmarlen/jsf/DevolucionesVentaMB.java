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

@ManagedBean(name="devolucionesVentaMB")
@SessionScoped
public class DevolucionesVentaMB  {
	private transient static Logger logger = Logger.getLogger(DevolucionesVentaMB.class.getSimpleName());
	
	@ManagedProperty(value = "#{editarDevolucionMB}")
	private EditarDevolucionMB editarDevolucionMB;
	
	ArrayList<EntradaSalidaQuickView> devoluciones;
	private int viewRows;
	
	@PostConstruct
	public void init(){
		logger.info("->init:");
		try {
			devoluciones = EntradaSalidaDAO.getInstance().findAllActiveDevs();
			logger.info("->refrescar:devoluciones.size()="+devoluciones.size());
			for(EntradaSalidaQuickView x:devoluciones){
				logger.finer("->x="+x.getId());
			}
		}catch(DAOException de){
			devoluciones = new ArrayList<EntradaSalidaQuickView>();
			logger.severe(de.getMessage());
		}
		viewRows = 25;
	}
	
	public void refrescar(){
		logger.info("->refrescar:");
		try {
			devoluciones = EntradaSalidaDAO.getInstance().findAllActiveDevs();
			if(devoluciones != null){
				logger.info("->refrescar:devoluciones.size()="+devoluciones.size());
				for(EntradaSalidaQuickView x:devoluciones){
					logger.finer("->x="+x.getId());
				}
			}
		} catch (DAOException ex) {
			logger.severe(ex.getMessage());
		}
		
	}

	public void setEditarDevolucionMB(EditarDevolucionMB editarDevolucionMB) {
		this.editarDevolucionMB = editarDevolucionMB;
	}

	public ArrayList<EntradaSalidaQuickView> getDevoluciones() {
		logger.fine("->getDevoluciones");
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
