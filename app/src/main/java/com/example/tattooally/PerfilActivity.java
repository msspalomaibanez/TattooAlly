package com.example.tattooally;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase en la que se mostrará el perfil del usuario con información sobre sus publicaciones
 *
 * Funcionalidades:
 * - Visualización de publicaciones
 * - Editar información del perfil personal
 * - Eliminar publicaciones
 */

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
