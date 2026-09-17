package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qvg extends qvm {
    public final qvh c;
    public qvh d;

    public qvg(qvh qvhVar) {
        super(null);
        this.c = qvhVar;
    }

    @Override // defpackage.qvm
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        qvh qvhVar = (qvh) obj;
        qvhVar.getClass();
        qvh qvhVar2 = obj2 == null ? this.c : this.d;
        if (qvhVar2 != null && qvhVar.c.c(this, qvhVar2) && obj2 == null) {
            qvh qvhVar3 = this.c;
            qvh qvhVar4 = this.d;
            qvhVar4.getClass();
            qvhVar3.o(qvhVar4);
        }
    }
}
