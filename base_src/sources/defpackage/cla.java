package defpackage;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class cla implements cle {
    public static final ouj a = ouj.h("com/google/android/apps/camera/camcorder/file/MediaFileOutputVideo");
    public final hsg b;
    public FileOutputStream c;
    public final pih d = pih.f();
    private final hsc e;
    private final Executor f;
    private final ljf g;
    private int h;

    public cla(hsg hsgVar, final hsc hscVar, Executor executor, ljf ljfVar) {
        this.b = hsgVar;
        this.e = hscVar;
        this.f = executor;
        this.g = ljfVar;
        executor.execute(ljfVar.c("MFOV#Init", new Runnable() { // from class: ckz
            @Override // java.lang.Runnable
            public final void run() {
                cla claVar = this.a;
                try {
                    claVar.c = hscVar.a.e();
                    claVar.d.o(claVar.c.getFD());
                } catch (IOException e) {
                    ((oug) ((oug) ((oug) cla.a.b()).h(e)).G((char) 465)).o("Can't open MediaFile.");
                }
            }
        }));
        this.h = 1;
        UUID.randomUUID().toString();
    }

    @Override // defpackage.cle
    public final long a() {
        return this.e.a.a();
    }

    @Override // defpackage.cle
    public final /* synthetic */ hss b() {
        return adg.d(this);
    }

    @Override // defpackage.cle
    public final ojc c() {
        return ojc.i(this.e);
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final synchronized void close() {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            return;
        }
        this.h = 3;
        this.f.execute(new cky(this, 0));
    }

    @Override // defpackage.cle
    public final ojc d() {
        return ojc.i(this.b);
    }

    @Override // defpackage.cle
    public final pht e() {
        return this.d;
    }

    @Override // defpackage.cle
    public final FileDescriptor f() {
        try {
            try {
                this.g.e("MFOV#getFileDescriptor");
                FileDescriptor fileDescriptor = (FileDescriptor) this.d.get();
                this.g.f();
                return fileDescriptor;
            } catch (Throwable th) {
                this.g.f();
                throw th;
            }
        } catch (InterruptedException | ExecutionException e) {
            ((oug) ((oug) ((oug) a.b()).h(e)).G(459)).o("Can't get file descriptor.");
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.cle
    public final synchronized void g() {
        int i = this.h;
        if (i == 0) {
            throw null;
        }
        if (i != 1) {
            return;
        }
        this.h = 2;
        this.f.execute(new cky(this, 1));
    }

    @Override // defpackage.cle
    public final /* synthetic */ boolean h() {
        return a() > 10000;
    }

    @Override // defpackage.cle
    public final void i() {
    }
}
