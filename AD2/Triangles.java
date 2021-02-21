public class Triangles {
    public void print()
    {
        System.out.println("\n\n");
        // First pattern
        for(int i = 0; i < 10; i++)
        {
            // Print star
            for(int j = 0; j<i+1; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(); // End first pattern

        // Second pattern
        for(int i = 0; i < 10; i++)
        {
            // Print star
            for(int j = 10; j>i; j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(); // End second pattern

        // Third pattern
        for(int i = 0; i < 10; i++)
        {
            // Print space
            for(int s = 0; s < i; s++)
                System.out.print(' ');

            // Print star
            for(int j = 10; j>i; j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println(); // End third pattern

        // Fourth pattern
        for(int i = 0; i < 10; i++)
        {
            // Print space
            for(int s = 10; s > i + 1; s--)
                System.out.print(' ');

            // Print stars
            for(int j = 0; j < i + 1; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        } //End fourth pattern

        System.out.println("\n\n");
    }

}
