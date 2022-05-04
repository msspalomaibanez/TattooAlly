package com.example.tattooally;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase en la que se mostrarán las publicaciones de otros usuarios de la app en formato de listado y desde donde
 * habrá un menú inferior con la navegación a todas las diferentes pantallas de la app
 *
 * Funcionalidades:
 * - Visualización de publicaciones
 * - Navegación a otras pantallas con el menú inferior
 */

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
