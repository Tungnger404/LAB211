/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import utils.Validation;
import messages.Messages;
import constant.Constant;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class Fresher extends Candidate{
    private String graddate;
    private String rank;
    private String university;
    
    public Fresher() {
    }

    public Fresher(String graddate, String rank, String university
            , int id, String name, String lastname, String birthdate
            , String address, String phone, String email, int type) {
        super(id, name, lastname, birthdate, address, phone, email, type);
        this.graddate = graddate;
        this.rank = rank;
        this.university = university;
    }

    public String getGraddate() {
        return graddate;
    }

    public void setGraddate(String graddate) {
        this.graddate = graddate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void input(List<Candidate> list) {
        super.input(list);
        this.graddate = Validation.getString("Enter gradua date:"
                , Constant.REGEX_DATE, Messages.MSG_INVALID);
        this.rank = Validation.getString("Enter rank"
                , Constant.REGEX_RANK, Messages.MSG_INVALID);
        this.university = Validation.getString("Enter graduate"
                , Constant.REGEX_NAME, Messages.MSG_INVALID);
    }       
}
