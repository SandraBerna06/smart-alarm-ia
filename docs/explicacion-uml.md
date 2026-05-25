# 7. Diagrama de clases UML (diseño orientado a objetos)

## 7.1 Diseño orientado a objetos

El sistema de despertador inteligente se ha diseñado siguiendo el paradigma de programación orientada a objetos (POO), con el objetivo de separar responsabilidades, mejorar la mantenibilidad y facilitar la escalabilidad del sistema.

---

## 🧠 Clases del sistema

### 🟦 Clase Alarm

La clase `Alarm` representa una alarma individual dentro del sistema.

### Responsabilidades:
- Almacenar los datos de una alarma (hora, minuto, etiqueta)
- Gestionar su estado (activa/inactiva)
- Aplicar funcionalidades específicas como snooze o modo circadiano

### Justificación:
Se crea esta clase porque cada alarma debe comportarse como una entidad independiente con su propio estado.

### Encapsulación:
Todos los atributos son privados para proteger los datos internos y solo se modifican mediante métodos públicos.

---

### 🟦 Clase AlarmManager

La clase `AlarmManager` actúa como controlador del sistema.

### Responsabilidades:
- Gestionar múltiples alarmas
- Crear y eliminar alarmas
- Filtrar alarmas activas
- Gestionar el modo vacaciones

### Justificación:
Centraliza la lógica global del sistema evitando que cada alarma gestione otras alarmas.

---

## 🔗 Relaciones entre clases

- `AlarmManager` contiene múltiples objetos `Alarm`
- Relación de composición (1 a muchos)
- El ciclo de vida de las alarmas depende del gestor

---

## 🧩 Diagrama de clases UML (Mermaid)

```mermaid
classDiagram

class Alarm {
    - int hour
    - int minute
    - String label
    - boolean active
    - Set~Integer~ repeatDays
    - String sound
    - int volume
    - boolean circadianMode

    + Alarm(int hour, int minute, String label)
    + void activate()
    + void deactivate()
    + void snooze()
    + void setCircadianMode(boolean enabled)
    + void simulateWakeUp()
}

class AlarmManager {
    - List~Alarm~ alarms
    - boolean vacationMode

    + void addAlarm(Alarm alarm)
    + void removeAlarm(String label)
    + List~Alarm~ getActiveAlarms()
    + void setVacationMode(boolean status)
}

AlarmManager "1" --> "*" Alarm