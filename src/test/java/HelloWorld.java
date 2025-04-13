import java.util.Scanner;

public class HelloWorld {

    /*
    This is my HelloWorld demo
    */
    public static void main(String[] args) {

        System.out.println("What is your name?");
        Scanner scan = new Scanner(System.in);
        String myName = scan.next();

        if (myName.equalsIgnoreCase("ftc")) myName = "FTC";

        // write hello world 5 times
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello, " + myName);
//        }

        int i = 0;
        while (i < 5) {
            i++;
            //System.out.println("Hello, " + ((i == 5) ? "Robo" : myName));
            if (i == 5) myName = "Robo";
            System.out.println("Hello, " + myName + "!");
        }
    }
}
