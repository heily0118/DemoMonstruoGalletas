/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomonstruogalletas.elements;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250523
 * @version 1.0.0
 */
public abstract class Sprite {
    
    protected int x;
    protected int y;
    protected int height;
    protected int width;
    protected ImageIcon image;
    protected GraphicContainer gameContainer;

     /**
     * Constructor base para los sprites.
     * 
     * @param x      La posición x del sprite.
     * @param y      La posición y del sprite.
     * @param height La altura del sprite.
     * @param width  El ancho del sprite.
     */
    public Sprite(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.image = null; 
        this.gameContainer = null; 
    }

   

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public GraphicContainer getGameContainer() {
        return gameContainer;
    }

    public void setGameContainer(GraphicContainer gameContainer) {
        this.gameContainer = gameContainer;
    }

    /**
     * Método abstracto para dibujar el sprite.
     * 
     * @param g El objeto Graphics usado para dibujar.
     */
    public abstract void paint(Graphics g);

    /**
     * Método abstracto para obtener las fronteras del sprite.
     * 
     * @return Un objeto Rectangle con las fronteras del sprite.
     */
    public abstract Rectangle getBoundaries();
     
     public void setGraphicContainer(GraphicContainer gContainer) {
        this.gameContainer = gContainer;
    }
    
    
    
}
