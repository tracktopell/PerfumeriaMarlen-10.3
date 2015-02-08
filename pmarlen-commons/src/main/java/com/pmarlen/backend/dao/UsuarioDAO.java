/**
 * UsuarioDAO
 *
 * Created 2015/02/07 21:02
 *
 * @author tracktopell :: DAO Builder
 * http://www.tracktopell.com.mx
 */

package com.pmarlen.backend.dao;

import java.util.ArrayList;

import java.io.ByteArrayInputStream;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Blob;
import java.sql.Timestamp;	

import java.util.logging.Logger;
import java.util.logging.Level;

import com.pmarlen.backend.model.*;
import com.tracktopell.jdbc.DataSourceFacade;

/**
 * Class for UsuarioDAO of Table USUARIO.
 * 
 * @author Tracktopell::jpa-builder @see  https://github.com/tracktopell/UtilProjects/tree/master/jpa-builder
 * @date 2015/02/07 21:02
 */

public class UsuarioDAO {

	private final static Logger logger = Logger.getLogger(UsuarioDAO.class.getName());

	/**
	*	Datasource for table USUARIO simple CRUD operations.
	*   x common paramenter.
	*/

	private static UsuarioDAO instance;

	private UsuarioDAO(){	
		logger.fine("created UsuarioDAO.");
	}

	public static UsuarioDAO getInstance() {
		if(instance == null){
			instance = new UsuarioDAO();
		}
		return instance;
	}

	private Connection getConnection(){
		return DataSourceFacade.getStrategy().getConnection();
	}

	private Connection getConnectionCommiteable(){
		return DataSourceFacade.getStrategy().getConnectionCommiteable();
	}

    public Usuario findBy(Usuario x) throws DAOException, EntityNotFoundException{
		Usuario r = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement("SELECT EMAIL,ABILITADO,NOMBRE_COMPLETO,PASSWORD FROM USUARIO "+
					"WHERE EMAIL=?"
			);
			ps.setString(1, x.getEmail());
			
			rs = ps.executeQuery();
			if(rs.next()) {
				r = new Usuario();
				r.setEmail((String)rs.getObject("EMAIL"));
				r.setAbilitado((Integer)rs.getObject("ABILITADO"));
				r.setNombreCompleto((String)rs.getObject("NOMBRE_COMPLETO"));
				r.setPassword((String)rs.getObject("PASSWORD"));
			} else {
				throw new EntityNotFoundException("USUARIO NOT FOUND FOR EMAIL="+x.getEmail());
			}
		}catch(SQLException ex) {
			logger.log(Level.SEVERE, "SQLException:", ex);
			throw new DAOException("InQuery:" + ex.getMessage());
		} finally {
			if(rs != null) {
				try{
					rs.close();
					ps.close();
					conn.close();
				}catch(SQLException ex) {
					logger.log(Level.SEVERE, "clossing, SQLException:" + ex.getMessage());
					throw new DAOException("Closing:"+ex.getMessage());
				}
			}
		}
		return r;		
	}

    public ArrayList<Usuario> findAll() throws DAOException {
		ArrayList<Usuario> r = new ArrayList<Usuario>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement("SELECT EMAIL,ABILITADO,NOMBRE_COMPLETO,PASSWORD FROM USUARIO");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				Usuario x = new Usuario();
				x.setEmail((String)rs.getObject("EMAIL"));
				x.setAbilitado((Integer)rs.getObject("ABILITADO"));
				x.setNombreCompleto((String)rs.getObject("NOMBRE_COMPLETO"));
				x.setPassword((String)rs.getObject("PASSWORD"));
				r.add(x);
			}
		}catch(SQLException ex) {
			logger.log(Level.SEVERE, "SQLException:", ex);
			throw new DAOException("InQuery:" + ex.getMessage());
		} finally {
			if(rs != null) {
				try{
					rs.close();
					ps.close();
					conn.close();
				}catch(SQLException ex) {
					logger.log(Level.SEVERE, "clossing, SQLException:" + ex.getMessage());
					throw new DAOException("Closing:"+ex.getMessage());
				}
			}
		}
		return r;		
	};
    
    public int insert(Usuario x) throws DAOException {
		PreparedStatement ps = null;
		int r = -1;
		Connection conn = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement("INSERT INTO USUARIO(EMAIL,ABILITADO,NOMBRE_COMPLETO,PASSWORD) "+
					" VALUES(?,?,?,?)"
					,Statement.RETURN_GENERATED_KEYS);			
			int ci=1;
			ps.setObject(ci++,x.getEmail());
			ps.setObject(ci++,x.getAbilitado());
			ps.setObject(ci++,x.getNombreCompleto());
			ps.setObject(ci++,x.getPassword());

			r = ps.executeUpdate();					
			ResultSet rsk = ps.getGeneratedKeys();
			if(rsk != null){
				while(rsk.next()){
					x.setEmail((String)rsk.getObject(1));
				}
			}
		}catch(SQLException ex) {
			logger.log(Level.SEVERE, "SQLException:", ex);
			throw new DAOException("InUpdate:" + ex.getMessage());
		} finally {
			if(ps != null) {
				try{				
					ps.close();
					conn.close();
				}catch(SQLException ex) {
					logger.log(Level.SEVERE, "clossing, SQLException:" + ex.getMessage());
					throw new DAOException("Closing:"+ex.getMessage());
				}
			}
		}
		return r;
	}

	public int update(Usuario x) throws DAOException {		
		PreparedStatement ps = null;
		int r= -1;
		Connection conn = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement("UPDATE USUARIO SET ABILITADO=?,NOMBRE_COMPLETO=?,PASSWORD=? "+
					" WHERE EMAIL=?");
			
			int ci=1;
			ps.setObject(ci++,x.getEmail());
			ps.setObject(ci++,x.getAbilitado());
			ps.setObject(ci++,x.getNombreCompleto());
			ps.setObject(ci++,x.getPassword());
			ps.setObject(ci++,x.getEmail());
			
			r = ps.executeUpdate();						
		}catch(SQLException ex) {
			logger.log(Level.SEVERE, "SQLException:", ex);
			throw new DAOException("InUpdate:" + ex.getMessage());
		} finally {
			if(ps != null) {
				try{
					ps.close();
					conn.close();
				}catch(SQLException ex) {
					logger.log(Level.SEVERE, "clossing, SQLException:" + ex.getMessage());
					throw new DAOException("Closing:"+ex.getMessage());
				}
			}
		}
		return r;
	}

    public int delete(Usuario x)throws DAOException {
		PreparedStatement ps = null;
		int r= -1;
		Connection conn = null;
		try {
			conn = getConnection();
			ps = conn.prepareStatement("DELETE FROM USUARIO WHERE EMAIL=?");
			ps.setObject(1, x.getEmail());
			
			r = ps.executeUpdate();						
		}catch(SQLException ex) {
			logger.log(Level.SEVERE, "SQLException:", ex);
			throw new DAOException("InUpdate:" + ex.getMessage());
		} finally {
			if(ps != null) {
				try{
					ps.close();
					conn.close();
				}catch(SQLException ex) {
					logger.log(Level.SEVERE, "clossing, SQLException:" + ex.getMessage());
					throw new DAOException("Closing:"+ex.getMessage());
				}
			}
		}
		return r;
	}

}