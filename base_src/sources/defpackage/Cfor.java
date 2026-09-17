package defpackage;

/* JADX INFO: renamed from: for, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
final class Cfor implements phh {
    final /* synthetic */ fot a;
    final /* synthetic */ fos b;
    final /* synthetic */ fou c;

    public Cfor(fou fouVar, fot fotVar, fos fosVar) {
        this.c = fouVar;
        this.a = fotVar;
        this.b = fosVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        if (this.a.o.b().isCancelled()) {
            fou.k(this.a, th, this.b);
            this.a.k.w(th);
        } else {
            this.c.d(this.a, th, this.b);
            this.a.k.C(jmq.a, th);
        }
        this.c.c(this.a);
        this.a.q = oih.a;
    }

    @Override // defpackage.phh
    public final void b(Object obj) {
        String str;
        frf frfVarA = this.a.d.a();
        if (frfVarA.a == 0) {
            ((oug) ((oug) fou.a.b()).G(1792)).r("No key video frames in long shot. Shot=%s", this.a.a);
            boolean zK = this.c.l.k(ddr.w);
            fot fotVar = this.a;
            boolean z = fotVar.p && zK && fotVar.q.g();
            if (!z) {
                fou fouVar = this.c;
                fot fotVar2 = this.a;
                fouVar.d(fotVar2, new IllegalStateException(String.format("No video frames in long shot. Shot=%s", fotVar2.a)), this.b);
            }
            this.c.c(this.a);
            if (z) {
                if (this.a.q.g()) {
                    this.c.t.a(((fmp) this.a.q.c()).a);
                    str = "No video frames available. Trigger backup shot.";
                } else {
                    ((oug) ((oug) fou.a.c()).G((char) 1794)).o("Didn't take second shot since UI resources are missing");
                    str = "No video frames available. Unable to trigger backup shot.";
                }
                this.a.k.w(new Throwable(str));
            } else {
                fot fotVar3 = this.a;
                hsp hspVar = fotVar3.a;
                fotVar3.k.C(jmq.a, new IllegalStateException(String.format("No video frames in long shot. Shot=%s", this.a.a)));
            }
        } else {
            this.c.h(this.a, this.b, frfVarA.d - frfVarA.c);
        }
        this.a.q = oih.a;
    }
}
