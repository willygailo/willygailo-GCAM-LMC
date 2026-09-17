package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jgp {
    public final jrl a;
    public View b;
    public boolean c;

    public jgp(jrl jrlVar) {
        this.a = jrlVar;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String str = true != this.c ? "" : "⊙";
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + str.length());
        sb.append(strValueOf);
        sb.append(str);
        return sb.toString();
    }
}
