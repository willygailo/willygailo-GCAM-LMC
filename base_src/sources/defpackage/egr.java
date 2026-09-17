package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class egr extends iag {
    public final fvv a;
    private final Resources e;

    public egr(Resources resources, fvv fvvVar, ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.e = resources;
        this.a = fvvVar;
    }

    @Override // defpackage.iag
    protected final iaf c() {
        iaw iawVarA = iax.a();
        iawVarA.b = this.e.getString(R.string.imax_suggestion_text);
        iawVarA.c = this.e.getDrawable(R.drawable.quantum_gm_ic_vrpano_white_24, null);
        iawVarA.d = new Runnable() { // from class: egq
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(jrl.IMAX);
            }
        };
        iawVarA.d(7000L);
        iax iaxVarA = iawVarA.a();
        iae iaeVarA = iaf.a();
        iaeVarA.a = iaxVarA;
        iaeVarA.c(1);
        iaeVarA.d(5);
        iaeVarA.b(jrl.IMAX);
        iaeVarA.e();
        return iaeVarA.a();
    }
}
