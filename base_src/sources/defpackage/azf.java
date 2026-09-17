package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class azf extends IOException {
    private static final long serialVersionUID = 1;

    public azf(String str, int i) {
        this(str, i, null);
    }

    public azf(String str, int i, Throwable th) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append(str);
        sb.append(", status code: ");
        sb.append(i);
        super(sb.toString(), th);
    }
}
