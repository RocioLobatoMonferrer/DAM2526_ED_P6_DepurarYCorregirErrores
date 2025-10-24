# DAM2526_ED_P6_DepurarYCorregirErrores
## Depura y corrige los errores

Se nos entrega el siguiente código:


## 1. Corrección de errores de Sintaxis


Como podemos observar, todos aquellos fallos que nos señala el IDE se deben a errores de sintaxis. Para este ejercicio, pondremos nuestras iniciales y la fecha de hoy tal y como la siguiente imagen:


## 2. Depurar y solucionar errores de ejecución


Una vez depuramos el código, incluso a la hora de corregir la sintaxis, nos daremos cuenta de que nos da un error a partir de la línea 19 hasta la 33, es decir, desde que empieza hasta que termina un bucle, como podemos observar en la siguiente imagen:


Para solucionar este error,  debemos solucionar la condición del bucle, por lo tanto colocaremos lo siguiente:


Luego nos encontraremos con otro problema y es que al ejecutar el programa, colocar una temperatura y seleccionar la opción de salir, el programa volverá a preguntarnos por otra temperatura y así todo el rato:


Para solucionar esto, debemos arreglar el if, ya que al ser la variable respuesta un String, debemos cambiar lo siguiente:


Con esto, el código funciona al completo.


## 3. Documentación


Gracias a este ejercicio, podemos notar que una parte fundamental en la programación es documentar los errores de un programa, ya que esto facilita el trabajo si es un código que lo manejan varias personas, avisando a tus compañeros de ciertos errores que has notado y has arreglado o viceversa.
