package Lamp;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton(); // Light is ON

        remote.setCommand(lightOff);
        remote.pressButton(); // Light is OFF
    }
}
