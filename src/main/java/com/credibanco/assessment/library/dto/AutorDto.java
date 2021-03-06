package com.credibanco.assessment.library.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AutorDto {

    @Id
    public int id_autor;

    @Column (name = "nombre",length = 50)
    public String nombre;

    @Column (name = "fecha",length = 50)
    public String fecha;

    @Column (name = "ciudad",length = 50)
    public String ciudad;

    @Column (name = "correo",length = 50)
    public String correo;

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
