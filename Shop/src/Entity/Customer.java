/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author user
 */
public class Customer {
    private int customerID;
    private String customerName;
    private String custumerPhone;

    public Customer() {
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustumerPhone() {
        return custumerPhone;
    }

    public void setCustumerPhone(String custumerPhone) {
        this.custumerPhone = custumerPhone;
    }
    
    
    
}
