package learningOOPS;

class car{
    String engine;
    String color;
    public car(String engine) {
        this.engine = engine;
    }
    public car(String engine, String color) {
        this.engine = engine;
        this.color = color;
    }

    
}
public class constructor {
    public static void main(String[] args) {
      car c1 = new car("diesel" , "red");
      System.out.println(c1.color);
      System.out.println(c1.engine);
    }
    
}
