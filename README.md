# Gestión Gasolinera - API REST con Spring Boot

API desarrollada en **Spring Boot** para gestionar las operaciones de una gasolinera: estaciones, surtidores, compras de combustible, reportes, etc.

---

## Funcionalidades principales

- Gestión de **estaciones** y **surtidores** (crear, editar, listar, eliminar).  
- Registro de **ventas** de combustible con datos como tipo, cantidad, precio, fecha.  
- Reportes básicos: ventas por día / por surtidor / por estación.  
- Persistencia con base de datos relacional.  
---

## Tecnologías usadas

- **Java** + **Spring Boot**  
- **Spring Data JPA** para acceso a base de datos  
- Base de datos relacional  
- Docker y Docker Compose para contenerización  

---

## Requisitos previos

- JDK 17+  
- Maven  
- Docker (si vas a usar contenedores)  
- Base de datos configurada (local o remota)  

---

## Cómo levantar el proyecto localmente

### Opción A: sin Docker

```bash
git clone https://github.com/yvl0420/Gestion_Gasolinera.git
cd Gestion_Gasolinera
