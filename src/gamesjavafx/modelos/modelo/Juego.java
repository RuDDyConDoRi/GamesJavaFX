/**
 * @author RuDDy
 * @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.modelo;

import java.util.Date;

public class Juego {

    int idJuego;
    String tipoJuego;
    String versionFirmware;
    String nombreJuego;
    byte[] imagen;
    Date fechaLanzamiento;
    Date fechaAdquisicion;
    int nroJugadores;
    String companiaCreadora;
    String estado;
    String preview;
    String Trailer;
    Date fechaRegistro;
    String usuarioRegistro;
    Date fechaActualizacion;
    String usuarioActualizacion;
    Plataforma plataforma;
    Ubicacion ubicacion;
    Genero genero;

    public Juego() {
    }

    public Juego(int idJuego, String tipoJuego, String versionFirmware,
            String nombreJuego, byte[] imagen, Date fechaLanzamiento,
            Date fechaAdquisicion, int nroJugadores, String companiaCreadora,
            String estado, String preview, String Trailer, Date fechaRegistro,
            String usuarioRegistro, Date fechaActualizacion,
            String usuarioActualizacion, Plataforma plataforma,
            Ubicacion ubicacion, Genero genero) {
        this.idJuego = idJuego;
        this.tipoJuego = tipoJuego;
        this.versionFirmware = versionFirmware;
        this.nombreJuego = nombreJuego;
        this.imagen = imagen;
        this.fechaLanzamiento = fechaLanzamiento;
        this.fechaAdquisicion = fechaAdquisicion;
        this.nroJugadores = nroJugadores;
        this.companiaCreadora = companiaCreadora;
        this.estado = estado;
        this.preview = preview;
        this.Trailer = Trailer;
        this.fechaRegistro = fechaRegistro;
        this.usuarioRegistro = usuarioRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
        this.plataforma = plataforma;
        this.ubicacion = ubicacion;
        this.genero = genero;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(String tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public String getVersionFirmware() {
        return versionFirmware;
    }

    public void setVersionFirmware(String versionFirmware) {
        this.versionFirmware = versionFirmware;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getNroJugadores() {
        return nroJugadores;
    }

    public void setNroJugadores(int nroJugadores) {
        this.nroJugadores = nroJugadores;
    }

    public String getCompaniaCreadora() {
        return companiaCreadora;
    }

    public void setCompaniaCreadora(String companiaCreadora) {
        this.companiaCreadora = companiaCreadora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getTrailer() {
        return Trailer;
    }

    public void setTrailer(String Trailer) {
        this.Trailer = Trailer;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getUsuarioActualizacion() {
        return usuarioActualizacion;
    }

    public void setUsuarioActualizacion(String usuarioActualizacion) {
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Juego{" + "idJuego=" + idJuego + ", tipoJuego=" + tipoJuego
                + ", versionFirmware=" + versionFirmware
                + ", nombreJuego=" + nombreJuego
                + ", fechaLanzamiento=" + fechaLanzamiento
                + ", fechaAdquisicion=" + fechaAdquisicion
                + ", nroJugadores=" + nroJugadores
                + ", companiaCreadora=" + companiaCreadora
                + ", estado=" + estado + ", preview=" + preview
                + ", Trailer=" + Trailer + ", fechaRegistro=" + fechaRegistro
                + ", usuarioRegistro=" + usuarioRegistro
                + ", fechaActualizacion=" + fechaActualizacion
                + ", usuarioActualizacion=" + usuarioActualizacion + "}";
    }

}
