package learningOOPS;
class papa{
    final int bankbalance = 50000;
    
    void buisnessskills(){
        System.out.println("good dealing");


        // use of final keyword


    }
}
final class friend{
    int bsf = 1;
    // he now cant produce child class
}
 
class beta extends papa{
    String bike = "kawasaki";

    public beta(String bike) {
        this.bike = bike;
    }
    
}
public class inheritance {
    public static void main(String[] args) {
        beta ved = new beta("");
        ved.buisnessskills();
        System.out.println(ved.bankbalance);
    }
}
