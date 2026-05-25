package core;

public class Main {

    public static void main(String[] args) {

        AlarmManager manager = new AlarmManager();

        // ======================
        // CREACIÓN
        // ======================

        Alarm a1 = new Alarm(7, 30, "Trabajo");
        Alarm a2 = new Alarm(7, 33, "Trabajo urgente");
        Alarm a3 = new Alarm(9, 0, "Gym");

        a1.addRepeatDay(1);
        a1.addRepeatDay(2);

        a2.setCircadianMode(true);

        manager.addAlarm(a1);
        manager.addAlarm(a2);
        manager.addAlarm(a3);

        // ======================
        // MOSTRAR
        // ======================

        System.out.println("\n=== ALARMAS ===");
        manager.showAlarms();

        // ======================
        // ACTIVAS
        // ======================

        System.out.println("\n=== ACTIVAS ===");
        System.out.println(manager.getActiveAlarms().size());

        // ======================
        // CIRCADIANO
        // ======================

        System.out.println("\n=== CIRCADIAN ===");
        a2.simulateWakeUp();

        // ======================
        // SNOOZE
        // ======================

        System.out.println("\n=== SNOOZE ===");
        a1.snooze();
        System.out.println("Snoozed: " + a1.isSnoozed());

        // ======================
        // VACACIONES
        // ======================

        System.out.println("\n=== VACACIONES ===");
        manager.setVacationMode(true);
        System.out.println("Activas: " + manager.getActiveAlarms().size());

        manager.setVacationMode(false);

        // ======================
        // CONFLICTOS (IMPORTANTE)
        // ======================

        System.out.println("\n=== CONFLICTOS ===");
        manager.detectConflicts();

        System.out.println("\n=== FIN SIMULACIÓN ===");
    }
}