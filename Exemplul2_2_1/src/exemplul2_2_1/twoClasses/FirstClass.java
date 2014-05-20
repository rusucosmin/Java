/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplul2_2_1.twoClasses;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rusucosmin
 */
public class FirstClass {
    public static int numberOfClasses = 0;
    private String name;
    public FirstClass() {
        ++ numberOfClasses;
        System.out.println("First Class created");
    }
    public FirstClass(String name) {
        ++ numberOfClasses;
        this.name = name;
        System.out.println("First Class created with name = " + name);
    }
}