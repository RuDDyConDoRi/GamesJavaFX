/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.dao;

import gamesjavafx.modelos.idao.IUsuarioDao;
import gamesjavafx.modelos.modelo.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class UsuarioDaoImpl implements IUsuarioDao{

    @Override
    public List<Usuario> recuperarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        
        return usuarios;
    }

    @Override
    public int registrarUsuario(Usuario usuario) {
        
        return 0;
    }
    
}