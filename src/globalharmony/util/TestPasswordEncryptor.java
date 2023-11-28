/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalharmony.util;

/**
 *
@author alpha
*/
public class TestPasswordEncryptor {

    public static void main(String[] args) {

        String pass="ozumpass1";
        System.out.println(PasswordEncryptor.encryptPassword(pass));
        String pass1="esrapass1";
        System.out.println(PasswordEncryptor.encryptPassword(pass1));
        String pass2="zacharypass1";
        System.out.println(PasswordEncryptor.encryptPassword(pass2));
        String pass3="mariepass1";
        System.out.println(PasswordEncryptor.encryptPassword(pass3));
        String pass4="fatimapass1";
        System.out.println(PasswordEncryptor.encryptPassword(pass4));

    }

}
