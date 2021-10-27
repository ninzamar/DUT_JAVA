public class MyClass {

    public static void main(String[] args) {
        int values[][] = new int[3][3];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j] = ((int)(Math.random() * 10));
            }
        }
        MyClass myclass = new MyClass();
        myclass.printArray(values);
        //myclass.fillArray(0,10,2);
    }

    private void printArray(int[][] values) {
        int maxIdx = values.length - 1;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int z = maxIdx; z >= 0; z--) {
            if (values[z][maxIdx - z] % 2 == 0) {
                System.out.print(values[z][maxIdx - z] + " ");
            }
        }
    }

    private int[] fillArray(int begin, int end, int step) {
        int size = ((end - begin) / step) + 1;
        int values[] = new int[size];
        for (int i = 0; i < values.length; i++) {
            values[i] = begin;
            begin = begin + step;
        }

        return values;
    }
}