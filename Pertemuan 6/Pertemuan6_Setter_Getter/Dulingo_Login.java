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
public class Dulingo_Login {
     void login(String User_name, String Password, Master_PBO_user user){
   
        if(User_name.equals(user.Get_username()) && Password.equals(user.Get_password())){
            System.out.println(">> Berhasil Login Dulingo");
            System.out.println("!! Rubah password anda untuk keamanan \n");
        }else {
            System.out.println("!! Gagal Login Dulingo.. Silahkan Coba Lagi");  
            System.out.println(">> Check Kebenaran User dan password yang di set");
            System.out.println("   User Name Saat ini : " + user.Get_username()); 
            System.out.println("   Password Saat ini  : " + user.Get_password() + "\n");
        }
    }
}
