package folder;

class BookUnavailableException extends Exception{
    public BookUnavailableException(String message){
        super(message);
    }
}

class InvalidMemberException extends Exception{
    public InvalidMemberException(String message){
        super(message);
    }
}
class library{
    int availablebooks = 3;
    public void borrowbook(int bookrequestedcount,String ismember) throws Exception{
        
            if(ismember == null || ismember.trim().isEmpty()){
                throw new InvalidMemberException("you are not a member");
            }
            if(bookrequestedcount <= 0){
                throw new Exception("you must request a book");
            }
            if(bookrequestedcount > availablebooks){
                throw new BookUnavailableException("not enough books");
            }else{
                System.out.println("book given");
            }
        }
    }

public class exceptionhandling {
    public static void main(String[] args) {
        try {
        library l1 = new library();
        l1.borrowbook(10,"Y");
       } catch (Exception e) {
        e.printStackTrace();
        // TODO: handle exception
        System.out.println("Exception occured " + e.getMessage());
       }
    }
    
}
