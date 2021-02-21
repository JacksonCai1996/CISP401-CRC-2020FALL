import java.util.Scanner;

public class Calculate2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number1; // first integer for user input
        int number2;// second integer for user input
        int number3;// third integer for user input
        int largest;// largest number from num1, num2, and num3
        int median;// median number from num1, num2, and num3
        int smallest;// smallest number from num1, num2, and num3
        int range; // the value that is between the largest and smallest
        int sum;// sum of num1, num2, and num3
        int product;// product of num1, num2, and num3
        int average;// average of num1, num2, and num3
        int quotient;// the largest divided by the the smallest
        int reminder; // the largest divided by the the smallest

        System.out.print("Enter first integer: ");// prompt
        number1 = input.nextInt(); // read the first number

        System.out.print("Enter second integer: ");// prompt
        number2 = input.nextInt();// read the second number

        System.out.print("Enter third integer: ");// prompt
        number3 = input.nextInt();// read the third number

        // display the numbers that user entered
        System.out.printf("%nFor the numbers %d, %d and %d%n", number1, number2, number3);

        // find the largest, median, and smallest by comparing three numbers
        if(number1 > number2 && number1 > number3 && number2 > number3)
        {
            largest = number1;
            median = number2;
            smallest = number3;
        }
         else if(number2 > number1 && number2 > number3 && number1 > number3)
        {
            largest = number2;
            median = number1;
            smallest = number3;

        }
         else
        {
            largest = number3;
            median = (Math.max(number1, number2));
            smallest = (Math.min(number1, number2));

        }


        range = largest - smallest; // range of largest and smallest
        sum = number1 + number2 + number3; // sum of numbers
        product = number1 * number2 * number3; // product of numbers
        average = sum / 3; // average of numbers

        System.out.printf("The largest is %d.%n",largest); // display the largest number
        System.out.printf("The smallest is %d.%n",smallest);// display the smallest number
        System.out.printf("The median is %d.%n",median);// display the median number
        System.out.printf("The range is %d.%n",range);// display the range
        System.out.printf("Sum is %d%n",sum);// display the sum
        System.out.printf("Product is %d.%n",product);// display the product
        System.out.printf("Average is %d.%n",average);// display the average


        quotient = largest / smallest; // quotient of the largest divided by the smallest
        reminder = largest % smallest; // reminder of the largest divided by the smallest

        System.out.printf("%nQuotient of the largest divided%n" +
                "by the smallest is %d.%n",quotient); // display the quotient
        System.out.printf("%nReminder of the largest divided%n" +
                "by the smallest is %d.%n",reminder); // display the reminder

    }
}
