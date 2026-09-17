package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fz {
    static void a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void b(TextView textView, int i) {
        ew.b(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void c(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, null);
    }

    public static void d(View view, ajo ajoVar) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, ajoVar);
    }

    public static StringBuilder e() {
        return new StringBuilder();
    }

    public static void f(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }
}
