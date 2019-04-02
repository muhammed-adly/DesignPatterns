package structural.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Widget widget = new BorderDecorator(new TextField(12, 14));
        widget.draw();
    }
}
