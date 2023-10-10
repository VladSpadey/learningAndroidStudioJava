package com.example.android_tutorial1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public Button btnHello = findViewById(R.id.btnHello);
    public EditText editTextName = findViewById(R.id.editTextName);
    public TextView txtHello = findViewById(R.id.txtHello);

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnHello) {
            Toast.makeText(this, "Hello Button clicked", Toast.LENGTH_SHORT).show();
            txtHello.setText(String.format("Hello %s", editTextName.getText().toString()));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(view -> {
            Toast.makeText(MainActivity.this, "Long Press", Toast.LENGTH_LONG).show();
            return true;
        });
    }


}