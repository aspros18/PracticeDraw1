package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    Path mPath = new Path();
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Path path2 = new Path();

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(2.0f);

        // 画框架图
        mPath.moveTo(100, 50);
        mPath.lineTo(100, 600);
        mPath.lineTo(1000, 600);

        canvas.drawPath(mPath, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setTextSize(50);
        canvas.drawText("直方图", 500, 740, mPaint);

        // 画直方
        drawHistogram(canvas, path2);

        // 画文本
        drawHistogramTexts(canvas);
    }

    private void drawHistogram(Canvas canvas, Path pathHistogram)
    {
        int cx;
        int cy;
        int cap = 25;

        mPaint.setColor(Color.rgb(114, 185, 22));

        cx = 100 + cap;
        cy = 600 - 1;
        // Froyo
        pathHistogram.addRect(cx, cy, cx+100, 597, Path.Direction.CW);

        // GB
        cx += 100 + cap;
        pathHistogram.addRect(cx, cy, cx+100, 579, Path.Direction.CW);

        // ICS
        cx += 100 + cap;
        pathHistogram.addRect(cx, cy, cx+100, 578, Path.Direction.CW);

        // JB
        cx += 100 + cap;
        pathHistogram.addRect(cx, cy, cx+100, 390, Path.Direction.CW);

        // KitKat
        cx += 100 + cap;
        pathHistogram.addRect(cx, cy, cx+100, 260, Path.Direction.CW);

        // L
        cx += 100 + cap;
        pathHistogram.addRect(cx, cy, cx+100, 190, Path.Direction.CW);

        // M
        cx += 100 + cap;
        pathHistogram.addRect(cx, cy, cx+100, 410, Path.Direction.CW);

        pathHistogram.close();

        canvas.drawPath(pathHistogram, mPaint);
    }

    private void drawHistogramTexts(Canvas canvas)
    {
        int cx;
        int cy;
        int cap = 25;

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(28);
        mPaint.setAntiAlias(true);

        // Froyo text
        String text = "Froyo";
        float textWidth = mPaint.measureText(text);

        cx = 100 + cap;
        cy = 600 + 24;
        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);

        // GB text
        text = "GB";
        textWidth = mPaint.measureText(text);
        cx += 100 + cap;

        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);

        // ICS text
        text = "ICS";
        textWidth = mPaint.measureText(text);
        cx += 100 + cap;

        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);

        // JB text
        text = "JB";
        textWidth = mPaint.measureText(text);
        cx += 100 + cap;

        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);

        // KitKat text
        text = "KitKat";
        textWidth = mPaint.measureText(text);
        cx += 100 + cap;

        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);

        // L text
        text = "L";
        textWidth = mPaint.measureText(text);
        cx += 100 + cap;

        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);

        // M text
        text = "M";
        textWidth = mPaint.measureText(text);
        cx += 100 + cap;

        canvas.drawText(text, cx + 50 - textWidth/2, cy, mPaint);
    }
}
