//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January,
//2 for February and so forth):
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1.  (This final case you can think of as
//a kind of safeguard against someone using your Month class incorrectly: even if
//someone passes a bad number to your constructor, it will still make a valid month.
//You will make a separate safeguard in your MonthPrinter class to reject bad user
//inputs, but making your code as resiliant as possible to incorrect usage is good
//practice as a programmer!)

//The Month class has 2 methods:
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. 
//Use Boolean operators (&&, ||, !). You will have an if then else if then else
//For February return 28

//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user
//for a month number and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this:
//June 30

//If the user enters an invalid month number print this error message: 
//"Number must be 1 through 12"
//(We include this even though our Month constructor will gracefully handle improper
//inputs.  Using multiple safeguards against incorrect usage is a good idea!)

//If the user enters a non-integer, give this error message: 
//"Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified, so be
//careful with the strings you print.

/**
 * Exercises the methods in the Month class
 */
import java.util.Scanner;
public class MonthPrinter
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a month number (1 through 12) " );

        if (in.hasNextInt() == true) {
            int monthNumber = in.nextInt();
            if (monthNumber > 12 || monthNumber < 1){
                System.out.println("Number must be 1 through 12");
            }
            else {
                Month myMonth = new Month(monthNumber);
                System.out.printf("%s %d", myMonth.getMonthName(), myMonth.getNumberOfDays());
            }
        }
        else {
            System.out.println("Not an integer. Terminating");
        }    
    }
}

//Write a class Month.

//A Month has a constructor that takes the month number as a parameter (1 for January,
//2 for February and so forth):
//   public Month(int monthNumber)
//If monthNumber is not 1 to 12, set it to 1.  (This final case you can think of as
//a kind of safeguard against someone using your Month class incorrectly: even if
//someone passes a bad number to your constructor, it will still make a valid month.
//You will make a separate safeguard in your MonthPrinter class to reject bad user
//inputs, but making your code as resiliant as possible to incorrect usage is good
//practice as a programmer!)

//The Month class has 2 methods:
//   public String getMonthName() Use if / else if /else if ...
//   public int getNumberOfDays() Do NOT use a separate if / else branch for each month. 
//Use Boolean operators (&&, ||, !). You will have an if then else if then else
//For February return 28

//These are implemented for you as stubs

//Now write a class MonthPrinter which will instantiate a Month object, ask the user
//for a month number and print the name of the month and the number or days.

//If the month is 6, the output should look exactly like this:
//June 30

//If the user enters an invalid month number print this error message: 
//"Number must be 1 through 12"
//(We include this even though our Month constructor will gracefully handle improper
//inputs.  Using multiple safeguards against incorrect usage is a good idea!)

//If the user enters a non-integer, give this error message: 
//"Not an integer. Terminating"

//To be considered correct, you must enter the message exactly as specified, so be
//careful with the strings you print.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 4 - Question 1" for some tips on 
// how to begin.

public class Month
{
    //instance variables
    private int month;

    /**
     * Contructs a Month
     * @param the month number. Must be 1 to 12. For any other number, the month number is set to 1
     */
    public Month(int month)
    {
        //TODO: initialize the instance variable(s) to complete this constructor
        //Remember to make the constructor resiliant to improper inputs!
        if (month < 1 || month > 12){
            this.month = 1;
        }
        else {
            this.month = month;
        }
    }

    /**
     * Gets the name of this month
     * @return the name of this month
     */
    public String getMonthName()
    {
        //TODO: implement this method (you will replace the return null statement below)
        String name = "";
        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;
        }
        return name;
    }

    /**
     * Gets the number of days in this month
     * @return the number of days in this month in a non-leap year
     */
    public int getNumberOfDays()
    {
        //TODO: implement this method (you will replace the return 0 statement below)
        int days = 0;
        if (month == 4 || month == 9 || month == 11 || month == 6){
            days = 30;
        }
        else if (month == 2){
            days = 28;
        }
        else {
            days = 31;
        }
        return days;
    }
}
