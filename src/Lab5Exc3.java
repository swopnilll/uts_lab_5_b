import java.util.Scanner;

public class Lab5Exc3 {

    public static void getSolution(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentence");

        char inputChar;


        int[] vowels = {'a', 'e', 'i', 'o', 'u'};

        int count = 0;

        do {
            inputChar = scanner.next().charAt(0);

            for (int vowel : vowels) {
                if (Character.toLowerCase(inputChar) == vowel) {
                    count++;
                }
            }


        } while (inputChar != '*');

        System.out.println("Vowel Count " +count);
    }

}
