/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

/**
 *
 * @author SoftwareDev
 */
public class Member{


    final private int memId;
    private String memberName;


    public Member(int memId, String memberName) {
        this.memId = memId;
        this.memberName = memberName;
    }


    @Override
    public String toString(){
        return "\nMember ID: " + memId +
               "\nName: " + memberName;
    }


    /**
     * @return the memId
     */
    public int getMemId() {
        return memId;
    }

    /**
     * @return the memberName
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName the memberName to set
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

}
