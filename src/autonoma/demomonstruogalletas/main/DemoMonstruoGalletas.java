/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.demomonstruogalletas.main;

import autonoma.demomonstruogalletas.elements.Cueva;
import autonoma.demomonstruogalletas.elements.Monstruo;
import autonoma.demomonstruogalletas.gui.VentanaPrincipal;

/**
 * 
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250524
 * @version 1.0.0
 */
public class DemoMonstruoGalletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Monstruo miMonstruo= new Monstruo( 5, 100, 100, 64, 64); 
        Cueva cueva = new Cueva(miMonstruo);
        miMonstruo.setCueva(cueva); 
        new Thread(miMonstruo).start();
        
        VentanaPrincipal ventana = new VentanaPrincipal(cueva);
        ventana.setVisible(true);
    }
    
}
