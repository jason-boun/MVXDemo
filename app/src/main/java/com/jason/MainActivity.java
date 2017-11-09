package com.jason;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jason.mvc.MVCActivity;
import com.jason.mvp.MVPActivity;
import com.jason.mvvm.MVVMActivity;
import com.jason.mvx.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mvc(View view) {

        startActivity(new Intent(this, MVCActivity.class));
    }

    public void mvp(View view) {
        startActivity(new Intent(this, MVPActivity.class));
    }

    public void mvvm(View view) {
        startActivity(new Intent(this, MVVMActivity.class));
    }
}
