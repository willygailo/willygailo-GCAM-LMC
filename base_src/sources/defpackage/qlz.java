package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qlz extends qls {
    public qlz(qlh qlhVar) {
        super(qlhVar);
        if (qlhVar != null && qlhVar.getContext() != qlo.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // defpackage.qlh
    public final qln getContext() {
        return qlo.a;
    }
}
