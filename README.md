# 🧪 Portfolio QA Automation - DemoQA

Este proyecto contiene pruebas automatizadas usando **Selenium WebDriver + Cucumber + JUnit**, desarrolladas en Java como parte de mi portfolio personal de automatización.

Se centra en el sitio [demoqa.com](https://demoqa.com/), ideal para practicar automatización funcional.

---

## 🚀 Tecnologías utilizadas

- 🟢 Java 21  
- 🧪 JUnit 5  
- 🥒 Cucumber JVM  
- 🧭 Selenium WebDriver  
- ⚙️ WebDriverManager  
- 📦 Maven  

---

## 🧰 Estructura del proyecto

```
src
├── main
│   └── java
│       ├── pages.demoqa          # PageObjects
│       └── utils                 # Clases utilitarias (DriverFactory, JS, etc.)
├── test
│   ├── java
│   │   ├── steps.demoqa          # Step Definitions
│   │   └── runner.demoqa         # Runner de Cucumber
│   └── resources
│       └── features              # Archivos .feature (escenarios Gherkin)
```

---

## ▶️ Cómo ejecutar

### 1. Clona el proyecto

```bash
git clone https://github.com/ChristianGarciaQa/PortfolioQA.git
```

### 2. Ve a la carpeta del proyecto

```bash
cd PortfolioQA
```

### 3. Ejecuta los tests con Maven

```bash
mvn test
```

---

## ✅ Estado de desarrollo

📦 Proyecto en curso – Estructura base configurada. Próximamente se agregarán escenarios y funcionalidades automatizadas.

---

## 📌 Funcionalidades cubiertas actualmente

⚠️ Aún no se han automatizado funcionalidades. Esta sección se irá actualizando a medida que se avanza en el desarrollo.

---

## 🧪 Estructura de un test

⚠️ No hay escenarios implementados por ahora. Esta sección se actualizará con ejemplos reales en Gherkin a medida que se desarrollen los `.feature`.

---

## 📎 Buenas prácticas aplicadas

- Uso del patrón **Page Object Model (POM)** para separar lógica de interacción  
- Estructura clara por capas (`pages`, `steps`, `features`)  
- Automatización modular y reutilizable  
- Separación entre lógica de ejecución (`Runner`) y lógica funcional (`Steps`)  
- Drivers gestionados con **WebDriverManager** (sin descarga manual)  

---

## ❓ Preguntas frecuentes

### ¿Se puede correr en otros navegadores?

Sí. Por defecto corre en Chrome, pero puedes adaptar el `DriverFactory` para aceptar parámetros por línea de comandos, por ejemplo:

```bash
mvn test -Dbrowser=firefox
```

---

## 📈 Próximas mejoras

- Primeros escenarios automatizados  
- Reporte HTML con Cucumber Reporting  
- Integración continua con GitHub Actions  
- Soporte para ejecución paralela  
- Inclusión de casos negativos y pruebas de borde  

---

## 🤝 Contribuciones

Proyecto personal, pero las ideas o sugerencias siempre son bienvenidas. Puedes abrir un *issue* o hacer un *fork* del repo.
