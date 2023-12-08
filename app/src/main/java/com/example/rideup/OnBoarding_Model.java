package com.example.rideup;

public class OnBoarding_Model {

    String content;
    String content1;
   // String imageset;

    public String getContent() {
        return content;
    }

    public String getContent1() {
        return content1;
    }

    public OnBoarding_Model(String content, String content1) {
        this.content = content;
        this.content1 = content1;

    }
    public void setContent(String content) {
        this.content = content;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }
}
