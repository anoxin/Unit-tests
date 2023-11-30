package main.java;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MyList lists = new MyList();

        int[] array1 = lists.createArray();
        double averageArray1 = lists.averageArray(array1);

        int[] array2 = lists.createArray();
        double averageArray2 = lists.averageArray(array2);

        lists.compareArray(averageArray1, averageArray2);
    }
}


