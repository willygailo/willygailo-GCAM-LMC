package defpackage;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public final class jpe implements jpd {
    private final String a;

    public jpe(String str) {
        this.a = str;
    }

    @Override // defpackage.jpd
    public final void a(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Trace.beginSection(sb.toString());
    }

    @Override // defpackage.jpd
    public final void b() {
        Trace.endSection();
    }
}
