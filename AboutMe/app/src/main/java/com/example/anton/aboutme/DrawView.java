package com.example.anton.aboutme;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Anton on 20.08.2016.
 */
public class DrawView extends View {
    Paint paint=new Paint();
    public DrawView(Context context) {
        super(context);
        paint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawLine(0,0,20,20,paint);
        canvas.drawLine(20,0,0,20,paint);
    }
}
