/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import bo.WorkerBO;
import utils.Validation;

/**
 *
 * @author lenovo
 */
public class Worker {

    private int id;
    private String name;
    private int salary;
    private int age;

    public Worker() {
    }

    public Worker(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Worker input(WorkerBO workerBO) {
        int id;
        while (true) {
            id = Validation.getInt("Enter id: ", 1,
                    Integer.MAX_VALUE,
                    messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
            if (workerBO.findWorker(id) != null) {
                System.out.println("Id exited");
            } else {
                break;
            }
        }

        String name = Validation.getString("Enter name: ",
                constant.Constant.REGEX_NAME, messages.Messages.INVALID);
        int age = Validation.getInt("Enter age: ", 1, Integer.MAX_VALUE,
                messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
        int salary = Validation.getInt("Enter salary: ", 1, Integer.MAX_VALUE,
                messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
        Worker worker = new Worker(id, name, salary, age);
        return worker;
    }

    public void output() {
        System.out.printf("%-10d %-10s %-10d %-10d", 
                this.id, this.name, this.age, this.salary);
    }
}
