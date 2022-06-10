package com.example.amst3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log; import
        android.view.View; import
        android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private EditText txtNombre, txtApellido, txtUsuario, txtPasswd; private Button
            btnLogin, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Referencias a los controles
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtPasswd = (EditText) findViewById(R.id.txtPasswd);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);
    }
    public void registrarse(View view) {
        Intent intent = new Intent(this, formulario_registro.class); startActivity(intent);
    }
    public void login(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Usted no cuenta " +
                "con un usuario",Toast.LENGTH_SHORT);
                toast.show();
    }
    public void Menu(View view) {
        Intent intent = new Intent(this, Menua.class);
        startActivity(intent);
    }
    public void onClick(View v) {
        if(v.getId() == R.id.btnLogin){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnRegistro) {
        }
    }
}