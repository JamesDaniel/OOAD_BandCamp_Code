package ie.ittralee;

import java.util.HashSet;
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

        Song searchedSong = songLibrary.searchForSongByTitle("I'm so blue");
        if (searchedSong == null)
            System.out.println("Song not found.");
        else
            System.out.println(searchedSong.toString());

        searchedSong = songLibrary.searchForSongByArtistName("Nazmul Alam");
        if (searchedSong == null)
            System.out.println("Song not found.");
        else
            System.out.println(searchedSong.toString());


        searchedSong = songLibrary.searchForSong("I'm so blue", "Nazmul Alam");
        if (searchedSong == null)
            System.out.println("Song not found.");
        else
            System.out.println(searchedSong.toString());


        searchedSong = songLibrary.searchForSong("I'm so blue", "Ciaran Griffo");
        if (searchedSong == null)
            System.out.println("Song not found.");
        else
            System.out.println(searchedSong.toString());

    }
}
