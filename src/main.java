/**
/@Title: Dobblesteen
/@Author: Amer Zahirovic
/@Group: IS109 SQUAD D
/Description: Een applicatie die herhaaldelijk een dobbelsteen gooit
/tot dat zes wordt gegooid. Na iedere worp moet de waarde afgedrukt worden als een “ASCII tekening"
*/

import java.util.Scanner;
public class main {

    public static void main(String[] args)
    {
        //Define the min and max of the dice
        final int MIN = 1;
        final int MAX = 6;

        //Define dice sides to be used later in the code
        final int DICE_SIDE_ONE = 1;
        final int DICE_SIDE_TWO = 2;
        final int DICE_SIDE_THREE = 3;
        final int DICE_SIDE_FOUR = 4;
        final int DICE_SIDE_FIVE = 5;

        //Ask for the character the person wants to use
        Scanner character = new Scanner(System.in);
        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        String c = character.nextLine();

        //Generates random number 1 - 6
        int randomInt = (int)(Math.random() * (MAX - MIN + MIN) + MIN);

        //First check if the number  is 6
        //If number is six display chosen char
        if (randomInt == MAX)
        {
            System.out.println("############");
            System.out.println("#    "  +c+ " " +c+"   #");
            System.out.println("#    "  +c+ " " +c+"   #");
            System.out.println("#    "  +c+ " " +c+"   #");
            System.out.println("############");
        }

        //While the number is not 6 keep going if the number reaches 6 stop
        while (randomInt != MAX)
        {
            //keep generating new number till 6 is hit
            int newRandom = randomInt = (int)(Math.random() * (MAX - MIN + MIN) + MIN);

            //Dice sides (tried to make it pretty)
            if (newRandom == MAX)
            {
                System.out.println("############");
                System.out.println("#    "  +c+ " " +c+"   #");
                System.out.println("#    "  +c+ " " +c+"   #");
                System.out.println("#    "  +c+ " " +c+"   #");
                System.out.println("############");
            }

            if (randomInt == DICE_SIDE_ONE)
            {
                System.out.println("############");
                System.out.println("#          #");
                System.out.println("#    "   +c+  "     #");
                System.out.println("#          #");
                System.out.println("############");
            }

            if (randomInt == DICE_SIDE_TWO)
            {
                System.out.println("############");
                System.out.println("#          #");
                System.out.println("#    "   +c+  "     #");
                System.out.println("#    "   +c+  "     #");
                System.out.println("############");
            }

            if (randomInt == DICE_SIDE_THREE)
            {
                System.out.println("############");
                System.out.println("#    "   +c+  "     #");
                System.out.println("#    "   +c+  "     #");
                System.out.println("#    "   +c+  "     #");
                System.out.println("############");
            }

            if (randomInt == DICE_SIDE_FOUR)
            {
                System.out.println("############");
                System.out.println("#          #");
                System.out.println("#    "  +c+ "" +c+  "    #");
                System.out.println("#    "  +c+ "" +c+  "    #");
                System.out.println("############");

            }

            if (randomInt == DICE_SIDE_FIVE)
            {
                System.out.println("############");
                System.out.println("#    "  +c+  "     #");
                System.out.println("#   "  +c+ " " +c+  "    #");
                System.out.println("#   "  +c+  " " +c+  "    #");
            }
        }

    }
}
