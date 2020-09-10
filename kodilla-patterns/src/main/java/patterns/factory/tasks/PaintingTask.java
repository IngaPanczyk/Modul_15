package patterns.factory.tasks;

public class PaintingTask implements Task {
    String taskName;
    String color;
    String whatToPaint;
    boolean execute;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean execute) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
