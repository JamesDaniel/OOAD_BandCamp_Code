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
public class SongLibrary {
    private List<Song> songs;

    public SongLibrary(){
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
    public Song searchForSong(String songTitle)
    {
        for (Song song: songs)
        {
            if (song.getSongTitle().equals(songTitle))
                return song;
        }
        return null;
    }

   // public Song searchForSong(String title)
    //public Song searchForSong(Member artist)
    //public Song searchForSong(String title, Member artist)
    public int getNewId(){
        return songs.size()+1;
    }

}
