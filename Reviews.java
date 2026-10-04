package com.college;

public class Reviews {
    public String name;
    public int year;
    public String reviewString;
    
    public Reviews() {}
    
    public Reviews(String name, int year, String reviewString) {
        this.name = name;
        this.year = year;
        this.reviewString = reviewString;
    }
    
    public void getdata(String n, int y, String r) {
        name = n;
        year = y;
        reviewString = r;
    }
    public void getdata() {
        System.out.println("Name:"+name);
        System.out.println("Year:"+year);
        System.out.println("Review:"+reviewString);
    }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
    public String getReviewString() { return reviewString; }
    public void setReviewString(String reviewString) { this.reviewString = reviewString; }
}
