package com.TSI.Lauren.librarySonar;

public class eBook extends Book {

    /////////////////////ATTRIBUTES/////////////////////////
    private String fileType;



    /////////////////////CONSTRUCTORS//////////////////////
    public eBook(String title, String genre, int pages, String fileType){
        super(title, genre, pages);
        this.fileType = fileType;

    }

    public eBook(String title, String genre, int pages, String fileType, String author){
        super(title, genre, pages, author);
        this.fileType = fileType;

    }

    public eBook(String title, String genre, int pages, String fileType, String author, String publisher){
        super(title, genre, pages, author, publisher);
        this.fileType = fileType;

    }
    /////////////////////METHODS/////////////////////////

    public String getFileType() {

        return fileType;
    }


}
