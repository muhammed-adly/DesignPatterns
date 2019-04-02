package behavioral.command;

class Button {
    private ICommand command;

    Button() {

    }

    void setCommand(ICommand command) {
        this.command = command;
    }

    void onPress() {
        this.command.execute();
    }
}
