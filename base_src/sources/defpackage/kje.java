package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kje extends kja {
    public final kkr b;

    public kje(kkr kkrVar, kvm kvmVar) {
        super(4, kvmVar);
        this.b = kkrVar;
    }

    @Override // defpackage.kiz
    public final boolean a(kkc kkcVar) {
        return ((kla) kkcVar.e.get(this.b)) != null;
    }

    @Override // defpackage.kiz
    public final khk[] b(kkc kkcVar) {
        return null;
    }

    @Override // defpackage.kja
    public final void c(kkc kkcVar) {
        kla klaVar = (kla) kkcVar.e.remove(this.b);
        if (klaVar != null) {
            klm klmVar = klaVar.b;
            klmVar.a.b.a(kkcVar.b, this.a);
            klaVar.a.a.a();
            return;
        }
        kvp kvpVar = this.a.a;
        synchronized (kvpVar.a) {
            if (kvpVar.b) {
                return;
            }
            kvpVar.b = true;
            kvpVar.d = false;
            kvpVar.f.d(kvpVar);
        }
    }

    @Override // defpackage.kja, defpackage.kjf
    public final /* bridge */ /* synthetic */ void g(kjt kjtVar, boolean z) {
    }
}
