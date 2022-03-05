/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c2tc_m05;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("Hash");
        hs.add("Set");
        hs.add("Demo");
        hs.add("Demo");
         
        Iterator i=hs.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            System.out.println(o);
        }
    }
}
