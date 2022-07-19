package SmartHouse;

public class Radio {
    private int currentChanel;
    private int currentVolume;

    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else if (newCurrentVolume > 10) {
            currentVolume = 10;
        } else
        currentVolume = newCurrentVolume;
    }

    public void louder() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void quiet() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentChanel(int newCurrentChanel) {
        if (newCurrentChanel < 0) {
            return;
        }
        if (newCurrentChanel > 9) {
            return;
        }
        currentChanel = newCurrentChanel;
    }

    public void prev(){
        if (currentChanel == 0){
            currentChanel = 9;
        } else {
            currentChanel = currentChanel - 1;
        }
    }

    public void next(){
        if (currentChanel == 9){
            currentChanel = 0;
        } else {
            currentChanel = currentChanel + 1;
        }
    }
}
