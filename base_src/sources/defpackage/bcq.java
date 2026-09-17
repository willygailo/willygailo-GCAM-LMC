package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class bcq implements bab {
    final /* synthetic */ bff a;
    final /* synthetic */ bcr b;

    public bcq(bcr bcrVar, bff bffVar) {
        this.b = bcrVar;
        this.a = bffVar;
    }

    @Override // defpackage.bab
    public final void b(Object obj) {
        if (this.b.f(this.a)) {
            bcr bcrVar = this.b;
            bff bffVar = this.a;
            bbr bbrVar = bcrVar.a.o;
            if (obj != null && bbrVar.c(bffVar.c.g())) {
                bcrVar.c = obj;
                bcrVar.b.b();
            } else {
                bbg bbgVar = bcrVar.b;
                azp azpVar = bffVar.a;
                bac bacVar = bffVar.c;
                bbgVar.e(azpVar, obj, bacVar, bacVar.g(), bcrVar.d);
            }
        }
    }

    @Override // defpackage.bab
    public final void e(Exception exc) {
        if (this.b.f(this.a)) {
            bcr bcrVar = this.b;
            bff bffVar = this.a;
            bbg bbgVar = bcrVar.b;
            bbe bbeVar = bcrVar.d;
            bac bacVar = bffVar.c;
            bbgVar.d(bbeVar, exc, bacVar, bacVar.g());
        }
    }
}
