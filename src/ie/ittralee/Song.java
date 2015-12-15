/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.Set;


public class Song{
    private int songId;
    private String songTitle;
    private Set<Genre> genre;
    private Member artist;

    public Song(int songId, String songTitle, Set<Genre> genre, Member artist) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.genre = genre;
        this.setArtist(artist);
    }
    @Override
    public String toString(){
        String genres = "";
        for (Genre g: genre)
        {
            genres += " " + g.toString() + ",";
        }

        genres = genres.substring(0,genres.length()-1);


        return "ID: " + songId +
               "\nTitle: " + songTitle +
               "\nGenres: " + genres;//add artist

    }



    /**
     * @return the songId
     */
    public int getSongId() {
        return songId;
    }

    /**
     * @param songId the songId to set
     */
    public void setSongId(int songId) {
        this.songId = songId;
    } //o/c

    /**
     * @return the songTitle
     */
    public String getSongTitle() {
        return songTitle;
    }

    /**
     * @param songTitle the songTitle to set
     */
    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }//remove



    /**
     * @return the genre
     */
    public Set<Genre> getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(Set<Genre> genre) {
        this.genre = genre;
    }


    public Member getArtist() {
        return artist;
    }

    public void setArtist(Member artist) {
        this.artist = artist;
    }
}
