package com.example.profilertest1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr, 0);
    }

    int[] colors = {Color.RED, Color.BLACK, Color.CYAN, Color.BLUE};
    int index = 0;
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(colors[index]);
        Log.d("aaa", String.valueOf(index));

        index = (++index >= colors.length) ? 0 : index;
        postInvalidateDelayed(1000);
    }
}

