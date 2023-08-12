package seminar_6.task;

import seminar_6.repo.TaskRepository;

import java.util.Deque;
import java.util.List;

public class TaskService implements TaskServiceInterface {
    private TaskRepository taskRepository;

    public TaskService() {
        this.taskRepository = new TaskRepository();
    }

    @Override
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }

    @Override
    public void deleteTask(Task task) {
        taskRepository.removeTask(task);
    }

    @Override
    public Task getTaskOfId(int id) {
        return taskRepository.getTaskOfId(id);
    }

    @Override
    public List<Task> getOnePriorityTasks(Priority priority) {
        return taskRepository.getOnePriorityTasks(priority);
    }

    @Override
    public Deque<Task> getAllTasks() {
        return taskRepository.getTaskDeque();
    }

}
