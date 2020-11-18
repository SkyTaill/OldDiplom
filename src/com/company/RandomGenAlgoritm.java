package com.company;

public class RandomGenAlgoritm {


    public static int StartGenAlgoritmRandom(int genArr) {
        int[] mass;
        int rand=0;
        int max=0;
        mass = FindSerchIndex(genArr);
        for (int i = 1; i < mass.length; i++) {
            if(mass[i]>max)
                max=mass[i];
        }

        int random_number1 = 1 + (int) (Math.random() * max);
    //    System.out.println("rand-"+random_number1);
        for (int i = 1; i < mass.length; i++) {
            //   System.out.println("fir-"+mass[i]);
        }
        rand = FindRand(mass, random_number1);
        for (int i = 1; i < mass.length; i++) {
            //   System.out.println(mass[i]);
        }

        mass=null;
        //   System.out.println("rand value-"+rand);
        return rand;
    }


    static int[] FindSerchIndex(int genArr) {
        int alf = 0;
        int[] mass;
        mass = new int[genArr];
        alf = Gen.chromosome[1].index;
        for (int i = 1; i < genArr; i++) {
            if (alf > Gen.chromosome[i].index) {
                alf = Gen.chromosome[i].index;
            }
        }
        for (int i = 0; i < genArr; i++) {
            if (alf == Gen.chromosome[i].index) {
                mass[i] = 1;
            } else {
                mass[i] = Gen.chromosome[i].index - alf;
            }
        }


        return mass;
    }



    static int FindRand(int[] massLoc, int a) {
        int min = 99;
        int mins=0;
        for (int i = 0; i < massLoc.length; i++) {
            if (massLoc[i] < a) {
                massLoc[i] = 0;
            }
        }
        for (int i = 0; i < massLoc.length; i++) {
            if ((min >= massLoc[i]) & (massLoc[i] != 0)) {
                min = massLoc[i];
                mins=i;


            }
        }
        return mins;
    }
}
