# Taller Persistencia

## Enlaces de interés

- [BookstoreBack](https://github.com/Uniandes-isis2603/bookstore-back) -> Repositorio de referencia para el Back

1. Diseño de Relaciones: ¿En cuál de las entidades (Proyecto o Tarea) quedó la columna de la llave foránea (project_id) en la base de datos? Quedó en ProyectoEntity debido a que es el dueño de la relación principal entre los proyectos y cada una de sus tareas.

2. Describe qué configuración específica utilizaste para que al borrar un Proyecto desaparezcan sus Tareas. ¿Cuál es la diferencia conceptual entre borrar la tarea de la lista del proyecto vs borrar el proyecto entero? Utilicé 'orphanRemoval=true' desde proyecto debido a que no tendría sentido borrar un proyecto entero por eliminar una de las tareas que lo componen. Sin embargo, si hace sentido borrar todas las tareas de un proyecto si el proyecto ya no existe.

3. Explica cómo funciona "por debajo" el método de búsqueda por estado. Si tuvieras que escribir el SQL de esa consulta manualmente, ¿cómo sería aproximadamente (SELECT ...)? Respuesta --> SELECT * FROM TareaEntity WHERE estado = TERMINADO