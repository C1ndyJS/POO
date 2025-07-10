/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utp.programacion4.ejercicios;

import java.util.ArrayList;

/**** @author utp*/

public class Factura{
    String NameCx;
    String NameCajero;
    String Fecha;
    
    ArrayList<Productos> products;
    //products = new ArrayList<Productos>();
    public Factura(String NameCx, String NameCaja, String Fecha){
        this.Fecha = Fecha;
        this.NameCajero = NameCaja;
        this.NameCx = NameCx;
        this.products = new ArrayList();

    }
}
