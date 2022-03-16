package exercises.technology;

public class SmartPhone extends Computer {
    private boolean hasCamera;

    public SmartPhone(String name, int ramCapacity, String processor) {
        super(name, ramCapacity, processor);
    }

    public void takePicture(){
        System.out.println("Image taken");
    }
}
