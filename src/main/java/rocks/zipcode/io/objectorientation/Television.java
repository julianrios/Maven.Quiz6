package rocks.zipcode.io.objectorientation;

public class Television {


    public void turnOn() {
    }

    public void setChannel(Integer channel) {
        TVChannel.getByOrdinal(channel);
    }

    public TVChannel getChannel() {
        return null;
    }
}
