/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SoftwareDev
 */
public class Member{


    private int id;
    private String name;
    List<Song> songsByMember;


    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.songsByMember = new ArrayList<Song>();
    }
    @Override
    public String toString(){
        return "\nID: " + id +
               "\nName: " + name;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param s the song to add to List
     */
    public void uploadSong(Song s, SongInventory si)
    {
        //Song s = new Song()
        songsByMember.add(s);
        //SongInventory.add(s);
    }
}
