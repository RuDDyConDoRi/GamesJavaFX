/**
 * @author RuDDy
 * @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.modelo;

public class Caracteristica {

    int idCaracteristica;
    String memoriaRam;
    String capacidadAlmacenamiento;
    int nroMicroprocesadores;
    String capacidadMicroprocesador;
    String fuenteEnergia;
    String tiposConexion;

    public Caracteristica() {
    }

    public Caracteristica(int idCaracteristica, String memoriaRam, 
            String capacidadAlmacenamiento, int nroMicroprocesadores, 
            String capacidadMicroprocesador, String fuenteEnergia, 
            String tiposConexion) {
        this.idCaracteristica = idCaracteristica;
        this.memoriaRam = memoriaRam;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.nroMicroprocesadores = nroMicroprocesadores;
        this.capacidadMicroprocesador = capacidadMicroprocesador;
        this.fuenteEnergia = fuenteEnergia;
        this.tiposConexion = tiposConexion;
    }

    public int getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(int idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public String getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public int getNroMicroprocesadores() {
        return nroMicroprocesadores;
    }

    public void setNroMicroprocesadores(int nroMicroprocesadores) {
        this.nroMicroprocesadores = nroMicroprocesadores;
    }

    public String getCapacidadMicroprocesador() {
        return capacidadMicroprocesador;
    }

    public void setCapacidadMicroprocesador(String capacidadMicroprocesador) {
        this.capacidadMicroprocesador = capacidadMicroprocesador;
    }

    public String getFuenteEnergia() {
        return fuenteEnergia;
    }

    public void setFuenteEnergia(String fuenteEnergia) {
        this.fuenteEnergia = fuenteEnergia;
    }

    public String getTiposConexion() {
        return tiposConexion;
    }

    public void setTiposConexion(String tiposConexion) {
        this.tiposConexion = tiposConexion;
    }

    @Override
    public String toString() {
        return "Caracteristica{" + "idCaracteristica=" + idCaracteristica 
                + ", memoriaRam=" + memoriaRam 
                + ", capacidadAlmacenamiento=" + capacidadAlmacenamiento 
                + ", nroMicroprocesadores=" + nroMicroprocesadores 
                + ", capacidadMicroprocesador=" + capacidadMicroprocesador 
                + ", fuenteEnergia=" + fuenteEnergia 
                + ", tiposConexion=" + tiposConexion + '}';
    }
}
