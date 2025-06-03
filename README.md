# CRUD_MHW

## Descripción

CRUD sobre el videojuego Monster Hunter World hecho en Spring MVC

## Funciones

- Crear, borrar, editar y visualizar la información de cualquier monstruo del videojuego MHW
- Almacenamiento de la información en una base de datos 
- Uso de Thymeleaf como maquina de render para el frontend

## Instalación

### Requisitos previos

- Java OpenJDK versión 21
- MySQL 8.0.41 o superior
- IDE recomendado: IntellJ IDEA Community

### Instrucciones

1. Clonar el repositorio:
```bash
git clone https://github.com/aecax/CRUD_MHW
```

2. Cambiar al directorio CRUD_MHW y ejecutar el comando:
```bash
mysql -u root -h localhost -p < script_base_de_datos.sql
```

3. Abrir con IntellJ IDEA la carpeta CRUD_MHW como proyecto Maven.

4. Configura el JDK, classpath y main class para poder ejecutar el código.

5. Accede a tu navegador web e introduce en la url localhost:8080/Monstruo

## Nota
Este proyecto fue realizado para la materia de Temas Especiales de Computación 1
