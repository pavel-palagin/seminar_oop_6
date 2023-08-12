package seminar_6.task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Task {
    private static int idCount = 0;
    private int id;
    private String description;
    private String ownerName;
    private Priority priority;
    private LocalDateTime dateAdded;
    private LocalDate dateDeadline;



    public Task(String description, Priority priority, String ownerName, LocalDate dateDeadline) {
        idCount++;
        this.id = idCount;
        this.description = description;
        this.priority = priority;
        this.ownerName = ownerName;
        this.dateDeadline = dateDeadline;
        this.dateAdded = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "\nid: " + id + "\ndescription: " + description + "\npriority: " + priority + "\nowner: " + ownerName + "\ndate added: " + dateAdded + "\ndeadline: " + dateDeadline;
    }
}
