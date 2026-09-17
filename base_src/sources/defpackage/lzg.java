package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class lzg implements pys {
    private final /* synthetic */ int a;

    public lzg(int i) {
        this.a = i;
    }

    public static mcu a() {
        return new mcu();
    }

    public static ClearcutMetricSnapshotTransmitter b() {
        return new ClearcutMetricSnapshotTransmitter();
    }

    public static pfg c() {
        pff pffVar = pff.INSTANCE;
        qmd.ae(pffVar);
        return pffVar;
    }

    public static mip d() {
        return new mip();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                lzk lzkVar = lzj.a;
                qmd.ae(lzkVar);
                return lzkVar;
            case 1:
                return lzi.a();
            case 2:
                ExecutorService executorServiceBL = mip.bL("MediaFS-IO", 2);
                qmd.ae(executorServiceBL);
                return executorServiceBL;
            case 3:
                return mip.bP("MediaFS", 2);
            case 4:
                return a();
            case 5:
                return new mdi();
            case 6:
                throw null;
            case 7:
                return new muz();
            case 8:
                return new mvq();
            case 9:
                return true;
            case 10:
                throw null;
            case 11:
                return new ohh();
            case 12:
                kfr kfrVar = new kfr(GoogleSignInOptions.f);
                kfrVar.a.add(GoogleSignInOptions.b);
                return kfrVar.a();
            case 13:
                return new nrm();
            case 14:
                return Integer.valueOf(Runtime.getRuntime().availableProcessors());
            case 15:
                return new plk();
            default:
                throw null;
        }
    }
}
