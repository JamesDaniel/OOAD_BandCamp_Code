/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author SoftwareDev
 */
public class SongLibrary {
    private List<Song> songs;

    public SongLibrary(List<Song> songs) {
        this.songs = songs;
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
        return songs.stream().filter(song -> song.getSongTitle().equals(songTitle)).collect(Collectors.toList());
    }


    public List<Song> searchForSongByArtistName(String artistName){
        return songs.stream().filter(song -> song.getArtist().getMemberName().equals(artistName)).collect(Collectors.toList());
    }

    public List<Song> searchForSongByGenre(String genre)
    {
        return songs.stream().filter(song -> song.getGenre().toString().equals(genre)).collect(Collectors.toList());

    }

    public List<Song> searchForSong(String songTitle, String artistName, String genre){
        return songs.stream().filter(song -> song.getSongTitle().equals(songTitle)
                && song.getArtist().getMemberName().equals(artistName)
                && song.getGenre().toString().equals(genre)).collect(Collectors.toList());

    }

    private int getNewSongId(){ //rename to getNewSongID and private
        return songs.size()+1;
    }

}
