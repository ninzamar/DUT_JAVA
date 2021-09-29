package com.company;
public class Main {
    private static int[][] Random(int[][] arr, int max, int min)
    {
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; ++j)
            {
                arr[i][j] = (int)(Math.random() * (max - min + 1) + min);
            }
        }
        return arr;
    }
    private static int[] Array(int go, int step_plus, int end)
    {
        int[] arr = new int[(end - go) / step_plus + 1];
        for (int i = 0; i < arr.length; ++i)
        {
            arr[i] = go + i * step_plus;
        }
        return arr;
    }
    private static int[] Diagonal(int[][] arr)
    {
        int[] Diagonal = new int[arr[0].length];
        for (int i = 0; i < arr.length; ++i)
        {
            for (int j = 0; j < arr[i].length; ++j)
            {
                if(i == j)
                {
                    Diagonal[j] = arr[i][arr[i].length - j - 1];
                }
            }
        }
        return Diagonal;
    }
    private static void printArray(int[][] arr)
    {
        for (int[] row : arr)
        {
            for (int value : row)
            {
                System.out.print(value);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    private static void printArray(int[] arr)
    {
        for (int value : arr)
        {
            System.out.print(value);
            System.out.print(' ');
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = new int[5][5];
        printArray(Random(arr, 0, 9));
        System.out.println();
        int[] diagonal = Diagonal(arr);
        for (int value : diagonal)
        {
            if (value % 2 == 0)
            {
                System.out.print(value);
                System.out.print(' ');
            }
        }
        System.out.println();
        printArray(Array(0, 10, 5));
    }
}