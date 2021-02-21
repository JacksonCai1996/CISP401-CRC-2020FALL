import java.security.SecureRandom;

class MathTest
{
    private static SecureRandom randomNumber = new SecureRandom();
    public static int totalQuestions = 0;
    public static int[][] array = new int[100][5];

    public static void main(String[] args)
    {
        Addition addition = new Addition();
        Subtraction subtraction = new Subtraction();
        Multiply multiply = new Multiply();
        Division division = new Division();

        int[] temp = new int[5];

        do {
            int selection = 1 + randomNumber.nextInt(4);

            switch (selection)
            {
                case 1:
                    temp = addition.quiz();
                    System.arraycopy(temp, 0, array[totalQuestions], 0, 5);
                    break;
                case 2:
                    temp = subtraction.quiz();
                    System.arraycopy(temp, 0, array[totalQuestions], 0, 5);
                    break;
                case 3:
                    temp = multiply.quiz();
                    System.arraycopy(temp, 0, array[totalQuestions], 0, 5);
                    break;
                case 4:
                    temp = division.quiz();
                    System.arraycopy(temp, 0, array[totalQuestions], 0, 5);
                    break;
            }

            totalQuestions++;

        }while((temp[0] != -1) && (totalQuestions < 100) );

        printQuestionResult();

    }

    public static String createResponse(boolean check)
    {
        String[] correctResponse = {"Very good!", "Excellent!",
                "Nice work!","Keep up the good work!"};

        String[] wrongResponse = {"No. Please try again.!", "Wrong. Try once more.",
                "Don't give up!","1.No. Keep trying."};

        int num = randomNumber.nextInt(4);
        if(check)
            return correctResponse[num];
        else
            return wrongResponse[num];

    }

    public static void printQuestionResult()
    {
        double rate;
        int correctQuestions = 1;
        System.out.println("\nThe questions generated by the system are:");
        for(int i = 0; (i < (totalQuestions - 1)) &&(array[i][0] != -1); i++)
        {
            switch (array[i][4])
            {
                case 1:
                    if(array[i][0] == array[i][1])
                    {
                        System.out.printf("%d + %d = %d%n", array[i][2],
                                array[i][3], array[i][1]);
                        correctQuestions++;
                    }
                    else
                    {
                        System.out.printf("%d + %d = %-6dYour answer was %d, which is incorrect%n",
                                array[i][2], array[i][3],
                                array[i][1],array[i][0]);
                    }
                    break;

                case 2:
                    if(array[i][0] == array[i][1])
                    {
                        System.out.printf("%d - %d = %d%n", array[i][2],
                                array[i][3], array[i][1]);
                        correctQuestions++;
                    }
                    else
                    {
                        System.out.printf("%d - %d = %-6dYour answer was %d, which is incorrect%n",
                                array[i][2], array[i][3],
                                array[i][1],array[i][0]);
                    }
                    break;

                case 3:
                    if(array[i][0] == array[i][1])
                    {
                        System.out.printf("%d * %d = %d%n", array[i][2],
                                array[i][3], array[i][1]);
                        correctQuestions++;
                    }
                    else
                    {
                        System.out.printf("%d * %d = %-6dYour answer was %d, which is incorrect%n",
                                array[i][2], array[i][3],
                                array[i][1],array[i][0]);
                    }
                    break;

                case 4:
                    if(array[i][0] == array[i][1])
                    {
                        System.out.printf("%d / %d = %d%n", array[i][2],
                                array[i][3], array[i][1]);
                        correctQuestions++;
                    }
                    else
                    {
                        System.out.printf("%d / %d = %-6dYour answer was %d, which is incorrect%n",
                                array[i][2], array[i][3],
                                array[i][1],array[i][0]);
                    }
                    break;

            }

        }

        System.out.println("---------------------------------------------------------------\n");
        System.out.printf("You got %d questions and made %d question correct%n",totalQuestions,correctQuestions);

        rate =  correctQuestions / (double)totalQuestions;
        if (rate > 0.6)
        {
            System.out.printf("%s%n",createResponse(true));
        }
        else
            System.out.printf("%s%n",createResponse(false));

    }
}