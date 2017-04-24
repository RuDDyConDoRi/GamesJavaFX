/**
 *      @author RuDDy
 *      @e-mail rucocool@hotmail.com
 */
package gamesjavafx.modelos.modelo;

import java.util.Date;

public class Usuario {

    int idUsuario;
    String nombre;
    String primerApellido;
    String nick;
    String email;
    String password;
    int rol;
    Date fechaRegistro;
    String usuarioRegistro;
    Date fechaActualizacion;
    String usuarioActualizacion;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String primerApellido,
            String nick, String email, String password, int rol,
            Date fechaRegistro, String usuarioRegistro,
            Date fechaActualizacion, String usuarioActualizacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.nick = nick;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
        this.usuarioRegistro = usuarioRegistro;
        this.fechaActualizacion = fechaActualizacion;
        this.usuarioActualizacion = usuarioActualizacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
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

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre
                + ", primerApellido=" + primerApellido + ", nick=" + nick
                + ", email=" + email + ", password=" + password
                + ", rol=" + rol + ", fechaRegistro=" + fechaRegistro
                + ", usuarioRegistro=" + usuarioRegistro
                + ", fechaActualizacion=" + fechaActualizacion
                + ", usuarioActualizacion=" + usuarioActualizacion + '}';
    }

}
