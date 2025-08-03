/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Candidate;
import entity.Experience;
import java.util.ArrayList;
import entity.Fresher;
import entity.Intern;
import constant.Constant;

/**
 *
 * @author lenovo
 */
public class CandiadateBO {
    private ArrayList<Candidate> candidateList = new ArrayList<>();
    private ArrayList<Experience> experienceList = new ArrayList<>();
    private ArrayList<Fresher> fresherList = new ArrayList<>();
    private ArrayList<Intern> internList = new ArrayList<>();
    
        public void addCandidate(int choice) {
        Candidate candidate;
        switch (choice) {
            case 1:
                Experience experience = new Experience();
                experience.input(candidateList);
                experienceList.add(experience);
                candidate = new Candidate(
                        experience.getId(),
                        experience.getName(),
                        experience.getLastname(),
                        experience.getBirthdate(),
                        experience.getAddress(),
                        experience.getPhone(),
                        experience.getEmail(),
                        Constant.TYPE_EXP
                );
                candidateList.add(candidate);
                break;
            case 2:
                Fresher fresher = new Fresher();
                fresher.input(candidateList);
                fresherList.add(fresher);
                candidate = new Candidate(
                        fresher.getId(),
                        fresher.getName(),
                        fresher.getLastname(),
                        fresher.getBirthdate(),
                        fresher.getAddress(),
                        fresher.getPhone(),
                        fresher.getEmail(),
                        Constant.TYPE_EXP
                );
                candidateList.add(candidate);
                break;
            case 3:
                Intern intern = new Intern();
                intern.input(candidateList);
                internList.add(intern);
                candidate = new Candidate(
                        intern.getId(),
                        intern.getName(),
                        intern.getLastname(),
                        intern.getBirthdate(),
                        intern.getAddress(),
                        intern.getPhone(),
                        intern.getEmail(),
                        Constant.TYPE_EXP
                );
                candidateList.add(candidate);
                break;
        }
    }

    public void findCandidateBo(String name){
        for(int i = 0; i < candidateList.size();i++){
            String fullName = candidateList.get(i).getName()
                    + candidateList.get(i).getLastname();
            if(fullName.toLowerCase().contains(name.toLowerCase())){
                candidateList.get(i).output();
            }
        }
    }
    
    public void display() {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        for (int i = 0; i < experienceList.size(); i++) {
            System.out.println(experienceList.get(i).getName());
        }
        System.out.println("===========FRESHER CANDIDATE============");
        for (int i = 0; i < fresherList.size(); i++) {
            System.out.println(fresherList.get(i).getName());
        }
        System.out.println("===========INTERN CANDIDATE============");
        for (int i = 0; i < internList.size(); i++) {
            System.out.println(internList.get(i).getName());
        }
    }
}
