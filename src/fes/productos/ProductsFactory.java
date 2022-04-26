/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fes.productos;

/**
 *
 * @author helad
 */
public class ProductsFactory {
    
    public static Product createProduct(int tipo){
        switch (tipo){
            case Product.SAMSUMG_GALAXY_S9 -> {
                return new Smartphone(5000,"Samsumg","Android 12");
            }
            
            case Product.LENOVO_TAB_M8 -> {
                return new Tablet(8000,"Lenovo","Android 11");
            }
                
            case Product.LAPTOP_ASUS -> {
                return new Computadora(14000,"ASUS","Windows 10");
            }
                
            default -> throw new AssertionError();
        }
    }
    
}
