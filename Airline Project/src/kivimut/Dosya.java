package kivimut;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Umut <3 Kıvanç
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class Dosya {
    public String[] DosyaOku() throws FileNotFoundException, IOException {
        try {
            String[] veriler = new String[20]; // String dizimizi tanımlıyoruz 
            FileReader file = new FileReader("item.txt"); // file reader ile dosyadan verileri okuyoruz
            BufferedReader reader = new BufferedReader(file);  // BufferedReader ile satır okumasını sağlıyoruz
            String satir = new String(); //string nesnemiz
            int i = 0;
            while ((satir = reader.readLine()) != null) { // Dosya sonuna gelene kadar oku
                veriler[i] = satir; // okunan değerlerin diziye satır satır aktarılması aktarılması
                i++;
            }
            reader.close();
            return veriler;
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Dosya Bulunamadı..");
        }
        return null;
    }
}
