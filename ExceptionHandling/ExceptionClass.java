package  ExceptionHandling;

import javax.naming.InsufficientResourcesException;

public  class ExceptionClass {

    int account;
    int amount;

    public void   withdraw(int withAmount) throws Exception {
        if(amount<withAmount){
          //  throw new Exception("This is not valid ");
            throw new InSufficientException("Insufficient Amount");
        }
        else{
            amount -= withAmount;
        }
    }

}