/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Friend extends Person{
    
    private int phoneNumber;
    
    public Friend(String firstName, String lastName, String date, int phoneNumber) {
        super(firstName, lastName, date);
        this.phoneNumber = phoneNumber;
    }
    
    public String toString() {
        return super.toString() + ", " + getPhoneNumber();
    }

    /**
     * @return the phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
