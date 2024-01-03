
/**
 * 
 * 
 * @author  
 * @version
 */
public class ThirteenSides implements Shape
{
  private int apothem;
  private int radius;  
  private int sideLength;
  private String color;

  /**
   * Constructor for objects of class Circle
   */
  public ThirteenSides(int radius, String color, int sideLength, int apothem)
  {
    this.sideLength = sideLength;
    this.color = color;
  }

  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea()
  {
    return ((13*this.sideLength)/2) * (this.apothem);
  }

  /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter()
  {
    return 13 * this.sideLength;
  }

  /**
   * Get the color
   * 
   * @return     returns the color of the circle
   */
  public String getColor()
  {
    return this.color;
  }
}
