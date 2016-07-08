package javaapplication3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fincken
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String homePhone;
    private String cellPhone;
    private String workPhone;
    
    Contact(){
        firstName = lastName = homePhone = cellPhone = workPhone = "";
    }
    Contact(String fn, String ln){
        firstName = fn;
        lastName = ln;
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
     * @return the homePhone
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * @param homePhone the homePhone to set
     */
    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    /**
     * @return the cellPhone
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the workPhone
     */
    public String getWorkPhone() {
        return workPhone;
    }

    /**
     * @param workPhone the workPhone to set
     */
    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }
         
    
}
