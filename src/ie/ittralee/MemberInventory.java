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
public class MemberInventory {
    private List<Member> members;

    public MemberInventory(){

    }
    public void addMember(String name)
    {
        int id = this.getNewId();
        members.add(new Member(id ,name));
    }
    public Member getMember(int id)
    {
        return members.get(id);
    }
    public int getNewId(){
        return members.size()+1;
    }


}
