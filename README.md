# Smart Alarm System

## 📌 Descripción del proyecto

Smart Alarm System es una aplicación desarrollada en Java que implementa la lógica interna de un despertador inteligente inspirado en las aplicaciones modernas de smartphones.

El proyecto se centra exclusivamente en la lógica de negocio y el diseño orientado a objetos, sin utilizar interfaces gráficas, bases de datos ni tecnologías web.

El sistema permite gestionar múltiples alarmas, configurar repeticiones semanales, activar funcionalidades avanzadas como modo circadiano, modo vacaciones y detección de conflictos entre alarmas.

---

# 🎯 Objetivos del proyecto

Los principales objetivos del proyecto son:

- Aplicar programación orientada a objetos en Java
- Diseñar una arquitectura modular y desacoplada
- Implementar funcionalidades de un despertador inteligente
- Utilizar Git y GitHub de forma profesional
- Elaborar documentación técnica utilizando Markdown
- Diseñar diagramas UML mediante Mermaid
- Utilizar inteligencia artificial como apoyo al desarrollo
- Aplicar buenas prácticas de programación

---

# ⚙️ Tecnologías utilizadas

| Tecnología | Uso |
|------------|-----|
| Java | Desarrollo de la lógica del sistema |
| Git | Control de versiones |
| GitHub | Gestión del repositorio |
| Markdown | Documentación técnica |
| Mermaid | Diagramas UML |
| Visual Studio Code | Entorno de desarrollo |
| Bash | Terminal de trabajo |

---

# 🧠 Funcionalidades implementadas

## Funcionalidades básicas

- Crear alarmas
- Eliminar alarmas
- Activar/desactivar alarmas
- Configurar hora y minuto
- Configurar etiquetas
- Gestionar múltiples alarmas
- Repetición semanal
- Configuración de volumen
- Posponer alarmas (Snooze)
- Consultar alarmas activas

---

## 🚀 Funcionalidades avanzadas

### 🌅 Modo circadiano
Permite simular un despertar progresivo aumentando gradualmente el volumen de la alarma.

### 🏖️ Modo vacaciones
Desactiva temporalmente todas las alarmas activas del sistema.

### ⚠️ Detección de conflictos
Detecta alarmas configuradas con horarios demasiado cercanos o etiquetas duplicadas.

### ⏰ Snooze avanzado
Permite posponer temporalmente una alarma manteniendo su estado interno.

---

# 📁 Estructura del proyecto

```text
/docs
│
├── ai-usage.md
├── diagram-mermaid.md
├── diagram-casosdeuso.md
├── dibujo-diagrama-casosdeuso.png
├── explicacion-uml.md
├── imagen-diagram-mermaid.png
├── oop-design.md
├── self-evaluation.md
├── use-case-diagram.md
├── use-cases.md
│
/src/core
│
├── Alarm.java
├── AlarmManager.java
├── Main.java
│
/tests
│
├── TestAlarmSystem.java
│
README.md
.gitignore