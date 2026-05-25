import java.util.*;

public class Alarm {
    private int hour;
    private int minute;
    private String label;
    private boolean active;
    private Set<Integer> repeatDays; // 1-7 (Mon-Sun)
    private String sound;
    private int volume;

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
}