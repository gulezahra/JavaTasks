package com.company;
import java.util.*;

/**
 * Created by gulezahra on 6/16/2016.
 */
public class Assign3 {
    public static void main(String[] args) {
        int z;
        int a[] = new int [5];
        Random r = new Random();

        System.out.println("Unsorted List : ");

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.println(a[i]);
        }

        System.out.println("Sorted list in Ascending Order : ");
        for(int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) // > for Descending Order
                {
                    z = a[i];
                    a[i] = a[j];
                    a[j] = z;
                }
            }
        }

        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}


