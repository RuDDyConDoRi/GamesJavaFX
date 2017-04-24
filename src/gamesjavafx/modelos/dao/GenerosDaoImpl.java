/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.IGeneroDao;
import gamesjavafx.modelos.modelo.Genero;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class GenerosDaoImpl implements IGeneroDao{

    @Override
    public List<Genero> recuperarGeneros() {
        List<Genero> generos = new ArrayList<>();
        
        return generos;
    }
    
}
