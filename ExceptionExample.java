class CustomException extends Exception{
    public CustomException (String errorMessage){
    super(errorMessage);
    }
    }
    public class ExceptionExample{
    public static void main(String [] args){
    try{
    int a = 5;
    throw new CustomException ("This is custom exception");
    } catch (CustomException e) {System.out.println(e);}
    }
    }