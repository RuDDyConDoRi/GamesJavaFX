/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.modelo;

public class TipoAlmacen {

    int idTipoAlmacen;
    String descripcion;
    String codigoAlmacen;

    public TipoAlmacen() {
    }

    public TipoAlmacen(int idTipoAlmacen, String descripcion, 
            String codigoAlmacen) {
        this.idTipoAlmacen = idTipoAlmacen;
        this.descripcion = descripcion;
        this.codigoAlmacen = codigoAlmacen;
    }

    public int getIdTipoAlmacen() {
        return idTipoAlmacen;
    }

    public void setIdTipoAlmacen(int idTipoAlmacen) {
        this.idTipoAlmacen = idTipoAlmacen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(String codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    @Override
    public String toString() {
        return "TipoAlmacen{" + "idTipoAlmacen=" + idTipoAlmacen 
                + ", descripcion=" + descripcion 
                + ", codigoAlmacen=" + codigoAlmacen + '}';
    }

}
