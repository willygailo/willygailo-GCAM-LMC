package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class fkj extends iag {
    public final fvv a;
    private final Resources e;

    public fkj(Resources resources, fvv fvvVar, ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.e = resources;
        this.a = fvvVar;
    }

    @Override // defpackage.iag
    protected final iaf c() {
        iaw iawVarA = iax.a();
        iawVarA.b = this.e.getString(R.string.longexposure_suggestion_text);
        iawVarA.c = this.e.getDrawable(R.drawable.ic_night_suggestion, null);
        iawVarA.d = new Runnable() { // from class: fki
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.b(jrl.LONG_EXPOSURE);
            }
        };
        iawVarA.d(2000L);
        iax iaxVarA = iawVarA.a();
        iae iaeVarA = iaf.a();
        iaeVarA.a = iaxVarA;
        iaeVarA.c(1);
        iaeVarA.d(5);
        iaeVarA.b(jrl.LONG_EXPOSURE);
        iaeVarA.e();
        return iaeVarA.a();
    }
}
