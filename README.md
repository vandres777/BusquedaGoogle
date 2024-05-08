# Proyecto #2 Screenplay Web - SerenityBDD 🚀

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Realiza 2 acciones: abre la página https://www.google.com.co/ y busca la palabra wikipedia, al cerrarse el navegador, se abre de nuevo el navegador abre la página https://www.google.com.co/ y busca la palabra GitHub 


## Pre requisitos para ejecutar 📋
- Java version 1.8 o superior y JDK (variables de entorno configuradas).
- Entorno de desarrollo: Eclipse IDE o IntelliJ IDEA
- Maven version 3.9.6 o superior (variables de entorno configuradas).

## Ejecutar pruebas 🔨

Limpiar el proyecto y luego compilar el código fuente. Esto es útil para asegurarte de que el código se compile correctamente antes de pasar a fases posteriores del ciclo de vida del proyecto, como las pruebas o el empaquetado.

	mvn clean compile
 
La herramienta de compilación de código y administrador de dependencias para este proyecto es **Maven**, así que para ejecutar las pruebas use el siguiente comando en la raíz del proyecto.

	mvn clean verify 

Genera el informe Serenity BDD, no ejecuta las pruebas en navegador

	mvn serenity:aggregate 

## Ver los informes 🔍
El comando proporcionado anteriormente para la ejecución de las pruebas, generará un informe de prueba de Serenity **index.html** en el directorio target\site\serenity\index.html

## Navegador Web 🌐
- En la clase se tiene la anotacion @Managed(driver = "chrome") indica que las pruebas se ejecutarán utilizando el navegador Google Chrome, sin embargo, se puede modificar para que se ejecute la prueba en otros navegadores: Firefox ("firefox"), Edge ("edge"), Safari ("safari"), entre otros..
- El proyecto no hace uso de drivers .exe para abrir un navegador. 

## Archivos de configuración entorno de ejecución de las pruebas 🗒️

| Archivo              | ¿Utiliza? |
| ---------------------|-------------- |
| serenity.conf        | NO            |
| serenity.properties  | NO            |

## Construido con 🛠
La automatización fue desarrollada con:
- BDD - Estrategia de desarrollo
- POM - Patrón de diseño (Page Object Model)
- Maven - Administrador de dependencias
- Serenity BDD - Librería de código abierto para escribir pruebas de aceptación automatizadas

## Versionamiento 📌
Se usó Git para el control de versiones. 🔀


## Autor 👨

***Víctor Andrés León Ballén*** - [vandres777@gmail.com]()
