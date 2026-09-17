package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class mej extends ContentObserver {
    final /* synthetic */ mek a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mej(mek mekVar, Handler handler) {
        super(handler);
        this.a = mekVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.b();
    }
}
