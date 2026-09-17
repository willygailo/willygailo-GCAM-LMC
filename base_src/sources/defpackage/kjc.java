package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kjc extends kja {
    public final kla b;

    public kjc(kla klaVar, kvm kvmVar, byte[] bArr) {
        super(3, kvmVar);
        this.b = klaVar;
    }

    @Override // defpackage.kiz
    public final boolean a(kkc kkcVar) {
        return true;
    }

    @Override // defpackage.kiz
    public final khk[] b(kkc kkcVar) {
        return null;
    }

    @Override // defpackage.kja
    public final void c(kkc kkcVar) {
        this.b.a.b(kkcVar.b, this.a);
        kkr kkrVarA = this.b.a.a();
        if (kkrVarA != null) {
            kkcVar.e.put(kkrVarA, this.b);
        }
    }

    @Override // defpackage.kja, defpackage.kjf
    public final /* bridge */ /* synthetic */ void g(kjt kjtVar, boolean z) {
    }
}
