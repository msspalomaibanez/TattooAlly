package com.example.tattooally;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase en la que se mostrará un listado de mensajes intercambiados con un usuario en concreto
 *
 * Funcionalidades:
 * - Mandar un mensaje al usuario del chat
 * - Recibir mensajes del usuario del chat
 * - Volver a la pantalla anterior con el listado de todas las conversaciones
 */

public class ConversacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
