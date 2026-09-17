package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class ivs implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ pih b;

    public ivs(Context context, pih pihVar) {
        this.a = context;
        this.b = pihVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.b.o(ayu.g(new File(this.a.getCacheDir(), "indicatorDiskCache"), 5000000L));
        } catch (IOException e) {
            this.b.a(e);
        }
    }
}
