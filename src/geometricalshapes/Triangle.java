
package geometricalshapes;


public class Triangle {
    
    private double base;
    private double heigth;
    private double volume;
    
    
    public Triangle()
    {
        base=1;
        heigth=1;
        volume();
    }
    
    public Triangle(double base)
    {
        heigth = 1;
        this.base = base;
        volume();
    }
 
    public Triangle(double heigth, String val)
    {
        base = 1;
        this.heigth = heigth;
        volume();
    }
    
    public Triangle(double base, double heigth)
    {
        this.heigth=heigth;
        this.base = base;
        volume();       
    }
    
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    
    public double getVolume()
    {
        return volume;
    }
    
    public void volume()
    {
        volume= (heigth*base)/2;
    }
    

}
