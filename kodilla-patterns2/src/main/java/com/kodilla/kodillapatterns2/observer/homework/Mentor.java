package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private  int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(StudentHomework studentHomework){
        System.out.println(mentorName + ": You have new tasks to check from "+ studentHomework.getStudentName() + "\n"+
                "total: " + studentHomework.getTasks().size() + "tasks");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
