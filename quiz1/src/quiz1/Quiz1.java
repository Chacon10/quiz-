/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Hacer el llamado JOptionPane; de cuantos cursos quiere elegir
    int numCursos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos cursos desea matricular?")); 
    double[] montosCursos = new double[numCursos];
    
    for(int i=0; i<numCursos; i++) {
    
      montosCursos[i] = Double.parseDouble(JOptionPane.showInputDialog("Monto pagado por el curso " + (i+1)));
    
    }
    
    double montoTotalCursos = 0;
    
    for(double montoCurso : montosCursos) {
      montoTotalCursos += montoCurso; 
    }
    //hice la operacion de impuesto y el llamado
    double impuesto = 0.02;
    double impuestoTotal = montoTotalCursos * impuesto;
    JOptionPane.showMessageDialog(null, "El profesor debe pagar a la hacienda el monto de " + impuestoTotal);

        
    }
    
}
