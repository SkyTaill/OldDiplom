package com.company;
//package com.List;
import com.Tree.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static void Start() {

    }
        public static void main(String[] args) {

            boolean T = false;
            Node root = null;




        root=AddElemenAtTree.AddTree(root);

                System.out.println("Введите колличество генов- \n");
                Scanner in = new Scanner(System.in);
                int input = in.nextInt();

                Matrix.CreateModel(root, input);

            while(T!=true) {
                System.out.println("вывод-1 закончить-2 \n");
                int input2 = in.nextInt();
                if(input2==1) {
                    System.out.println("выводELEMENT- \n");
                       int input3 = in.nextInt();
                       Matrix.PrintBigMatrix(input3);

                    for (int z = 0; z < 13; z++) {
                        System.out.println(z + "--elem-" + Gen.chromosome[input3].score[z]);
                    }
                         System.out.println("{fullScor}-" + Gen.chromosome[input3].index);



                GenAlgoritm.StartAlgoritm(input);


                }


                if(input2==2)
                    T=true;



            }

    }
}
