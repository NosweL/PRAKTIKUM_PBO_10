/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.abstractclass;

/**
 *
 * @author lenovo
 */
public class Orang {

    private String nama;
    private Hewan hewanPeliharaan;

    Orang(String nama) {
        this.nama = nama;
    }

    public void peliharaHewan(Hewan peliharaan) {
        this.hewanPeliharaan = peliharaan;
    }

    public void ajakPeliharaanJalan() {
        System.out.println("Nama : " + nama);
        System.out.println("Hewan Peliharaanku Bergerak dengan : ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------");
    }
}
