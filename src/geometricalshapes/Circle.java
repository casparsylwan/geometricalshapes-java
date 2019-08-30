
package geometricalshapes;

import java.lang.Math.*;

public class Circle {
    
  private double pi = Math.PI;
  private double radie;
  private double area;
  private double circum;
  
  public Circle()
  {
      radie = 1;
      circleArea();
      circumferance();
  }
  
  public Circle(double radie)
  {
      this.radie = radie;
      circleArea();
      circumferance();
  }

    public double getArea() {
        return area;
    }
  
    public double getPi() {
        return pi;
    }

    public double getCircum() {
        return circum;
    }
    
     public void circleArea()
    {
        area = pi* radie*radie;
        
    }
     
    public double getRadie()
    {
        return radie;
    }
    
    public void circumferance()
    {
        circum = 2*radie*pi;
    }

}
