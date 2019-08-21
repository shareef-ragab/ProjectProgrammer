
package projectprogrammer;


public class AccountException extends Exception{
    
    public AccountException(){
        super("the Exception in information account");
    }
    public AccountException(String e){
        super(e);
    }
}
