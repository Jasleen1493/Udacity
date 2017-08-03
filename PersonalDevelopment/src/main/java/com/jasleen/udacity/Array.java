package com.jasleen.udacity;

/**
 * Created by jasleen on 7/26/2017.
 */
    public class Array {

        public static void main(String[] args) {
            int[][] array1 = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(array1[i][j] == 0){
                        if(i== 0 && j==0){
                            array1[i+1][j+1]=array1[i+2][j+2] =0;
                        }
                        else if(i== 0 && j==1){
                            array1[i][j-1]=array1[i+2][j+1]=0;
                        }
                        else if(i==0 && j==2){

                        }
                    }

                }
            }
    }
}
