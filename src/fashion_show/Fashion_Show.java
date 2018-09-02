package fashion_show;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fashion_Show {








    public  static  void main (String args[])throws FileNotFoundException, IOException{
        FileReader f = new FileReader("test.in");
        BufferedReader b = new BufferedReader(f);
        Scanner entradaEscaner = new Scanner (System.in);
        int t;
        int n, m;
        String data[],temp_line;
        t = Integer.parseInt(b.readLine());



        for (int i=0; i < t; i++){


            temp_line = b.readLine();

            data = temp_line.split(" ");

            n = Integer.parseInt(data[0]) ;

            m = Integer.parseInt(data[1]);

            char matrix [][] = new char[n][n];

            matrix = fillMatrix(matrix,n);

            int pos_i, pos_j;
            char type_model;

            for (int j = 0; j <m; j++){

                temp_line = b.readLine();
                data = temp_line.split(" ");
                type_model = data[0].charAt(0);
                pos_i = Integer.parseInt(data[1]);
                pos_j = Integer.parseInt(data[2]);

                matrix[pos_i - 1][pos_j -1] = type_model;


            }

            Models mo = new Models(n,m,matrix);

            mo.printFashionMatrix();


        }

        b.close();



    }

    public static  char[][] fillMatrix(char [][]matrix, int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix [i][j] = '.';
            }
        }

        return matrix;
    }





}
