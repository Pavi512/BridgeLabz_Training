package com.bridgelabz.arrays;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class ElementFrequency {
    public static void elementOccurence(int[] ar){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for(int i=0; i<ar.length; i++){
            map.put(ar[i], map.getOrDefault(ar[i],0)+1);
        }
        Set<Entry<Integer,Integer>> entries = map.entrySet();
        for(Entry<Integer,Integer> e : entries){
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        elementOccurence(arr);
    }
}
