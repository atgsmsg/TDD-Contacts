/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CCannon
 */
public class Person {
    private String firstName;
    private String lastName;
    private Date birthdate;
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    
    public Person(String firstName, String lastName, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        try {
            this.birthdate = dateFormat.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Given birthday is unreadible: " + date);
            this.birthdate = new Date();
        }
    }
    
    public String toString() {
        return getFirstName() + ", " + getLastName() + ", " + getDateFormat().format(birthdate);
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the formatted birthdate
     */
    public String getFormattedBirthdate() {
        return dateFormat.format(birthdate);
    }

    /**
     * @param birthdate the birthdate to set
     * Format: "YYYY-MM-dd"
     */
    public void setBirthdate(String birthdate) {
        try {
            this.birthdate = dateFormat.parse(birthdate);
        } catch (ParseException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Given birthday is unreadible: " + birthdate);
            this.birthdate = new Date();
        }
    }

    /**
     * @return the dateFormat
     */
    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    /**
     * @param dateFormat the dateFormat to set
     */
    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
}
