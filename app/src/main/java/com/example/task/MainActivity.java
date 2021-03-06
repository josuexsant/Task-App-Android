package com.example.task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView letras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //barra de herramientas
        Toolbar barra = findViewById(R.id.toolbar);
        setSupportActionBar(barra);
        setUpView();
        //----------

    }

    public void editNote(View view) {
        Intent editScreen = new Intent(this, Edit.class);
        startActivity(editScreen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Info:
                Intent infoScreen = new Intent(this, InfoActivity.class);
                startActivity(infoScreen);
            case R.id.Settings:
                Toast.makeText(getApplicationContext(), "Proximamente", Toast.LENGTH_SHORT).show();
            default:
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}