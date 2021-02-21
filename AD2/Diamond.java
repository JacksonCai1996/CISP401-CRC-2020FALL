import java.util.*;

public class Diamond
{
    public void print()
    {
        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("\n\n");
        System.out.print("Enter number of rows (odd number 1 to 19): ");
        n = input.nextInt();

        while(n%2 == 0 || n > 19)
        {
            System.out.printf("%n** The inputted row number, %d, is not correct. **%n",n);
            System.out.print("Enter number of rows (odd number 1 to 19): ");
            n = input.nextInt();
        }

        for(int i = 0; i <= n/2 ; i++)
        {
                // Space
                for(int s = n/2; s > i; s--)
                    System.out.print(' ');

                // print star
                for(int j = 0; j < 2*(i+1) - 1; j++)
                    System.out.print('*');

                System.out.println();
        }

        for(int i = 1; i <= n/2 ; i++)
        {
            // Space
            for (int s = 0; s < i; s++)
                System.out.print(' ');

            // print star
            for (int j = n; j > (2 * i); j--)
                System.out.print('*');

            System.out.println();
        }

        System.out.println("\n");

    }
}
