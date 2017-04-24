/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.idao;

import gamesjavafx.modelos.modelo.Juego;
import java.util.List;

public interface IJuegoDao {
    
    public List<Juego> recuperarRegistroJuegos(String usuario);
    public Juego recuperarJuego(int idJuego);
    public int registrarJuego(Juego juego);
    public boolean eliminarJuego(int idJuego);
    public boolean actualizarJuego(Juego juego);
    
}
