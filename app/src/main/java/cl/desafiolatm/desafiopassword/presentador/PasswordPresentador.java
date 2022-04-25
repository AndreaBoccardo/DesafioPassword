package cl.desafiolatm.desafiopassword.presentador;

public interface PasswordPresentador {

    int verificarPassword(String contrasenia);
    boolean reglaLongitud(String contrasenia);
    boolean reglaMayusculas(String contrasenia);
    boolean reglaNumeros(String contrasenia);
}
