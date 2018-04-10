package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);

        // 实心圆
        canvas.drawCircle(320, 170, 165, paint);

        // 空心圆
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4.0f);
        canvas.drawCircle(720, 170, 165, paint);

        // 蓝色实心圆
        paint.setColor(Color.rgb(74, 144, 226));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(320, 580, 165, paint);

        // 线宽为 20 的空心圆
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(60.0f);
        canvas.drawCircle(720, 570, 165, paint);
    }
}
