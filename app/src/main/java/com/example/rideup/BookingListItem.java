package com.example.rideup;

public class BookingListItem {
    String carname;
    String carseater;
    String carrating;

    String caraddress;
    String drivername;
    String gender;
    String driver;
    String age;
    String seatsavilable;

    String price;

    public BookingListItem(String carname, String carseater, String carrating, String caraddress, String drivername, String gender, String driver, String age, String seatsavilable, String price) {
        this.carname = carname;
        this.carseater = carseater;
        this.carrating = carrating;
        this.caraddress = caraddress;
        this.drivername = drivername;
        this.gender = gender;
        this.driver = driver;
        this.age = age;
        this.seatsavilable = seatsavilable;
        this.price = price;
    }

    public String getDrivername() {
        return drivername;
    }

    public String getGender() {
        return gender;
    }

    public String getDriver() {
        return driver;
    }

    public String getAge() {
        return age;
    }

    public String getSeatsavilable() {
        return seatsavilable;
    }

    public String getPrice() {
        return price;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSeatsavilable(String seatsavilable) {
        this.seatsavilable = seatsavilable;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCarname() {
        return carname;
    }

    public String getCarseater() {
        return carseater;
    }

    public String getCarrating() {
        return carrating;
    }

    public String getCaraddress() {
        return caraddress;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public void setCarseater(String carseater) {
        this.carseater = carseater;
    }

    public void setCarrating(String carrating) {
        this.carrating = carrating;
    }

    public void setCaraddress(String caraddress) {
        this.caraddress = caraddress;
    }
}
