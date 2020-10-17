package com.mendez.mascotas;

public class Mascota {



private String nombre;
private String puntuacion;
private int imagen;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }


    public Mascota(int imagen, String nombre, String puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }
}
