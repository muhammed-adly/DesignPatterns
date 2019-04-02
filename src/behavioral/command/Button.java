package behavioral.command;

public class Button {
    private ICommand command;

    public Button() {

    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void onPress() {
        this.command.execute();
    }
}
