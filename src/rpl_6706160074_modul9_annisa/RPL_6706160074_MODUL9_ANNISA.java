/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpl_6706160074_modul9_annisa;

/**
 *
 * @author APEX
 */
public class RPL_6706160074_MODUL9_ANNISA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner pramana = new java.util.Scanner(System.in);
        System.out.print("Masukan Input Angka : ");
        int n = pramana.nextInt();
        long dataangka[] = new long[n];
         
        dataangka[0] = 0;
        dataangka[1] = 1;
        
        for(int i = 2; i < n; i++) {
            dataangka[i] = dataangka[i-1] + dataangka[i-2];
        }
         
        for (int i = 0; i < n; i++) {
            System.out.print(dataangka[i] +  " ");
        }
    }
    
}
