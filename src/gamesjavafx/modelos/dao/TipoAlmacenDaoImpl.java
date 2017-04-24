/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.ITipoAlmacenDao;
import gamesjavafx.modelos.modelo.TipoAlmacen;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class TipoAlmacenDaoImpl implements ITipoAlmacenDao{

    @Override
    public List<TipoAlmacen> recuperaraTiposAlmacenes() {
        List<TipoAlmacen> tiposAlmacenes = new ArrayList<>();
        
        return tiposAlmacenes;
    }
    
}
