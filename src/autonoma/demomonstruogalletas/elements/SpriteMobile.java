/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demomonstruogalletas.elements;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */

public  abstract class SpriteMobile  extends Sprite implements Runnable{
   /**
     * Indica si el hilo asociado al Sprite está en ejecución.
     */
    protected boolean running;

    /**
     * Indica si el Sprite está en pausa.
     */
    protected boolean pausa;

    /**
     * Tiempo de espera (en milisegundos) entre cada movimiento del Sprite.
     */
    protected long delay;

    /**
     * Hilo de ejecución que controla el comportamiento del Sprite.
     */
    protected Thread hilo;
    
     protected int step;

    public SpriteMobile(int step, int x, int y, int height, int width) {
        super(x, y, height, width);
        hilo = new Thread(this);
        delay = 1000;
        running = false;
        pausa = false;
        this.step = step;
    }

     /**
     * Verifica si el hilo del Sprite está corriendo.
     *
     * @return Retorna true si está corriendo o retorna false si está detenido.
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Detiene el hilo asociado al Sprite.
     */
    public void parar() {
        this.running = false;
    }

    /**
     * Verifica si el Sprite está en pausa.
     *
     * @return Retorna true si está en pausa o retorna si no lo está.
     */
    public boolean isPausa() {
        return pausa;
    }

    /**
     * Pone el Sprite en estado de pausa.
     */
    public void pausar() {
        this.pausa = true;
    }

    /**
     * Quita la pausa al Sprite, permitiendo que continúe su ejecución.
     */
    public void dePausar() {
        this.pausa = false;
    }
  
    
    
    
}
