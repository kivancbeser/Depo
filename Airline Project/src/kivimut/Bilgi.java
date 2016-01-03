/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kivimut;

/**
 *
 * @author Umut
 */
public class Bilgi {
    private String name;
    private String surname;
    private String email;
    private int numara;

    public Bilgi(String name, String surname, String email, int numara) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.numara = numara;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }
    
    
    
}
