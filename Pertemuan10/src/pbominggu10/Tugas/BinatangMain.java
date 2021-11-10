/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.Tugas;

/**
 *
 * @author lenovo
 */
public class BinatangMain {

    public static void main(String[] args) {

        Singa s1 = new Singa("Singa", 4, "KUKURUYUKKKK ROARRRRR", "Hitam Putih");
        s1.displayBinatang();
        s1.displayMakan();
        s1.displayData();

        Keledai k1 = new Keledai("Keledai", 4, "Kiek-kiek-kiek", "Abu-Abu");
        k1.displayBinatang();
        k1.displayMakan();
        k1.displayData();

        Gorilla g1 = new Gorilla("Gorilla", 2, "UU II U AA JENG JENG PALAPALA JENGJENG", "Hitam");
        g1.displayBinatang();
        g1.displayMakan();
        g1.displayData();

    }
}
