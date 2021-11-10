/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.interfaceclass;

/**
 *
 * @author lenovo
 */
public class Sarjana extends Mahasiswa implements ICumlaude {
    
    public Sarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Nama Saya : "+nama);
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggi() {
        System.out.println("IPK-Ku lebih dari 3,51");
    }
    
}
