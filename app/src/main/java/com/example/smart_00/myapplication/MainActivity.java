package com.example.smart_00.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너 사용");
        //배열 선언
        final String[] movie={"목록1","목록1","목록1",
                "목록1","목록1","목록1","목록1"};

        //id찾기;
        spinner = (Spinner) findViewById(R.id.spinner1);

        //arrayadperp 연결;
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.simple_spinner_item, movie);
        spinner.setAdapter(adapter);

        //기능 부여==> setOnItemSelectedList......
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            //토스트 보여주기 넣기
                Toast.makeText(getApplicationContext(),
                        movie[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
