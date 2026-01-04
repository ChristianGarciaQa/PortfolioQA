# 🧪 Portfolio QA Automation (Selenium + Cucumber + Java)

Este repositorio es mi portafolio personal de automatización E2E usando **Selenium WebDriver + Cucumber (BDD) + Java + Maven**.

La idea principal es trabajar como en un proyecto real:
- **Estructura modular por sitios/módulos** (DemoQA, SauceDemo, DemoBlaze…)
- **Ejecución por tags** (`@smoke`, `@regression`, `@demoqa`, etc.)
- **Page Object Model (POM)** para mantener el código limpio y escalable
- **DriverFactory + Hooks** para crear/cerrar el navegador de forma ordenada por escenario

---

## 🎯 Objetivo del repositorio

- Practicar automatización de UI con buenas prácticas (POM, waits, reutilización)
- Tener un proyecto “portfolio-ready”, fácil de ejecutar y extender
- Simular estructura real de trabajo: múltiples módulos + ejecución por tags

---

## 🧰 Tecnologías usadas

- **Java 21**
- **Maven**
- **Selenium WebDriver (Selenium 4 / Selenium Manager)**
- **Cucumber JVM**
- **JUnit 5**
- **Reportes: Cucumber HTML / plugins**

---

## 🗂️ Estructura del proyecto (por módulos + tags)

> Un solo repositorio, múltiples “sitios” o “módulos”.

```text
src
└── test
    ├── java
    │   └── com.empresa.automation
    │       ├── core
    │       │   └── DriverFactory.java
    │       ├── hooks
    │       │   └── Hooks.java
    │       ├── sites
    │       │   ├── demoqa
    │       │   │   ├── pages
    │       │   │   └── steps
    │       │   ├── saucedemo
    │       │   │   ├── pages
    │       │   │   └── steps
    │       │   └── demoblaze
    │       │       ├── pages
    │       │       └── steps
    │       └── runner
    │           └── TestRunner.java
    └── resources
        └── features
            ├── demoqa
            ├── saucedemo
            └── demoblaze
```
---

## ▶️ Cómo ejecutar

```bash
# 1) Clonar el repo
git clone https://github.com/ChristianGarciaQa/PortfolioQA.git
cd PortfolioQA

# 2) Ejecutar todos los tests
mvn test

# 3) Ejecución por tags (lo más importante)

# Ejecutar solo smoke:
mvn test -Dcucumber.filter.tags="@smoke"

# Ejecutar solo DemoQA:
mvn test -Dcucumber.filter.tags="@demoqa"

# Ejecutar Smoke de DemoQA:
mvn test -Dcucumber.filter.tags="@demoqa and @smoke"

# Excluir tests en progreso:
mvn test -Dcucumber.filter.tags="not @wip"

```

---

## 🏷️ Convención sugerida de tags

- @smoke → lo mínimo para validar que “la app vive”
- @regression → batería completa
- @wip → en construcción
- @demoqa, @saucedemo, @demoblaze → por sitio/módulo
- @login, @forms, @cart → por feature funcional

---

## ✅ Buenas prácticas aplicadas

- Page Object Model (POM): pages encapsulan localizadores + acciones
- Waits explícitos: evitamos implicit waits para reducir flakiness
- DriverFactory + Hooks: navegador controlado por escenario (orden y limpieza)
- Estructura modular: el repo crece sin convertirse en un monolito
- Tags: ejecución selectiva como en proyectos reales (CI / smoke / regression)

---

## 📌 Estado actual

📦 En desarrollo.
Se irá incorporando cobertura por módulos de forma incremental, manteniendo el enfoque de:
- features claras
- steps limpios
- pages reutilizables

---

## 🗺️ Roadmap (próximas mejoras)

- BasePage con acciones comunes (click, type, waits, scroll)
- Reporte HTML automático
- Parámetros por línea de comando (browser, headless)
- Ejecución paralela (cuando el proyecto esté estable)
- CI con GitHub Actions

---

## 🤝 Sugerencias / Feedback

Este repo es personal, pero cualquier idea o sugerencia suma.
Puedes abrir un issue o hacer fork.
