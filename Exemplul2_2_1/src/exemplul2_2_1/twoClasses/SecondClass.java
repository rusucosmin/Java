/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplul2_2_1.twoClasses;

/**
 *
 * @author rusucosmin
 */
public class SecondClass {
    private String name;
    public SecondClass() {
        System.out.println("Second Class created");
    }
    public SecondClass(String name) {
        this.name = name;
        System.out.println("Second Class created with name = " + name);
    }
}
