package com.getmorph.com.custommath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.getmorph.com.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int sum = MyMath.Plus(5,10);

        Toast.makeText(getApplicationContext(),sum+"",Toast.LENGTH_SHORT);
    }
}
