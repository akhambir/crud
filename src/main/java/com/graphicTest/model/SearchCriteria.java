package com.graphicTest.model;


public class SearchCriteria {

    private int OEExpense;
    private int OEStaticPressure;
    private int limit;

    public SearchCriteria() {}

    public SearchCriteria(int OEExpense, int OEStaticPressuret) {
        this.OEExpense = OEExpense;
        this.OEStaticPressure = OEStaticPressure;
    }

    public SearchCriteria(int OEExpense, int OEStaticPressure, int limit) {
        this.OEExpense = OEExpense;
        this.OEStaticPressure = OEStaticPressure;
        this.limit = limit;
    }

    public int getOEExpense() {
        return OEExpense;
    }

    public void setOEExpense(int OEExpense) {
        this.OEExpense = OEExpense;
    }

    public int getOEStaticPressure() {
        return OEStaticPressure;
    }

    public void setOEStaticPressure(int OEStaticPressure) {
        this.OEStaticPressure = OEStaticPressure;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
