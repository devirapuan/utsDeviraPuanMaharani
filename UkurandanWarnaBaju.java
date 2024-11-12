/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukurandanwarnabaju;

/**
 *
 * @author ITBI 37
 */
public class UkurandanWarnaBaju {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UkurandanWarnaBaju2 small= new UkurandanWarnaBaju2("Merah", 55);
        UkurandanWarnaBaju2 large= new UkurandanWarnaBaju2("Hijau", 61);
        UkurandanWarnaBaju2 extraLarge= new UkurandanWarnaBaju2("Biru", 67);
        
        System.out.println("====Data Anggota Keluarga====");
        small.tampilkanInfo();
        System.out.println();
        large.tampilkanInfo();
        System.out.println();
        extraLarge.tampilkanInfo();
        System.out.println();
    }
    
}
