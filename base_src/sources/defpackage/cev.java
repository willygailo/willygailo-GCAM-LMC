package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cev implements lie {
    public final phv a;
    public final lar b;
    public final ljf c;
    public final cgx d;
    public final cvi e;
    public final ckh f;
    public final cfw g;
    public final cgs h;
    public final csh i;
    public final lij j;
    public final cfk k;
    public final ddf l;
    public final nvb m;

    public cev(phv phvVar, lar larVar, ljf ljfVar, cgx cgxVar, nvb nvbVar, cgs cgsVar, cvi cviVar, cfw cfwVar, ckh ckhVar, csh cshVar, lij lijVar, cfk cfkVar, ddf ddfVar, byte[] bArr, byte[] bArr2) {
        this.a = phvVar;
        this.b = larVar;
        this.c = ljfVar;
        this.d = cgxVar;
        this.m = nvbVar;
        this.h = cgsVar;
        this.e = cviVar;
        this.g = cfwVar;
        this.f = ckhVar;
        this.i = cshVar;
        this.j = lijVar;
        this.k = cfkVar;
        this.l = ddfVar;
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.d.c.b();
    }
}
