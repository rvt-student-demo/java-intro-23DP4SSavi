package lv.rvt;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this capacity = capacity;
        } else {
            this capacity = 0;
        }

    public double getBalance() {
        return this.balance;
    }
    public double getCapacity() {
        return this.balance;
    }
    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
    }
    public double takeFromWarehouse(double amount) {
    }
