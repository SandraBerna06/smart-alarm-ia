public class Main {
    public static void main(String[] args) {

        AlarmManager manager = new AlarmManager();

        Alarm a1 = new Alarm(7, 30, "Trabajo");
        Alarm a2 = new Alarm(9, 0, "Gym");

        a1.addRepeatDay(1);
        a1.addRepeatDay(2);

        manager.addAlarm(a1);
        manager.addAlarm(a2);

        manager.showAlarms();

        a1.setCircadianMode(true);
        a1.simulateWakeUp();
    }
}