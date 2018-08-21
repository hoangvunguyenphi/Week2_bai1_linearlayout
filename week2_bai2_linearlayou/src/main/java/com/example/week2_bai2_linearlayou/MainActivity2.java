package com.example.week2_bai2_linearlayou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void cong(View view){
        EditText txtA=(EditText) findViewById(R.id.editTextA);
        EditText txtB=(EditText) findViewById(R.id.editTextB);
        TextView txtKq=(TextView) findViewById(R.id.textViewKq);
        txtKq.setText("");
        float a,b;
        try{
             a=Float.parseFloat(txtA.getText().toString());
             b=Float.parseFloat(txtB.getText().toString());
            txtKq.setText(String.valueOf(a+b));
        }
        catch (Exception e){
            Toast.makeText(this, "Loi nhap du lieu khong hop le!", Toast.LENGTH_SHORT).show();
        }
    }
    public void tru(View view){
        EditText txtA=(EditText) findViewById(R.id.editTextA);
        EditText txtB=(EditText) findViewById(R.id.editTextB);
        TextView txtKq=(TextView) findViewById(R.id.textViewKq);
        txtKq.setText("");
        float a,b;
        try{
            a=Float.parseFloat(txtA.getText().toString());
            b=Float.parseFloat(txtB.getText().toString());
            txtKq.setText(String.valueOf(a-b));
        }
        catch (Exception e){
            Toast.makeText(this, "Loi nhap du lieu khong hop le!", Toast.LENGTH_SHORT).show();
        }
    }
    public void nhan(View view){
        EditText txtA=(EditText) findViewById(R.id.editTextA);
        EditText txtB=(EditText) findViewById(R.id.editTextB);
        TextView txtKq=(TextView) findViewById(R.id.textViewKq);
        txtKq.setText("");
        float a,b;
        try{
            a=Float.parseFloat(txtA.getText().toString());
            b=Float.parseFloat(txtB.getText().toString());
            txtKq.setText(String.valueOf(a*b));
        }
        catch (Exception e){
            Toast.makeText(this, "Loi nhap du lieu khong hop le!", Toast.LENGTH_SHORT).show();
        }
    }
    public void chia(View view){
        EditText txtA=(EditText) findViewById(R.id.editTextA);
        EditText txtB=(EditText) findViewById(R.id.editTextB);
        TextView txtKq=(TextView) findViewById(R.id.textViewKq);
        txtKq.setText("");
        float a,b;
        try{
            a=Float.parseFloat(txtA.getText().toString());
            b=Float.parseFloat(txtB.getText().toString());
            txtKq.setText(String.valueOf(a/b));
        }
        catch (Exception e){
            Toast.makeText(this, "Loi nhap du lieu khong hop le!", Toast.LENGTH_SHORT).show();
        }
    }

}
