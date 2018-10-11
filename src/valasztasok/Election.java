/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valasztasok;

/**
 *
 * @author Diak
 */
public class Election {
    private int kerulet;
    private int szavazatok;
    private String lastname;
    private String firstname;
    private String part;
    
    //valasztokerulet szavazatswzam 
    
    // konstruktor getterek

    public Election(int kerulet, int szavazatok, String lastname, String firstname, String part) {
        this.kerulet = kerulet;
        this.szavazatok = szavazatok;
        this.lastname = lastname;
        this.firstname = firstname;
        this.part = part;
    }

    public int getKerulet() {
        return kerulet;
    }

    public int getSzavazatok() {
        return szavazatok;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPart() {
        return part;
    }
    
}
