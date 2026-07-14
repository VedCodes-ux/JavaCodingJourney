package learningOOPS;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface operation{
    int add(int a , int b);
}

// () -> {}
// parameter -> expression
public class Functionalprogramming {

    public static BiFunction<Integer,Integer,Integer> addFunction = (a,b) -> a+b;
    public static void main(String[] args) {
        // original
        BookAction action1 = new BookAction() {
            @Override
            public void perform(){
                System.out.println("action performed");
            }
        };

        // convert into lambda function
        BookAction action2 = () -> {
           System.out.println("action performed");
        };
        action2.perform();

        // shorter version of lambda function
        BookAction Action3 = () -> System.out.println("Action3 performed");
        Action3.perform();

        operation A1 = (a,b) -> a+b;
        System.out.println(A1.add(435, 234));




        // method reference
        // ::
        List<String> names = Arrays.asList("Ved","priyanka","anushka","isshika");
        // normal method
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // using enhanced for loop
        for (String string : names) {
            System.out.println(string);
        }

        names.forEach(System.out::println);
        
        System.out.println(addFunction.apply(67, 97));
    }
}
