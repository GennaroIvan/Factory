/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author SAMSUNG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Vehiculo carro=new Vehiculo("Corsa");
        carro.setLlantas(4);
        carro.setOcupantes(5);

        Vehiculo camioneta= new Vehiculo("Monster Truck");
        camioneta.setOcupantes(10);
        camioneta.setLlantas(4);

        Vehiculo camion=new Vehiculo("Mercedes");
        camioneta.setOcupantes(45);
        camioneta.setLlantas(10);

        JOptionPane.showMessageDialog(null, carro);
        JOptionPane.showMessageDialog(null, camioneta);
        JOptionPane.showMessageDialog(null, camion);

        // TODO code application logic here
    }

}
