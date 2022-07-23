package SmartHouse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int countChanel = 10;
    private int maxVolume = 100;

    public void quiet() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void louder() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void prev() {
        if (currentChanel == 0) {
            currentChanel = countChanel - 1;
        } else {
            currentChanel = currentChanel - 1;
        }
    }

    public void next() {
        if (currentChanel == countChanel - 1) {
            currentChanel = 0;
        } else {
            currentChanel = currentChanel + 1;
        }
    }

    public void setCurrentChanel(int newCurrentChanel) {
        if (newCurrentChanel < 0) {
            return;
        }
        if (newCurrentChanel > countChanel - 1) {
            return;
        }
        currentChanel = newCurrentChanel;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        } else
            currentVolume = newCurrentVolume;
    }

}

