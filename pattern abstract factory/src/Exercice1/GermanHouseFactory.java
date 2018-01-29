package Exercice1;


public class GermanHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new GlassWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
