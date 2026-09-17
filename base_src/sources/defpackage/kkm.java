package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class kkm {
    private static kkm b;
    public final Object a;

    private kkm() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new ocm(this, null));
    }

    public kkm(Activity activity) {
        this.a = activity;
    }

    public kkm(Object obj) {
        this.a = obj;
    }

    public static kkm a() {
        if (b == null) {
            b = new kkm();
        }
        return b;
    }

    public static kkm b() {
        return new kkm((Object) null);
    }

    public static kkm c(int i, int i2, int i3, int i4, boolean z) {
        return new kkm(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static kkm d(int i, int i2, int i3) {
        return new kkm(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
