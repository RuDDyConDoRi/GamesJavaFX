/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.IJuegoDao;
import gamesjavafx.modelos.modelo.Juego;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JuegoDaoImpl implements IJuegoDao{

    @Override
    public List<Juego> recuperarRegistroJuegos(String usuario) {
        List<Juego> juegosRecuperados = new ArrayList<>();
        
        return juegosRecuperados;
    }

    @Override
    public Juego recuperarJuego(int idJuego) {
        Juego juegoRecuperado = new Juego();
        
        return juegoRecuperado;
    }

    @Override
    public int registrarJuego(Juego juego) {
        return 0;
    }

    @Override
    public boolean eliminarJuego(int idJuego) {
        
        return false;
    }

    @Override
    public boolean actualizarJuego(Juego juego) {
        
        return false;
    }
    
}
