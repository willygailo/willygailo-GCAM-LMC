package defpackage;

import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: loaded from: classes.dex */
public final class egs implements ejy {
    private final oom a;

    public egs(oom oomVar) {
        this.a = oomVar;
    }

    @Override // defpackage.ejy
    public final void a(float[] fArr, long j) {
        oom oomVar = this.a;
        int i = ((orr) oomVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ejy) oomVar.get(i2)).a(fArr, j);
        }
    }

    @Override // defpackage.ejy
    public final void b(int i, int i2) {
        oom oomVar = this.a;
        int i3 = ((orr) oomVar).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((ejy) oomVar.get(i4)).b(i, i2);
        }
    }

    @Override // defpackage.ejy
    public final void c(Texture texture, ejx ejxVar) {
        oom oomVar = this.a;
        int i = ((orr) oomVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ejy) oomVar.get(i2)).c(texture, ejxVar);
        }
    }

    @Override // defpackage.ejy
    public final void d() {
        oom oomVar = this.a;
        int i = ((orr) oomVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ejy) oomVar.get(i2)).d();
        }
    }

    @Override // defpackage.ejy
    public final void e(egy egyVar) {
        oom oomVar = this.a;
        int i = ((orr) oomVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ejy) oomVar.get(i2)).e(egyVar);
        }
    }
}
