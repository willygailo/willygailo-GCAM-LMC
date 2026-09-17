package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class mgd implements mgk {
    private final Context a;
    private final String b;

    public mgd(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.mgk
    public final void b() {
        ((ClipboardManager) this.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("simple text", this.b));
        String strConcat = this.b;
        if (strConcat.length() > 50) {
            strConcat = String.valueOf(strConcat.substring(0, 50)).concat("...");
        }
        String.valueOf(this.a.getString(R.string.text_copied_to_clipboard)).length();
        String.valueOf(strConcat).length();
    }
}
