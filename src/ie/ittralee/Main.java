package ie.ittralee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        SongLibrary songLibrary = new SongLibrary();
        Member newMember = new Member(1, "Nazmul Alam");

        Set<Genre> genres = new HashSet<Genre>();
        genres.add(Genre.JAZZ);
        genres.add(Genre.BLUES);
        genres.add(Genre.RNB);
        songLibrary.addSong("I'm so blue", genres, newMember);
        songLibrary.addSong("I'm so blue", genres, new Member(2, "Ciaran Griffo"));

        genres = new HashSet<Genre>();
        genres.add(Genre.POP);
        genres.add(Genre.ROCK);
        songLibrary.addSong("Slapping Gourgous", genres, newMember);

        List<Song> searchedSong = songLibrary.searchForSongByTitle("I'm so blue");
        displaySongs(searchedSong);

        searchedSong = songLibrary.searchForSongByArtistName("Nazmul Alam");
        displaySongs(searchedSong);

        searchedSong = songLibrary.searchForSong("I'm so blue", "Nazmul Alam", Genre.ROCK.toString());
        displaySongs(searchedSong);

        searchedSong = songLibrary.searchForSong("I'm so blue", "Ciaran Griffo", Genre.POP.toString());
        displaySongs(searchedSong);

    }

    private static void displaySongs(List<Song> searchedSong) {

        if (searchedSong == null)
            System.out.println("Song not found.");
        else {
            for (Song song : searchedSong)
                System.out.println(song.toString());
        }

    }
}
