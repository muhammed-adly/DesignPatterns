package structural.decorator;

public class TextField implements Widget {
    private int width, height;

    TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.print("TextField: width: " + width + ", height: " + height);
    }
}
