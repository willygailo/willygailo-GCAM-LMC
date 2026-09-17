package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lej extends IOException {
    public lej(lek lekVar, Throwable th) {
        String strValueOf = String.valueOf(lekVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 37);
        sb.append("fail to create media codec with mime ");
        sb.append(strValueOf);
        super(sb.toString(), th);
    }
}
