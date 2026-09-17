package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cql {
    public final /* synthetic */ cqq a;

    public final void a(cuv cuvVar, boolean z) {
        cqj cqjVar;
        cqq cqqVar = this.a;
        cuv cuvVar2 = cuv.STANDARD;
        switch (cuvVar) {
            case STANDARD:
                cqjVar = cqj.DEFAULT;
                break;
            case LOCKED:
                cqjVar = cqj.LOCKED;
                break;
            case ACTIVE:
                cqjVar = cqj.ACTIVE;
                break;
            case CINEMATIC:
                cqjVar = cqj.CINEMATIC;
                break;
            default:
                String strValueOf = String.valueOf(cuvVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
                sb.append("Unsupported option: ");
                sb.append(strValueOf);
                throw new UnsupportedOperationException(sb.toString());
        }
        cqqVar.d(cqjVar, z);
    }
}
