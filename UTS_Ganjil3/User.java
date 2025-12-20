/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Ganjil3;

/**
 *
 * @author setyo
 */
public class User extends Person {

    private String username;
    private String password;
    private String backupCode;

    public User(String username, String password, String email,
                String phone, String backupCode) {

        super(username, email, phone); // inheritance
        this.username = username;
        this.password = password;
        this.backupCode = backupCode;
    }

    public String getUsername() {
        return username;
    }
    
}
