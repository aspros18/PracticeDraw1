package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    Path mPath = new Path();
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形

        mPaint.setColor(Color.RED);

        mPath.arcTo(400, 300, 550, 450, 150, 220, true);
        mPath.arcTo(550, 300, 700, 450, 180, 220, false);
        mPath.lineTo(550, 600);

        mPath.close();

        canvas.drawPath(mPath, mPaint);
    }
}
