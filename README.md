# DesafioPassword
Usar arquitectura MVP para evaluar la fortaleza de una contraseña

Descripción
Se quiere evaluar qué tan segura es una contraseña, por esto, a medida que se escribe la
contraseña, esta debe ser evaluada mostrando su fortaleza.
Para esto se deben utilizar 2 elementos en la vista:
● EditText para ingresar la contraseña.
● TextView para desplegar qué tan fuerte es la contraseña.

Reglas a ser aplicadas
1. Longitud mínima de al menos 5 caracteres.
2. Contenga letras mayúsculas.
3. Contenga al menos un caracter numerico.
La contraseña puede ser clasificada como:
● Weak: Que es de baja complejidad y fortaleza. No cumple con la regla 1.
● Medium: Que tiene una complejidad media. Cumple con 1, pero no con 2.
● Strong: Fuerte. Cumple con 1 y 2, pero no con 3.
● Very Strong: Cumple con todas las reglas y es una contraseña segura.
A medida que la contraseña es escrita, se evalúa el texto y se entrega el resultado indicando
el nivel con un texto y coloreando para mejorar el feedback sobre la fuerza de la contraseña.

Para poder observar los cambios que ocurren en el EditText en general se utiliza la interfaz
TextWatcher que se agrega al EditText usando el método addTextChangedListener.
Para el desarrollo de la aplicación se debe utilizar el patrón Modelo-Vista-Presentador
(MVP), creando las clases en sus respectivos paquetes para modelo, vista y presentador.

Requerimientos
Vistas
1. Crear el proyecto usando el template de Empty Activity.
2. Agregar las vistas para ingresar la contraseña y para desplegar el resultado de la
evaluación en el layout main_layout.xml .
3. Definir los textos ocupados en el archivo strings.xml .
4. Inicializar las vistas usando findViewById(...) o con ButterKnife @Bind (..) .
Modelo
5. Crear la clase Verifier que tenga un método público para evaluar la contraseña que
retorne un entero indicando que tan robusta es la contraseña.
6. Implementar cada regla en un método separado. Una de las formas es que cada
regla retorne un booleano indicando si la regla se cumple.

Presentador
7. Definir la interfaz de comunicación entre la vista y el presentador, como es
IPresenterView.
8. Crear el presentador con las referencias a la vista y al modelo.
9. Definir el método para evaluar la contraseña y su resultado.

MainActivity
10. Implementar la interfaz IPresenterView por parte de MainActivity para hacer los
cambios de texto y color asociados a la respuesta.
11. Implementar el listener TextWatcher para verificar los cambios en el texto y utilizar el
presentador para evaluar la contraseña.
