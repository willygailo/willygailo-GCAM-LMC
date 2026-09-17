package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class anr implements ajt {
    final /* synthetic */ Context a;

    public anr(Context context) {
        this.a = context;
    }

    @Override // defpackage.ajt
    public final aju a(ajs ajsVar) {
        ajr ajrVarA = ajs.a(this.a);
        ajrVarA.b = ajsVar.b;
        ajrVarA.c = ajsVar.c;
        ajrVarA.d = true;
        return new akc().a(ajrVarA.a());
    }
}
