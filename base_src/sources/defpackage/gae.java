package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class gae {
    final hkn a;
    float b;
    float c;

    public gae(hkn hknVar) {
        this.a = hknVar;
        float f = hknVar.b;
        float f2 = hknVar.f;
        float f3 = -1000.0f;
        if ((f2 <= 0.0f || !hknVar.n) && (f2 >= 1.0f || !hknVar.o)) {
            f3 = 0.0f;
        }
        float f4 = f + f3;
        this.b = f4;
        this.c = f4;
    }
}
