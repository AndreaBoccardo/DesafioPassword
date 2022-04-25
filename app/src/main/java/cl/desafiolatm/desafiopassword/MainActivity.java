package cl.desafiolatm.desafiopassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import cl.desafiolatm.desafiopassword.databinding.ActivityMainBinding;
import cl.desafiolatm.desafiopassword.presentador.PasswordPresentadorImplem;
import cl.desafiolatm.desafiopassword.presentador.PasswordViewPresentador;

public class MainActivity extends AppCompatActivity implements PasswordViewPresentador {

    private ActivityMainBinding b;
    private PasswordPresentadorImplem presentador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(b.getRoot());


        presentador = new PasswordPresentadorImplem(this);

        b.etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presentador.clasificarPassword(String.valueOf(s));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


/*    @Override
    public void addTextChangedListener() {
        b.tvAnalisis.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!s.equals("") ) {
                     presentador.clasificarPassword(clave);
                }
            }
        });

    }*/

    @Override
    public void cambiarTexto(String mensaje) {
        b.tvAnalisis.setText(mensaje);
    }

    @Override
    public void cambiarColor(int color) {
        b.tvAnalisis.setBackgroundColor(color);
    }


}