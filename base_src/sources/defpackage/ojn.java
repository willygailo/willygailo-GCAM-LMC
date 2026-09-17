package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class ojn implements ojp {
    final /* synthetic */ String a;

    public ojn(String str) {
        this.a = str;
    }

    @Override // defpackage.ojp
    public final /* bridge */ /* synthetic */ Iterator a(ojq ojqVar, CharSequence charSequence) {
        return new ojm(this, ojqVar, charSequence);
    }
}
