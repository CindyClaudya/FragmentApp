package com.e.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai","Para Progmobers");
        ft.replace(R.id.frameMain,proteinFragment);
        ft.commit();
        View.OnClickListener helpButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainFragment2Activity.class);
                startActivity(intent);
            }
        };
        Button helpBtn = (Button)findViewById(R.id.button2);
        helpBtn.setOnClickListener(helpButtonListener);
    }
}
