package com.example.rideup;

public class NotificationListItem {

    String type;
    String content;
    String day;

    public NotificationListItem(String type, String content, String day) {
        this.type = type;
        this.content = content;
        this.day = day;
    }

    public String getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
