package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        // 说明
        // 由RectF(float left, float top, float right, float bottom)得到一个矩形，
        // 此虚拟矩形内切绘制一个椭圆（如果长和宽相等，则为圆）
        // startAngle -  开始角度（以时钟3点的方向为0°，逆时针为正方向）
        // sweepAngle -  扫过角度（以时钟3点的方向为0°，逆时针为正方向）
        // 以矩形的中心为圆心，以时钟3点的方向为0°，逆时针为正方向

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0xFFA4C739);
        RectF rectF = new RectF(320, 200, 720, 450);

        // 扇形
        canvas.drawArc(rectF, -110, 90, true, paint);

        // 弧形
        canvas.drawArc(rectF, 20, 140, false, paint);

        // 不封口弧形
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        canvas.drawArc(rectF, 180, 60, false, paint);
    }
}
