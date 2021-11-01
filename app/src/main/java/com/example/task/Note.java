package com.example.task;

import android.app.Activity;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Note extends AppCompatActivity {
    /**
     * Clase para crear una nota
     */
    private String titulo;
    private String descripcion;
    private String ID;

    /**
     * @param titulo incluye el titulo de la nota
     * @param descripcion incluye la descripcion de la nota
     * @param ID incluye el ID para identificar cada nota
     */

    public Note(String titulo, String descripcion, String ID){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ID = ID;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getID() {
        return ID;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void crear(String titulo, String descripcion, String ID){
        /**
         * Metodo para crear un fichero y guardar la nota
         */
        try {
            OutputStreamWriter nota = new OutputStreamWriter(openFileOutput(
                    "PrimerNota.txt", Activity.MODE_PRIVATE));
            Toast.makeText(getApplicationContext(), "Guardado", Toast.LENGTH_SHORT).show();
            nota.write(descripcion);
            nota.flush();
            nota.close();
        } catch (FileNotFoundException e) {
            Toast.makeText(getApplicationContext(), "Error de archivo", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "ERROR", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
    public void leer(){
        /**
         * Metodo para leer un fichero guardado
         */

    }
}
