package com.example.MovieTicketBooking.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;


@Entity
public class Customer {
    @Id
    private String userName;
    private String password;
    private String mobileNumber;
    @OneToMany(mappedBy = "customer")
    private List<BookedSeats> bookedSeats;

    public Customer() {}

    public Customer(String userName, String password, String mobileNumber) {
        this.userName = userName;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
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
