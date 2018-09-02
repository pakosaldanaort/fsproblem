package fashion_show;

import java.util.Scanner;

public class Models {

    private int n, m;

    private String temp_line;

    private String data[];

    private char fashion_matrix [] [];

    Scanner entradaEscaner = new Scanner (System.in);



    public  Models(int n, int m, char[][] matrix){
        this.m = m;
        this.n = n;
        this.fashion_matrix = matrix;
        //this.getModelsPositions();


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



        checkO(n-1,n-1);

        checkPlus(n-1,n-1);

        checkX(n-1,n-1);


    }

    public void checkO(int i, int j){

        int count = 0;

        if (validation(i,j) ){

            if (validation(i-1,j-1) && (this.fashion_matrix[i-1][j-1] == 'x' || this.fashion_matrix[i-1][j-1] == '.'  ) ){
                count++;
            }
            if (validation(i+1,j-1) && ( this.fashion_matrix[i+1][j-1] == 'x' || this.fashion_matrix[i+1][j-1] == '.' ) ){
                count++;
            }
            if (validation(i+1,j+1) && (this.fashion_matrix[i+1][j+1] == 'x' || this.fashion_matrix[i+1][j+1] == '.' )){
                count++;
            }
            if (validation(i-1,j+1) && (this.fashion_matrix[i-1][j+1] == 'x' || this.fashion_matrix[i-1][j+1] == '.')){
                count++;
            }
            if (validation(i-1,j) && (this.fashion_matrix[i-1][j] == '+' || this.fashion_matrix[i-1][j] == '.' ) ){
                count++;
            }
            if (validation(i,j-1) && (this.fashion_matrix[i][j-1] == '+' || this.fashion_matrix[i][j-1] == '.' ) ){
                count++;
            }
            if (validation(i+1,j) && (this.fashion_matrix[i+1][j] == '+' || this.fashion_matrix[i+1][j] == '.' ) ){
                count++;
            }
            if (validation(i,j+1) && (this.fashion_matrix[i][j+1] == '+' || this.fashion_matrix[i][j+1] == '.'  )){
                count++;
            }

            if(!validation(i-1,j-1)){
                count++;
            }

            if(!validation(i+1,j-1) ){
                count++;
            }
            if(!validation(i+1,j+1)  ){
                count++;
            }
            if(!validation(i-1,j+1) ){
                count++;
            }
            if(!validation(i-1,j) ){
                count++;
            }

            if(!validation(i,j-1) ){
                count++;
            }
            if(!validation(i+1,j) ){
                count++;
            }
            if(!validation(i,j+1) ){
                count++;
            }

            if(count == 8){
                this.fashion_matrix[i][j] = 'o';
            }

            if(j == 0){
                i--;
                j = n-1;
            }else{
                j--;
            }

            this.checkO(i,j);
        }

    }

    public void checkPlus(int i, int j){

        int count = 0;

        if (validation(i,j)  ){

            if (validation(i-1,j-1) && this.fashion_matrix[i][j]=='.' && (this.fashion_matrix[i-1][j-1] == 'x' || this.fashion_matrix[i-1][j-1] == '.' ) ){
                count++;

            }
            if (validation(i+1,j-1) && this.fashion_matrix[i][j]=='.' &&( this.fashion_matrix[i+1][j-1] == 'x' || this.fashion_matrix[i+1][j-1] == '.' ) ){
                count++;
            }
            if (validation(i+1,j+1) && this.fashion_matrix[i][j]=='.' &&(this.fashion_matrix[i+1][j+1] == 'x' || this.fashion_matrix[i+1][j+1] == '.' )){
                count++;
            }
            if (validation(i-1,j+1) && this.fashion_matrix[i][j]=='.' && (this.fashion_matrix[i-1][j+1] == 'x' || this.fashion_matrix[i-1][j+1] == '.')){
                count++;
            }
            if(!validation(i-1,j-1) && this.fashion_matrix[i][j]=='.'){
                count++;
            }

            if(!validation(i+1,j-1) && this.fashion_matrix[i][j]=='.'){
                count++;
            }
            if(!validation(i+1,j+1) && this.fashion_matrix[i][j]=='.'){
                count++;
            }
            if(!validation(i-1,j+1) && this.fashion_matrix[i][j]=='.'){
                count++;
            }

            if(count == 4){
                this.fashion_matrix[i][j] = '+';
            }

            if(j == 0){
                i--;
                j = n-1;


            }else{
                j--;
            }

            this.checkPlus(i,j);
        }
    }

    public void checkX(int i, int j){

        int count = 0;

        if (validation(i,j)  ){

            if (validation(i-1,j) && this.fashion_matrix[i][j]=='.' &&  (this.fashion_matrix[i-1][j] == '+' || this.fashion_matrix[i-1][j] == '.'  ) ){
                count++;
            }

            if (validation(i,j-1) && this.fashion_matrix[i][j]=='.' &&  (this.fashion_matrix[i][j-1] == '+' || this.fashion_matrix[i][j-1] == '.' ) ){
                count++;
            }

            if (validation(i+1,j) && this.fashion_matrix[i][j]=='.' &&   (this.fashion_matrix[i+1][j] == '+' || this.fashion_matrix[i+1][j] == '.' ) ){
                count++;
            }

            if (validation(i,j+1) && this.fashion_matrix[i][j]=='.' &&   (this.fashion_matrix[i][j+1] == '+' || this.fashion_matrix[i][j+1] == '.'  ) ){
                count++;
            }
            if(!validation(i-1,j) && this.fashion_matrix[i][j]=='.'){
                count++;
            }
            if(!validation(i,j-1) && this.fashion_matrix[i][j]=='.'){
                count++;
            }
            if(!validation(i+1,j) && this.fashion_matrix[i][j]=='.'){
                count++;
            }
            if(!validation(i,j+1) && this.fashion_matrix[i][j]=='.'){
                count++;
            }

            if(count == 4){
                this.fashion_matrix[i][j] = 'x';
            }
            if(j == 0){
                i--;
                j = n-1;


            }else{
                j--;
            }

            this.checkX(i,j);

        }

    }

    public boolean validation(int i, int j){
        if (i >=0 && i <n && j >=0 && j <n ){

            return true;

        }
        else{
            return false;
        }

    }


}
