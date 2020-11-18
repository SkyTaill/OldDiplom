package com.company;
import java.util.Arrays;
public class GenAlgoritm {

    public static void StartAlgoritm(int input) {






        int[] a=new int[input];

        for(int i=0;i<input;i++) {

                a[i] = RandomGenAlgoritm.StartGenAlgoritmRandom(input);



        }




        for (int i = 1; i < input; i++) {
            System.out.println("fullrand-" + a[i]);
        }

        int gen = 0;


    }
}



