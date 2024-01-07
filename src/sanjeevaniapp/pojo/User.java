/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanjeevaniapp.pojo;

/**
 *
 * @author DELL
 */
public class User {

    public static String getLoginId() {
        return LoginId;
    }

    public static void setLoginId(String LoginId) {
        User.LoginId = LoginId;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        User.Password = Password;
    }

    public static String getUserType() {
        return UserType;
    }

    public static void setUserType(String UserType) {
        User.UserType = UserType;
    }

   
    
    private static String LoginId;
    private static String Password;
    private static String UserType;
    
}
