package hotel.app.HotelRoomReservation.entity;

import javax.persistence.*;
@Entity
public class User {
    @Id
    private String userName;
    private String password;
    private String mobileNumber;


    public User() {}

    public User(String userName, String password, String mobileNumber) {
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
