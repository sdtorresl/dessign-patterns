package co.edu.unisabana.dessignpatterns.exercise4.code;

public class TaskSystem {
    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager();
        CommandInvoker invoker = new CommandInvoker();

        Task task1 = new Task(1,"Go Market");
        Task task2 = new Task(2, "Read a book");

        Command createTaskCommand1 = new CreateTaskCommand(task1, taskManager);
        Command createTaskCommand2 = new CreateTaskCommand(task2, taskManager);

        invoker.executeCommand(createTaskCommand1);
        invoker.executeCommand(createTaskCommand2);


        Command updateTaskCommand = new EditTaskCommand(task1, "Buy groceries and cook dinner", taskManager);
        invoker.executeCommand(updateTaskCommand);

        System.out.println("All tasks Edit:");
        taskManager.getAllTasks().forEach(task -> System.out.println(task.getDescription()));

        System.out.println("undoLastCommand.....:");
        invoker.undoLastCommand();

        System.out.println("All tasks Back Edit:");
        taskManager.getAllTasks().forEach(task -> System.out.println(task.getDescription()));

        Command removeTaskCommand = new DeleteTaskCommand(task2, taskManager);
        invoker.executeCommand(removeTaskCommand);

        System.out.println("All tasks Delete:");
        taskManager.getAllTasks().forEach(task -> System.out.println(task.getDescription()));

        System.out.println("undoLastCommand.....:");
        invoker.undoLastCommand();

        System.out.println("All tasks Back Delete:");
        taskManager.getAllTasks().forEach(task -> System.out.println(task.getDescription()));

        System.out.println("Complete Task");
        Command completeTask = new CompleteTaskCommand(task1, taskManager);
        invoker.executeCommand(completeTask);

        System.out.println("All tasks Complete Task:");
        taskManager.getAllTasks().forEach(task -> System.out.println(task.getDescription() + ", status: " + task.isComplete()));





    }
}
