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
public class Monstruo extends SpriteMobile {
     private Image imagen;
     private Cueva cueva;

    public Monstruo(int step, int x, int y, int height, int width) {
        super(step, x, y, height, width);
          this.imagen = new ImageIcon(getClass().getResource("/autonoma/demomonstruogalletas/images/monstruo.png")).getImage();
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

                if (cueva == null || cueva.getGalletas().isEmpty()) continue;

                Galleta masCercana = null;
                double minDist = Double.MAX_VALUE;

                for (Galleta g : cueva.getGalletas()) {
                    double dist = Math.hypot(g.getX() - x, g.getY() - y);
                    if (dist < minDist) {
                        minDist = dist;
                        masCercana = g;
                    }
                }

                if (masCercana != null) {
                    int dx = masCercana.getX() - x;
                    int dy = masCercana.getY() - y;

                    // Mover un paso hacia la galleta
                    if (Math.abs(dx) > step) x += step * Integer.signum(dx);
                    if (Math.abs(dy) > step) y += step * Integer.signum(dy);

                    // Comer si esta muy cerca
                    if (Math.abs(dx) <= step && Math.abs(dy) <= step) {
                        cueva.eliminarGalleta(masCercana);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void setCueva(Cueva cueva) {
        this.cueva = cueva;
    }
    
}
