package com.TSI.Lauren.librarySonar;

public class printBook extends Book{


    /////////////////////ATTRIBUTES/////////////////////////
    private String cover_type; //hardback or paperback



    /////////////////////CONSTRUCTORS//////////////////////
    public printBook(String title, String genre, int pages, String cover_type){
        super(title,genre,pages);
        this.cover_type=cover_type;

    }

    public printBook(String title, String genre, int pages, String cover_type, String author){
        super(title,genre,pages, author);
        this.cover_type=cover_type;

    }

    public printBook(String title, String genre, int pages, String cover_type, String author, String publisher){
        super(title,genre,pages, author, publisher);
        this.cover_type=cover_type;


    }

    public printBook(String title, String genre, int pages, String cover_type, String author, String publisher, String release_date){
        super(title,genre,pages, author, publisher, release_date);
        this.cover_type=cover_type;


    }



    /////////////////////METHODS/////////////////////////
    public String cover(){
        return ("This book is " + cover_type );

    }

    public String getCover_type(){
        return cover_type;

    }





}

