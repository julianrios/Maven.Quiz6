package rocks.zipcode.io.objectorientation;

public class Television {
    private TVChannel currentChannel;
    private boolean powerOn;

    public void turnOn() {
        this.powerOn = true;
    }

    public void setChannel(Integer channel) {
       if(this.powerOn) {
           currentChannel = TVChannel.getByOrdinal(channel);
       } else {
           throw new IllegalStateException();
       }
    }

    public TVChannel getChannel() {
        return this.currentChannel;
    }
}
