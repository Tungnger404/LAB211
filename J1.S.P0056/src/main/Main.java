package main;

import bo.WorkerBO;
import entity.Worker;
import utils.Validation;

public class Main {

    public static void main(String[] args) {
        WorkerBO workerBO = new WorkerBO();
        while (true) {
            String menu = ("=====Worker Management===== \n"
                    + "1. Add Worker \n"
                    + "2. Up salary \n"
                    + "3. Down salary \n"
                    + "4. Display Information \n"
                    + "5. Exit \n"
                    + "Enter your choice: ");
            int choice = Validation.getInt(menu, 1, 5,
                    "Choice must be 1-5", messages.Messages.INVALID);
            switch (choice) {
                case 1:
                    Worker newWorker = Worker.input(workerBO);
                    workerBO.addWorker(newWorker);
                    break;
                case 2:
                case 3:
                    String status;
                    int findId = Validation.getInt("Enter Id: ", 1,
                            Integer.MAX_VALUE, messages.Messages.OUT_OF_RANGE,
                            messages.Messages.INVALID);
                    Worker worker = workerBO.findWorker(findId);
                    if (worker != null) {
                        int max, min;
                        if (choice == 2) {
                            min = worker.getSalary() + 1;
                            max = Integer.MAX_VALUE;
                            status = constant.Constant.UP;
                        } else {
                            max = worker.getSalary() - 1;
                            min = 1;
                            status = constant.Constant.DOWN;
                        }
                        int newsalary = Validation.getInt("Enter new salary: ", min, max,
                                messages.Messages.OUT_OF_RANGE, messages.Messages.INVALID);
                        workerBO.updateSalary(worker, status, newsalary);
                        System.out.println("Upadte sucessful");
                    } else {
                        System.out.println("No worker found");
                    }
                    break;
                case 4:
                    workerBO.displayList();
                    break;
                case 5:
                    System.out.println("Goodbye. Exiting program");
                    return;
            }
        }
    }
}
