import core.*;

public class TestAlarmSystem {

    public static void main(String[] args) {

        AlarmManager manager = new AlarmManager();

        System.out.println("=== TEST SISTEMA ===");

        Alarm a1 = new Alarm(7, 30, "Trabajo");
        Alarm a2 = new Alarm(7, 33, "Trabajo urgente");

        manager.addAlarm(a1);
        manager.addAlarm(a2);

        // TEST 1
        System.out.println("\nTEST 1: creación");
        System.out.println("Alarmas: " + manager.getActiveAlarms().size());

        // TEST 2
        System.out.println("\nTEST 2: vacaciones");
        manager.setVacationMode(true);
        System.out.println("Activas (vacaciones): " + manager.getActiveAlarms().size());

        manager.setVacationMode(false);

        // TEST 3
        System.out.println("\nTEST 3: conflictos");
        manager.detectConflicts();

        // TEST 4
        System.out.println("\nTEST 4: snooze");
        a1.snooze();
        System.out.println("Snooze activo: " + a1.isSnoozed());

        System.out.println("\n=== TEST FINALIZADO ===");
    }
}