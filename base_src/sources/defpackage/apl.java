package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class apl extends aph {
    public apl(Context context, aso asoVar) {
        super(apw.a(context, asoVar).c);
    }

    @Override // defpackage.aph
    public final boolean b(aqt aqtVar) {
        int i = aqtVar.i.i;
        return i == 3 || i == 6;
    }

    @Override // defpackage.aph
    public final /* bridge */ /* synthetic */ boolean c(Object obj) {
        apb apbVar = (apb) obj;
        return !apbVar.a || apbVar.c;
    }
}
