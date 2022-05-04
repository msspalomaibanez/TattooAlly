package com.example.tattooally;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Clase en la que se mostrará una barra de búsqueda para buscar usuarios o categorías seguido de un listado
 * de categorias frecuentes
 *
 * Funcionalidades:
 * - Buscar usuarios y categorias
 */

public class ExplorarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
}
