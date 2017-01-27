/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.aaldapef.a03.pkg1;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPP2AAldapeFA031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        //Declaracion de variables
        double radio;
        double volumen; 
        int vr;
        
        System.out.println("Calculo del volumen de una esfera");
        System.out.println("Introduce el radio de la esfera");
        radio= teclado.nextDouble();
        
        volumen= 4/3*Math.PI*Math.pow(radio, 3);
        
        System.out.println("El volumen de la esfera es de "+ volumen);
        
        vr= (int) Math.rint(volumen);
        System.out.println("El volumen redeondeado es" + vr);
        
        System.out.println("El metodo utilizado fue Math.PI, Math.pow, Math. rint");
        
        
    }
    
}
