package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes2.dex */
final class ndy extends ContentObserver {
    final /* synthetic */ ndz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndy(ndz ndzVar) {
        super(null);
        this.a = ndzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.c();
    }
}
