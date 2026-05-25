package core;

import java.util.*;

public class Alarm {

    private int hour;
    private int minute;
    private String label;
    private boolean active;

    private Set<Integer> repeatDays;
    private int volume;

    private boolean snoozed = false;
    private boolean circadianMode = false;

    public Alarm(int hour, int minute, String label) {
        this.hour = hour;
        this.minute = minute;
        this.label = label;
        this.active = true;
        this.repeatDays = new HashSet<>();
        this.volume = 5;
    }

    public void addRepeatDay(int day) {
        repeatDays.add(day);
    }

    public void removeRepeatDay(int day) {
        repeatDays.remove(day);
    }

    public Set<Integer> getRepeatDays() {
        return repeatDays;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
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

    public boolean isSnoozed() {
        return snoozed;
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
            System.out.println("Alarm: " + label + " volumen normal: " + volume);
            return;
        }

        for (int v = 1; v <= 10; v++) {
            System.out.println("Despertando... volumen: " + v + " -> " + label);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Despertar completado: " + label);
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "label='" + label + '\'' +
                ", time=" + hour + ":" + minute +
                ", active=" + active +
                '}';
    }
}