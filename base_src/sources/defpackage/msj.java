package defpackage;

import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class msj {
    public final Object a;
    public oiu b;
    public Handler c;
    public boolean d;
    public Surface e;
    private final MediaFormat f;
    private final msx g;
    private mso h;

    public msj() {
        this.a = new Object();
        oix oixVar = oix.INSTANCE;
        throw null;
    }

    public msj(MediaFormat mediaFormat, msx msxVar) {
        this.a = new Object();
        this.b = oix.INSTANCE;
        this.f = mediaFormat;
        this.c = null;
        this.g = msxVar;
        this.h = new mso(msn.c);
        this.d = false;
        this.e = null;
    }

    public final /* bridge */ /* synthetic */ msc a() {
        Object objA;
        try {
            synchronized (this.a) {
                oiu oiuVar = this.b;
                try {
                    mso msoVar = this.h;
                    msoVar.a = new msk(msoVar.a, this.g);
                    objA = oiuVar.a(new msb(this.f, this.g, this.h.a, this.c, this.d, this.e));
                } catch (Throwable th) {
                    throw new IllegalStateException("Could not build track encoder", th);
                }
            }
            return (msc) objA;
        } catch (Throwable th2) {
            throw new IllegalStateException("Could not build instance.", th2);
        }
    }

    public final void b(msn msnVar) {
        this.h = new mso(msnVar);
    }
}
