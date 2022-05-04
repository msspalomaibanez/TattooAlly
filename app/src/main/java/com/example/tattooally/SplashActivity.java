package com.example.tattooally;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase que aparecerá por defecto como primera pantalla donde se le pedirá al usuario que se registre o que inicie sesión
 * con dos botones
 *
 * Funcionalidades:
 * - Dirigirse a la actividad de inicio de seión
 * - Dirigirse a la actividad de registro
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}