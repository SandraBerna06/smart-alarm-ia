package core;

import java.util.*;

public class AlarmManager {

    private List<Alarm> alarms = new ArrayList<>();
    private boolean vacationMode = false;

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(String label) {
        alarms.removeIf(a -> a.getLabel().equals(label));
    }

    public void showAlarms() {
        for (Alarm a : alarms) {
            System.out.println(a);
        }
    }

    public List<Alarm> getActiveAlarms() {

        if (vacationMode) {
            return new ArrayList<>();
        }

        List<Alarm> active = new ArrayList<>();

        for (Alarm a : alarms) {
            if (a.isActive()) {
                active.add(a);
            }
        }

        return active;
    }

    public void setVacationMode(boolean value) {
        vacationMode = value;
    }

    public boolean isVacationMode() {
        return vacationMode;
    }

    // =========================
    // 🔥 MEJORADO: CONFLICTOS REALES
    // =========================

    public void detectConflicts() {

        System.out.println("Analizando conflictos de alarmas...");

        for (int i = 0; i < alarms.size(); i++) {
            for (int j = i + 1; j < alarms.size(); j++) {

                Alarm a = alarms.get(i);
                Alarm b = alarms.get(j);

                int timeA = a.getHour() * 60 + a.getMinute();
                int timeB = b.getHour() * 60 + b.getMinute();

                int diff = Math.abs(timeA - timeB);

                if (diff <= 5) {
                    System.out.println("⚠ CONFLICTO HORARIO: " +
                            a.getLabel() + " y " + b.getLabel() +
                            " están muy cerca (" + diff + " min)");
                }

                if (a.getLabel().equals(b.getLabel())) {
                    System.out.println("⚠ CONFLICTO ETIQUETA DUPLICADA: " + a.getLabel());
                }
            }
        }
    }
}