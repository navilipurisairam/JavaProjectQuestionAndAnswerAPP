package org.app.units;

public class User extends AbstractEntity {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //Username and password to login to the console QnA_app
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    private UserRole userRole;

    //Implementation of the abstract class defined in its parent class
    int id=0;

    @Override
    public void autoGenerateId() {
        id++;
        super.setId(id);
    }

}
