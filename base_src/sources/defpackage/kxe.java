package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class kxe implements kiv {
    public final kwg a;
    private final Status b;

    public kxe(Status status, kwg kwgVar) {
        this.b = status;
        this.a = kwgVar;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.b;
    }
}
