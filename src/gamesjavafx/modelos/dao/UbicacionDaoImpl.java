/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.IUbicacionDao;
import gamesjavafx.modelos.modelo.Ubicacion;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class UbicacionDaoImpl implements IUbicacionDao{

    @Override
    public List<Ubicacion> recuperarUbicaciones() {
        List<Ubicacion> ubicaciones = new ArrayList<>();
        
        return ubicaciones;
    }

    @Override
    public int registrarUbicacion() {
        
        return 0;
    }
    
}
