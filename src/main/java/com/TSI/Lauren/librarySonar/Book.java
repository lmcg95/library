package com.TSI.Lauren.librarySonar;

public abstract class Book extends libraryItem {

    /////////////////////ATTRIBUTES/////////////////////////

    private int pageNum;
    private String author;
    private String publisher;



    /////////////////////CONSTRUCTORS//////////////////////

    protected Book(String title, String genre, int pageNum){
        super(title, genre);
        this.pageNum = pageNum;

    }

    protected Book(String title, String genre, int pageNum, String author) {
        super(title, genre);
        this.pageNum = pageNum;
        this.author=author;

    }

    protected Book(String title, String genre, int pageNum, String author, String publisher) {
        super(title, genre);
        this.pageNum = pageNum;
        this.author=author;
        this.publisher=publisher;

    }

    protected Book(String title, String genre, int pageNum, String author, String publisher, String releaseDate) {
        super(title, genre, releaseDate);
        this.pageNum = pageNum;
        this.author=author;
        this.publisher=publisher;

    }



    /////////////////////METHODS/////////////////////////



    public String pages(){
        return ("This book has " + pageNum + " pages");
    }

    public int getPageNum(){
        return pageNum;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }















}

