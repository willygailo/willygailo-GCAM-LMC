package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Trace;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class akf {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }

    public static TextView c(Context context) {
        TextView textView = new TextView(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dialog_horizontal_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dialog_vertical_padding);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        return textView;
    }

    public static TextView d(int i, Context context, Runnable runnable) {
        String string = context.getResources().getString(i);
        String string2 = context.getResources().getString(R.string.learn_more);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" ");
        sb.append(string2);
        String string3 = sb.toString();
        SpannableString spannableString = new SpannableString(string3);
        int length = string3.length();
        int length2 = string2.length();
        spannableString.setSpan(new cwg(runnable), length - length2, string3.length(), 33);
        TextView textViewC = c(context);
        textViewC.setText(spannableString);
        textViewC.setMovementMethod(LinkMovementMethod.getInstance());
        return textViewC;
    }

    public static void e(Context context, Uri uri) {
        context.startActivity(new Intent("android.intent.action.VIEW", uri));
    }

    public static int f(cxs cxsVar, int i, int i2, boolean z) {
        int i3 = cxsVar.c;
        if (i3 > i2 && z) {
            return 4;
        }
        if (i3 != 0) {
            return i3 % (i + 1) == 0 ? 3 : 5;
        }
        int i4 = cxsVar.b;
        return (i4 == 0 || i4 % (i + 1) != 0) ? 5 : 3;
    }
}
