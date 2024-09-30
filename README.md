# Mi API Rest Cerradura Kleene

Este proyecto es una API Rest básica creada con **Spring Boot** utilizando **Java** y **Maven** como herramientas principales de desarrollo. 
La aplicación permite obtener la cerradura de Kleene y la cerradura positiva de Kleene de un alfabeto binario.
A continuación se detallan los requerimientos y pasos necesarios para ejecutar este proyecto localmente.

## Requerimientos

Para poder ejecutar este proyecto, necesitarás tener instalados los siguientes componentes:

### 1. **Java Development Kit (JDK) 17 o superior**
   - Puedes descargar e instalar el JDK desde el sitio oficial de [Oracle](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) o usar [OpenJDK](https://openjdk.java.net/install/).

   Verifica la instalación ejecutando el siguiente comando en la terminal:
   
   java -version

### 2. **Apache Maven**
  - Asegúrate de tener instalado Maven en tu máquina. Puedes descargarlo desde el sitio oficial de Maven o instalarlo con un gestor de paquetes como Homebrew (macOS) o APT (Ubuntu).
  Verifica la instalación de Maven ejecutando el siguiente comando en la terminal:
  
  mvn -version

### **3. IDE (Entorno de Desarrollo Integrado)**
  - Es recomendable usar un IDE que soporte Maven y Java, como:
      - IntelliJ IDEA
      - Eclipse
      - Visual Studio Code

### **Instalación y Ejecución del Proyecto**
- Sigue los siguientes pasos para clonar, instalar dependencias y ejecutar el proyecto:

1. Clonar el repositorio (opcional)
  Si estás trabajando con un repositorio remoto, puedes clonarlo con el siguiente comando:
  
  git clone https://github.com/LuisAl2589/practica1.git
  
2. Construir el proyecto con Maven
  Para compilar y construir el proyecto, usa el comando:

  mvn clean install

Esto descargará todas las dependencias necesarias y generará los artefactos del proyecto en la carpeta target/.

3. Ejecutar la aplicación
Para iniciar la aplicación, usa el siguiente comando:

mvn spring-boot:run

La aplicación se ejecutará en el puerto 8080 por defecto. Puedes verificar que está funcionando abriendo un navegador y navegando a:

http://localhost:8080/

### **Dependencias**
  Este proyecto utiliza las siguientes dependencias principales:
      - Spring Boot Starter Web: Para crear APIs REST.
      - Spring Boot Starter Test: Para realizar pruebas unitarias y de integración.
      - Lombok (opcional): Para reducir código repetitivo como getters y setters.

### **Estructura del Proyecto**
La estructura del proyecto sigue el estándar de Spring Boot:
mi-api-rest/
├── src/
│   ├── main/
│   │   ├── java/com/luis/practica1/
│   │   │   ├── HomeController.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md






