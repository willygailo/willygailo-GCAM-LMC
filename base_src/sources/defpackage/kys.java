package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kys implements kiv {
    public final int a;
    private final Status b;

    public kys(Status status, int i) {
        this.b = status;
        this.a = i;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.b;
    }
}
