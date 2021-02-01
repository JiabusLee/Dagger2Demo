package com.example.dagger2demo.mvp;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dagger2demo.DemoApplication;
import com.example.dagger2demo.R;
import com.example.dagger2demo.dagger.modules.GitHubModule;
import com.example.dagger2demo.model.Repository;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 *
 * Created by HERO on 2017/3/15.
 */

public class SecondActivity extends Activity {

    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    Retrofit retrofit;
    @Inject
    GitHubModule.GitHubApiInterface gitHubApiInterface;

    @BindView(R.id.second_contentMain)
    TextView textView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        ((DemoApplication) getApplication()).getGitHubComponent().inject(this);
        Call<ArrayList<Repository>> codepath = gitHubApiInterface.getRepository("codepath");
        codepath.enqueue(new Callback<ArrayList<Repository>>() {
            @Override
            public void onResponse(Call<ArrayList<Repository>> call, Response<ArrayList<Repository>> response) {
                ArrayList<Repository> body = response.body();
                if (body != null && response.body().size() > 0) {
                    textView.setText(body.toString());
                }
            }


            @Override
            public void onFailure(Call<ArrayList<Repository>> call, Throwable t) {
                Toast.makeText(SecondActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
