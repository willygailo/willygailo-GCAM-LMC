package defpackage;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class klk implements kuu {
    @Override // defpackage.kuu
    public final /* bridge */ /* synthetic */ Object a(kvk kvkVar) throws kig {
        if (((Boolean) kvkVar.c()).booleanValue()) {
            return null;
        }
        throw new kig(new Status(13, "listener already unregistered"));
    }
}
