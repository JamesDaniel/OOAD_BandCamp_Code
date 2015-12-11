/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.Set;


public class Song implements Comparable<Song>{
    private int id;
    private String title;
    private Set<Genre> genre;

    public Song(int id, String title, Set<Genre> genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }
    public int compareTo(Song otherSong){
        return this.getId() > otherSong.getId() ? 1  :
                this.getId() < otherSong.getId() ? -1 : 0;
    }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }



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

}
