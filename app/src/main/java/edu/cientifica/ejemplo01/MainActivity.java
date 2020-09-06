package edu.cientifica.ejemplo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumero1;
    EditText etNumero2;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumero1 = (EditText) findViewById(R.id.etNumero1);
        etNumero2 = (EditText) findViewById(R.id.etNumero2);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        //realizarCalculo();


    }
    public void realizarCalculo(View view){
        int num1;
        int num2;
        int resultado;
        num1 = Integer.parseInt(etNumero1.getText().toString());
        num2 = Integer.parseInt(etNumero2.getText().toString());
        resultado = num1+num2;
        tvResultado.setText(String.valueOf(resultado));
    }

}