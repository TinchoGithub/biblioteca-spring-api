# API de Biblioteca con Spring

Esta es una API desarrollada con Spring para administrar una biblioteca virtual.

## Descripción

La API de Biblioteca permite gestionar libros, autores, usuarios y préstamos en una biblioteca virtual. Proporciona endpoints para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre estos recursos, así como endpoints para buscar libros por título, autor, etc.

## Tecnologías utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL (u otra base de datos compatible)

## Configuración

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tu-usuario/biblioteca-api-spring.git
   ```

2. **Configurar la base de datos:**
    - Configura tu base de datos en el archivo `application.properties`.
    - Ejecuta las migraciones de la base de datos con Liquibase o Flyway si es necesario.

3. **Ejecutar la aplicación:**
   ```bash
   ./mvnw spring-boot:run
   ```

La API estará disponible en `http://localhost:8080`.

## Documentación de la API

Puedes encontrar la documentación completa de la API en el siguiente endpoint:

```
http://localhost:8080/swagger-ui.html
```

## Endpoints

A continuación se detallan algunos de los endpoints principales:

- **Obtener todos los libros:**
  ```
  GET /api/libros
  ```

- **Obtener un libro por ID:**
  ```
  GET /api/libros/{id}
  ```

- **Crear un nuevo libro:**
  ```
  POST /api/libros
  ```

- **Actualizar un libro:**
  ```
  PUT /api/libros/{id}
  ```

- **Eliminar un libro:**
  ```
  DELETE /api/libros/{id}
  ```

- **Buscar libros por título:**
  ```
  GET /api/libros/buscar?titulo={titulo}
  ```

- **Buscar libros por autor:**
  ```
  GET /api/libros/buscar?autor={autor}
  ```

- **Obtener todos los usuarios:**
  ```
  GET /api/usuarios
  ```

- **Obtener un usuario por ID:**
  ```
  GET /api/usuarios/{id}
  ```

- **Crear un nuevo usuario:**
  ```
  POST /api/usuarios
  ```

- **Actualizar un usuario:**
  ```
  PUT /api/usuarios/{id}
  ```

- **Eliminar un usuario:**
  ```
  DELETE /api/usuarios/{id}
  ```

- **Realizar un préstamo:**
  ```
  POST /api/prestamos
  ```

- **Devolver un libro:**
  ```
  PUT /api/prestamos/{id}/devolver
  ```

## Contribuyendo

Si deseas contribuir a este proyecto, ¡estás más que bienvenido! Puedes enviar un pull request con tus mejoras.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
