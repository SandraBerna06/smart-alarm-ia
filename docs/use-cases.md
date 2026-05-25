# 9. Especificación completa de casos de uso

---

## 🟦 UC-01: Crear alarma

| Campo | Descripción |
|------|-------------|
| Nombre | Crear alarma |
| Objetivo | Permitir al usuario crear una alarma con hora, minuto y etiqueta |
| Actor principal | Usuario |
| Precondiciones | El sistema debe estar iniciado |
| Flujo principal | 1. Usuario introduce hora<br>2. Usuario introduce minuto<br>3. Usuario introduce etiqueta<br>4. Sistema crea la alarma<br>5. Se almacena en el sistema |
| Flujos alternativos | Hora o minuto inválido → se rechaza la creación |
| Postcondiciones | La alarma queda registrada |
| Reglas de negocio | Hora 0–23, minuto 0–59, etiqueta obligatoria |

---

## 🟦 UC-02: Activar / desactivar alarma

| Campo | Descripción |
|------|-------------|
| Nombre | Activar / desactivar alarma |
| Objetivo | Cambiar el estado de una alarma |
| Actor principal | Usuario |
| Precondiciones | La alarma existe |
| Flujo principal | 1. Usuario selecciona alarma<br>2. Cambia estado<br>3. Sistema actualiza estado |
| Flujos alternativos | Alarma no encontrada → error |
| Postcondiciones | Estado actualizado |
| Reglas de negocio | Solo alarmas existentes pueden modificarse |

---

## 🟦 UC-03: Snooze

| Campo | Descripción |
|------|-------------|
| Nombre | Snooze |
| Objetivo | Posponer temporalmente una alarma |
| Actor principal | Usuario |
| Precondiciones | Alarma activa |
| Flujo principal | 1. Alarma suena<br>2. Usuario activa snooze<br>3. Sistema pospone la alarma |
| Flujos alternativos | Usuario no interactúa → la alarma sigue sonando |
| Postcondiciones | Alarma reprogramada temporalmente |
| Reglas de negocio | Snooze limitado por configuración del sistema |

---

## 🟦 UC-04: Modo vacaciones

| Campo | Descripción |
|------|-------------|
| Nombre | Modo vacaciones |
| Objetivo | Desactivar temporalmente todas las alarmas |
| Actor principal | Usuario |
| Precondiciones | Existen alarmas creadas |
| Flujo principal | 1. Usuario activa modo vacaciones<br>2. Sistema bloquea alarmas<br>3. No suena ninguna alarma |
| Flujos alternativos | Usuario desactiva modo → alarmas vuelven a funcionar |
| Postcondiciones | Sistema sin alarmas activas |
| Reglas de negocio | Si vacationMode = true no se devuelven alarmas activas |

---

## 🟦 UC-05: Modo circadiano

| Campo | Descripción |
|------|-------------|
| Nombre | Despertar circadiano |
| Objetivo | Simular un despertar progresivo |
| Actor principal | Usuario |
| Precondiciones | Alarma activa |
| Flujo principal | 1. Alarma se activa<br>2. Volumen aumenta progresivamente<br>3. Usuario se despierta gradualmente |
| Flujos alternativos | Usuario detiene proceso antes de finalizar |
| Postcondiciones | Alarma finalizada |
| Reglas de negocio | Incremento progresivo de volumen simulado |

---

## 🟦 UC-06: Consultar alarmas activas

| Campo | Descripción |
|------|-------------|
| Nombre | Consultar alarmas activas |
| Objetivo | Mostrar alarmas activas del sistema |
| Actor principal | Usuario |
| Precondiciones | Existen alarmas creadas |
| Flujo principal | 1. Usuario solicita listado<br>2. Sistema filtra alarmas activas<br>3. Muestra resultados |
| Flujos alternativos | Modo vacaciones activo → lista vacía |
| Postcondiciones | Información mostrada |
| Reglas de negocio | Solo alarmas activas y no bloqueadas por vacationMode |