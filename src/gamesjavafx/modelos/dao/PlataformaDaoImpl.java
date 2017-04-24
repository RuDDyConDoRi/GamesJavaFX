/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.IPlataformaDao;
import gamesjavafx.modelos.modelo.Plataforma;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class PlataformaDaoImpl  implements IPlataformaDao{

    @Override
    public List<Plataforma> recuperarPlataformas() {
        List<Plataforma> plataformas = new ArrayList<>();
        
        return plataformas;
    }
    
}
