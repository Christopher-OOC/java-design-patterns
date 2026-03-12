package org.example.behavioural.command;

public class App {

    static void main() {
        Switcher switcher = new Switcher();

        Light light = new Light();

        TurnOffCommand turnOffCommand = new TurnOffCommand(light);
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);

        switcher.addCommand(turnOffCommand);
        switcher.addCommand(turnOnCommand);

        switcher.executeCommands();
    }

}
