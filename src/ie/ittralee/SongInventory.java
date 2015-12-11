/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author SoftwareDev
 */
public class SongInventory {
    private List<Song> songs;

    public SongInventory(){
        songs = new ArrayList<Song>();
    }
    public void addSong(String title, Set<Genre> genres)
    {
        int id = this.getNewId();
        songs.add(new Song(id , title, genres));
    }
    public Song getSong(int id)
    {
        return songs.get(id);
    }
    public Song searchForSong(String title)
    {
        for (Song song: songs)
        {
            if (song.getTitle().equals(title))
                return song;
        }
        return null;
    }
    public int getNewId(){
        return songs.size()+1;
    }

}
