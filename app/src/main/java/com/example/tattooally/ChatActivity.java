package com.example.tattooally;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase en la que se mostrará un listado de usuarios con los que se ha tenido un intercambio de mensajes
 *
 * Funcionalidades:
 * - Ingresar en alguna de las conversaciones para visualizar el intercambio de mensajes
 * - Navegación a otras pantallas con el menú inferior
 */

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
