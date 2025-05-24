/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomonstruogalletas.elements;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 * 
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250523
 * @version 1.0.0
 */
public class Galleta extends SpriteMobile{
     private Image imagen;

    public Galleta(int step, int x, int y, int height, int width) {
        super(step, x, y, height, width);
        this.imagen = new ImageIcon(getClass().getResource("/autonoma/demomonstruogalletas/images/Galleta.png")).getImage();
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imagen, x, y, width, height, null);
    }

    @Override
    public Rectangle getBoundaries() {
       return new Rectangle(x, y, width, height);
    }

    @Override
    public void run() {
           while (true) {
        try {
            Thread.sleep(100); 
        } catch (InterruptedException e) {
            break; 
        }
    }
    }
    
}
