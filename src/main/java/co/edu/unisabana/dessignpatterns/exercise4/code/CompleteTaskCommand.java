package co.edu.unisabana.dessignpatterns.exercise4.code;

public class CompleteTaskCommand implements Command{

    private Task task;
    private TaskManager taskManager;

    public CompleteTaskCommand(Task task, TaskManager taskManager) {
        this.task = task;
        this.taskManager = taskManager;
    }

    @Override
    public void execute() {
        task.setComplete(true);
        taskManager.updateTask(task);
    }

    @Override
    public void undo() {
        task.setComplete(false);
        taskManager.updateTask(task);
    }
}
