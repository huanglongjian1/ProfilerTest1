package com.example.profilertest1;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import com.jakewharton.rxbinding3.widget.RxPopupMenu;

import io.reactivex.functions.Consumer;

public class PopupMenuUtil {
    public static void PopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenuInflater().inflate(R.menu.popupmenu, popupMenu.getMenu());
        popupMenu.show();
        RxPopupMenu.itemClicks(popupMenu).subscribe(new Consumer<MenuItem>() {
            @Override
            public void accept(MenuItem menuItem) throws Exception {
                switch (menuItem.getItemId()) {
                    case R.id.add:
                        Log.e("add", "add");
                }

            }
        });
    }
}
