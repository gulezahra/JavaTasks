package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        boolean isMatched;

        for (int i = 0; i < a.length; i++) {
            isMatched = false;
            a[i] = r.nextInt(6);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isMatched = true;
                    break;
                }
            }
            if (isMatched) {
                i--;
            }
        }
    }
}
