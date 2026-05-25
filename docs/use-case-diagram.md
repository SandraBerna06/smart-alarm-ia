# 8. Diagrama de casos de uso UML

---

## 🧠 Descripción general

El diagrama de casos de uso representa las funcionalidades principales del sistema de despertador inteligente desde el punto de vista del usuario.

Su objetivo es mostrar de forma clara e intuitiva cómo interactúa el usuario con el sistema, sin entrar en detalles de implementación.

---

## 👤 Actor del sistema

### Usuario
Es el único actor del sistema.

Representa a la persona que utiliza la aplicación de despertador inteligente para gestionar alarmas y funcionalidades avanzadas.

---

## 🧩 Casos de uso identificados

El sistema incluye los siguientes casos de uso:

- Crear alarma
- Eliminar alarma
- Activar alarma
- Desactivar alarma
- Consultar alarmas activas
- Snooze (posponer alarma)
- Modo vacaciones
- Modo circadiano

---

## 🔗 Relaciones entre casos de uso

### <<include>>
- El caso de uso **Modo vacaciones** afecta directamente a la funcionalidad de consulta de alarmas activas.
- Cuando está activado, el sistema puede bloquear o anular la consulta de alarmas activas.

### <<extend>>
- El caso de uso **Snooze** extiende el comportamiento de activación de una alarma.
- Solo se ejecuta si el usuario decide posponer la alarma en ese momento.

---

## 📊 Diagrama de casos de uso (Mermaid)

Debido a las limitaciones de compatibilidad de Mermaid en GitHub, el diagrama se ha implementado utilizando `flowchart`, manteniendo la semántica de un diagrama de casos de uso UML.

```mermaid
flowchart TD

Usuario((Usuario))

Usuario --> Crear[(Crear alarma)]
Usuario --> Eliminar[(Eliminar alarma)]
Usuario --> Activar[(Activar alarma)]
Usuario --> Desactivar[(Desactivar alarma)]
Usuario --> Consultar[(Consultar alarmas activas)]
Usuario --> Snooze[(Snooze alarma)]
Usuario --> Vacaciones[(Modo vacaciones)]
Usuario --> Circadiano[(Modo circadiano)]

Vacaciones -.-> Consultar
Snooze -.-> Activar