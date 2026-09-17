package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ipj extends dcc {
    private static final oor e = oor.p("/m/01b2w5", Float.valueOf(0.5f));
    public final fvv c;
    public boolean d;
    private final Resources f;

    public ipj(Resources resources, fvv fvvVar) {
        this.f = resources;
        this.c = fvvVar;
    }

    @Override // defpackage.dcc
    protected final dcb c() {
        dca dcaVarA = dcb.a();
        iaw iawVarA = iax.a();
        iawVarA.b = this.f.getString(R.string.timelapse_suggestion_text);
        iawVarA.c = this.f.getDrawable(R.drawable.quantum_gm_ic_fast_forward_vd_theme_24, null);
        final int i = 1;
        iawVarA.d = new Runnable(this) { // from class: ipi
            public final /* synthetic */ ipj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.a.d = true;
                        break;
                    default:
                        this.a.c.b(jrl.TIME_LAPSE);
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.g = new Runnable(this) { // from class: ipi
            public final /* synthetic */ ipj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.a.d = true;
                        break;
                    default:
                        this.a.c.b(jrl.TIME_LAPSE);
                        break;
                }
            }
        };
        iawVarA.d(7000L);
        dcaVarA.b = iawVarA.a();
        return dcaVarA.a();
    }

    @Override // defpackage.dcc
    protected final boolean e(Map map) {
        if (this.d) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Float) e.getOrDefault((String) entry.getKey(), Float.valueOf(Float.MAX_VALUE))).floatValue() <= ((Float) entry.getValue()).floatValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dbr
    public final Map fM() {
        return e;
    }
}
