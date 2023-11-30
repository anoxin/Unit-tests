package main.java;

public class MyList {
    public int[] createArray() {
        return new int[]{(int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100), (int) (Math.random() * 100)};
    }

    public double averageArray(int[] array1) {
        double sum = 0;
        for (int arr: array1) {
            sum +=arr;
        }
        return sum/array1.length;
    }

    public String compareArray(double averageArray1, double averageArray2) {
        if(averageArray1 > averageArray2) {
            System.out.println("Первый список имеет большее среднее значение");
            return "Первый список имеет большее среднее значение";
        } else if (averageArray1 == averageArray2) {
                System.out.println("Средние значения равны");
                return "Средние значения равны";
        } else {
            System.out.println("Второй список имеет большее среднее значение");
            return "Второй список имеет большее среднее значение";
        }

    }
}
