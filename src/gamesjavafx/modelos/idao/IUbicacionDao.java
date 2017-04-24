/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.idao;

import gamesjavafx.modelos.modelo.Ubicacion;
import java.util.List;

public interface IUbicacionDao {
    
    public List<Ubicacion> recuperarUbicaciones();
    public int registrarUbicacion();
    
}
