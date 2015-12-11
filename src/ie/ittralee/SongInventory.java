/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.List;
import java.util.Set;

/**
 *
 * @author SoftwareDev
 */
public class SongInventory {
    private List<Song> songs;

    public SongInventory(){

    }
    public void addSong(String title, Set<Genre> genre)
    {
        int id = this.getNewId();
        songs.add(new Song(id , title, genre));
    }
    public Song getSong(int id)
    {
        return songs.get(id);
    }
    public Song SearchForSong(String title, Genre genre)
    {
        // need code to search for and return a song from inventory list
        return null;
    }
    public int getNewId(){
        return songs.size()+1;
    }
}
