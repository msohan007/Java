package Class;

public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {

        return length * width;

    }
    
    public void display() {
        System.out.println("Rectangle Area : " + calculateArea());
    }
}
