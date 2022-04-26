/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfactory;

import java.util.Scanner;
import fes.productos.*;

/**
 *
 * @author helad
 */
public class FactoryMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        int seleccion =0;
        
        System.out.println("Que producto deseas de la fabrica?");
        System.out.println(Product.SAMSUMG_GALAXY_S9 + ") Telefono Samsumg");
        System.out.println(Product.LENOVO_TAB_M8 + ") Tableta Lenovo");
        System.out.println(Product.LAPTOP_ASUS +") Laptop ASUS");
        
        try{
            System.out.println("Elige una opcion.");
            seleccion = teclado.nextInt();
        }
        catch(Exception e){
            System.out.println("Opcion invalida"); 
        }
        
        Product producto = ProductsFactory.createProduct(seleccion);
        System.out.println(producto.toString());
    }
    
}
