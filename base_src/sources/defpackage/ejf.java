package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ejf extends dcc {
    private static final oor e;
    public final fvv c;
    public boolean d;
    private final Resources f;
    private final cbl g;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        e = oor.s("/m/04h4w", fValueOf, "/m/06cnp", fValueOf, "/m/0brn2d", fValueOf, "/m/01bqvp", fValueOf);
    }

    public ejf(Resources resources, fvv fvvVar, cbl cblVar) {
        this.f = resources;
        this.c = fvvVar;
        this.g = cblVar;
    }

    @Override // defpackage.dcc
    protected final dcb c() {
        dca dcaVarA = dcb.a();
        iaw iawVarA = iax.a();
        iawVarA.b = this.f.getString(R.string.imax_suggestion_text);
        iawVarA.c = this.f.getDrawable(R.drawable.quantum_gm_ic_vrpano_white_24, null);
        final int i = 1;
        iawVarA.d = new Runnable(this) { // from class: eje
            public final /* synthetic */ ejf a;

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
                        this.a.c.b(jrl.IMAX);
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.g = new Runnable(this) { // from class: eje
            public final /* synthetic */ ejf a;

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
                        this.a.c.b(jrl.IMAX);
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
        boolean z;
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (((Float) e.getOrDefault((String) entry.getKey(), Float.valueOf(Float.MAX_VALUE))).floatValue() <= ((Float) entry.getValue()).floatValue()) {
                z = true;
                break;
            }
        }
        if (z) {
            this.g.f(jrl.IMAX);
        }
        return !this.d && z;
    }

    @Override // defpackage.dbr
    public final Map fM() {
        return e;
    }
}
