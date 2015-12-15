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
    public void addSong(String title, Set<Genre> genres, Member artist)
    {
        int id = this.getNewId();
        songs.add(new Song(id , title, genres, artist));
    }
    public Song getSong(int id)
    {
        return songs.get(id);
    }
    public Song searchForSongByTitle(String songTitle)
    {
        for (Song song: songs)
        {
            if (song.getSongTitle().equals(songTitle))
                return song;
        }
        return null;
    }


    public Song searchForSongByArtistName(String artistName){
        for(Song song: songs)
        {
            if(song.getArtist().getMemberName().equals(artistName))
                return song;
        }
        return null;
    }

    public Song searchForSong(String songTitle, String artistName){
        for(Song song: songs){
            if(song.getSongTitle().equals(songTitle) && song.getArtist().getMemberName().equals(artistName))
                return song;
        }

        return null;
    }

    public int getNewId(){
        return songs.size()+1;
    }

}
