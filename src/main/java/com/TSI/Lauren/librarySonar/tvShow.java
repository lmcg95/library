package com.TSI.Lauren.librarySonar;

public class tvShow extends DVD {
    /////////////////////ATTRIBUTES/////////////////////////
    private int howManySeries;


    /////////////////////CONSTRUCTORS//////////////////////
    public tvShow(String title, String genre, String director, int howManySeries) {

        super(title, genre, director);
        this.howManySeries = howManySeries;

    }
    /////////////////////METHODS/////////////////////////


    public int getHowManySeries() {
        return howManySeries;
    }




}

