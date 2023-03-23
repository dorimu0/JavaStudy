package test;

public class Television {
    int channel;
    int volume;
    boolean isOn;

    // +
    void inputData(int inputChannel, int inputVolume, boolean inputIsOn) {
        channel = inputChannel;
        volume = inputVolume;
        isOn = inputIsOn;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
    }
}
