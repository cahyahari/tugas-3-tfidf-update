/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tf.idf;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author Cahya HS
 */
public class TfIdf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.println("masukkan kalimat ke 1");
        String teks1 = a.nextLine();
        
        System.out.println("masukkan kalimat ke 2");
        String teks2 = a.nextLine();
        
//      String teks1 = "saya sedang kuliah di universitas";
//      String teks2 = "saya masuk sekolah dan saya sakit";
        
        System.out.println("Masukkan Kata");
        String teks = a.nextLine();
        
        Vector <String> kata1 = new Vector();
        Vector <String> kata2 = new Vector();
        StringTokenizer d = new StringTokenizer(teks1, " ");
        while (d.hasMoreElements()) {
            kata1.add(d.nextToken());
        }
        StringTokenizer dq = new StringTokenizer(teks2, " ");
        while (dq.hasMoreElements()) {
            kata2.add(dq.nextToken());
        }
        double jumlah_kata = 0;
        int cek_kata = 0;
        for (int i = 0; i < kata1.size(); i++) {
            if (kata1.get(i).equalsIgnoreCase(teks)) {
                jumlah_kata +=1;
                cek_kata = 1;
            }
        }
        double jumlah_kata2 = 0;
        int cek_kata2 = 0;
        for (int i = 0; i < kata2.size(); i++) {
            if (kata2.get(i).equalsIgnoreCase(teks)) {
                jumlah_kata2 +=1;
                cek_kata2 = 1;
            }
        }
        double total = cek_kata + cek_kata2;
        System.out.println("tf("+teks+",d1) = "+(int)jumlah_kata+"/"+kata1.size()+" = "+jumlah_kata/kata1.size());
        System.out.println("tf("+teks+",d2) = "+(int)jumlah_kata2+"/"+kata2.size()+" = "+jumlah_kata2/kata2.size());
        double log = Math.log10(total/2.0);
        System.out.println("idf("+teks+",D) = log("+(int)total+"/2) = "+log);
        
        System.out.println("tfidf("+teks+",d1) = "+(jumlah_kata/kata1.size())*log);
        System.out.println("tfidf("+teks+",d2) = "+(jumlah_kata2/kata2.size())*log);

    }
    
}
