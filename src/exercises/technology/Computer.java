package exercises.technology;

public class Computer extends AbstractEntity {

    private String name;
    private int ramCapacity;
    private String processor;
    private boolean isPowerOn = false;
    private boolean isScreenOn = false;


    public Computer(String name, int ramCapacity, String processor) {
        this.id = nextId;
        nextId++;

        this.name = name;
        this.ramCapacity = ramCapacity;
        this.processor = processor;
    }

    public void powerOn(){
        System.out.println("Powered on");
        this.isPowerOn = true;
    }

    public void screenOff(){
        System.out.println("Turning screen off");
        this.isScreenOn = false;
    }


}
