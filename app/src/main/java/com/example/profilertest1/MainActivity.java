package com.example.profilertest1;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxbinding3.widget.RxPopupMenu;

import io.reactivex.functions.Consumer;
import kotlin.Unit;

public class MainActivity extends AppCompatActivity {
    CustomView customView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customView = findViewById(R.id.custom);
        textView = findViewById(R.id.tv1);

        RxView.clicks(textView).subscribe(new Consumer<Unit>() {
            @Override
            public void accept(Unit unit) throws Exception {
                PopupMenuUtil.PopupMenu(textView);
            }
        });

    }

    public void onObservable(View view) {


    }
}
