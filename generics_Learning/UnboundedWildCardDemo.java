/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics_Learning;

import java.util.Arrays;
import java.util.List;

public class UnboundedWildCardDemo {

    public static void display(List<?> ll) {
        for (Object o : ll) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        System.out.println("display values");
        display(l1);

        List<String> l2 = Arrays.asList("Hi", "Hello", "How are you");
        System.out.println("display values");
        display(l2);

    }
}
