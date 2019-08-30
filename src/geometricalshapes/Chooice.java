
package geometricalshapes;


public class Chooice {
    int choice;
    
    private Circle cir;
    private Triangle tri = new Triangle();
    private int base, hiegth, rad; 
    private boolean proceed =true;
    
    
    public void choce()
    {

        while(proceed )
        {
        
        System.out.println("Hej vad vill beräkna?");
        System.out.println("Arean av en triangle, tryck 1.");
        System.out.println("Arean av en cirkel, tryck 2.");
        System.out.println("Omkretsen av en cirkel, tryck 3.");
        System.out.println("Sluta detta projekt, tryck 4!!!");
        System.out.print("Skriv ditt val: ");
        choice = GeometricalShapes.sc.nextInt();
        System.out.println("");
        
        switch(choice) {
  case 1:
      System.out.println("Skriv vilken bas?");
      base= GeometricalShapes.sc.nextInt();
      System.out.println("Skriv vilken höjd?");
      hiegth = GeometricalShapes.sc.nextInt();
      System.out.println("");
      tri = new Triangle(base, hiegth);
      System.out.println("Arean är: "+ tri.getVolume() );
    break;
  case 2:
    System.out.println("Skriv vilken radie?");
    rad = GeometricalShapes.sc.nextInt();
      System.out.println("");
    cir = new Circle(rad);
    System.out.println("Cirkelns omkrets: "+ cir.getCircum());
    break;
  case 3:
    
      
      System.out.println("Cirkelns omkrets: "+ cir.getArea());
    break;
  case 4:
    proceed = false;
    break;
  default:
        }
}
        
    
        
        
    }
}
