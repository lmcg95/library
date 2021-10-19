import com.TSI.Lauren.librarySonar.DVD;
import com.TSI.Lauren.librarySonar.film;
import com.TSI.Lauren.librarySonar.tvShow;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DVDTest {

    @Test
    public void testFilmTitle(){
        DVD testFilmTitle = new film("Trainspotting", "Drama", "Danny Boyle", "Ewan McGregor");
        assertEquals("The film was not the same title","Trainspotting",testFilmTitle.getTitle());
    }

    @Test
    public void testFilmGenre(){
        DVD testFilmGenre = new film("Trainspotting", "Drama", "Danny Boyle", "Ewan McGregor");
        assertEquals("The film was not the same genre","Drama",testFilmGenre.getGenre());
    }


    @Test
    public void testDirector(){
        DVD testDirector = new film("Trainspotting", "Drama", "Danny Boyle", "Ewan McGregor");
        assertEquals("The film was not the same director","Danny Boyle",testDirector.getDirector());
    }

    @Test
    public void testStar(){
        film testStar = new film("Trainspotting", "Drama", "Danny Boyle", "Ewan McGregor");
        assertEquals("The film was not the same starring role","Ewan McGregor",testStar.getStarringRole());
    }

    @Test
    public void testSeries(){
        tvShow testSeries = new tvShow("You", "Drama", "Noel Arthur", 3);
        assertEquals("The show was not the same number of series",3,testSeries.getHowManySeries());
    }

    @Test
    public void testSeriesName(){
        tvShow testSeriesName = new tvShow("You", "Drama", "Noel Arthur", 3);
        assertEquals("The show was not the same name","You", testSeriesName.getTitle());
    }

    @Test
    public void testSeriesGenre(){
        tvShow testSeriesGenre = new tvShow("You", "Drama", "Noel Arthur", 3);
        assertEquals("The show was not the same genre","Drama", testSeriesGenre.getGenre());
    }

    @Test
    public void testSeriesDirector(){
        tvShow testSeriesDirector = new tvShow("You", "Drama", "Noel Arthur", 3);
        assertEquals("The show was not the same director","Noel Arthur", testSeriesDirector.getDirector());
    }

    @Test
    public void testSeriesDirector2(){
        DVD testSeriesDirector2 = new tvShow("You", "Drama", "Noel Arthur", 3);
        assertEquals("The show was not the same director","Noel Arthur", testSeriesDirector2.getDirector());
    }





}
