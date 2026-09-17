package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
final class fav extends gfx {
    final /* synthetic */ fbb a;

    public fav(fbb fbbVar) {
        this.a = fbbVar;
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void A() {
        this.a.u.a();
        this.a.E.f();
        this.a.d.g().n();
        if (((Boolean) this.a.D.a().fA()).booleanValue()) {
            this.a.w.q();
        }
        this.a.w.r();
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void B() {
        this.a.e.execute(new Runnable() { // from class: fau
            @Override // java.lang.Runnable
            public final void run() {
                fav favVar = this.a;
                favVar.a.d.g().l();
                favVar.a.h.b(R.raw.camera_shutter);
            }
        });
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void D(float f) {
        F(f, -1L);
    }

    @Override // defpackage.gfx, defpackage.gft
    public final void F(float f, long j) {
        if (((Boolean) this.a.D.a().fA()).booleanValue()) {
            this.a.E.b(f);
            this.a.w.E((int) (100.0f * f), j, false);
            if (f == 1.0f) {
                this.a.F.a(j);
                this.a.w.q();
            }
        } else {
            this.a.u.f((int) (100.0f * f));
            if (f == 0.0f) {
                this.a.d.g().m();
            } else if (f == 1.0f) {
                this.a.d.g().n();
            }
        }
        if (f == 1.0f) {
            this.a.h.b(R.raw.camera_shutter);
        }
    }
}
