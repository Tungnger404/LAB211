/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Worker;
import entity.WorkerHistory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class WorkerBO {

    private List<Worker> workerList;
    private List<WorkerHistory> workerHistoryList;

    public WorkerBO() {
        workerList = new ArrayList<>();
        workerHistoryList = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workerList.add(worker);
    }

    public Worker findWorker(int id) {
        for (int i = 0; i < workerList.size(); i++) {
            if (workerList.get(i).getId() == id) {
                return workerList.get(i);
            }
        }
        return null;
    }

    public void updateSalary(Worker worker, String status, int newsalary) {
        worker.setSalary(newsalary);
        WorkerHistory workerHistory = new WorkerHistory(utils.DateUtil.getDate(),
                status, worker.getId(),
                worker.getName(), worker.getSalary(), worker.getAge());
        workerHistoryList.add(workerHistory);
    }

    public void displayList() {
        if (workerList.isEmpty()) {
            System.out.println("No workers available.");
            return;
        }
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s \n",
                "Code", "Name", "Age", "Salary", "Status", "Date");
        for (int i = 0; i < workerList.size(); i++) {
            workerList.get(i).output();
            System.out.println();
        }
    }
}
