import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in ett godtyckligt antal tal och lagra dem i en lista (avsluta inläsning med EoF)
        // Loopa igenom listan och skriv ut alla tal, men skriv inte ut dubbletter

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Ange tal: ");
        while (input.hasNextInt()) {
            numbers.add(input.nextInt());
        }

        for (int i=0; i < numbers.size(); i ++) {
            int number = numbers.get(i);
            if (numbers.indexOf(number) == i) {
                System.out.println(number);
            }
        }
    }
}