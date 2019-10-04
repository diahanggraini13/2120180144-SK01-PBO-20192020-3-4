/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180144.sk01.pbo.ti20192020.pkg3.pkg4.pkg05;

/**
 *
 * @author Diah
 */
public class SK01PBOTI201920203405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int a = 1; a <= 10; a++){
            for(int b = 1; b < a; b++){
                System.out.print(" ");
            }
            for(int c = 10; c >= a; c--){
                System.out.print(" 5");
            }
            System.out.println();
        }
    }
    
}
