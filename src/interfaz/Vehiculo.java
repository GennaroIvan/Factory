/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

/**
 *
 * @author SAMSUNG
 */
public class Vehiculo {

    private String nombre;
    private int ocupantes, llantas;
    private boolean cinturon;

    public Vehiculo (String n){
        this.nombre = n;
        this.cinturon=false;
    }

    public String getNombre(){
        return nombre;
    }

    /**
     * @return the ocupantes
     */
    public int getOcupantes() {
        return ocupantes;
    }

    /**
     * @param ocupantes the ocupantes to set
     */
    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public void abrocharCinturones(){

    }

    @Override
    public String toString(){
        return this.getNombre() + " puede llevar a " + this.getOcupantes() + " por tener " + this.getLlantas()+ " llantas";
    }

    /**
     * @return the cinturon
     */
    public boolean isCinturon() {
        return cinturon;
    }

    /**
     * @param cinturon the cinturon to set
     */
    public void setCinturon(boolean cinturon) {
        this.cinturon = cinturon;
    }

}
