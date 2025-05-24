/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomonstruogalletas.elements;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 * 
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250523
 * @version 1.0.0
 */
public class Cueva {
    private Monstruo monstruo;
    private Image cuevaImage;
    private ArrayList<Galleta> galletas;
    private static final int LIMITE_GALLETAS = 100;
    private Timer timerGalletas;
    private int galletasCreadas = 0;
    private Random random = new Random();

    public Cueva(Monstruo monstruo) {
        this.monstruo = monstruo;
        this.cuevaImage = new ImageIcon(getClass().getResource("/autonoma/demomonstruogalletas/images/Cueva.jpg")).getImage();
        this.galletas = new ArrayList<>();
        
            timerGalletas = new Timer(2000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (galletasCreadas < LIMITE_GALLETAS) {
                int x = random.nextInt(600); 
                int y = random.nextInt(400); 
                Galleta nueva = new Galleta(0, x, y, 30, 30);
                galletas.add(nueva);
                new Thread(nueva).start(); 
                galletasCreadas++;
            } else {
                timerGalletas.stop();
            }
        }
    });

    timerGalletas.start();
    }
    public void agregarGalleta(Galleta galleta) {
        galletas.add(galleta);
    }

      
    public void paint(Graphics g, int ancho, int alto) {
       g.drawImage(cuevaImage, 0, 0, ancho, alto, null);
        monstruo.paint(g);

        for (Galleta galleta : galletas) {
            galleta.paint(g);
        }
    }
    
    public ArrayList<Galleta> getGalletas() {
        return galletas;
    }

    public void eliminarGalleta(Galleta galleta) {
        galletas.remove(galleta);
    }

    
}
