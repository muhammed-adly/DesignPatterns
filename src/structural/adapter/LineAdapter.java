package structural.adapter;

public class LineAdapter implements Shape {
    private Line adaptee;

    LineAdapter(Line adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public void draw(int x, int y, int j, int k) {
        adaptee.draw(x, y, j, k);
    }
}
