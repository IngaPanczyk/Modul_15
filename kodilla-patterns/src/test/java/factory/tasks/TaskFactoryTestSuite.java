package factory.tasks;

import org.junit.Assert;
import org.junit.Test;
import patterns.factory.tasks.Task;
import patterns.factory.tasks.TaskFactory;


public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);
        boolean beforeExecute = shopping.isTaskExecuted(shopping.getExecute());
        boolean executeTask = shopping.executeTask();
        boolean isExecuted = shopping.isTaskExecuted(executeTask);

        //Then
        Assert.assertEquals("Task 1", shopping.getTaskName());
        Assert.assertEquals(false, beforeExecute);
        Assert.assertEquals(true, executeTask);
        Assert.assertEquals(true, isExecuted);
    }
    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);
        boolean beforeExecute = painting.isTaskExecuted(painting.getExecute());
        boolean executeTask = painting.executeTask();
        boolean isExecuted = painting.isTaskExecuted(executeTask);
        //Then
        Assert.assertEquals("Task 2", painting.getTaskName());
        Assert.assertEquals(false, beforeExecute);
        Assert.assertEquals(true, executeTask);
        Assert.assertEquals(true, isExecuted);
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);
        boolean beforeExecute = driving.isTaskExecuted(driving.getExecute());
        boolean executeTask = driving.executeTask();
        boolean isExecuted = driving.isTaskExecuted(executeTask);
        //Then
        Assert.assertEquals("Task 3", driving.getTaskName());
        Assert.assertEquals(false, beforeExecute);
        Assert.assertEquals(true, executeTask);
        Assert.assertEquals(true, isExecuted);
    }
}
