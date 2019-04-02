package structural.decorator;

public class HorizontalDecorator extends Decorator {
    public HorizontalDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print("    With HorizontalDecorator");
    }
}
