package com.justinstolpe.helloworld;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.justinstolpe.helloworld.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // call parent
        super.onCreate(savedInstanceState);

        // setup our activity
        setupActivity();
    }

    public void setupActivity() {
        // set our view
        setContentView(R.layout.activity_main);
    }
}