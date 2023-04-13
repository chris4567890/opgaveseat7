public class Tv {

    private boolean state;
    private int volume,channel;

    public Tv(){
        boolean state = false;
        this.volume = volume;
        this.channel = channel;
    }

    public boolean getState(){
        return state;
    }

    public void setState(boolean state){
        this.state = state;
    }

    public int getVolume(){
        return getVolume();
    }

    public int getChannel(){
        return getChannel();
    }

    public void tvOn(){
        state = true;
    }

    public void setChannel(int channelNr){
        if(state == true){
            this.channel = channelNr;
        }
    }

    public void setVolume(int volumeNr){
        if(state == true){
            this.volume = volumeNr;
        }
    }

    public void volumeUp(){
        ++volume;
    }

    public void channelUp(){
        if (state == true){
            ++channel;
        }
        else{
            channel = channel;
        }
    }

    public void channelDown(){
        if(state == true){
            --channel;
        }

    }

}
