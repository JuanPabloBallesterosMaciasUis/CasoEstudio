# CasoEstudio

Se necesita escribir las clases necesarias y una aplicación para registrar la información de los libros
 pertenecientes a la biblioteca del señor Pérez.  El ha informado que de cada libro desea guardar el nombre del
 mismo, el nombre del autor o autores, el año de edición y si se trata de una edición de lujo o no.  También ha
 dicho que tiene una serie de libros que forman colecciones, en cuyo caso además de lo anterior, requiere guardar
 el nombre de la colección y el número que ocupa el libro en la colección.  La única aclaración adicional es que
 si se trata de un libro con mas de dos autores quiere guardar el primer autor, y el nombre del segundo debe
 aparecer “y otros”.
 El usuario debe poder ingresar los datos de los libros

# Analisis del problema
Se crea una carpeta llamada modelo que contenga las clases Libro y Coleccion, las cuales se encargaran de guardar la informacion de los Libro y las Coleccion respectivamente.

En la clase Libro tendra los atributos nombre, autor, año, edicion, y en la clase Coleccion tendra los atributos nombre, autor, año, edicion, nombreColeccion, numeroColeccion.

# Diagrama de clases
![diagrama de clases](diagramaEstudio.png "Diagrama de clases")

# Ejecucion por consola
![diagrama de clases](CasoConsola.png "Diagrama de clases")





