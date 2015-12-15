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
        int id = this.getNewSongId();
        songs.add(new Song(id , title, genres, artist));
    }
    public Song getSong(int id)
    {
        return songs.get(id);
    }
    public List<Song> searchForSongByTitle(String songTitle)
    {
        List<Song> foundSongs = new ArrayList();
        for (Song song: songs)
        {
            if (song.getSongTitle().equals(songTitle))
                foundSongs.add(song);
        }
        return foundSongs;
    }


    public List<Song> searchForSongByArtistName(String artistName){
        List<Song> foundSongs = new ArrayList();
        for(Song song: songs)
        {
            if(song.getArtist().getMemberName().equals(artistName))
                foundSongs.add(song);
        }
        return foundSongs;
    }

    public List<Song> searchForSongByGenre(String genre)
    {
        List<Song> foundSongs = new ArrayList();
        for (Song song: songs)
        {
            if (song.getGenre().equals(genre)) {
                foundSongs.add(song);
            }
        }
        return foundSongs;
    }

    public List<Song> searchForSong(String songTitle, String artistName, String genre){
        List<Song> foundSongs = new ArrayList();
        for(Song song: songs){
            if(song.getSongTitle().equals(songTitle)
                    && song.getArtist().getMemberName().equals(artistName)
                    && song.getGenre().equals(genre))
            {
                foundSongs.add(song);
            }
        }

        return foundSongs;
    }

    private int getNewSongId(){ //rename to getNewSongID and private
        return songs.size()+1;
    }

}
