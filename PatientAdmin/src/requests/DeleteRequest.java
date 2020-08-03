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
public class DeleteRequest extends Request implements Serializable {
    
    public DeleteRequest(String ID, Account account) {
        this.ID = ID;
        this.Account = account;
        this.requestType = "DELETE";
    }  

    public DeleteRequest() {
    }
         
    @Override
    public String toString(){
        return Account.getID() + " " + Account.getFirstName() + " " + Account.getSurname() + ": " + requestType;
    }
    
}
