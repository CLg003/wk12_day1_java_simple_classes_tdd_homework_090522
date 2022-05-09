public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public int setVolume(int newVolume) {
        this.volume = newVolume;
        return this.volume;
    }

    public void drink() {
        this.setVolume(this.volume - 10);
    }

    public void empty() {
        this.setVolume(0);
    }

    public void fill() {
        this.setVolume(100);
    }
}
