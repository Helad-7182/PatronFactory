/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.productos;

/**
 *
 * @author helad
 */
public class Computadora implements Product{
    private float precio;
    private String marca;
    private String SO;
    
    public Computadora(){
    }

    public Computadora(float precio, String marca, String SO) {
        this.precio = precio;
        this.marca = marca;
        this.SO = SO;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    @Override
    public String toString() {
        return "Computadora{" + "precio=" + precio + ", marca=" + marca + ", SO=" + SO + '}';
    }
    
    
    
}
