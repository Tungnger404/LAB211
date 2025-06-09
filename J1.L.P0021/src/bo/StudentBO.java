package bo;

import entity.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentBO {

    private ArrayList<Student> studentList = new ArrayList<>();

    //Add a new student to the list
    public void addStudent() {
        Student student = new Student();
        student.input(studentList, constants.Constants.STATUS_CREATE);
        studentList.add(student); //thêm vào danh sách
    }

    //Find a student by their ID 
    public Student findStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return studentList.get(i);
            }
        }
        return null;
    }

    //tìm sinh viên theo tên
    public ArrayList<Student> findStudent(String name) {
        ArrayList<Student> studentFoundList = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().toLowerCase()
                    .contains(name.toLowerCase())) {
                studentFoundList.add(studentList.get(i));
            }
        }
        sortList(studentFoundList); //sắp xếp theo tên
        return studentFoundList;
    }

    // Sort a list of students
    public void sortList(List<Student> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {

                if (list.get(i).getName().compareTo(list.get(j + 1).getName()) > 0) {
                    Student temp = list.get(i);
                    list.set(i, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    //cập nhật hoặc xóa tên
    public void modifyStudent(Student student, String choice) {
        if (choice.equalsIgnoreCase(constants.Constants.STATUS_DELETE)) {
            studentList.remove(student);
        } else {
            student.input(studentList, constants.Constants.STATUS_UPDATE);
        }
    }

    //thống kê số lần học lại 1 khóa
    public Map<String, Integer> report() {
        Map<String, Integer> retakeCount = new HashMap<>();
        for (int i = 0; i < studentList.size(); i++) {
            String key = studentList.get(i).getId()
                    + "|" + studentList.get(i).getName()
                    + "|" + studentList.get(i).getCoursename();
            retakeCount.put(key, retakeCount.getOrDefault(key, 0) + 1);
        }
        return retakeCount;
    }

    public void displayList(List<Student> list) {
        System.out.printf("%-10s %-10s %-10s %-10s\n", "ID", "Name", "CourseName", "Semester");
        for (int i = 0; i < list.size(); i++) {
            list.get(i).output();
        }
    }
}
