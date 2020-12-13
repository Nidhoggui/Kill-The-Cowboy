



public class Cowboy {
    private boolean full_glass = false;
    private int cups = 0;
    private boolean wake_up = true;
    private boolean alive = true;

    public Cowboy() {
    }
    
    public boolean isFull_glass() {
        return full_glass;
    }

    public void setFull_glass(boolean full_glass) {
        this.full_glass = full_glass;
    }

    public int getCups() {
        return cups;
    }

    public void setCups(int cups) {
        this.cups = cups;
    }

    public boolean isWake_up() {
        return wake_up;
    }

    public void setWake_up(boolean wake_up) {
        this.wake_up = wake_up;
    } 
}
