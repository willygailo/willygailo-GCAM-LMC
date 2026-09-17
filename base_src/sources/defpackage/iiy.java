package defpackage;

import android.os.Environment;
import com.google.android.apps.camera.stats.Instrumentation;
import java.io.File;
import java.text.NumberFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class iiy implements pys {
    private final /* synthetic */ int a;

    public iiy(int i) {
        this.a = i;
    }

    public static ika a() {
        return new ika();
    }

    public static final ldt b() {
        return new ldt();
    }

    public static final mip c() {
        return new mip();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return new qiz();
            case 1:
                return new Instrumentation();
            case 2:
                return new mcu();
            case 3:
                return a();
            case 4:
                return new ikp();
            case 5:
                return ikt.a();
            case 6:
                return new iki(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "Raw"));
            case 7:
                throw null;
            case 8:
                throw null;
            case 9:
                ExecutorService executorServiceBM = mip.bM("CheetahExecutor");
                qmd.ae(executorServiceBM);
                return executorServiceBM;
            case 10:
                return new lap();
            case 11:
                ExecutorService executorServiceBM2 = mip.bM("trk-deinit");
                qmd.ae(executorServiceBM2);
                return executorServiceBM2;
            case 12:
                ExecutorService executorServiceBM3 = mip.bM("trk-analysis");
                qmd.ae(executorServiceBM3);
                return executorServiceBM3;
            case 13:
                ExecutorService executorServiceBM4 = mip.bM("trk-img");
                qmd.ae(executorServiceBM4);
                return executorServiceBM4;
            case 14:
                ExecutorService executorServiceBM5 = mip.bM("trk-roi");
                qmd.ae(executorServiceBM5);
                return executorServiceBM5;
            case 15:
                return new ivf();
            case 16:
                return new lce(false);
            case 17:
                return new AtomicReference();
            case 18:
                return pih.f();
            case 19:
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMinimumFractionDigits(1);
                numberFormat.setMaximumFractionDigits(1);
                qmd.ae(numberFormat);
                return numberFormat;
            default:
                return new jug();
        }
    }
}
