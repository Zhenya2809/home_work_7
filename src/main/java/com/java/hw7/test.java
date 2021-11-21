package com.java.hw7;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
    private static int[] array = new int[10];
    /**
     * Current size of the array
     */
    private static int size = 0;

    public static void main(String[] args) {
        add(5);
        add(6);
        add(5);
        remove(5);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Method for adding element to the array
     *
     * @param element represents number need to add
     */
    public static void add(int element) {
        if (size == array.length) {
            resize();
        }
        array[size++] = element;
    }
    public static boolean remove(int element) {
        if(array[0]==element){
            System.arraycopy(array, 1, array, 0, array.length - 1);
            return true;

        }else {return false;}
    }


    private static void resize() {
        int[] array1 = new int[array.length + 1];
        System.arraycopy(array, 0, array, 0, array.length);
        array = array1;
    }
}
