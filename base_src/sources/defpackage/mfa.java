package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class mfa {
    private final Context a;
    private final Object b = new Object();
    private File c;

    public mfa(Context context) {
        this.a = context.getApplicationContext();
    }

    public final File a() {
        File file;
        synchronized (this.b) {
            if (this.c == null) {
                this.c = this.a.getDataDir();
            }
            file = this.c;
        }
        return file;
    }
}
