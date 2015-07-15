package com.example.android.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends Activity {
    private final Map<Integer, Integer> activityIds = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityIds.put(R.id.popular_movies_1, R.string.popular_movies_1);
        activityIds.put(R.id.popular_movies_2, R.string.popular_movies_2);
        activityIds.put(R.id.super_duo, R.string.super_duo);
        activityIds.put(R.id.build_it_bigger, R.string.build_it_bigger);
        activityIds.put(R.id.make_your_app_mat, R.string.make_your_app_mat);
        activityIds.put(R.id.capstone, R.string.capstone);
    }

    public void openApp(View view) {
        final Context context = getApplicationContext();
        final String appName = getString(activityIds.get(view.getId()));
        final String text = getString(R.string.future_launch_toast_msg, appName);
        final int duration = Toast.LENGTH_SHORT;

        final Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
