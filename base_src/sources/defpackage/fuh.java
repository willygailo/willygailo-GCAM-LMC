package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
public final class fuh implements ebn, ebo, eby {
    public final lie b;
    public final /* synthetic */ fui f;
    public boolean c = false;
    private final pih g = pih.f();
    final pih d = pih.f();
    final pih e = pih.f();
    public final pih a = pih.f();

    public fuh(fui fuiVar, lie lieVar) {
        this.f = fuiVar;
        this.b = lieVar;
    }

    @Override // defpackage.ebn
    public final void a(edd eddVar, int i, long j, lzv lzvVar) {
        synchronized (this.f) {
            this.c = true;
        }
        mad madVarC = this.f.a.c(j);
        if (madVarC == null) {
            this.a.o(oih.a);
            return;
        }
        fud fudVar = this.f.c;
        new fue(fudVar.a, this.d, this.e, this.g);
        this.d.o(madVarC);
        this.a.e(pgb.h(this.g, eto.f, pgr.INSTANCE));
    }

    @Override // defpackage.eby
    public final void b(iin iinVar, dzx dzxVar) {
    }

    @Override // defpackage.eby
    public final void c(edd eddVar, ebr ebrVar) {
        this.a.o(oih.a);
    }

    @Override // defpackage.ebo
    public final void r(edd eddVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        this.e.o(bitmap.copy(Bitmap.Config.ARGB_8888, false));
    }

    @Override // defpackage.eby
    public final void s(edd eddVar) {
        this.a.o(oih.a);
    }
}
