package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kyy implements kiv {
    public final List a;
    private final Status b;

    public kyy(Status status, List list) {
        this.b = status;
        this.a = list;
    }

    @Override // defpackage.kiv
    public final Status a() {
        return this.b;
    }
}
