package com.example.course.exceptionapplication_solution;

import android.util.Log;

/**
 * Created by Laze on 9/2/2015.
 */
public class MainApp {

    public static void main(String[] args) {
        int[] array = new int[3];
        try {
            for (int i = 0; i < 3; ++i) {
                array[i] = i;
            }
            Log.i("", " " + array[1]);

            // This throw ArithmeticalException
            array[0] = 2/0;

        } catch (ArrayIndexOutOfBoundsException e) {
            // printed just to inform that we have entered the catch block
            System.out.println("Oops, we went to far, better go back to 0!");

        } catch(ArithmeticException ae) {
//			LOGGER.info(ae.toString());
            System.out.println(array);

        } finally{
            System.out.println(array);
        }

        Log.i("TAG", "Ova e super");
    }
}
