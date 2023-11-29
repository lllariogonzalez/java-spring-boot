# Spring Boot

## Definición

Spring Boot es un framework de desarrollo de aplicaciones Java que simplifica la creación de aplicaciones robustas y de alto rendimiento. Proporciona un conjunto de herramientas y convenciones que facilitan el desarrollo, eliminando gran parte de la configuración tediosa y permitiendo a los desarrolladores centrarse en la lógica de negocio.

## Conceptos Clave

1. **Inyección de Dependencias**: Patrón central en Spring Boot que permite la gestión de dependencias entre componentes de una aplicación, mejorando la modularidad y flexibilidad.

2. **Autoconfiguración**: Capacidad de Spring Boot para configurarse automáticamente basándose en las dependencias presentes en el proyecto, reduciendo la necesidad de configuraciones manuales.

3. **Convenio sobre Configuración**: Enfocado en reducir la configuración explícita, utiliza convenciones predefinidas para agilizar el desarrollo.

4. **Starters**: Conjuntos de dependencias preconfiguradas que simplifican la inclusión de funcionalidades específicas, como bases de datos, seguridad, entre otros.

### Características Principales

1. **Embebido en Contenedor**: Permite empaquetar la aplicación con un servidor de aplicaciones embebido como Tomcat, Jetty o Undertow.

2. **Facilidad de Inicio**: Proporciona Spring Initializr, una herramienta web para generar rápidamente proyectos Spring Boot con las dependencias y configuraciones deseadas.

3. **Actuadores para Monitoreo**: Ofrece endpoints para supervisar y gestionar la aplicación en tiempo de ejecución, proporcionando información valiosa para la monitorización.

4. **Facilidad de Testeo**: Soporta pruebas unitarias, de integración y de extremo a extremo, integrando herramientas como JUnit, Mockito, etc.

5. **Seguridad**: Integra soluciones de seguridad como Spring Security para autenticación y autorización.

## Cómo Iniciar una Aplicación

1. **Usando Spring Initializr**
    - Visita [Spring Initializr](https://start.spring.io/).
    - Selecciona las dependencias y configuraciones requeridas para tu proyecto.
    - Descarga el proyecto generado como un archivo ZIP.
    - Descomprime el archivo y ábrelo en tu IDE (Entorno de Desarrollo Integrado) preferido.
    - Ejecuta la clase principal con el método `main` anotado con `@SpringBootApplication`.

2. **Usando la Línea de Comandos**
    - Utiliza herramientas como Maven o Gradle para crear un nuevo proyecto Spring Boot.
    - Agrega las dependencias necesarias en el archivo de configuración (pom.xml para Maven, build.gradle para Gradle).
    - Ejecuta la aplicación desde la línea de comandos utilizando los comandos proporcionados por Maven o Gradle.
