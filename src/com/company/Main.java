package com.company;

//Задание 1,2,3

public class Main {

    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        int sum = 0;
        for (int a = 0; a < arr.length; a++) {
            sum += arr [a];
        }

        int maxArr = arr[0];
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] < maxArr) {
                maxArr = arr[a];
            }
            int minArr = arr[0];
            for (int b = 0; b < arr.length; b++) {
                if(arr[b] > minArr) {
                    minArr = arr[b];
                }
                double avgArr =maxArr / arr.length ;
                System.out.println("Средняя сумма трат за месяц составила " + avgArr + " рублей.");
                {

                }

            }
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Максимальная сумма трат за день составила " +  maxArr + " рублей");
        System.out.println("Минимальная сумма трат за день составила " +  minArr + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;
    }
    //Задание 4
    char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};{
        for( int d = reverseFullName.length - 1; d >=0; d--) {
            System.out.print(reverseFullName[d]);


        }

    }

}





