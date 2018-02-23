package com.danielescobar.calculadora1;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    EditText  elado,eAltura,ePerimetro,eArea,eVolumen,eBase;
    TextView  tPerimetro, tArea ,tVolumen;
    LinearLayout imagen;
    int bandera_figura=0;
    float lado;
    float base;
    float Altura;
    float calculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        elado = findViewById(R.id.elado);
        eAltura= findViewById(R.id.eAltura);
        eBase=findViewById(R.id.eBase);
        ePerimetro= findViewById(R.id.ePerimetro);
        eArea= findViewById(R.id.eArea);
        eVolumen= findViewById(R.id.eVolumnen);
        tPerimetro= findViewById(R.id.tPerimetro);
        tArea= findViewById(R.id.tArea);
        tVolumen= findViewById(R.id.tVolumen);
        imagen=findViewById(R.id.imagen);



    }

    public void onRadioButtonClicked(View view) {
        int id = view.getId();
        tPerimetro.setVisibility(View.INVISIBLE);
        tArea.setVisibility(View.INVISIBLE);
        tVolumen.setVisibility(View.INVISIBLE);
        ePerimetro.setVisibility(View.INVISIBLE);
        eArea.setVisibility(View.INVISIBLE);
        eVolumen.setVisibility(View.INVISIBLE);
        if (id == R.id.rCuadrado ){
            elado.setVisibility(view.VISIBLE);
            eAltura.setVisibility(view.INVISIBLE);
            eBase.setVisibility(View.INVISIBLE);
            elado.setHint("lado");
            imagen.setBackgroundResource(R.drawable.cuadrado);
            bandera_figura=1;
            //code
        } else if(id == R.id.rCirculo)
        {
            elado.setVisibility(view.VISIBLE);
            eAltura.setVisibility(view.INVISIBLE);
            eBase.setVisibility(View.INVISIBLE);
            elado.setHint("radio");
            imagen.setBackgroundResource(R.drawable.circulo2);
            bandera_figura=2;
            //code
        }
        else if(id == R.id.rCubo)
        {
            elado.setVisibility(view.VISIBLE);
            eAltura.setVisibility(view.INVISIBLE);
            eBase.setVisibility(View.INVISIBLE);
            elado.setHint("lado");
            imagen.setBackgroundResource(R.drawable.cubo2);
            bandera_figura=3;
            //code
        }
        else
        {
            elado.setVisibility(view.VISIBLE);
            elado.setHint("Lado1");
            eAltura.setVisibility(view.VISIBLE);
            eAltura.setHint("Lado2");
            eBase.setVisibility(view.VISIBLE);
            eBase.setHint("Lado3");
            imagen.setBackgroundResource(R.drawable.triangulo2);
            bandera_figura=4;
        }



    }

    public void onButtonClicked(View view) {

        switch (bandera_figura) {
            case 1:
                if (elado.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Debes ingresar el lado del cuadrado",
                            Toast.LENGTH_LONG).show();
                }
                else {

                    lado = Integer.parseInt(elado.getText().toString());
                    calculo = 4 * lado;
                    tPerimetro.setVisibility(View.VISIBLE);
                    ePerimetro.setVisibility(View.VISIBLE);
                    ePerimetro.setText(String.valueOf(calculo));
                    calculo = (float) Math.pow(lado, 3);
                    tArea.setVisibility(view.VISIBLE);
                    eArea.setVisibility(view.VISIBLE);
                    eArea.setText(String.valueOf(calculo));
                    elado.getText().clear();
                    eAltura.getText().clear();
                    eBase.getText().clear();
                    elado.setVisibility(View.INVISIBLE);
                    eBase.setVisibility(View.INVISIBLE);
                    eAltura.setVisibility(View.INVISIBLE);

                }

                    break;
            case 2:
                if (elado.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Debes ingresar el radio del circulo",
                            Toast.LENGTH_LONG).show();

                }
                else {
                    lado = Integer.parseInt(elado.getText().toString());
                    calculo = (float) (2 * Math.PI * lado);
                    tPerimetro.setVisibility(view.VISIBLE);
                    ePerimetro.setVisibility(view.VISIBLE);
                    ePerimetro.setText(String.valueOf(calculo));
                    calculo = (float) (Math.pow(lado, 2) * Math.PI);
                    tArea.setVisibility(view.VISIBLE);
                    eArea.setVisibility(view.VISIBLE);
                    eArea.setText(String.valueOf(calculo));
                    elado.getText().clear();
                    eAltura.getText().clear();
                    eBase.getText().clear();
                    elado.setVisibility(View.INVISIBLE);
                    eBase.setVisibility(View.INVISIBLE);
                    eAltura.setVisibility(View.INVISIBLE);

                }
                break;
            case 3:
                if (elado.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Debes ingresar el lado del cubo",
                            Toast.LENGTH_LONG).show();

                }
                else {
                    lado = Integer.parseInt(elado.getText().toString());
                    calculo = (float) (6 * Math.pow(lado, 2));
                    tArea.setVisibility(view.VISIBLE);
                    eArea.setVisibility(view.VISIBLE);
                    eArea.setText(String.valueOf(calculo));
                    calculo = (float) (Math.pow(lado, 2));
                    tVolumen.setVisibility(view.VISIBLE);
                    eVolumen.setVisibility(view.VISIBLE);
                    eVolumen.setText(String.valueOf(calculo));
                    elado.getText().clear();
                    eAltura.getText().clear();
                    eBase.getText().clear();
                    elado.setVisibility(View.INVISIBLE);
                    eBase.setVisibility(View.INVISIBLE);
                    eAltura.setVisibility(View.INVISIBLE);

                }

                break;
            case 4:
                if (elado.getText().toString().isEmpty() || eAltura.getText().toString().isEmpty() || eBase.getText().toString().isEmpty() )
                    {
                        Toast.makeText(this, "Debes ingresar todos los lados del triangulo",
                                Toast.LENGTH_LONG).show();
                    }
                else {

                    lado = Integer.parseInt(elado.getText().toString());
                    base = Integer.parseInt(eBase.getText().toString());
                    Altura = Integer.parseInt(eAltura.getText().toString());
                    calculo = lado + base + Altura;
                    tPerimetro.setVisibility(view.VISIBLE);
                    ePerimetro.setVisibility(view.VISIBLE);
                    ePerimetro.setText(String.valueOf(calculo));
                    calculo = calculo / 2;
                    calculo = (float) sqrt(calculo * (calculo - lado) * (calculo - base) * (calculo - Altura));
                    tArea.setVisibility(view.VISIBLE);
                    eArea.setVisibility(view.VISIBLE);
                    eArea.setText(String.valueOf(calculo));
                    elado.getText().clear();
                    eAltura.getText().clear();
                    eBase.getText().clear();
                    elado.setVisibility(View.INVISIBLE);
                    eBase.setVisibility(View.INVISIBLE);
                    eAltura.setVisibility(View.INVISIBLE);
            }

        }


    }
}
