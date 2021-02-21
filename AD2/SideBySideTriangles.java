public class SideBySideTriangles
{
    public void print()
    {
        System.out.println("\n\n");

        for(int i = 0; i < 10; i++)
        {
            // First pattern
            for(int j = 0; j<i+1; j++)
            {
                System.out.print('*');
            }

            //Space
            for(int s = 16; s > i + 1; s--)
                System.out.print(' ');

            // Second pattern
            for(int j = 10; j>i; j--)
            {
                System.out.print('*');
            }

            //Space
            for(int s = 0; s < (6+(2*i)); s++)
                System.out.print(' ');

            // Third pattern
            for(int j = 10; j>i; j--)
            {
                System.out.print('*');
            }

            // Space
            for(int s = 16; s > i + 1; s--)
                System.out.print(' ');

            // Fourth pattern
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print('*');
            }

            System.out.println();
        }

        System.out.println("\n\n");
    }
}
