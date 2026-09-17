package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class dgc extends lim {
    @Override // defpackage.lim
    public final lin a(String str) {
        return new lin(str, this);
    }

    @Override // defpackage.lim
    public final boolean b(String str, int i) {
        if (dgd.a != 0) {
            return dgd.a <= i;
        }
        if (i == 2) {
            return dgd.a(str, 2);
        }
        return "userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE) || dgd.a(str, i);
    }
}
