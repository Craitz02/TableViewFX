/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edu.ni.programacion2.tableviewfx.pojo;

/**
 *
 * @author Sistemas-11
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private int cant;
    private float precio;
    private String image;

    public Producto() {
    }
    
    public Producto(int id, String nombre, String descripcion, int cant, float precio, String image) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cant = cant;
        this.precio = precio;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
}
