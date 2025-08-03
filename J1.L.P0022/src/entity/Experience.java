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
public class Experience extends Candidate{
    private int exp;
    private String skill;

    public Experience() {
    }

    public Experience(int exp, String skill, int id, String name
            , String lastname, String birthdate, String address
            , String phone, String email, int type) {
        super(id, name, lastname, birthdate, address, phone, email, type);
        this.exp = exp;
        this.skill = skill;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void input(List<Candidate> list) {
        super.input(list); 
        this.exp = Validation.getInt("Enter experience year:",
                0, 200,
                Messages.MSG_OUT_OF_RANGE, Messages.MSG_INVALID);
        this.skill = Validation.getString("Enter skill:"
                , Constant.REGEX_NAME, Messages.MSG_INVALID);
    } 
}
