package Exercice1;


public class DutchHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new BricksWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}

