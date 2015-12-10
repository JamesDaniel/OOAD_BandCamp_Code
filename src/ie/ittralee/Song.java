package ie.ittralee;

import java.util.Collection;

/**
 * Created by SoftwareDev on 08/12/2015.
 */
public class Song {
    private String title;
    private int memberID;
    private int songID;


    public Song(String title, int memberID, int songID) {
        this.title = title;
        this.memberID = memberID;
        this.songID = songID;
    }

    public String getTitle() {
        return title;
    }

    public int getMemberID() {
        return memberID;
    }

    public int getSongID(){ return songID; }




}
