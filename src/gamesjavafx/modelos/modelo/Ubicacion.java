/**
 * @author RuDDy
 * @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.modelo;

public class Ubicacion {

    int idUbicacion;
    String codUnidad;
    TipoAlmacen tipoAlmacen;

    public Ubicacion() {
    }

    public Ubicacion(int idUbicacion, String codUnidad, 
            TipoAlmacen tipoAlmacen) {
        this.idUbicacion = idUbicacion;
        this.codUnidad = codUnidad;
        this.tipoAlmacen = tipoAlmacen;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getCodUnidad() {
        return codUnidad;
    }

    public void setCodUnidad(String codUnidad) {
        this.codUnidad = codUnidad;
    }

    public TipoAlmacen getTipoAlmacen() {
        return tipoAlmacen;
    }

    public void setTipoAlmacen(TipoAlmacen tipoAlmacen) {
        this.tipoAlmacen = tipoAlmacen;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "idUbicacion=" + idUbicacion 
                + ", codUnidad=" + codUnidad 
                + ", tipoAlmacen=" + tipoAlmacen + '}';
    }

}
