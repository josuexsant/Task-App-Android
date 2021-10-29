package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class Edit extends AppCompatActivity {
    private EditText titulo;
    private EditText texto;
    private int time = 100;
    private int noNote = 1;
    Nota nota[] = new Nota[noNote];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Toolbar barraEdicion = findViewById(R.id.memuEditar);       //Asignamos una toolbar
        setSupportActionBar(barraEdicion);
    }
    //Metodo para el boton de guardar en la toolbar--------------------/
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_editing, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.backtomain){
            Intent Main = new Intent(this, MainActivity.class);
            startActivity(Main);
            Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void newNote(){          //Obtenemos los datos de la nota
        titulo = findViewById(R.id.titulo_note);
        texto = findViewById(R.id.titulo_note);
        nota[noNote--] = new Nota(titulo.getText().toString(), texto.getText().toString(), time);
    }
}