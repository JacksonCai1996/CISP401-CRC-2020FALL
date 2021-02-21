// GradeBook.java
// GradeBook class with a constructor to initialize the course name.

public class GradeBook
{
   private String courseName; // course name for this GradeBook
   private String instructorName;// instructor name for this GradeBook

   // constructor initializes courseName and instructorName with String supplied as argument
   public GradeBook( String name, String instructorName )
   {
      courseName = name; // initializes courseName
      this.instructorName = instructorName; // initializes instructorName

      // display initial course name and instructor name
      System.out.printf("%n==GradeBook constructor is called!!==%n"+
              "Welcome to the grade book for%n%s!%n"+
              "This course is presented by: %s%n"+
              "== End of GradeBook constructor.==%n",getCourseName(), getInstructorName());
   } // end constructor

   // method to set the course name
   public void setCourseName( String name )
   {
      courseName = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return courseName;
   } // end method getCourseName

   // method to set the instructor name
   public void setInstructorName(String instructorName)
   {
      this.instructorName = instructorName;// store the instructor name
   }// end method setInstructorName

   // method to retrieve the instructor name
   public String getInstructorName()
   {
      return instructorName;
   }// end method getInstructorName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName and getInstructorName to get the
      // name of the course and instructor which this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n"+
         "This course is presented by: %s%n", getCourseName(), getInstructorName() );
   } // end method displayMessage

} // end class GradeBook

