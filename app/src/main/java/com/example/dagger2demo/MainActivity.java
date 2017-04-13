package com.example.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger2demo.activities.BaseActivity;
import com.example.dagger2demo.dagger.component.DaggerMainComponent;
import com.example.dagger2demo.model.Student;
import com.example.dagger2demo.mvp.SecondActivity;

import javax.inject.Inject;
import javax.inject.Named;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Inject
    Student student;
    @Inject
    String mainModule;
    @Named("secondModule")
    @Inject
    String secondModule;
    @BindView(R.id.main_click)
    AppCompatButton mainClick;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        TextView textView = (TextView) findViewById(R.id.main_contentMain);

//        DaggerMainComponent.builder().mainModule(new MainModule()).build()(this);

        DaggerMainComponent.getInstance().inject(this);


        textView.setText(student.toString() + "\n" + mainModule);
        Toast.makeText(this, secondModule, Toast.LENGTH_SHORT).show();


    }

    @OnClick({R.id.main_click, R.id.main_click2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_click:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.main_click2:
                ConstructorInjectActivity.start(this);
                break;
            default:
                break;
        }


    }
}


