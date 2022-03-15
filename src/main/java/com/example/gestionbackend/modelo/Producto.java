package com.example.gestionbackend.modelo;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 60, nullable = false)
    private String nombre;
    @Column(name = "descripcion",length = 60, nullable = false)
    private String descripcion;
    @Column(name = "precio",length = 60, nullable = false)
    private int precio;
    @Column(name = "id_tipo",length = 60, nullable = false) //unique=true --> es para emails
    private int id_tipo;

    public Producto(){

    }

    public Producto(Long id, String nombre, String descripcion, int precio, int id_tipo) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.id_tipo = id_tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
}
