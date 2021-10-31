package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Edit extends AppCompatActivity {
    private EditText titulo;
    private EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Toolbar barraEdicion = findViewById(R.id.memuEditar);       //Asignamos una toolbar
        setSupportActionBar(barraEdicion);
        setUpView(); //Inicia los editText
    }
    //Metodo para el boton de guardar en la toolbar--------------------/
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_editing, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.backtomain){
            String str = "djgnjkdfbgljfkgbfjklg";
            try {
                OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("todoki.txt", Activity.MODE_PRIVATE));
                archivo.write(str);
                archivo.flush();
                archivo.close();
                Log.d("TAG1", "Creado en :" + getFilesDir() + "/" + "todoki.txt");
                Toast.makeText(getApplicationContext(), "exito", Toast.LENGTH_SHORT).show();
            }catch (IOException e){
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
            }
            finish();
            Intent Main = new Intent(this, MainActivity.class);
            startActivity(Main);
        }else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
    public void setUpView(){
        texto = findViewById(R.id.texto_note);
        titulo = findViewById(R.id.titulo_note);
    }
}