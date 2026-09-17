package com.hdrindicator;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes2.dex */
public class HDRProgress extends CircleProgressView {
    static Handler handler = new Handler(Looper.getMainLooper());
    private static HDRProgress instance;

    public HDRProgress(Context context) {
        super(context);
        init(context);
    }

    public HDRProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public HDRProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        instance = this;
        setProgress(0.0f, false);
        setProgressColor(getColorAccent(context));
        setBackgroundCircleColor(0);
        setProgressWidth(AgcUtil.dp2px(context, 6.0f));
    }

    public static void setClickEnabled(boolean z) {
        HDRProgress hDRProgress = instance;
        if (hDRProgress != null) {
            hDRProgress.setEnabled(z);
        }
    }

    public static void updateProgress(final float f) {
        handler.post(new Runnable() { // from class: com.hdrindicator.HDRProgress.1
            @Override // java.lang.Runnable
            public void run() {
                if (HDRProgress.instance != null) {
                    HDRProgress.instance.setProgress((int) (f * 100.0f), false);
                }
            }
        });
    }

    public int getColorAccent(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }
}
