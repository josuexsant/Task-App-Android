package com.example.task;
/**
 * Clase para crear notas
 */
public class Note {
    private String titulo;
    private String descripcion;
    private String ID;

    /**
     *
     * @param titulo
     * @param descripcion
     * @param ID
     */
    public Note(String titulo, String descripcion, String ID){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.ID = ID;
    }
}
