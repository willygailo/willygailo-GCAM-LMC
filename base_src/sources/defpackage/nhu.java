package defpackage;

import android.content.ClipData;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class nhu {
    public static final ClipData a = ClipData.newIntent("", new Intent());

    public static boolean a(int i, int i2) {
        return (i & i2) == i2;
    }
}
