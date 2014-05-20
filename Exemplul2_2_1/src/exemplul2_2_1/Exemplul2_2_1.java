/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplul2_2_1;
import exemplul2_2_1.twoClasses.*;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author rusucosmin
 */
public class Exemplul2_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FirstClass a = new FirstClass("Cosmin");
        SecondClass b = new SecondClass("Alis");
        Random r = new Random();
        int x = r.nextInt() % 10 + 1;
        for(int i = 1 ; i <= x ; ++ i) {
            FirstClass c = new FirstClass("" + (char)('a' + i));
        }
        
        System.out.println(FirstClass.numberOfClasses);
        System.out.println("Apasati Enter");
        try {
            System.in.read();
            System.in.skip(System.in.available());
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    
}
