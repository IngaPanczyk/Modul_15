package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class StudentHomeworkTest {
    @Test
    public void testUpdate() {
        //Given
        StudentHomework janNowakHomework = new JanNowakHomework();
        StudentHomework annaKwiatkowskaHomework = new JanNowakHomework();
        Mentor karolKwiatkowskiMentor = new KarolKwiatkowskiMentor();
        janNowakHomework.registerObserver(karolKwiatkowskiMentor);
        annaKwiatkowskaHomework.registerObserver(karolKwiatkowskiMentor);
        //When
        janNowakHomework.addTask("Task 1");
        janNowakHomework.addTask("Task 2");
        annaKwiatkowskaHomework.addTask("Task 1");
        annaKwiatkowskaHomework.addTask("Task 2");
        annaKwiatkowskaHomework.addTask("Task 3");
        //Then
        assertEquals(5, karolKwiatkowskiMentor.getUpdateCount());

    }


}
