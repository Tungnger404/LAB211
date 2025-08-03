/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import bo.CandiadateBO;
import utils.Validation;
import messages.Messages;
import constant.Constant;

/**
 *
 * @author lenovo
 */
public class J1LP0022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CandiadateBO candidateBO = new CandiadateBO();
        while (true) {
        String menu = ("\n====== CANDIDATE MANAGEMENT SYSTEM ======"
                + "1. Add Experience Candidate"
                + "2. Add Fresher Candidate"
                + "3. Add Intern Candidate"
                + "4. Search Candidate by Name"
                + "5. Display all Candidates"
                + "6. Exit"
                + "Choose your option: ");
            int choice = Validation.getInt(
                    menu,
                    1, 6,
                    Messages.MSG_OUT_OF_RANGE,
                    Messages.MSG_INVALID
            );
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    candidateBO.addCandidate(choice);
                    break;
                case 4:
                    String name = Validation.getString("Enter name to search: "
                            , Constant.REGEX_NAME, Messages.MSG_INVALID);
                    candidateBO.findCandidateBo(name);
                    break;
                case 5:
                    candidateBO.display();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    return;
            }
        }
    }
}
