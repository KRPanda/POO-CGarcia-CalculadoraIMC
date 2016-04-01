/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraimc;

import javax.swing.JOptionPane;

/**
 *
 * @author carlos
 */
public class Formula {

    //Atributos

    static private float peso;
    static private float altura;
    static private float imcc;
    static JOptionPane mensaje = new JOptionPane("Bienvenido");

    public static void mostrarventana(int numero) {
        switch (numero) {
            case 1:
                JOptionPane.showMessageDialog(null, "Caculadora de IMC");
                break;
            case 2:
                setPeso(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su peso en kilos")));
                break;
            case 3:
                getAltura(Float.parseFloat(JOptionPane.showInputDialog("Ingrese su altura en metros")));
                
                break;
            case 4:
                
                JOptionPane.showMessageDialog(null, "Su indice de masa corporal es: " + getIMC() + "\n16.00  Infrapeso: Delgadez Severa\n"
                        + "16.00 - 16.99  Infrapeso: Delgadez moderada\n"
                        + "17.00 - 18.49  Infrapeso: Delgadez aceptable\n"
                        + "18.50 - 24.99  Peso Normal\n"
                        + "25.00 - 29.99  Sobrepeso\n"
                        + "30.00 - 34.99  Obeso: Tipo I\n"
                        + "35.00 - 40.00  Obeso: Tipo II\n"
                        + "40.00  Obeso: Tipo III");
                break;
        }
    }

    

//metodos
    public Formula() {

    }

    public static void setPeso(float peso1) {
        peso = peso1;

    }

    public static void getAltura(float altura1) {
        altura = altura1;

    }

    public static float getIMC() {
        imcc = peso / (altura * altura);
        return imcc;
    }

}
