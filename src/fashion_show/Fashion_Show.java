package fashion_show;

import java.util.Scanner;


public class Fashion_Show {








    public  static  void main (String args[]){
        Scanner entradaEscaner = new Scanner (System.in);
        int t;
        int n, m;
        String data[],temp_line;
        System.out.print("#Test Cases: ");

        t = entradaEscaner.nextInt();

        entradaEscaner.nextLine();

        for (int i=0; i < t; i++){

            System.out.print("give me N and M: ");

            temp_line = entradaEscaner.nextLine();

            data = temp_line.split(" ");

            n = Integer.parseInt(data[0]) ;

            m = Integer.parseInt(data[1]);

            Models mo = new Models(n,m);


            mo.printFashionMatrix();


        }



    }





}
