package com.goit.Luhn;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

//import java.utils.Sca
public class Runner {

    public static void main(String[] args) {
        System.out.println("Please neter card name:");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        int len = numbers.length();
        System.out.println("Length "+ len);
        int[] array = new int[len];
                for (int i = 0; i < numbers.length(); i++) {
            array[i] = Character.getNumericValue(numbers.charAt(i));

        }
          verifAlg luhn = new verifAlg(array);
    }
}