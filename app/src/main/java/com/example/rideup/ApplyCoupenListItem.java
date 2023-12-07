package com.example.rideup;

public class ApplyCoupenListItem {
    String coupentype;
    String saveruppe;
    String content;

    public ApplyCoupenListItem(String coupentype, String saveruppe, String content) {
        this.coupentype = coupentype;
        this.saveruppe = saveruppe;
        this.content = content;
    }

    public String getCoupentype() {
        return coupentype;
    }

    public String getSaveruppe() {
        return saveruppe;
    }

    public String getContent() {
        return content;
    }

    public void setCoupentype(String coupentype) {
        this.coupentype = coupentype;
    }

    public void setSaveruppe(String saveruppe) {
        this.saveruppe = saveruppe;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
