package com.example.nguyenlinh.android2ddrawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by nguyenlinh on 20/06/2017.
 */

public class LinesConnection extends View {
    Paint mPaint = new Paint();

    public LinesConnection(Context context) {
        super(context);
        mPaint.setColor(Color.BLACK);
    }

    public LinesConnection(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        //canvas.drawLine(0, 0, viewWidth, viewHeight, mPaint);             // cheo 1
        //canvas.drawLine(viewWidth, 0, 0, viewHeight, mPaint);             // cheo 2
        //canvas.drawLine(0, 0, viewWidth, 0, mPaint);                      // ngang tren
        canvas.drawLine(viewWidth, viewHeight, 0, viewHeight, mPaint);
        //canvas.drawLine(0, 0, 0, viewHeight, mPaint);                     // doc trai
        canvas.drawLine(viewWidth,0,viewWidth,viewHeight,mPaint);

    }
}
