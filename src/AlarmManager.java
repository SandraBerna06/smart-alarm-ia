import java.util.*;

public class AlarmManager {
    private List<Alarm> alarms = new ArrayList<>();

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(String label) {
        alarms.removeIf(a -> a.getLabel().equals(label));
    }

    public List<Alarm> getActiveAlarms() {
        List<Alarm> active = new ArrayList<>();
        for (Alarm a : alarms) {
            if (a.isActive()) active.add(a);
        }
        return active;
    }

    public void showAlarms() {
        for (Alarm a : alarms) {
            System.out.println(a);
        }
    }
}