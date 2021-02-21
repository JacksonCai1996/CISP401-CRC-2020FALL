import java.security.SecureRandom;
import java.util.Scanner;

public class Addition {
    SecureRandom randomNumber = new SecureRandom();
    Scanner input = new Scanner(System.in);
    private int[] arr = new int[5];
    private int number1;
    private int number2;

    public int[] quiz()
    {
        createQuestion();
        int userInput = input.nextInt();
        if(userInput != -1)
        {
            checkResponse(userInput);
        }
        else
            arr[0] = -1;
        return arr;


    }

    public void createQuestion()
    {
        number1 = randomNumber.nextInt(20);
        number2 = randomNumber.nextInt(20);
        System.out.printf("How much is %d add %d?%n",number1, number2);
        System.out.println("Enter your answer (-1 to exit):");

    }

    String createResponse(boolean check)
    {
        String[] correctResponse = {"Very good! A", "Excellent! A",
                "Nice work! A","Keep up the good work! A"};
        String[] wrongResponse = {"No. Please try again.! A", "Wrong. Try once more. A",
                "Don't give up! A","1.No. Keep trying. A"};

        int num = randomNumber.nextInt(4);
        if(check)
            return correctResponse[num];
        else
            return wrongResponse[num];

    }

    void checkResponse(int userInput)
    {
        int answer = number1 + number2;
        arr[0] = userInput;
        arr[1] = answer;
        arr[2] = number1;
        arr[3] = number2;
        arr[4] = 1;

        if(answer == userInput)
        {
            System.out.printf("%s%n%n",createResponse(true));

        }
        else
        {
            System.out.printf("%s%n",createResponse(false));
            System.out.printf("The correct answer is  %d%n%n%n",answer);
        }
    }
}
