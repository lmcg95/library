package com.TSI.Lauren.librarySonar;

public abstract class DVD extends libraryItem {


    /////////////////////ATTRIBUTES/////////////////////////
    private String director;


    /////////////////////CONSTRUCTORS//////////////////////
    protected DVD(String title, String genre, String director){
        super(title, genre);
        this.director=director;


    }





    /////////////////////METHODS/////////////////////////





    public String getDirector(){

        return director;
    }



}
