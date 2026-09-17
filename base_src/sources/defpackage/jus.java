package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class jus {
    private final jut a;

    private jus(jut jutVar) {
        jutVar.getClass();
        this.a = jutVar;
    }

    public static jus a(View view) {
        return b(new juu(view));
    }

    public static jus b(jut jutVar) {
        return new jus(jutVar);
    }

    public final Object c(int i) {
        View viewA = this.a.a(i);
        viewA.getClass();
        return viewA;
    }
}
