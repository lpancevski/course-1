package com.example.course.arrayapplication_solution;

/**
 * Created by Laze on 9/2/2015.
 */
public class MainApp {

    public static void main(String[] args) {

        // Array of int numbers
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("First array number value is: "+ numbers[i]);
        }

        for (int i : numbers) {
            System.out.println("ForEach loop: array number value is: "+ i);
        }

        // Array of Arrays (Matrix) of Strings
        String [][] firstMatrix = {
                {"q","w","e","t","y"},
                {"a","s","d","f","g"},
                {"z","x","c","v","b"}
        };

        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.println("First Matrix Value is: "+firstMatrix[i][j]);
            }
        }

        // Array with defined size
        int[]arrayNumbers = new int[2];
        arrayNumbers[0] = 1;
        arrayNumbers[1] = 2;
//		arrayNumbers[2] = 3;  This will throw ArrayIndexOutOfBoundsException
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Second array number value is: "+arrayNumbers[i]);
        }


        // Matrix with defined size
        String [][] secondMatrix = new String[2][2];
        secondMatrix[0][0] = "a";
        secondMatrix[0][1] = "b";
        secondMatrix[1][0] = "1";
        secondMatrix[1][1] = "2";
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.println("Second Matrix Value is: "+secondMatrix[i][j]);
            }
        }


    }
}
