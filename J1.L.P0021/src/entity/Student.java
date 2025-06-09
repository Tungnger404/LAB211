package entity;

import java.util.ArrayList;
import utils.Validation;

public class Student {

    private int id;
    private String name;
    private int semester;
    private String courseName;

    public Student() {
    }

    public Student(int id, String name, int semester, String courseName) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCoursename() {
        return courseName;
    }

    public void setCoursename(String courseName) {
        this.courseName = courseName;
    }

    public void input(ArrayList<Student> list, String status) {

        Student findStudent = null;
        //kiểm tra trùng ID
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                findStudent = list.get(i);
            }
        }
        while (true) {
            id = Validation.getInt("Enter id:", 1,
                    Integer.MAX_VALUE, messages.Messages.OUT_OF_RANGE,
                    messages.Messages.INVALID);

            if (findStudent != null) {
                this.id = findStudent.getId();
                break;
            } else {
                break;
            }
        }

        this.name = Validation.getString("Enter name:",
                constants.Constants.REGEX_NAME, messages.Messages.INVALID);

        this.courseName = Validation.getString(
                "Enter course name:",
                constants.Constants.REGEX_COURSE,
                messages.Messages.INVALID
        );

        //kiểm tra trùng bản ghi
        while (true) {
            this.semester = Validation.getInt("Enter semester:",
                    1, 9, messages.Messages.OUT_OF_RANGE,
                    messages.Messages.INVALID);

            // Nếu là chế độ tạo mới thì cần kiểm tra trùng lặp
            if (status.equalsIgnoreCase(constants.Constants.STATUS_CREATE)) {
                boolean isDuplicate = false;
                for (Student s : list) {
                    if (this.id == s.getId()
                            && this.name.equalsIgnoreCase(s.getName())
                            && this.courseName.equalsIgnoreCase(s.getCoursename())
                            && this.semester == s.getSemester()) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) {
                    System.out.println("Record existed, please enter again.");
                } else {
                    break; // không trùng thì thoát khỏi vòng lặp
                }

            } else {
                // Nếu là update thì không kiểm tra trùng
                break;
            }
        }
    }

    public void output() {
        System.out.printf("%-10d %-10s %-10s %-10d\n", this.id,
                this.name, this.getCoursename(), this.semester);
    }
}
