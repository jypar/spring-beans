package app.model;

public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
    public String getmessage(){
        return  "It is timer" ;
    }
}
