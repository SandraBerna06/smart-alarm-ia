# 6. Diseño orientado a objetos

## Clases del sistema

El sistema se ha diseñado utilizando un enfoque orientado a objetos con dos clases principales:

---

## 🟦 Clase Alarm

### Responsabilidad
Representa una alarma individual del sistema.

### Atributos
- hour: hora de la alarma
- minute: minuto de la alarma
- label: nombre de la alarma
- active: estado de la alarma
- repeatDays: días de repetición
- sound: sonido asociado
- volume: volumen
- circadianMode: modo de despertar progresivo

### Responsabilidad principal
Gestionar el comportamiento de una única alarma.

### Encapsulación
Todos los atributos son privados para garantizar integridad de datos.

---

## 🟦 Clase AlarmManager

### Responsabilidad
Gestiona el conjunto de alarmas del sistema.

### Funciones principales
- Crear alarmas
- Eliminar alarmas
- Activar/desactivar alarmas
- Aplicar modo vacaciones
- Filtrar alarmas activas

### Responsabilidad principal
Control central del sistema de alarmas.

---

## 🔗 Relaciones entre clases

- AlarmManager → contiene múltiples Alarm
- Relación: composición (1 a muchos)
- Un AlarmManager controla el ciclo de vida de las Alarm

---

## 🧠 Justificación del diseño

Este diseño separa claramente:

- Datos individuales (Alarm)
- Lógica global (AlarmManager)

Esto mejora:

- Mantenibilidad
- Escalabilidad
- Separación de responsabilidades (SRP)