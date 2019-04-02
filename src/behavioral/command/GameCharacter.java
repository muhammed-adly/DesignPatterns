package behavioral.command;

public class GameCharacter {
    private int latitude, logitude;

    public GameCharacter() {
        latitude = 0; // Y
        logitude = 0; // X
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLogitude() {
        return logitude;
    }

    public void setLogitude(int logitude) {
        this.logitude = logitude;
    }


}
