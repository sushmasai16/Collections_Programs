/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coll.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author HOME
 */
public class ListSampleExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> listObj = new ArrayList<String>();
        
        listObj.add("hello");
        listObj.add("sushma");
        listObj.add("how");
        listObj.add("r u");
        listObj.add(1, "wt");
//        for (String listObj1 : listObj) {
//            System.out.println("list obj : "+listObj1);
//        }
        System.out.println("list : "+listObj);
        List<String> listObj1 = new ArrayList<String>();
        listObj1.addAll(listObj);
        System.out.println("list : "+listObj1);
        listObj1.add(1, "srikanth");
        listObj1.add("hello");
        System.out.println("list : "+listObj1);
        System.out.println("list : "+listObj1.remove(1));
        System.out.println("list : "+listObj1);
        listObj1.set(1, "srikanth");
        System.out.println("list : "+listObj1);
        System.out.println("list : "+listObj1.indexOf(1));
        System.out.println("list : "+listObj1.lastIndexOf("hello"));
        
        ListIterator<String> listIterator = listObj.listIterator();
        listIterator.add("sushma");
        while(listIterator.hasNext()){
            String input =listIterator.next();
            listIterator.add("test");
            listIterator.previous();
            System.out.println("listiterator : "+listIterator.next());
        }
        while(listIterator.hasNext()){
//            String input =listIterator.next();
//            listIterator.add("test");
//            listIterator.previous();
            System.out.println("listiterator : "+listIterator.next());
        }
        System.out.println("iterartor : "+listIterator);
//        while(listIterator.hasPrevious()){
//            System.out.println("listiterator : "+listIterator.previous());
//        }
        
    }
    
}
