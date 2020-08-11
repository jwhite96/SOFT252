/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;

import accounts.*;
import java.io.Serializable;

/**
 *
 * @author James
 */
public class CreateRequest extends Request implements Serializable{
    
    public CreateRequest(Account account) {
        this.Account = account;
        this.requestType = "CREATE";
    }

    public CreateRequest() {
    }

    @Override
    public String toString(){
        return Account.getID() + " " + Account.getFirstName() + " " + Account.getSurname() + ": " + requestType;
    }
    
}
