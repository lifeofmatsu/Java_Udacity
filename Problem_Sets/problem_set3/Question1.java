// You don't need to modify this file

public class YardCalculatorTester
{
    public static void main(String[] args)
    {
        double length = 40.0;
        double width = 30.0;

        YardCalculator calculator = new YardCalculator(length, width); 
        
        double perimeter = calculator.perimeter();
        double area = calculator.area();
        double diagonal = calculator.diagonal();

        System.out.println("perimeter: " + perimeter);
        System.out.println("Expected: 42.672");
        System.out.println("diagonal: " + diagonal);
        System.out.println("Expected: 15.24");

        length = 60.1;
        width = 35.5;
        
        calculator = new YardCalculator(length, width); 
        perimeter = calculator.perimeter();
        area = calculator.area();
        diagonal = calculator.diagonal();

        System.out.printf("perimeter: %.2f\n", perimeter);
        System.out.println("Expected: 58.28");
        System.out.printf("area: %.2f\n", area);
        System.out.println("Expected: 198.21");
        System.out.printf("diagonal: %.2f\n", diagonal);
        System.out.println("Expected: 21.28");        
    }
}

//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that 
//takes the width and length in feet as arguments:
//public YardCalculator(double length, double width)

//Provide methods:
//  public double perimeter() which returns the perimeter in meters
//  public double area() which returns the area in square meters
//  public double diagonal() which returns the diagonal in meters

//For reference:
//  1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it, e.g.
//  public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 3 - Question 1" for some tips on 
// how to begin. 

public class YardCalculator
{
    //Instance variables go here.
    private double theLength;
    private double theWidth;
    private static final double METERS_PER_FOOT = 0.3048;
    private double perimeter;
    private double area;
    private double diagonal;
    
    /**
     * Constructs a YardCalculator with the given parameters
     * @param theLength the length of the yard
     * @param theWidth the width of the yard
     */
    public YardCalculator(double theLength, double theWidth)
    {
     this.theLength = theLength;
     this.theWidth = theWidth;
    }

    /**
     * Gets the perimeter of the yard
     * @return the perimeter
     */
    public double perimeter()
    {
        perimeter = (2 * (theLength * METERS_PER_FOOT)) + (2 * (theWidth * METERS_PER_FOOT));
        return perimeter;
    }

    /**
     * Gets the area of the yard
     * @return the area
     */
    public double area()
    {
        area = (theLength * METERS_PER_FOOT) * (theWidth * METERS_PER_FOOT);
        return area;
    }

     /**
     * Gets the diagonal of the yard
     * @return the diagonal
     */
    public double diagonal()
    {
        diagonal = Math.sqrt(Math.pow((theLength * METERS_PER_FOOT), 2) + Math.pow((theWidth * METERS_PER_FOOT), 2));
        return diagonal;
    }

}
