/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180144.sk01.pbo.ti20192020.pkg3.pkg4.pkg06;

/**
 *
 * @author Diah
 */
public class SK01PBOTI201920203406 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,k,p,q,r;
        int n =10;
        int di = n-1;
        for(i=0; i<n; i++){
            for(j=0; j<di; j++){
                System.out.print(" ");
            }
            for(k=0; k<=i; k++){
                System.out.print("6 ");
            }
            di--;
            System.out.println();
        }
        di = 0;
        for(p=(n); p>0; p--){
            for(q=0; q<di; q++){
               System.out.print(" ");
            }
            for (r=0; r<p; r++){
                System.out.print("6 ");
            }
            System.out.println();
            di++;
        }
    } 
}
