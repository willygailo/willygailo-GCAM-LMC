package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dug implements pys {
    private final /* synthetic */ int a;

    public dug(int i) {
        this.a = i;
    }

    public static dei a() {
        dei deiVar = dei.RELEASE;
        qmd.ae(deiVar);
        return deiVar;
    }

    public static final dxx b() {
        return new dxx(0);
    }

    public static ByteArrayOutputStream c() {
        return new ByteArrayOutputStream();
    }

    public static final dxx d() {
        return new dxx(1);
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return dqw.b("feature.acmi.image.subject-motion");
            case 2:
                return mip.bQ("audio-frame-enc");
            case 3:
                ExecutorService executorServiceBM = mip.bM("meta-store-exec");
                qmd.ae(executorServiceBM);
                return executorServiceBM;
            case 4:
                return kdc.a != null ? fcy.i(kdc.a, true) : fcy.l();
            case 5:
                return new dwk();
            case 6:
                return new dwm();
            case 7:
                return new enl();
            case 8:
                return new dwu();
            case 9:
                return d();
            case 10:
                return b();
            case 11:
                return c();
            case 12:
                ExecutorService executorServiceBM2 = mip.bM("ois-exec");
                qmd.ae(executorServiceBM2);
                return executorServiceBM2;
            case 13:
                return new enl();
            case 14:
                enl.b();
                return new pko();
            case 15:
                return new gpo(1);
            case 16:
                return new lce(Float.valueOf(-999.0f));
            case 17:
                return new nvb((byte[]) null, (char[]) null);
            case 18:
                return new lce(false);
            case 19:
                return new lce(true);
            default:
                return new lce(false);
        }
    }
}
