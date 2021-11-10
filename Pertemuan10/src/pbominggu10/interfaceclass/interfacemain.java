/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbominggu10.interfaceclass;
import pbominggu10.interfaceclass.ICumlaude;
import pbominggu10.interfaceclass.Mahasiswa;
import pbominggu10.interfaceclass.PascaSarjana;
import pbominggu10.interfaceclass.Rektor;
import pbominggu10.interfaceclass.Sarjana;
/**
 *
 * @author lenovo
 */
public class interfacemain {
    public static void main(String[]args){
        
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhs = new Mahasiswa("Charlie");
        Sarjana scl = new Sarjana("Dini");
        PascaSarjana pscl = new PascaSarjana("Elok");
        
        //pakrektor.beriSertifikatCumlaude(msh);
        pakrektor.beriSertifikatCumlaude(scl);
        pakrektor.beriSertifikatCumlaude(pscl);
        
        //pakrektor.beriSertifikatMawapres(scl);
        pakrektor.beriSertifikatMawapres(pscl);
        
    }
}
