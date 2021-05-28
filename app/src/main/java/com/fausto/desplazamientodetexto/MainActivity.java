package com.fausto.desplazamientodetexto;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView articulo_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articulo_text = findViewById(R.id.articulo);
        registerForContextMenu(articulo_text);
    }

    public void displayToast (String mensagge){
        Toast.makeText(getApplicationContext(), mensagge,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
    super.onCreateContextMenu(menu,v,menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_context, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.editar_text:
                displayToast("Haz seleccionado editar");
             return true;

            case R.id.borrar_text:
                displayToast("Haz seleccionado borrar");
                return true;

            case R.id.compartir_text:
                 displayToast("Seleccionaste Compartir");
                 return true;

            default:
                return super.onContextItemSelected(item);

        }



    }
}