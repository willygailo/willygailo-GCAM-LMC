package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ksp implements klb {
    public boolean a = true;
    final /* synthetic */ kkt b;

    protected ksp() {
    }

    public ksp(kkt kktVar) {
        this.b = kktVar;
    }

    @Override // defpackage.klb
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ktk ktkVar = (ktk) obj;
        if (this.a) {
            kvm kvmVar = (kvm) obj2;
            ksm ksmVar = new ksm(kvmVar);
            try {
                kkr kkrVar = this.b.b;
                if (kkrVar != null) {
                    synchronized (ktkVar.a) {
                        ksx ksxVar = (ksx) ktkVar.a.remove(kkrVar);
                        if (ksxVar != null) {
                            ksxVar.c();
                            ((kti) ktkVar.u()).e(ktm.a(ksxVar, ksmVar));
                        }
                    }
                }
            } catch (RuntimeException e) {
                kvmVar.c(e);
            }
        }
    }
}
