/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.idao;

import gamesjavafx.modelos.modelo.Usuario;
import java.util.List;

public interface IUsuarioDao {
    
    public List<Usuario> recuperarUsuarios();
    public int registrarUsuario(Usuario usuario);
    
}
