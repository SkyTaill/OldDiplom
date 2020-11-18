package com.company;

public class Gen {
    //static double mutation = 1; // Мутации, по сути точность вычисления значения функции.
    static int KolChromosome=50 ;                                              //FIIIIXXXXXXXXX  количество генов
    static int Full=0;
    static int LFull=0;
    static int it=0;
    public  static Object[] chromosome = new Object[KolChromosome];
    public static int z12=16;                                                    //FFFFFIIIIXXXXXX         кол-элементов дерева
    public static int[] arrayAll=new int [z12];
    public static int[] LarrayAll=new int [z12];

/*/
        Gen(int KolChromosome,int Full,int it,Object [] chromosome,int z12,int[] arrayAll){
        this.KolChromosome=KolChromosome;
        this.Full=Full;
        this.it=it;
        this.chromosome=chromosome;
        this.z12=z12;
        this.arrayAll=arrayAll;
    }
/*/

        public static void AddElementList(int index,int score){

            arrayAll[index]=score;
            LarrayAll[index]=score;
            Full+=score;
            LFull+=score;



        }
        public static void AddInList() {

            chromosome[it] = new Object(Full, arrayAll,Matrix.array,           LFull, LarrayAll,Matrix.Larray);
            it++;
           Full=0;
           Matrix.array=new int [Matrix.z][Matrix.z1];
            Matrix.Larray=new int [Matrix.z][Matrix.z1];
           arrayAll=new int [z12];
            LarrayAll=new int [z12];



        }

}
