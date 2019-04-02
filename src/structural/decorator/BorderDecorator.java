package structural.decorator;

public class BorderDecorator extends Decorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.print("   With BorderDecorator");
    }
}
