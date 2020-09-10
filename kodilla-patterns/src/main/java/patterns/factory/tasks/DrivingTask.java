package patterns.factory.tasks;

public class DrivingTask implements Task {
    String taskName;
    String where;
    String using;
    boolean execute;

    public DrivingTask(String taskName, String where, String using, boolean execute) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.execute = execute;
    }

    public boolean getExecute() {
        return execute;
    }

    public boolean executeTask() {
        execute = true;
        System.out.println("The task was done");
        return execute;
    }

    @Override
    public String getTaskName() {
        System.out.println("Task name is: " + taskName);
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(boolean execute) {
        if (execute == true) {
            System.out.println("Task is executed");
            return true;
        } else {
            System.out.println("Task is not executed");
            return false;
        }
    }

}
