/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6_Setter_Getter;

/**
 *
 * @author setyo
 */
public class main {
    public static void main(String[] args) {
        Dulingo_Login Dulingo = new Dulingo_Login();
        Master_PBO_user user = new Master_PBO_user();
        
        Dulingo.login("DANDI", "030805", user);
        
        user.Set_username("SENOKK");
        user.Set_password("030805");
        
        Dulingo.login("DANDI", "030805", user);
        
        Dulingo.login("SENOKK", "030805", user);
      
      
    }  
}
