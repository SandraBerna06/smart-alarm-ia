import java.util.*;

public class Alarm {
    private int hour;
    private int minute;
    private String label;
    private boolean active;
    private Set<Integer> repeatDays; // 1-7 (Mon-Sun)
    private String sound;
    private int volume;
    private boolean snoozed = false;
    private boolean circadianMode = false;

    public Alarm(int hour, int minute, String label) {
        this.hour = hour;
        this.minute = minute;
        this.label = label;
        this.active = true;
        this.repeatDays = new HashSet<>();
        this.sound = "default";
        this.volume = 5;
    }

    public void addRepeatDay(int day) {
        repeatDays.add(day);
    }

    public void removeRepeatDay(int day) {
        repeatDays.remove(day);
    }

    public void deactivate() {
        active = false;
    }

    public void activate() {
        active = true;
    }

    public boolean isActive() {
        return active;
    }

    public String getLabel() {
        return label;
    }

    public String toString() {
        return "Alarm: " + label + " " + hour + ":" + minute + " Active:" + active;
    }
    public void snooze() {
    snoozed = true;
}

public void stopSnooze() {
    snoozed = false;
}


public void setCircadianMode(boolean enabled) {
    circadianMode = enabled;
}

public boolean isCircadianMode() {
    return circadianMode;
}

public void simulateWakeUp() {
    if (!circadianMode) {
        System.out.println("Alarm ringing at full volume: " + label);
        return;
    }

    for (int volume = 1; volume <= 10; volume++) {
        System.out.println("Waking up... volume: " + volume + " -> " + label);
        try {
            Thread.sleep(300); // simulación progresiva
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    System.out.println("Fully awake alarm ended: " + label);
}
}