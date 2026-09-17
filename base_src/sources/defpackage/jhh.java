package defpackage;

import android.content.Context;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jhh {
    public final lco a;
    public final hub b;
    public final elw c;
    public final Context d;
    public final Executor e;
    public final String f;
    public final String g;
    public final boolean h;
    public jgu i;
    public jgu j;
    public jgu k;
    public jgu l;
    public jgu m;
    public jgu n;
    public jgu o;
    public boolean p = false;
    public final bqg q;
    private jgu r;

    public jhh(Context context, lco lcoVar, hub hubVar, elw elwVar, Executor executor, bqg bqgVar, ddf ddfVar) {
        this.a = lcoVar;
        this.b = hubVar;
        this.c = elwVar;
        this.d = context;
        this.q = bqgVar;
        this.h = ddfVar.k(ddl.ay);
        this.f = context.getResources().getString(R.string.face_retouching_on_light);
        this.g = context.getResources().getString(R.string.face_retouching_on_strong);
        this.e = executor;
    }

    public final void a() {
        jgu jguVar = this.o;
        if (jguVar != null) {
            this.c.g(jguVar);
        }
    }

    public final void b() {
        this.c.g(this.j);
    }

    public final void c() {
        jgu jguVar = this.r;
        if (jguVar != null) {
            this.c.g(jguVar);
        }
    }

    public final void d() {
        this.c.d(this.j);
    }

    public final synchronized void e(ims imsVar, boolean z) {
        c();
        ims imsVar2 = ims.COLD;
        switch (imsVar.ordinal()) {
            case 4:
                this.c.d(this.j);
                this.r = this.j;
                return;
            case 5:
                this.c.d(this.k);
                this.r = this.k;
                return;
            case 6:
            case 7:
                if (z) {
                    this.c.d(this.l);
                    this.r = this.l;
                    return;
                } else {
                    this.c.d(this.m);
                    this.r = this.m;
                }
                break;
        }
    }
}
