package com.company;
import java.util.Random;
import com.Tree.BST;
import com.Tree.Node;

import static com.Tree.BST.traverseInOrder;

public class Matrix {
    public static int z = 30;

    public static int z1 = 10;
    public static int MaxSize=0;

    public static int[][] array = new int[z][z1];
    public static int[][] Larray = new int[z][z1];
    public static int[] arrayAll=new int [13];
    

    /*
    public static int i1=0;
    public static void NullMatrix() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
            }
        }
    }
/*/



    public static void GetMatrix(Node node) {
        if (node != null) {
            GetMatrix(node.right);
       //     MaxSizeFull=MaxSize;
            MaxSize=0;
           //  System.out.print(" " + node.data + " H-" + node.high + "L-"+ node.lengh + "index-"+ node.index + "\n");
            Star(node.data, node.high, node.lengh,node.index);

            GetMatrix(node.left);
        }
    }


    public static void Star(int a, int high, int lan,int index) {

        int rand = 0, rand2 = 0;
        boolean P = false;
        Random r = new Random();
        int flag2 = 0;
        while (P != true) {
            rand = r.nextInt(z - 0) + 0;
            rand2 = r.nextInt(z1 - 0) + 0;
            int flag = 0;
            flag2++;
            if ((a > 5) & (a < 7)) {
                rand = r.nextInt(20 - 13) + 13;

              //  System.out.println("(7>a>5z==" + rand + " ves" + a);
            }
            if (a >= 7) {
                rand = r.nextInt(17 - 13) + 13;

              //  System.out.println("a>=7==" + rand + " ves" + a);
            }
            if (flag2 < 5) {
                rand2 = 0;
               // System.out.println("rand<4=" + rand2);

            }
            if ((flag2 > 4) & (flag2 < 20)) {
                rand = r.nextInt(8 - 1) + 0;
              //  System.out.println("rand>3<20=" + rand2);

            }

            if (rand + high <= z) {
                if (rand2 + lan <= z1) {


                    for (int i1 = rand; i1 < rand + high; i1++) {
                        for (int i2 = rand2; i2 < rand2 + lan; i2++) {
                            if (array[i1][i2] != 0) {
                                flag = 1;
                            }

                        }
                    }
                    if (flag == 0) {
                        P = true;
                        flag2 = 0;
                   //     System.out.println("THISS" + a);
                    }
                }
            }
        }

        int Score=0;



        for (int i1 = rand; i1 < rand + high; i1++) {
            for (int i2 = rand2; i2 < rand2 + lan; i2++) {

                array[i1][i2] = index;
                Larray[i1][i2]=index;
                Score=Score+TakeScore(i1);

            }


        }




        MaxSize+=Score;

        Gen.AddElementList(index,Score);

    }
/*/
    public static void Copy(int m) {
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z1; j++) {
                arrayBig[m][i][j] = array[i][j];
            }
        }

        NullMatrix();

    }
    /
 */
    public static void PrintBigMatrix(int m){
        System.out.println("BigMatrix "+m+"\n");
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z1; j++) {
                System.out.print(Gen.chromosome[m].Matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void CreateModel(Node root,int iter){
      for(int i=0; i<iter ;i++){

          GetMatrix(root);
        Gen.AddInList();



        }


    }

    public static int TakeScore(int alf){
       int score=0;

        if((alf>=14)&&(alf<=16))
        {
            score=3;
           // System.out.println(alf+"ocki-"+score);
        }
      else   if((alf>=17)&&(alf<=21))
        {
            score=2;
           // System.out.println(alf+"ocki-"+score);
        }
       else if((alf>=9)&&(alf<=13))
        {
            score=2;
          //  System.out.println(alf+"ocki-"+score);
        }
        else {
            score = 1;

           // System.out.println(alf + "ocki-" + score);
        }
        return score;
    }



}