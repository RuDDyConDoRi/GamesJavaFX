/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.ICaracteristicaDao;
import gamesjavafx.modelos.modelo.Caracteristica;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class CaracteristicaDaoImpl implements ICaracteristicaDao{

    @Override
    public List<Caracteristica> recuperarCaracteristicas() {
        List<Caracteristica> caracteristicas = new ArrayList<>();
        
        return caracteristicas;
    }
    
}
