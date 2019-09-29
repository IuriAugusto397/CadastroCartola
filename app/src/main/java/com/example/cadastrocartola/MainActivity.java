package com.example.cadastrocartola;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.cadastrar_time = findViewById(R.id.cadastrar_time);

        this.mViewHolder.cadastrar_time.setOnClickListener(this);

    }

    private static class ViewHolder{
        Button cadastrar_time;
    }

    @Override
    public void onClick(View view) {
    if(view.getId() == R.id.cadastrar_time ){

    }
    }
}
