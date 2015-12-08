package ie.ittralee;

import java.util.Collection;

/**
 * Created by SoftwareDev on 08/12/2015.
 */
public class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }


}
