package main;

import bo.StudentBO;
import entity.Student;
import java.util.Map;
import utils.Validation;

public class J1LP0021 {

    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        while (true) {
            String menu = ("===== Student Managent =====\n"
                    + "1. Creat \n"
                    + "2. Find and sort \n"
                    + "3. Update and Delete \n"
                    + "4. Report \n"
                    + "5. Exit \n"
                    + "Enter your choice: ");
            int choice = Validation.getInt(
                    menu, 1, 5,
                    messages.Messages.OUT_OF_RANGE,
                    messages.Messages.INVALID);
            switch (choice) {
                case 1:
                    studentBO.addStudent();
                    break;
                case 2:
                    String name = Validation.getString("Enter name: ",
                            constants.Constants.REGEX_NAME,
                            messages.Messages.INVALID);
                    studentBO.displayList(studentBO.findStudent(name));
                    break;
                case 3:
                    int findId = Validation.getInt("Enter id: ", 1, Integer.MAX_VALUE,
                            messages.Messages.OUT_OF_RANGE,
                            messages.Messages.INVALID);

                    Student student = studentBO.findStudent(findId);
                    if (student == null) {
                        System.out.println("No student found");
                    } else {
                        System.out.println("Student found: " + student);
                        String udChoice = Validation.getString(
                                "Do you want to update (U) or delete (D) student:",
                                constants.Constants.REGEX_UD, messages.Messages.INVALID
                        );
                        studentBO.modifyStudent(student, udChoice);
                    }
                    break;
                case 4:
                    Map<String, Integer> result = studentBO.report();
                    for (Map.Entry<String, Integer> entry : result.entrySet()) {
                        System.out.println(entry.getKey() + "|" + (entry.getValue() + 1));
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
            }
        }
    }
}
