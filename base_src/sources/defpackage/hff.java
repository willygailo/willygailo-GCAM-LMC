package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class hff extends iag {
    public final fvv a;
    private final Resources e;

    public hff(Resources resources, ScheduledExecutorService scheduledExecutorService, fvv fvvVar) {
        super(scheduledExecutorService);
        this.e = resources;
        this.a = fvvVar;
    }

    @Override // defpackage.iag
    protected final iaf c() {
        iaw iawVarA = iax.a();
        iawVarA.b = this.e.getString(R.string.portrait_suggestion_text);
        iawVarA.c = this.e.getDrawable(R.drawable.quantum_gm_ic_portrait_white_24, null);
        iawVarA.d = new Runnable() { // from class: hfe
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(jrl.PORTRAIT);
            }
        };
        iawVarA.d(5000L);
        iax iaxVarA = iawVarA.a();
        iae iaeVarA = iaf.a();
        iaeVarA.a = iaxVarA;
        iaeVarA.c(2);
        iaeVarA.d(5);
        iaeVarA.b(jrl.PORTRAIT);
        iaeVarA.e();
        return iaeVarA.a();
    }
}
