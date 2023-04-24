package Session6.Main;

import Session6.Perwira;
import Session6.Pion;
import Session6.Sel;
import Session6.WarnaEnum;

import java.util.ArrayList;

public class Main {
    /*
    overloading
    - nama function harus sama
    - jumlah parameter beda
    - type data parameter beda

    overriding
    - nama function sama
    - beda antar class
     */

    // abstract class -> class yang memiliki abstract method / function

    // abstract method -> method yang belum di deskripsikan

    // interface
    // semua method adalah abstract
    // semua attributenya constanta
    public static void main(String[] args) {
//        Perwira p = new Perwira('A', 1, WarnaEnum.PUTIH);
        Pion pion = new Pion('B', 1, WarnaEnum.PUTIH);

        ArrayList<Sel> jalan = pion.kemungkinanJalan();
        for (Sel sel: jalan){
            System.out.println("" + sel.col + sel.row);
        }
    }
}
