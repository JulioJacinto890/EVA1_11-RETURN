/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11.pkgreturn;

/**
 *
 * @author hp
 */
public class EVA1_11RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        resu = square(10);//invoasion o llamada a funcion
        System.out.println("Resultado :" + resu);
    }
    public static int square(int num) {
        return num * num;
    }
    
}
