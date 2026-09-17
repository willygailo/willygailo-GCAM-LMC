package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lfb extends IOException {
    public lfb(int i, Throwable th) {
        StringBuilder sb = new StringBuilder("file descriptor".length() + 66);
        sb.append("Unable to create MediaMuxer with file path ");
        sb.append("file descriptor");
        sb.append(" and format ");
        sb.append(i);
        super(sb.toString(), th);
    }
}
