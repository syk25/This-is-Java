package ch08.sec06;

public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Tv의 전원을 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv의 전원을 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume  = MAX_VOLUME;
        } else if(volume < MIN_VOLUME){
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 Tv의 볼륨: " + volume);
    }

}
