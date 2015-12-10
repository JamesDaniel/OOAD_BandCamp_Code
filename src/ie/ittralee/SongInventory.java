package ie.ittralee;
import java.util.List;

/**
 * Created by t00119195 on 10/12/2015.
 */
public class SongInventory {

    private List<Song> songs;

    public SongInventory(){

    }

    public void add(String title, int memberID ){
        songs.add(new Song(title, memberID, getNextSongID()));
    }


    public Song search(String title){
        for(Song song: songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null; //nothing found
    }

    public int getNextSongID(){
        return (songs.size() + 1);
    }
}
