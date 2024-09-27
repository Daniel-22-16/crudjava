package com.example.crud;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {


    EditText edtNOMBRE,edtAPELLIDO,edtGMAIL;
    Button btnAgregar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNOMBRE=(EditText)findViewById(R.id.editNombre);
        edtAPELLIDO=(EditText) findViewById(R.id.editPellido);
        edtGMAIL=(EditText) findViewById(R.id.editGmail);
        btnAgregar=(Button) findViewById(R.id.btnAgregar);

        final  crudDaniel crudDaniel=new crudDaniel(getApplicationContext());

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crudDaniel.agregarREGISTRO(edtNOMBRE.getText() .toString(),edtAPELLIDO.getText().toString(), edtGMAIL.getText().toString());
                Toast.makeText(getApplicationContext(),"SE AGREGO CORRECTAMENTE",Toast.LENGTH_SHORT).show();
            }
        });

    }
}