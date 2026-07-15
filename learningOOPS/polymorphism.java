package learningOOPS;
class animal{
    void makesound(){
        System.out.println("make voice");
    }
}

class horse extends animal{
    void makesound(){
        System.out.println("nyahoo");
    }
}
class dog extends animal{
    void makesound(){
        System.out.println("warf");
    }
}
class cat extends animal{
    void makesound(){
        System.out.println("meaow");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        horse h1 = new horse();
        h1.makesound();
    }
}
