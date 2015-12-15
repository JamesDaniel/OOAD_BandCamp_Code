package ie.ittralee;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SongLibrary songLibrary = new SongLibrary();

        Set<Genre> genres = new HashSet<Genre>();
        genres.add(Genre.JAZZ);
        genres.add(Genre.BLUES);
        genres.add(Genre.RNB);
        songLibrary.addSong("I'm so blue", genres);


        genres = new HashSet<Genre>();
        genres.add(Genre.POP);
        genres.add(Genre.ROCK);
        songLibrary.addSong("Slapping Gourgous", genres);

        Song searchedSong = songLibrary.searchForSong("I'm so blue");
        if (searchedSong == null)
            System.out.println("Song not found.");
        else
            System.out.println(searchedSong.toString());


    }
}
