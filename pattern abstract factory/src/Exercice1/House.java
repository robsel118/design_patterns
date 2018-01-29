package Exercice1;


/**
 * @author  h40003073
 */
public class House {

   
    /**
	 * @uml.property  name="houseFactory"
	 * @uml.associationEnd  
	 */
    private HouseFactory houseFactory;

    private String name = "";
    
    /**
	 * @uml.property  name="southWall"
	 * @uml.associationEnd  
	 */
    private Wall southWall;
    
    /**
	 * @uml.property  name="northWall"
	 * @uml.associationEnd  
	 */
    private Wall northWall;
    
    /**
	 * @uml.property  name="westWall"
	 * @uml.associationEnd  
	 */
    private Wall westWall;
    
    /**
	 * @uml.property  name="eastWall"
	 * @uml.associationEnd  
	 */
    private Wall eastWall;
   
    /**
	 * @uml.property  name="southWindow"
	 * @uml.associationEnd  
	 */
    private Window southWindow;
    
    /**
	 * @uml.property  name="westWindow"
	 * @uml.associationEnd  
	 */
    private Window westWindow;
    
    /**
	 * @uml.property  name="eastDoor"
	 * @uml.associationEnd  
	 */
    private Door eastDoor;

    public House(String name, HouseFactory houseFactory) {
        this.name = name;
        this.houseFactory = houseFactory;
    }

    public void buildHouse() {
        southWall = createWall();
        northWall = createWall();
        westWall = createWall();
        eastWall = createWall();

        southWall.bindTo(westWall);
        westWall.bindTo(southWall);

        westWall.bindTo(northWall);
        northWall.bindTo(westWall);

        northWall.bindTo(eastWall);
        eastWall.bindTo(northWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        southWindow = createWindow(southWall);
        westWindow = createWindow(westWall);

        eastDoor = createDoor(eastWall);

    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() 
                + westWall.getPrice()
                + northWall.getPrice()
                + eastWall.getPrice()
                + southWindow.getPrice()
                + westWindow.getPrice()
                + eastDoor.getPrice();
    }

    private Wall createWall() {
        return houseFactory.createWall();
    }

    private Door createDoor(Wall w) {
        Door door = houseFactory.createDoor();
        door.buildOnWall(w);
        return door;
    }

    private Window createWindow(Wall w) {
        Window window = houseFactory.createWindow();
        window.buildOnWall(w);
        return window;
    }

    /**
	 * @return
	 * @uml.property  name="houseFactory"
	 */
    public HouseFactory getHouseFactory() {
        return houseFactory;
    }

    
    /**
	 * @param houseFactory
	 * @uml.property  name="houseFactory"
	 */
    public void setHouseFactory(HouseFactory houseFactory) {
        this.houseFactory = houseFactory;
    }

}
