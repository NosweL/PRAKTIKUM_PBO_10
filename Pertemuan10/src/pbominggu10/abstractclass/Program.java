/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.abstractclass;

/**
 *
 * @author lenovo
 */
public class Program {

    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaHewan(kucingKampung);
        budi.peliharaHewan(lumba);

        ani.ajakPeliharaanJalan();
        budi.ajakPeliharaanJalan();
    }
}
