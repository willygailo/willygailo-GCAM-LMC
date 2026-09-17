package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public class kig extends Exception {

    @Deprecated
    public final Status a;

    public kig(Status status) {
        int i = status.g;
        String str = status.h;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(str.length() + 13);
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.a = status;
    }

    public final int a() {
        return this.a.g;
    }
}
