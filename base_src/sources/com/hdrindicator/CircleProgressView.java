package com.hdrindicator;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class CircleProgressView extends View {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_CLIP = 1;
    private int mBackgroundColor;
    private Paint mBackgroundPaint;
    private int mDefaultWidth;
    private int mDuration;
    private int mEndAngle;
    private OnProgressChangedListener mListener;
    private float mProgress;
    private int mProgressColor;
    private Paint mProgressPaint;
    private int mProgressType;
    private int mProgressWidth;
    private RectF mRectf;
    private boolean mShowAnimation;
    private int mStartAngle;
    private float mTotalProgress;
    private ValueAnimator mValueAnimator;
    private int mViewWidth;

    public interface OnProgressChangedListener {
        void onProgressChanged(float f);
    }

    public CircleProgressView(Context context) {
        this(context, null);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressType = 0;
        initPaint();
        int iDp2px = AgcUtil.dp2px(context, 1.0f);
        this.mDefaultWidth = iDp2px;
        this.mProgressWidth = iDp2px;
        this.mProgressColor = Color.parseColor("#ffffffff");
        this.mBackgroundColor = Color.parseColor("#4dffffff");
        this.mStartAngle = -90;
        this.mEndAngle = 270;
        this.mShowAnimation = true;
        this.mDuration = 1000;
        this.mProgressPaint.setStrokeWidth(this.mProgressWidth);
        this.mProgressPaint.setColor(this.mProgressColor);
        this.mBackgroundPaint.setStrokeWidth(this.mProgressWidth);
        this.mBackgroundPaint.setColor(this.mBackgroundColor);
    }

    private void initPaint() {
        Paint paint = new Paint(1);
        this.mProgressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.mBackgroundPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
    }

    private int measureHeight(int i) {
        int size = View.MeasureSpec.getSize(i);
        switch (View.MeasureSpec.getMode(i)) {
            case Integer.MIN_VALUE:
                return this.mDefaultWidth * 2;
            case 1073741824:
                int i2 = this.mProgressWidth;
                return size < i2 ? i2 : size;
            default:
                return DisplayHelper.getScreenHeight(getContext());
        }
    }

    private int measureWidth(int i) {
        int size = View.MeasureSpec.getSize(i);
        switch (View.MeasureSpec.getMode(i)) {
            case Integer.MIN_VALUE:
                return this.mDefaultWidth * 2;
            case 1073741824:
                int i2 = this.mProgressWidth;
                return size < i2 ? i2 : size;
            default:
                return DisplayHelper.getScreenWidth(getContext());
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.mProgressWidth;
        int i2 = this.mViewWidth;
        RectF rectF = new RectF(i / 2, i / 2, i2 - (i / 2), i2 - (i / 2));
        this.mRectf = rectF;
        int i3 = this.mProgressType;
        if (i3 == 0) {
            int i4 = this.mViewWidth;
            canvas.drawCircle(i4 / 2, i4 / 2, (i4 / 2) - (this.mProgressWidth / 2), this.mBackgroundPaint);
            canvas.drawArc(this.mRectf, this.mStartAngle, (this.mProgress * 360.0f) / 100.0f, false, this.mProgressPaint);
        } else if (i3 == 1) {
            int i5 = this.mStartAngle;
            canvas.drawArc(rectF, i5, this.mEndAngle - i5, false, this.mBackgroundPaint);
            canvas.drawArc(this.mRectf, this.mStartAngle, (this.mProgress * 360.0f) / 100.0f, false, this.mProgressPaint);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(measureWidth(i), measureHeight(i2));
        this.mViewWidth = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    public void setBackgroundCircleColor(int i) {
        this.mBackgroundColor = i;
        this.mBackgroundPaint.setColor(i);
        invalidate();
    }

    public void setCap(Paint.Cap cap) {
        this.mProgressPaint.setStrokeCap(cap);
        this.mBackgroundPaint.setStrokeCap(cap);
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    public void setEndAngle(int i) {
        this.mEndAngle = i;
    }

    public void setOnProgressChangedListener(OnProgressChangedListener onProgressChangedListener) {
        this.mListener = onProgressChangedListener;
    }

    public void setProgress(float f, boolean z) {
        this.mShowAnimation = z;
        if (this.mProgressType == 1) {
            f = (int) (((this.mEndAngle - this.mStartAngle) * 100) / 360.0f);
            this.mTotalProgress = f;
        } else {
            this.mTotalProgress = 100.0f;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mValueAnimator.cancel();
        }
        if (!this.mShowAnimation) {
            this.mProgress = f;
            invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f);
        this.mValueAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.mDuration);
        this.mValueAnimator.setInterpolator(new LinearInterpolator());
        this.mValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.hdrindicator.CircleProgressView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                CircleProgressView.this.mProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (CircleProgressView.this.mListener != null) {
                    CircleProgressView.this.mListener.onProgressChanged((CircleProgressView.this.mProgress * 100.0f) / CircleProgressView.this.mTotalProgress);
                }
                CircleProgressView.this.invalidate();
            }
        });
        this.mValueAnimator.start();
    }

    public void setProgressColor(int i) {
        this.mProgressColor = i;
        this.mProgressPaint.setColor(i);
    }

    public void setProgressType(int i) {
        this.mProgressType = i;
    }

    public void setProgressWidth(int i) {
        this.mProgressWidth = i;
        this.mBackgroundPaint.setStrokeWidth(i);
        this.mProgressPaint.setStrokeWidth(i);
    }

    public void setStartAngle(int i) {
        this.mStartAngle = i;
    }
}
