package com.mycompany.Iva;
import java.util.Scanner;
public class P {
    public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    float articulos,precio,pepe;
    double iva,neto;
    System.out.print("Ingrese cantidad de articulos");
    articulos=leer.nextFloat();
    System.out.print("Ingresa precio");
    precio=leer.nextFloat();
    pepe=(articulos*precio);
    System.out.print("Iva a pagar ");
    iva=(pepe*.16);
    System.out.print("el precio es"+pepe);
    System.out.print("el iva es "+iva);
    neto=(pepe+iva);
    System.out.print("El total de neto es "+neto);
    
    }
}
