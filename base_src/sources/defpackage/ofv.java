package defpackage;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
abstract class ofv implements ogi {
    private final ogi a;
    private final UUID b;
    private final String c;

    public ofv(String str, UUID uuid) {
        str.getClass();
        this.c = str;
        this.a = null;
        this.b = uuid;
    }

    public ofv(String str, ogi ogiVar) {
        str.getClass();
        this.c = str;
        this.a = ogiVar;
        this.b = ogiVar.c();
    }

    @Override // defpackage.ogi
    public final ogi a() {
        return this.a;
    }

    @Override // defpackage.ogi
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ogi
    public final UUID c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ogq.e(this);
    }

    public final String toString() {
        return ogq.d(this);
    }
}
