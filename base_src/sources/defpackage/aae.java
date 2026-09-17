package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class aae {
    public aae() {
    }

    public aae(Context context, AttributeSet attributeSet) {
    }

    public aae(byte[] bArr) {
    }

    public static Object s(Object obj) {
        w(obj, "Argument must not be null");
        return obj;
    }

    public static void t(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void u(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
    }

    public static void v(Collection collection) {
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
    }

    public static void w(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public void a(aah aahVar) {
    }

    public void b() {
    }

    public void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw null;
    }

    public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(View view) {
        return false;
    }

    public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
    }

    public void j(CoordinatorLayout coordinatorLayout, View view) {
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean l(View view) {
        return false;
    }

    public void m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
    }

    public void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        iArr[0] = iArr[0] + i2;
        iArr[1] = iArr[1] + i3;
    }

    public void o(View view, Parcelable parcelable) {
    }

    public Parcelable p(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public boolean r(View view, Rect rect) {
        return false;
    }
}
