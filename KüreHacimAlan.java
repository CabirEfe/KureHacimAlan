/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class KüreHacimAlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner yusuf = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("Lütfen Kürenin Yarıçapını Giriniz: ");
        double yç = yusuf.nextDouble();
        
        
        double pi = 3.14;
        double hacim = 4/3 * pi * yç * yç * yç;
        double alan = 4 * pi * yç * yç;
        
        
        
        System.out.println("Kürenin Hacmi: "+hacim);
        System.out.println("Kürenin Alanı: "+alan);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
