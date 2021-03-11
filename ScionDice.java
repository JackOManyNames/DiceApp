import java.util.*;
public class ScionDice
{
    public static void main(String [] args)
    {
        System.out.println("\n\n\n\n             Scion Dice Roller" + 
                           "\n===============================================\n");
        int v;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Enter 1 - 10 to roll 1 - 10 D10. Enter r to enter custom number");
            v = sc.nextInt();
            System.out.println("\n");
            summary(v);
        } while (v != 0);
        sc.close();
    }

    public static void summary(int choice)
    {
        int total = 0;

        for(int i = 0; i < choice; i++)
        {
            Random r = new Random();
            int v = r.nextInt(10) + 1;
            System.out.print("| " + v);
            if(v >= 7 && v <= 9)
            {
                total += 1;
            }
            else if(v == 10)
            {
                total += 1;
                choice++;
            }
        }
        if(total == 0)
        {
            System.out.println("\n                   Failure");
        }
        else
        {
            System.out.println("\n\nNumber of Successes: " + total);
        }
        System.out.println("\n=======================================================");
    }
}