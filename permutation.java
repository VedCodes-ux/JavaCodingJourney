package JavaCodingJourney;

public class permutation {
    public static void main(String[] args) {
        
    }

    static void printperm(String str,String perm){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < array.length; i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printperm(newstr, perm+currchar);
        }
    }
}
