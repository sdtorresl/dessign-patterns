package co.edu.unisabana.dessignpatterns.exercise4.code;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    // Método para agregar una tarea
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added: " + task.getDescription() +  ", status: " + task.isComplete());
    }

    // Método para eliminar una tarea
    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("Task removed: " + task.getDescription());
    }

    // Método para actualizar una tarea
    public void updateTask(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId()==task.getId()) {
                tasks.set(i, task);
                System.out.println("Task updated: " + task.getDescription() + ", status: " + task.isComplete());
                break;
            }
        }
    }

    // Método para obtener todas las tareas
    public List<Task> getAllTasks() {
        return tasks;
    }

    // Método para obtener una tarea por su ID
    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId()==id) {
                return task;
            }
        }
        return null;
    }
}
