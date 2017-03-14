package com.example.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger2demo.dagger.component.DaggerMainComponent;
import com.example.dagger2demo.model.Student;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject Student student;
    @Inject String mainModule;
    @Named("secondModule")
    @Inject String secondModule;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.main_contentMain);

//        DaggerMainComponent.builder().mainModule(new MainModule()).build()(this);

        DaggerMainComponent.getInstance().inject(this);


        textView.setText(student.toString() + "\n" + mainModule);
        Toast.makeText(this, secondModule, Toast.LENGTH_SHORT).show();


    }
}


