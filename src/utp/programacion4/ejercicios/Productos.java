/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.programacion4.ejercicios;

/**
 * * @author cindy
 */
public class Productos {
    String NameProduct;
    long codigoProd;
    float precio;
    float unidad;    
    Productos (String Name, long codigo, float price, float unit)
    {
        this.NameProduct = Name;
        this.codigoProd = codigo;
        this.precio = price;
        this.unidad = unit;
    }
}
