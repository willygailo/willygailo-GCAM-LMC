package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class elz implements emr {
    final /* synthetic */ Context a;

    public elz(Context context) {
        this.a = context;
    }

    @Override // defpackage.emr
    public final Object a(emq emqVar) {
        try {
            return emqVar.a.cast(this.a.getSystemService(emqVar.b));
        } catch (Exception e) {
            String str = emqVar.b;
            throw new RuntimeException(str.length() != 0 ? "Unable to create or provide ".concat(str) : new String("Unable to create or provide "), e);
        }
    }
}
