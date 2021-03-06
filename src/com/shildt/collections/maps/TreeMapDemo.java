package com.shildt.collections.maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
p.611
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Double> hm = new TreeMap<>();
        //input elements to the HashMap
        hm.put("Some Jon", 3434.34);
        hm.put("Some Mary", 123.22);
        hm.put("Some Tad", 1378.00);
        hm.put("Some Larry", 99.22);
        hm.put("Some Smith", - 19.08);
        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> me: set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();
        //put 100 to Jon account
        double balance = hm.get("Some Mary");
        hm.put("Some Jon", balance + 100);
        System.out.println("new balance on the Some Jone account is: " + hm.get("Some Mary"));
    }
}
