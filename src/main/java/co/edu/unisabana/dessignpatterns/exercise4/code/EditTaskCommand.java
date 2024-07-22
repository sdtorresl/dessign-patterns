package co.edu.unisabana.dessignpatterns.exercise4.code;

public class EditTaskCommand implements  Command{

    private Task task;
    private String newDescription;
    private String oldDescription;
    private TaskManager taskManager;

    public EditTaskCommand(Task task, String newDescription, TaskManager taskManager) {
        this.task = task;
        this.newDescription = newDescription;
        this.taskManager = taskManager;
        this.oldDescription = task.getDescription();
    }

    @Override
    public void execute() {
        task.setDescription(newDescription);
        taskManager.updateTask(task);
    }

    @Override
    public void undo() {
        task.setDescription(oldDescription);
        taskManager.updateTask(task);
    }
}
