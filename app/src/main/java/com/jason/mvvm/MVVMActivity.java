package com.jason.mvvm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jason.mvx.R;
import com.jason.mvx.databinding.ActivityMvvmBinding;

/**
 * Created by JiaBo on 2017/11/8.
 */

public class MVVMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMvvmBinding activityMvvmBinding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        setTitle("MVVM-Demo");

        LoginModel loginModel = new LoginModel();
        loginModel.setUserName("");
        loginModel.setPassWord("");
        loginModel.setUserPhoto("http://i.dimg.cc/6f/65/e5/0a/35/f4/97/64/4f/93/d1/0d/7a/f5/f9/10.jpg");
        activityMvvmBinding.setLoginModel(loginModel);

        LoginViewModel loginViewModel = new LoginViewModel(this, loginModel);
        activityMvvmBinding.setLoginViewModel(loginViewModel);
    }

}