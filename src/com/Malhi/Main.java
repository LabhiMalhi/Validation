package com.Malhi;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> hostList = new ArrayList<>();
        hostList.add("Labi");
        //System.out.println("Sab toh pehla kaun aaya => "+hostList);
        List<String> guestList = new ArrayList<>();

        guestList.add("Gagan");
        guestList.add("Ramu");
        //System.out.println("fer kaun aaya => " +guestList);
        List<String> newList = Arrays.asList("Bikram","Pankaj");
        //System.out.println("fer ehe aaye => "+newList);
        guestList.addAll(2,newList);
        //System.out.println("saale chaar landu => " + guestList);
        hostList.addAll(1,guestList);
       // System.out.println("Last vich asi panj reh gye => " + hostList);
       // if(hostList.contains("Labi")){
            //System.out.println("It in the list");

       // }else
        //{
          //  System.out.println("Not exists");
        //}
      //  System.out.println(hostList.size());
        //System.out.println(hostList.equals(hostList));
        //System.out.println(hostList.indexOf("Ramu"));
        //System.out.println(hostList.get(3));
       // Iterator<String> iterator = hostList.iterator();
        //while(iterator.hasNext()){
          //  String el = iterator.next();
            //System.out.println(el);
       // }
        for (String s: hostList) {
            System.out.println(s);

        }



    }
}
