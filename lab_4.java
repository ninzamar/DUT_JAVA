import java.util.*;

public class MyClass {
    static String target;
    static int n = 3;
    public static void main(String args[]) {
        int values[] = new int[n];
        int sum = 0;
        int count = 0;
        String myString = "sjdhgfsjkavchjwagehf";
        String myNewSrting = "";
        List < String > myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        for (String item: myList) {
            if (item.contains("c")) {
                if (item.contains("2")) {
                    target = item;
                } else {
                    System.out.println(item);
                }
            }
        }
        System.out.println(target);

        for (int i = 0; i < values.length; i++) {
            values[i] = ((int)(Math.random() * 10));
            if (values[i] % 2 == 0) {
                sum = sum + values[i];
                count = count + 1;
            }
        }

        System.out.println(sum / count);

        String[] letters = myString.split("");
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals("h") || letters[i].equals("i") || letters[i].equals("j") ||
                letters[i].equals("k") || letters[i].equals("l") || letters[i].equals("m") ||
                letters[i].equals("o") || letters[i].equals("p") || letters[i].equals("1") ||
                letters[i].equals("r") || letters[i].equals("s") || letters[i].equals("t")) {
                letters[i] = letters[i].toUpperCase();
            }
        }

        for (int i = 0; i < letters.length; i++) {
            myNewSrting = myNewSrting.concat(letters[i]);
        }

        System.out.println(myNewSrting);

    }
}