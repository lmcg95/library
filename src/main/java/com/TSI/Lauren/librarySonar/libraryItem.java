package com.TSI.Lauren.librarySonar;




public abstract class libraryItem {

    /////////////////////ATTRIBUTES/////////////////////////
    private String title;
    private String genre;
    private String releaseDate;

    /////////////////////CONSTRUCTORS//////////////////////

    protected libraryItem(String title, String genre){
        this.title=title;
        this.genre=genre;

    }

    protected libraryItem(String title, String genre, String releaseDate){
        this.title=title;
        this.genre=genre;
        this.releaseDate =releaseDate;

    }

    /////////////////////METHODS/////////////////////////
    public String getTitle(){

        return title;
    }
    public String getGenre() {
        return genre;

    }

    public String getReleaseDate(){
        return releaseDate;
    }


}
