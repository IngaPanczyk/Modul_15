package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"123", "John", "Smith"},
            {"123", "John", "Smith"},
            {"123", "John", "Smith"},
            {"123", "John", "Smith"},
            {"123", "John", "Smith"}};
    private double[] salaries = {
            4500.00,
            4500.00,
            4500.00,
            4500.00,
            4500.00,};
    public String getWorker (int n){
        if(n>salaries.length){
            return "";
        }
        return workers[n][0] + ","+workers [n][1]+ ","+workers [n][2] +","+ salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
