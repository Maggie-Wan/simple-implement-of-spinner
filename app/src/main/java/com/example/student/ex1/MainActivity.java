package com.example.student.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spn;
    String [] x={"教育","金融", "服務"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn=(Spinner)findViewById(R.id.spn);
        //ArrayAdapter<String> ada=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,x);
        ArrayAdapter<CharSequence> ada=ArrayAdapter.createFromResource(this,R.array.x2,android.R.layout.simple_spinner_item);
        ada.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(ada);
        spn.setOnItemSelectedListener(L1);
    }
    Spinner.OnItemSelectedListener L1=new Spinner.OnItemSelectedListener(){
        @Override
        public void onItemSelected(AdapterView<?> adp, View view, int i, long l) {
            String msg=adp.getSelectedItem().toString();
            Toast t=Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT);
            t.show();
        }
        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}
