package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class dnj {
    public final Context a;
    public final View b;
    public final int[][] c = {new int[]{R.string.top_left, R.string.top_center, R.string.top_right}, new int[]{R.string.left, R.string.center, R.string.right}, new int[]{R.string.bottom_left, R.string.bottom_center, R.string.bottom_right}};
    public long d = -1;
    public int e = -1;
    public boolean f = true;

    public dnj(Context context, View view) {
        this.a = context;
        this.b = view;
    }

    public static final int c(int i, int i2, int i3) {
        if (i2 == 0) {
            return 0;
        }
        int i4 = (i * i3) / i2;
        return i4 == i3 ? i4 - 1 : i4;
    }

    public final void a() {
        this.f = false;
    }

    public final void b() {
        this.f = true;
    }
}
