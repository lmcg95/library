package com.TSI.Lauren.librarySonar;

public class film extends DVD{

    /////////////////////ATTRIBUTES/////////////////////////
    private String starringRole;



    /////////////////////CONSTRUCTORS//////////////////////
    public film(String title, String genre, String director, String starringRole){
        super(title, genre, director);
        this.starringRole = starringRole;

    }
    /////////////////////METHODS/////////////////////////
    public String getStarringRole(){
        return starringRole;



    }



}
