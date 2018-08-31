package fashion_show;

import java.util.Scanner;

public class Models {

    private int n, m, maxT;

    private String temp_line;

    private String data[];

    private char fashion_matrix [] [];

    Scanner entradaEscaner = new Scanner (System.in);



    public  Models(int n, int m){
        this.m = m;
        this.n = n;
        this.fashion_matrix = new char [n] [n] ;
        this.fillMatrix();
        this.getModelsPositions();


    }

    public void fillMatrix(){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                fashion_matrix [i][j] = '.';
            }
        }
    }

    public void printFashionMatrix() {

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(this.fashion_matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void getModelsPositions(){


        int pos_i, pos_j;
        char type_model;

        for (int i = 1; i <=m; i++){
            System.out.print("Give me Model Type(+,x,o), i Position, j Position : ");
            this.temp_line = this.entradaEscaner.nextLine();
            this.data = this.temp_line.split(" ");
            type_model = data[0].charAt(0);
            pos_i = Integer.parseInt(data[1]);
            pos_j = Integer.parseInt(data[2]);

            this.fashion_matrix[pos_i - 1][pos_j -1] = type_model;


        }
        this.maxT = 0;
        checkO(0,0);

    }

    public boolean checkO(int i, int j){

        int count = 0;


        if (validation(i,j) && this.maxT< (n*n)){

            this.maxT++;
            System.out.println(i+ " "+j);

            if (validation(i-1,j-1) && (this.fashion_matrix[i-1][j-1] == 'x' || this.fashion_matrix[i-1][j-1] == '.' ) ){
                checkO(i-1,j-1);
                count++;

            }

            if (validation(i+1,j-1) && ( this.fashion_matrix[i+1][j-1] == 'x' || this.fashion_matrix[i+1][j-1] == '.' ) ){
                checkO(i+1,j-1);
                count++;

            }
            if (validation(i+1,j+1) && (this.fashion_matrix[i+1][j+1] == 'x' || this.fashion_matrix[i+1][j+1] == '.' )){
                checkO(i+1,j+1);
                count++;


            }
            if (validation(i-1,j+1) && (this.fashion_matrix[i-1][j+1] == 'x' || this.fashion_matrix[i-1][j+1] == '.')){
                checkO(i-1,j+1);
                count++;



            }

            if (validation(i-1,j) && (this.fashion_matrix[i-1][j] == '+' || this.fashion_matrix[i-1][j] == '.' ) ){
                checkO(i-1,j);
                count++;

            }

            if (validation(i,j-1) && (this.fashion_matrix[i][j-1] == '+' || this.fashion_matrix[i][j-1] == '.' ) ){
                checkO(i,j-1);
                count++;

            }

            if (validation(i+1,j) && (this.fashion_matrix[i+1][j] == '+' || this.fashion_matrix[i+1][j] == '.' ) ){
                checkO(i+1,j);
                count++;

            }

            if (validation(i,j+1) && (this.fashion_matrix[i][j+1] == '+' || this.fashion_matrix[i][j+1] == '.'  )){
                checkO(i,j+1);
                count++;


            }

            if(count == 8){

                this.fashion_matrix[i][j] = 'o';


            }








        }


        return true;
    }

    public boolean validation(int i, int j){
        if (i >=0 && i <n && j >=0 && j <n ){

            return true;

        }
        else{
            return false;
        }

    }

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }
}
