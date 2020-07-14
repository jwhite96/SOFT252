/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package requests;
import accounts.Account;

/**
 *
 * @author James
 */
public abstract class Request {
    
    protected Account Account;
    protected String requestType;

    public Account getAccount() {
        return Account;
    }

    public String getRequestType() {
        return requestType;
    }    
}
