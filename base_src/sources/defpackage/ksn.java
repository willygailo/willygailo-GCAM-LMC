package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class ksn extends kso {
    private final ksj a;

    public ksn(kvm kvmVar, ksj ksjVar) {
        super(kvmVar);
        this.a = ksjVar;
    }

    @Override // defpackage.kso, defpackage.kth
    public final void c() {
        ksj ksjVar = this.a;
        kij kijVar = ksjVar.c;
        ksp kspVar = ksjVar.a;
        kkt kktVar = ksjVar.b;
        kspVar.a = false;
        kkr kkrVar = kktVar.b;
        if (kkrVar != null) {
            kijVar.h(kkrVar);
        }
    }
}
