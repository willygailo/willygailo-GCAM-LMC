package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class dmf extends ImageView {
    public final int a;
    public final int b;
    public float c;
    public float d;
    public float e;

    public dmf(Context context) {
        super(context);
        this.a = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_icon_size);
        this.b = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_knob_size);
    }

    public final void a(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.c = f;
            return;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Illegal fraction: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }
}
