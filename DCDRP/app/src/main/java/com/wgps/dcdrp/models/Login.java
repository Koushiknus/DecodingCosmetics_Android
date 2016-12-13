package com.wgps.dcdrp.models;

/**
 * Created by koushik on 12/8/2016.
 */
public class Login {

    /****************************/
       /* Instance Variables/
     /**************************/

    /*
        Name of the user
     */
    private String mUserName;

    /*
        Password of the user
     */
    private String mPassword;

    /*******************************/
    /* Public constructors starts  */
    /*
        Default Constuctor
     */
    public Login(){

    }



    public Login(String mUserName, String password) {
        this.mUserName = mUserName;
        this.mPassword = password;
    }
    /* Public Constrctor ends */
   /*******************************/


    /*******************************/

        /* Getters and setters */

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String mPassword) {
        this.mPassword = mPassword;
    }
}
