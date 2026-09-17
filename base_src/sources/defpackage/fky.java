package defpackage;

import android.content.res.Resources;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class fky implements iat {
    iax a;
    public final fvv b;
    public final huf c;
    public iay d;
    public Date e = null;
    public boolean f;
    private final Resources g;
    private final jhd h;
    private lie i;

    public fky(Resources resources, fvv fvvVar, huf hufVar, jhd jhdVar) {
        this.g = resources;
        this.b = fvvVar;
        this.c = hufVar;
        this.h = jhdVar;
    }

    @Override // defpackage.iat
    public final void a() {
        this.h.b(null, null);
        lie lieVar = this.i;
        lieVar.getClass();
        lieVar.close();
        this.i = null;
        c();
        this.d = null;
    }

    @Override // defpackage.iat
    public final void b(iay iayVar) {
        this.d = iayVar;
        iaw iawVarA = iax.a();
        iawVarA.b = this.g.getString(R.string.longexposure_suggestion_text);
        iawVarA.c = this.g.getDrawable(R.drawable.ic_night_suggestion, null);
        final int i = 1;
        iawVarA.d = new Runnable(this) { // from class: fkx
            public final /* synthetic */ fky a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        fky fkyVar = this.a;
                        fkyVar.f = true;
                        fkyVar.c();
                        break;
                    default:
                        this.a.b.b(jrl.LONG_EXPOSURE);
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.g = new Runnable(this) { // from class: fkx
            public final /* synthetic */ fky a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        fky fkyVar = this.a;
                        fkyVar.f = true;
                        fkyVar.c();
                        break;
                    default:
                        this.a.b.b(jrl.LONG_EXPOSURE);
                        break;
                }
            }
        };
        this.a = iawVarA.a();
        this.h.b(new lij(this) { // from class: fkw
            public final /* synthetic */ fky a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i) {
                    case 0:
                        fky fkyVar = this.a;
                        if (!((String) obj).equals("on")) {
                            fkyVar.c();
                        }
                        break;
                    default:
                        fky fkyVar2 = this.a;
                        jgu jguVar = (jgu) obj;
                        iay iayVar2 = fkyVar2.d;
                        Date date = fkyVar2.e;
                        if (!fkyVar2.f && date != null && jguVar.r() != null && !jguVar.r().before(date) && ((String) fkyVar2.c.c(htu.j)).equals("on") && iayVar2 != null) {
                            iayVar2.b(fkyVar2.a);
                            break;
                        }
                        break;
                }
            }
        }, pgr.INSTANCE);
        this.i = this.c.a(htu.j).a(new lij(this) { // from class: fkw
            public final /* synthetic */ fky a;

            {
                this.a = this;
            }

            @Override // defpackage.lij
            public final void fB(Object obj) {
                switch (i2) {
                    case 0:
                        fky fkyVar = this.a;
                        if (!((String) obj).equals("on")) {
                            fkyVar.c();
                        }
                        break;
                    default:
                        fky fkyVar2 = this.a;
                        jgu jguVar = (jgu) obj;
                        iay iayVar2 = fkyVar2.d;
                        Date date = fkyVar2.e;
                        if (!fkyVar2.f && date != null && jguVar.r() != null && !jguVar.r().before(date) && ((String) fkyVar2.c.c(htu.j)).equals("on") && iayVar2 != null) {
                            iayVar2.b(fkyVar2.a);
                            break;
                        }
                        break;
                }
            }
        }, pgr.INSTANCE);
    }

    public final void c() {
        iay iayVar = this.d;
        if (iayVar != null) {
            iayVar.a();
        }
    }

    @Override // defpackage.iat
    public final void u() {
        this.e = null;
        c();
    }

    @Override // defpackage.iat
    public final void v() {
        this.e = new Date();
    }
}
