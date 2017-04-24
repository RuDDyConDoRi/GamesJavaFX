/**
 * @author RuDDy
 * @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.modelo;

import java.util.Date;

public class Plataforma {

    int idPlataforma;
    String descripcion;
    String empresaCreadora;
    Date fechaLanzamiento;
    Caracteristica caracteristicas;

    public Plataforma() {
    }

    public Plataforma(int idPlataforma, String descripcion,
            String empresaCreadora, Date fechaLanzamiento,
            Caracteristica caracteristicas) {
        this.idPlataforma = idPlataforma;
        this.descripcion = descripcion;
        this.empresaCreadora = empresaCreadora;
        this.fechaLanzamiento = fechaLanzamiento;
        this.caracteristicas = caracteristicas;
    }

    public int getIdPlataforma() {
        return idPlataforma;
    }

    public void setIdPlataforma(int idPlataforma) {
        this.idPlataforma = idPlataforma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEmpresaCreadora() {
        return empresaCreadora;
    }

    public void setEmpresaCreadora(String empresaCreadora) {
        this.empresaCreadora = empresaCreadora;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Caracteristica getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Caracteristica caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Plataforma{" + "idPlataforma=" + idPlataforma
                + ", descripcion=" + descripcion
                + ", empresaCreadora=" + empresaCreadora
                + ", fechaLanzamiento=" + fechaLanzamiento
                + ", caracteristicas=" + caracteristicas + '}';
    }

}
