public class Rectangle
{
  private double length;
  private double width; 

 public double calculatePerimeter()   
  {
    return (2 * length) + (2 * width);
  }

  public double calculaterArea()
  {
    return length * width;
  }

  public double getLength()
  {
    return length;
  }
  public void setLength(double length)
  {
    this.length = length;
  }

  double getWidth()
  {
    return width;
  }
  void setWidth(double width)
  {
    this.width = width;
  }
  
}

  
