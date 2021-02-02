package com.example.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import com.example.dagger2demo.activities.BaseActivity;
import com.example.dagger2demo.bind.impl.AppManagerImpl;
import com.example.dagger2demo.dagger.component.DaggerActivityComponent;
import com.example.dagger2demo.model.Teacher;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HERO on 2017/4/13.
 */

public class ConstructorInjectActivity extends BaseActivity {
    private static final String TAG = "ConstructorInjectActivi";
    @Inject
    Teacher teacher;
    @BindView(R.id.constructorInject_tv_name)
    AppCompatTextView textView;

    @Inject
    AppManagerImpl appManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constructorinject);

        DaggerActivityComponent.builder().build().inject(this);

        ButterKnife.bind(this);
        textView.setText(teacher.getStudent());
        Toast.makeText(this, teacher.changeStudentName("ConstrucorInject").getStudent(), Toast.LENGTH_SHORT).show();
//        Log.e(TAG, "onCreate: "+ appManager.print(""));
        appManager.print("tomcat");

    }

    public static void start(BaseActivity activity) {
        activity.startActivity(new Intent(activity,ConstructorInjectActivity.class));
    }
}
