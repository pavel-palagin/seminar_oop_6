package seminar_6;

import seminar_6.task.Priority;
import seminar_6.task.Task;
import seminar_6.task.TaskService;
import seminar_6.task.TaskServiceInterface;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        TaskServiceInterface taskService = new TaskService();
//        ReadTasksFromFile readTasksFromFile = new ReadTasksFromFile(taskService);
//
//        readTasksFromFile.readTasksfromFile("C:\\Users\\Pavel\\Desktop\\Study\\java\\seminarOOP\\seminar_6\\Tasks.txt");
//        System.out.println(taskService.getAllTasks());

        Task task1 = new Task("homework", Priority.HIGH, "Petr", LocalDate.now().plusDays(3));
        Task task2 = new Task("homework", Priority.URGENT, "Petr", LocalDate.now().plusDays(2));
        Task task3 = new Task("homework", Priority.HIGH, "Vera", LocalDate.now().plusDays(1));

        TaskServiceInterface taskService = new TaskService();
        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        System.out.println(taskService.getAllTasks());
//
//        System.out.println(taskService.getTaskOfId(2));
//        System.out.println();
//
//        System.out.println(taskService.getTaskOfId(10));
//        System.out.println();
//
//        System.out.println(taskService.getOnePriorityTasks(Priority.HIGH));
//        System.out.println();
//
//        taskService.deleteTask(task1);
//        System.out.println(taskService.getAllTasks());

    }



}

