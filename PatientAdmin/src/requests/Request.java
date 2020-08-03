/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;
import accounts.Account;
import java.io.Serializable;

/**
 *
 * @author James
 */
public abstract class Request implements Serializable {
    
    protected String ID;
    protected Account Account;
    protected String requestType;

    public Request() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public Account getAccount() {
        return Account;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setAccount(Account Account) {
        this.Account = Account;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    
}
