package Exercice1;


public class SwissWoodChaletFactory implements HouseFactory {

    public Wall createWall() {
        return new WoodWall();
    }

    public Door createDoor() {
        return new ThinDoor();
    }

    public Window createWindow() {
        return new WindowWithStructure();
    }

}
