package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class akb implements aju {
    public final Object a = new Object();
    public aka b;
    public boolean c;
    private final Context d;
    private final String e;
    private final ajq f;
    private final boolean g;

    public akb(Context context, String str, ajq ajqVar, boolean z) {
        this.d = context;
        this.e = str;
        this.f = ajqVar;
        this.g = z;
    }

    private final aka b() {
        aka akaVar;
        synchronized (this.a) {
            if (this.b == null) {
                ajy[] ajyVarArr = new ajy[1];
                String str = this.e;
                if (str == null || !this.g) {
                    this.b = new aka(this.d, str, ajyVarArr, this.f);
                } else {
                    this.b = new aka(this.d, new File(this.d.getNoBackupFilesDir(), this.e).getAbsolutePath(), ajyVarArr, this.f);
                }
                this.b.setWriteAheadLoggingEnabled(this.c);
            }
            akaVar = this.b;
        }
        return akaVar;
    }

    @Override // defpackage.aju
    public final ajy a() {
        return b().c();
    }

    @Override // defpackage.aju, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }
}
