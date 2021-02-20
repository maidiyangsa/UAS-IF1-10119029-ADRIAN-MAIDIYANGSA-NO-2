/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldotabungan;

/**
 *
 * @author Beta Three
 */
public class UASIF110119029ADRIANMAIDIYANGSANO2 {
        
    public void TampilSaldo(){
        int i = 1;
        int saldoAwal = 100000;
        while (i <= 5) {
            saldoAwal = saldoAwal + 500;
            System.out.print("Saldo di bulan ke-" + i + " Rp.");
            i++;
            System.out.println(saldoAwal);
        }
    }
    
}
