package cl.desafiolatm.desafiopassword.presentador;

import android.graphics.Color;

import androidx.annotation.ColorInt;

import cl.desafiolatm.desafiopassword.modelo.Password;

public class PasswordPresentadorImplem implements  PasswordPresentador{

    private PasswordViewPresentador view;
    private Password password;
    private String contrasenia;

    public PasswordPresentadorImplem(PasswordViewPresentador view) {
        this.view = view;
        password = new Password();
    }


    @Override
    public boolean reglaLongitud(String contrasenia) {
        if (contrasenia.length() >= 5){
            return true;
        }
        return false;
    }

    @Override
    public boolean reglaMayusculas(String contrasenia) {

        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isUpperCase(contrasenia.charAt(i))){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean reglaNumeros(String contrasenia) {
        for (int i = 0; i < contrasenia.length(); i++) {
            if (Character.isDigit(contrasenia.charAt(i))){
                return true;
            }
        }
        return false;
    }
    @Override
    public int verificarPassword(String contrasenia){
        int clave = 0;
        if (reglaLongitud(contrasenia) == true){
            clave++;
        } if (reglaMayusculas(contrasenia) == true){
            clave++;
        }if (reglaNumeros(contrasenia) == true){
            clave++;
        }
        return clave;
    }

    public void clasificarPassword(String contrasenia){
        if (verificarPassword(contrasenia) == 0) {
          //  view.addTextChangedListener();
            view.cambiarTexto("WEAK");
            view.cambiarColor(Color.parseColor("#C10C21"));
        } else {if (verificarPassword(contrasenia) == 1) {
           // view.addTextChangedListener();
            view.cambiarTexto("MEDIUM");
            view.cambiarColor(Color.parseColor("#FFEA36"));
        } else {if (verificarPassword(contrasenia) == 2) {
           // view.addTextChangedListener();
            view.cambiarTexto("STRONG");
            view.cambiarColor(Color.parseColor("#8BC34A"));
        } else {
          //  view.addTextChangedListener();
            view.cambiarTexto("VERY STRONG");
            view.cambiarColor(Color.parseColor("#508118"));
        }
        }
        }
    }
}


