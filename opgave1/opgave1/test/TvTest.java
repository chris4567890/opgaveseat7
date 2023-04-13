import static org.junit.jupiter.api.Assertions.*;

class TvTest {
    Tv tv = new Tv();
    @org.junit.jupiter.api.Test
    void getState() {
    }

    @org.junit.jupiter.api.Test
    void setState() {
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
    }

    @org.junit.jupiter.api.Test
    void getChannel() {
    }

    @org.junit.jupiter.api.Test
    void tvOn() {
        tv.tvOn();
        assertTrue(tv.getState());
    }

    @org.junit.jupiter.api.Test
    void setChannel() {
        tv.setChannel(30);
        assertEquals(30,tv.getChannel());
    }

    @org.junit.jupiter.api.Test
    void setVolume(){
        tv.setVolume(3);
    }

    @org.junit.jupiter.api.Test
    void volumeUp(){
        tv.volumeUp();
        assertEquals(tv.getVolume(),tv.getVolume());
    }
    @org.junit.jupiter.api.Test
    void channelUp() {
        assertEquals(tv.getChannel(),tv.getChannel());
    }

    @org.junit.jupiter.api.Test
    void channelDown() {
        assertEquals(tv.getChannel(),tv.getChannel());
    }
}