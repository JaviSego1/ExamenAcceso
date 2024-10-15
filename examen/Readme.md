# Examen Acceso a Datos

Nombre | Apellidos | Fecha | Modulo | Modulo
---------|----------|---------|---------|---------
 Javier | Segovia Martinez | 15-10-2024 | Acceso a datos | Tema 1

## Proyecto
Para este proyecto que debemos hacer, deberemos hacer un proyecto maven, sin archetype, donde iremos agregando dependencias al pom.xml, agregando un proyecto java, donde sera tipo maven, sin archetype como he comentado, donde deberemos darle:
-   Paquete: "com.iesvdc.acceso"
-   Artefacto: "examen"
-   Clase principal: "App.java"

## Dependencias a agregar
Deberemos agregar las dependencias de javax activation la cual es esta

```xml
<dependency>
            <groupId>javax.activation</groupId>
            <artifactId>activation</artifactId>
            <version>1.1.1</version>
        </dependency>
```

La dependencia de jaxb2 codehaus

```xml
<dependency>
            <groupId>org.codehaus.mojo</groupId>
            <artifactId>jaxb2-maven-plugin</artifactId>
            <version>3.2.0</version>
            <type>maven-plugin</type>
        </dependency>
```

La dependencia de eclipse moxy

```xml
<dependency>
            <groupId>org.eclipse.persistence</groupId>
            <artifactId>org.eclipse.persistence.moxy</artifactId>
            <version>2.7.7</version>
        </dependency>
```

Y la dependencia de jakarta json

```xml
<dependency>
            <groupId>jakarta.json</groupId>
            <artifactId>jakarta.json-tck</artifactId>
            <version>2.1.1</version>
            <type>pom</type>
        </dependency>
```
        
