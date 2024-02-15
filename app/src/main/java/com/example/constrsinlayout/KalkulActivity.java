package com.example.constrsinlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class KalkulActivity extends AppCompatActivity {

    EditText txta1;
    EditText txta2;
    Spinner spinner;
    Button btnItung;
    TextView tvhasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        txta1 = findViewById(R.id.txta1);
        txta2 = findViewById(R.id.txta2);
        tvhasil = findViewById(R.id.tvhasil);
        spinner = findViewById(R.id.spinner);
        btnItung = findViewById(R.id.btnItung);
        btnItung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String tetx = spinner.getSelectedItem().toString();
                int a1 = Integer.parseInt(txta1.getText().toString());
                int a2 = Integer.parseInt(txta1.getText().toString());
                int hasil = 0;

                String text = spinner.getSelectedItem().toString();
                switch (tetx){
                    case "Tambah":
                        hasil = a1+a2;
                        tvhasil.setText(hasil+"");
                        break;

                        case "Kurang":
                        hasil = a1-a2;
                        tvhasil.setText(hasil+"");
                        break;

                    case "Kali":
                        hasil = a1*a2;
                        tvhasil.setText(hasil+"");
                        break;

                        case "Bagi":
                            double a1double =  Double.parseDouble(txta1.getText().toString());
                            double a2double =  Double.parseDouble(txta2.getText().toString());
                            double hasildouble = a1double/a2double;
                            tvhasil.setText(hasildouble+"");
                        break;

                }
            }
        });
    }
}