/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.idao;

import gamesjavafx.modelos.modelo.TipoAlmacen;
import java.util.List;

public interface ITipoAlmacenDao {
    
    public List<TipoAlmacen> recuperaraTiposAlmacenes();
        
}
