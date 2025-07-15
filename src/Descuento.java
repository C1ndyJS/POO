/*Marcos trabaja en una tienda y necesita verificar si un cliente tiene derecho a un
descuento del 10% en su compra. El descuento se aplica solo si el valor de la compra
es mayor o igual a $100.00. Para ello, quiere un programa que permita ingresar el valor
de la compra y muestre si el descuento fue aplicado o no, junto con el nuevo valor después
del descuento, en caso de que corresponda.
Basado en este escenario, crea un programa que reciba el valor de la compra y muestre un
mensaje indicando si el descuento fue aplicado o no.*/

public class Descuento {
    double valorCompra;
    double nuevoValor;

    public Descuento(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void aplicarDcto(){
        if(this.valorCompra >= 100.00){
            this.nuevoValor = valorCompra - (valorCompra * 0.1);
            System.out.println("Descuento del 10% aplicado.\nNuevo Valor: "+ this.nuevoValor);
        }else{
            System.out.println("Descuento no aplicado.\nValor total: "+ this.valorCompra);
        }
    }

}
