package exercises.technology;

public class Laptop extends Computer {
    private boolean hasKeyboard;

    public Laptop(String name, int ramCapacity, String processor) {
        super(name, ramCapacity, processor);
    }

    public void openScreen(){
        System.out.println("Screen opened");
    }
}
