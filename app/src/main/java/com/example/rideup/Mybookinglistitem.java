package com.example.rideup;

public class Mybookinglistitem {
    String carname;
    String bookingid;
    String bookingdate;

    String caraddress;
    String carnumber;
    String paidby;
    String button1;

    public Mybookinglistitem(String carname, String bookingid, String bookingdate, String caraddress, String carnumber, String paidby, String button1) {
        this.carname = carname;
        this.bookingid = bookingid;
        this.bookingdate = bookingdate;
        this.caraddress = caraddress;
        this.carnumber = carnumber;
        this.paidby = paidby;
        this.button1 = button1;
    }

    public String getCarname() {
        return carname;
    }

    public String getBookingid() {
        return bookingid;
    }

    public String getBookingdate() {
        return bookingdate;
    }

    public String getCaraddress() {
        return caraddress;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public String getPaidby() {
        return paidby;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    public void setCaraddress(String caraddress) {
        this.caraddress = caraddress;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public void setPaidby(String paidby) {
        this.paidby = paidby;
    }

    public String getButton1() {
        return button1;
    }

    public void setButton1(String button1) {
        this.button1 = button1;
    }
}

