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
public class FamilyMember extends Person{
    
    private FamilyRelationship relationship;
    
    public FamilyMember(String firstName, String lastName, String date, FamilyRelationship relationship) {
        super(firstName, lastName, date);
        this.relationship = relationship;
    }
    
    public String toString() {
        return super.toString() + ", " + getRelationship().toString().toLowerCase();
    }

    /**
     * @return the relationship
     */
    public FamilyRelationship getRelationship() {
        return relationship;
    }

    /**
     * @param relationship the relationship to set
     */
    public void setRelationship(FamilyRelationship relationship) {
        this.relationship = relationship;
    }
    
}
