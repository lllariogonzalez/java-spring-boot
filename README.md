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


### Anotaciones Principales:

1. `@SpringBootApplication`: Anotación principal para arrancar una aplicación Spring Boot. Combina `@Configuration`, `@EnableAutoConfiguration` y `@ComponentScan`.

2. `@RestController`: Utilizada para marcar clases que gestionan las peticiones HTTP y devuelven respuestas RESTful.

3. `@Autowired`: Se utiliza para la inyección de dependencias, permitiendo a Spring resolver e inyectar automáticamente las dependencias en los beans.

4. `@RequestMapping`: Mapea las peticiones HTTP a métodos específicos del controlador, permitiendo definir el URI y el método HTTP.

5. `@Service`: Utilizada para marcar clases de servicios. Los servicios contienen lógica de negocio y se utilizan para realizar operaciones específicas.

6. `@Repository`: Usada para marcar clases de repositorio. Los repositorios se utilizan para interactuar con la capa de persistencia, como bases de datos.

7. `@Component`: Anotación genérica para marcar una clase como un componente de Spring, permitiendo que Spring la gestione automáticamente.

8. `@Configuration`: Define una clase de configuración de Spring, especialmente útil para la configuración de beans.

9. `@EnableAutoConfiguration`: Habilita la autoconfiguración de Spring Boot, permitiendo que Spring configure automáticamente el contexto de la aplicación.

10. `@PathVariable`: Utilizada para mapear variables de la URL a parámetros del método de controlador.

11. `@RequestBody`: Se utiliza para vincular el cuerpo de la solicitud HTTP a un objeto Java en métodos de controlador.

12. `@ResponseBody`: Indica que el valor devuelto por un método debe ser serializado en la respuesta HTTP.

13. `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: Anotaciones de conveniencia para mapear métodos a operaciones HTTP GET, POST, PUT y DELETE respectivamente.

## Arquitectura Multicapa en Spring Boot

![Arquitectura multicapa](./images/Arquitectura%20Multicapa.png)

En Spring Boot, una arquitectura multicapa se utiliza comúnmente para construir aplicaciones robustas y escalables. Esta arquitectura sigue el patrón de separación en diferentes capas, como:

### 1. Capa de Presentación (Controladores - Controllers)

- Responsable de manejar las peticiones HTTP.
- Utiliza anotaciones como `@RestController` y `@RequestMapping`.
- Ejemplo: `UserController.java`.

### 2. Capa de Servicio (Servicios - Services)

- Contiene la lógica de negocio de la aplicación.
- Utiliza anotaciones como `@Service`.
- Ejemplo: `UserService.java`.

### 3. Capa de Repositorio (Persistencia - Repositories)

- Define la interacción con la capa de persistencia de datos.
- Utiliza anotaciones como `@Repository`.
- Ejemplo: `UserRepository.java`.

### 4. Capa de Dominio (Modelos - Domain)

- Define los modelos o entidades que representan la estructura de los datos.
- Pueden estar anotados con `@Entity` (en el contexto de JPA).
- Ejemplo: `User.java`.

### Estructura de Código Ejemplo:

```plaintext
src
├── main
│   └── java
│       └── com
│           └── ejemplo
│               ├── controllers
│               │   └── UserController.java
│               ├── services
│               │   └── UserService.java
│               ├── repositories
│               │   └── UserRepository.java
│               └── models
│                   └── User.java
└── resources
    ├── application.properties
    └── ...
```

- `UserController.java`: Controlador que gestiona las peticiones relacionadas con usuarios.
- `UserService.java`: Clase de servicio que contiene la lógica de negocio relacionada con los usuarios.
- `UserRepository.java`: Interfaz que define las operaciones de acceso a datos para los usuarios.
- `User.java`: Clase que representa el modelo de usuario.

### Ventajas de la Arquitectura Multicapa en Spring Boot:

1. **Separación de Responsabilidades**: Cada capa tiene un propósito claro y funciones específicas, lo que facilita el mantenimiento y la comprensión del código.

2. **Reutilización de Código**: Las capas independientes facilitan la reutilización de lógica de negocio y la posibilidad de cambiar implementaciones sin afectar otras partes del sistema.

3. **Escalabilidad y Mantenibilidad**: La modularidad permite que el sistema sea más escalable y adaptable a medida que crece y se añaden nuevas funcionalidades.

4. **Facilita las Pruebas Unitarias**: Al dividir la lógica en capas, se hace más sencillo realizar pruebas unitarias aisladas para cada componente.