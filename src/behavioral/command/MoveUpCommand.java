package behavioral.command;

public class MoveUpCommand implements ICommand{
    GameCharacter character;

    public MoveUpCommand(GameCharacter charecter){
        this.character = charecter;
    }

    @Override
    public void execute() {
        int new_latitude = character.getLatitude() + 1;
        character.setLatitude(new_latitude);
        System.out.println("New Latitude Execute "+new_latitude);
    }

    @Override
    public void unexecute() {
        int new_latitude = character.getLatitude() - 1;
        character.setLatitude(new_latitude);
        System.out.println("New Latitude Un-Execute "+new_latitude);
    }
}
