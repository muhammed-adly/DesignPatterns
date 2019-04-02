package behavioral.command;

public class CommandTest {
    public static void main(String[] args) {
        Button buttonA =  new Button();
        Button buttonS =  new Button();
        Button buttonW =  new Button();
        Button buttonD =  new Button();

        GameCharacter mario = new GameCharacter();

        ICommand moveUp = new MoveUpCommand(mario);
        ICommand moveDown = new MoveDownCommand(mario);


        buttonA.setCommand(moveUp);
        buttonS.setCommand(moveDown);

        buttonA.onPress();
        buttonA.onPress();

        buttonS.onPress();
        buttonA.onPress();
        buttonS.onPress();

    }
}
