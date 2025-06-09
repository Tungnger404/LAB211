/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author lenovo
 */
public class WorkerHistory extends Worker{
   private LocalDate date;
   private String status;

    public WorkerHistory() {
    }

    public WorkerHistory(LocalDate date, String status) {
        this.date = date;
        this.status = status;
    }

    public WorkerHistory(LocalDate date, String status, int id, String name, int salary, int age) {
        super(id, name, salary, age);
        this.date = date;
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

   @Override
    public void output() {
        super.output();
        System.out.printf("%-10s %-10s\n", this.status, this.date);       
    }
}
    