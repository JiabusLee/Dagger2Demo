package com.example.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.example.dagger2demo.activities.BaseActivity;
import com.example.dagger2demo.dagger.component.DaggerQualifierComponent;
import com.example.dagger2demo.dagger.scope.BlueColor;
import com.example.dagger2demo.dagger.scope.RedColor;
import com.example.dagger2demo.model.Color;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by HERO on 2017/4/17.
 */

public class QualifierActivity extends BaseActivity {

    @Inject
    @RedColor
    Color redColor;

    @Inject
    @BlueColor
    Color blueColor;

    @BindView(R.id.qualifier_A)
    TextView qualifierA;

    @BindView(R.id.qualifier_B)
    TextView qualifierB;

    public static void start(BaseActivity activity) {
        activity.startActivity(new Intent(activity, QualifierActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qualifier);
        ButterKnife.bind(this);

        DaggerQualifierComponent.builder().build().inject(this);

        qualifierA.setText(redColor.toString());
        qualifierB.setText(blueColor.toString());

    }
}
