package khh.Test;

public class Channel {
    private ChannelType channelType;
    private int channelID;
    private String channelName;
    private String broadcastName;
    private String frequency;

    public Channel(ChannelType channelType, int channelID, String channelName, String broadcastName, String frequency) {
        this.channelType = channelType;
        this.channelID = channelID;
        this.channelName = channelName;
        this.broadcastName = broadcastName;
        this.frequency = frequency;
    }

    public Channel(ChannelType channelType, int channelID, String channelName, String broadcastName) {
        this.channelType = channelType;
        this.channelID = channelID;
        this.channelName = channelName;
        this.broadcastName = broadcastName;
    }

}
