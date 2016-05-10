package com.epicodus.myjournal.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.epicodus.myjournal.R;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    public static final String TAG = MainActivity.class.getSimpleName();
    @Bind(R.id.viewEntriesButton) Button mViewEntriesButton;
    @Bind(R.id.newEntryButton)
    Button mNewEntryButton;
    @Bind(R.id.imageView) ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Picasso.with(context).load(R.drawable.background).into(mImageView);
        ButterKnife.bind(this);

        mNewEntryButton.setOnClickListener(this);
        mViewEntriesButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mNewEntryButton) {
            Intent intent = new Intent(MainActivity.this, NewEntryActivity.class);
            startActivity(intent);
        }

        if (v == mViewEntriesButton) {
            Intent intent = new Intent(MainActivity.this, ViewEntriesActivity.class);
            startActivity(intent);
        }
    }

}
