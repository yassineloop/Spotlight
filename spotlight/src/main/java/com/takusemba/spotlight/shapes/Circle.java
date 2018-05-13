package com.takusemba.spotlight.shapes;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.View;

public class Circle extends Shape {
    private float mRadius;

    public Circle(View view) {
        this(view, (float) (Math.sqrt(Math.pow(view.getWidth(), 2) + Math.pow(view.getHeight(), 2)) / 2.0));
    }

    public Circle(View view, float radius) {
        setPoint(view);
        this.mRadius = radius;
    }

    public Circle(PointF point, float radius) {
        this.point = point;
        this.mRadius = radius;
    }

    @Override
    public void draw(Canvas canvas, float animValue, Paint paint) {
        canvas.drawCircle(point.x, point.y, animValue * mRadius, paint);
    }
}
