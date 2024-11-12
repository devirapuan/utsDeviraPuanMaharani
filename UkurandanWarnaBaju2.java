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
public class UkurandanWarnaBaju2 {
    String warna;
    int ukuran;
    
public UkurandanWarnaBaju2(String warna, int ukuran){
        this.warna= warna;
        this.ukuran= ukuran;
    }
String tentukanukuran(){
    if(ukuran <51){
        return "extraSmall";
    } else if ( ukuran >= 51 && ukuran < 55){
        return "medium";
    } else {
        return "doubleExtraLarge";
    }
}
public String getWarna(){
    return warna;
}
public int getUkuran(){
    return ukuran;
}
    
    void tampilkanInfo(){
        System.out.println("Warna:"+warna);
        System.out.println("Ukuran:"+ukuran);
}
}
