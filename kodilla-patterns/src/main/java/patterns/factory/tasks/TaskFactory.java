package patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "ShoppingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String DRIVING_TASK = "DrivingTask";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Task 1", "Soup", 11, false);
            case PAINTING_TASK:
                return new PaintingTask("Task 2", "yellow", "door", false);
            case DRIVING_TASK:
                return new DrivingTask("Task 3", "Wrocław", "car", false);
            default:
                return null;
        }

    }
}
