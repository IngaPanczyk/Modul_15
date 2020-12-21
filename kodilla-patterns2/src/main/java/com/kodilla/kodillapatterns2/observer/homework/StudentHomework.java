package com.kodilla.kodillapatterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentHomework implements Observable{
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String studentName;

    public StudentHomework(String studentName) {
        this.observers = new ArrayList<>();
        this.tasks = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObserver();
    }
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);

    }
    @Override
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);

    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }
}
