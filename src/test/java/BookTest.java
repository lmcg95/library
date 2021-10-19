import com.TSI.Lauren.librarySonar.Book;

import com.TSI.Lauren.librarySonar.eBook;
import com.TSI.Lauren.librarySonar.printBook;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    @Test
    public void testTitle(){
        Book testTitle = new printBook("harry potter", "fantasy", 1200, "hardback");
        assertEquals("The book was not the same name","harry potter",testTitle.getTitle());
    }

    @Test
    public void testGenre(){
        Book testGenre = new printBook("harry potter", "fantasy", 1200, "hardback");

        assertEquals("The book was not the same genre","fantasy",testGenre.getGenre());

    }

    @Test
    public void testPages(){
        Book testPages = new printBook("harry potter", "fantasy", 1200, "hardback");

        assertEquals("The book was not the same number of pages", 1200,testPages.getPageNum());

    }

    @Test
    public void testAuthor(){
        Book testAuthor = new printBook("harry potter", "fantasy", 1200, "hardback","J.K. Rowling");

        assertEquals("The book was not the same author", "J.K. Rowling",testAuthor.getAuthor());

    }

    @Test
    public void test_e_Author(){
        Book testAuthor = new eBook("harry potter", "fantasy", 1200, "hardback","J.K. Rowling");

        assertEquals("The book was not the same author", "J.K. Rowling",testAuthor.getAuthor());

    }

    @Test
    public void testPages2(){
        Book testPages = new printBook("harry potter", "fantasy", 1200, "hardback");

        assertEquals("The book was not the same number of pages", "This book has 1200 pages",testPages.pages());

    }

    @Test
    public void testCover(){
        printBook testCover = new printBook("harry potter", "fantasy", 1200, "hardback");
        assertEquals("The book was not the same cover type", "hardback",testCover.getCover_type());
    }

    @Test
    public void testCover2(){
        printBook testCover2 = new printBook("harry potter", "fantasy", 1200, "hardback");
        assertEquals("The book was not the same cover type", "This book is hardback",testCover2.cover());
    }



    @Test
    public void testFile(){
        eBook testCover = new eBook("harry potter", "fantasy", 1200, "PDF");
        assertEquals("The book was not the same file type", "PDF",testCover.getFileType());
    }

    @Test
    public void test_eTitle(){
        eBook test_eTitle = new eBook("harry potter", "fantasy", 1200, "PDF");
        assertEquals("The book was not the same title", "harry potter",test_eTitle.getTitle());
    }

    @Test
    public void test_eGenre(){
        eBook test_eGenre = new eBook("harry potter", "fantasy", 1200, "PDF");
        assertEquals("The book was not the same genre", "fantasy",test_eGenre.getGenre());
    }

    @Test
    public void test_ePages(){
        eBook test_ePages = new eBook("harry potter", "fantasy", 1200, "PDF");
        assertEquals("The book was not the same page numbers", 1200,test_ePages.getPageNum());
    }

    @Test
    public void test_ePages2(){
        Book test_ePages2 = new printBook("harry potter", "fantasy", 1200, "hardback");

        assertEquals("The book was not the same number of pages", "This book has 1200 pages",test_ePages2.pages());

    }

    @Test
    public void testPublish(){
        printBook testPublish = new printBook("harry potter", "fantasy", 1200, "hardback", "J.K. Rowling", "Bloomsbury");
        assertEquals("The book was not the same publisher", "Bloomsbury",testPublish.getPublisher());
    }

    @Test
    public void test_e_Publish(){
        eBook testPublish = new eBook("harry potter", "fantasy", 1200, "hardback", "J.K. Rowling", "Bloomsbury");
        assertEquals("The book was not the same publisher", "Bloomsbury",testPublish.getPublisher());
    }

    @Test
    public void testDate(){
        Book testDate = new printBook("harry potter", "fantasy", 1200, "hardback","J.K. Rowling", "Bloomsbury", "26-06-1997");
        assertEquals("The book was not the same release date", "26-06-1997",testDate.getReleaseDate());
    }



}
