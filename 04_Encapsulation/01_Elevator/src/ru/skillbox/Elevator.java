package ru.skillbox;

// при условии, что этажи < 0 - это цокольные
public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveUp() {
        currentFloor += 1;
    }

    public void moveDown() {
        currentFloor -= 1;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor || floor == 0)
            System.out.println("Ошибка! " + floor + " этаж отсутствует.");
        else if (floor > currentFloor) {
            while (currentFloor < floor) {
                moveUp();
                System.out.println(currentFloor == 0 ? "0" : currentFloor + " этаж");
            }
        } else if (floor < currentFloor) {
            while (currentFloor > floor) {
                moveDown();
                System.out.println(currentFloor == 0 ? "0" : currentFloor + " этаж");
            }
        }
        currentFloor = floor;
    }
}

