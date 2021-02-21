import javax.swing.JOptionPane;

public class CISP401V11AD2 {
    public static void main(String[] args)
    {
        Triangles drawTriangles = new Triangles();
        SideBySideTriangles drawSideBySideTriangles = new SideBySideTriangles();
        Diamond drawDiamond = new Diamond();

        String input;
        int number;

       do
       {
           input = JOptionPane.showInputDialog("Draw Triangles and Diamond shapes\n"+
                   "Enter 1 to draw four separate triangles\n" +
                   "Enter 2 to draw four triangle at the same row\n" +
                   "Enter 3 to draw a diamond\n" +
                   "Enter 4 to exit the program");
           number = Integer.parseInt(input);

           switch (number)
           {
               case 1 -> drawTriangles.print();
               case 2 -> drawSideBySideTriangles.print();
               case 3 -> drawDiamond.print();
               case 4 -> System.out.println("\n\n\nThanks to use this program");
               default -> System.out.println("\n\n\nInvalid value entered");
           }

       } while(number != 4);

    }
}
