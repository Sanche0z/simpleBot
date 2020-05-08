import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        //System.out.println("Hello \n Hello");
        greet("Ant", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }
    static int getNumber() {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a positive number: ");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static Boolean checkName(String name) {
        int i = 0;
        char ch;
        boolean number = false;
        while (i < name.length()) {
            if (Character.isDigit(name.charAt(i))) {
                number = true;
            }
            i++;
        }
        return false;
    }

    static void remindName() {
        String name = scanner.nextLine();
        int i = 0;
        boolean number = false;
        while (i < name.length()) {
            if (Character.isDigit(name.charAt(i))) {
                number = true;
            }
            i++;
        }
        if (number) {
            System.out.println("What a strange name you have, " + name + "!");
        } else {
            System.out.println("What a great name you have, " + name + "!");
        }

    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = getNumber();
        int rem5 = getNumber();
        int rem7 = getNumber();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        if (age < 80) {
            System.out.println("Your age is " + age + "; that's a good time to start programming!");
        } else {
            System.out.println("If you are really so old, it will be difficult to surprise you.");
        }

    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = getNumber();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        String[] arrayTest;
        arrayTest = new String[3];
        int[] arrayAnswer;
        arrayAnswer = new int[3];
        arrayTest[0] = "What does \" WTF \" usually mean in English slang?\n";
        arrayTest[0] += "1. Where’s the fish?.\n";
        arrayTest[0] += "2. What the fuck?!\n";
        arrayTest[0] += "3. We turn famous.";
        arrayAnswer[0] = 2;

        arrayTest[1] = "What is usually hidden behind the abbreviation \"OMG?\"\n";
        arrayTest[1] += "1. One married guy.\n";
        arrayTest[1] += "2. Oh my god!\n";
        arrayTest[1] += "3. Only Mexican guitars.";
        arrayAnswer[1] = 2;

        arrayTest[2] = "How did Shakespeare sound in the original?\n";
        arrayTest[2] += "1. To be or not to be.\n";
        arrayTest[2] += "2. Two pea or not two pea..\n";
        arrayTest[2] += "3. Two bee or not two bee..";
        arrayAnswer[2] = 1;

        System.out.println("Let's test your programming knowledge.");
        int answer;
        int i = 0;
        while (i < 3) {
            System.out.println(arrayTest[i]);
            answer = getNumber();
            while (answer != arrayAnswer[i]) {
                System.out.println("Please, try again.");
                System.out.println(arrayTest[i]);
                answer = getNumber();
            }
            i++;
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
