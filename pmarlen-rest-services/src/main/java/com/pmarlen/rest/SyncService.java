/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pmarlen.rest;

import com.pmarlen.backend.dao.AlmacenProductoDAO;
import com.pmarlen.backend.dao.DAOException;
import com.pmarlen.backend.dao.ProductoDAO;
import com.pmarlen.backend.model.quickviews.InventarioSucursalQuickView;
import com.pmarlen.backend.model.quickviews.ProductoQuickView;
import com.pmarlen.rest.dto.P;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/**
 *
 * @author alfredo
 */
@Path("/syncservice/")
public class SyncService {
    private static final String encodingUTF8  = "UTF-8";
    
    private final static Logger logger = Logger.getLogger(SyncService.class.getName());

	@GET
	@Path("/productos/{sucursalId}")
	@Produces(MediaType.APPLICATION_JSON  + ";charset=" + encodingUTF8)
	public List<P> getAllProducto(@PathParam(value = "sucursalId")String sucursalId) throws WebApplicationException {
        List<P> l = null;
		
		try {
			l = new ArrayList<P>();
			int sucId=new Integer(sucursalId);
			ArrayList<InventarioSucursalQuickView> p = AlmacenProductoDAO.getInstance().findAllBySucursal(sucId);
			for(InventarioSucursalQuickView is: p){
				l.add(is.getFaccadeForREST());
			}
		} catch (DAOException ex) {
			logger.log(Level.SEVERE, null, ex);
			throw new WebApplicationException(ex, Response.Status.INTERNAL_SERVER_ERROR);
		}
		return l;
	}
	
}
