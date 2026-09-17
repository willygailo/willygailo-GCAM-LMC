package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
final class oyo implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public oyo(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private Object readResolve() {
        return new oyp(this.a, this.b);
    }
}
