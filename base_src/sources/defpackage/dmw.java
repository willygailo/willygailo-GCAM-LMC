package defpackage;

import com.google.android.apps.camera.evcomp.EvCompView;

/* JADX INFO: loaded from: classes.dex */
final class dmw implements phh {
    final /* synthetic */ dna a;

    public dmw(dna dnaVar) {
        this.a = dnaVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
    }

    @Override // defpackage.phh
    public final /* synthetic */ void b(Object obj) {
        hbs hbsVar = (hbs) obj;
        if (((dme) this.a.e.fA()).equals(dme.SINGLE)) {
            this.a.k();
            return;
        }
        dna dnaVar = this.a;
        float f = hbsVar.a;
        dnaVar.m = f;
        dnaVar.a.g(f);
        dna dnaVar2 = this.a;
        float f2 = hbsVar.b;
        dnaVar2.n = f2;
        EvCompView evCompView = dnaVar2.a;
        if (((dme) ((lce) evCompView.b).d).equals(dme.SINGLE)) {
            return;
        }
        if (f2 <= 1.0f && f2 >= 0.0f) {
            evCompView.e(evCompView.i, f2);
            return;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Fraction is not illegal: ");
        sb.append(f2);
        throw new IllegalArgumentException(sb.toString());
    }
}
