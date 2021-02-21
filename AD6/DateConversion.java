import java.util.Scanner;
import java.util.StringTokenizer;

public class DateConversion {
    public static void main(String[] args)
    {

        int count = 0;
        int month, day, year;
        Scanner scanner = new Scanner(System.in);
        String[] originalFormat = new String[20];
        String[] otherFormat = new String[20];
        String[] monthPerYear = {"", "January", "February", "March", "April", "May",
                                    "June", "July", "August", "September",
                                    "October", "November", "December"};


        System.out.println("\nplease enter a date in mm/dd/yyyy\n" +
                "(04/05/2018,4/5/2018, 04/5/2018, or\n" +
                "4/05/2018) format or enter 9999/ to\n" +
                "terminate the program.");
        String input = scanner.nextLine();

        while(count < 20 && !(input.equals("9999/")))
        {
            StringTokenizer tokens = new StringTokenizer(input, "/");
            month = Integer.parseInt(tokens.nextToken());
            day = Integer.parseInt(tokens.nextToken());
            year = Integer.parseInt(tokens.nextToken());

            originalFormat[count] = input;
            otherFormat[count] = monthPerYear[month] + " " + day + ", " + year;

            System.out.println("\nplease enter a date in mm/dd/yyyy\n" +
                    "(04/05/2018,4/5/2018, 04/5/2018, or\n" +
                    "4/05/2018) format or enter 9999/ to\n" +
                    "terminate the program.");
            input = scanner.nextLine();

            count++;
        }

        System.out.printf("%nDisplay date in  |       Display date in%n" +
                            "Original format  |        other format%n" +
                "-----------------|-----------------------%n");
        for(int i = 0; i < count; i++)
            System.out.printf("  %-15s|      %s%n", originalFormat[i], otherFormat[i]);

    }
}
