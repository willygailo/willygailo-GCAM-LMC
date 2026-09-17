package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ftc implements pys {
    private final qkg a;
    private final qkg b;

    public ftc(qkg qkgVar, qkg qkgVar2) {
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    @Override // defpackage.qkg
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fpp get() {
        fpr fprVar = ((ftj) this.a).get();
        fpp fppVar = ((frx) this.b).get();
        fqv fqvVar = new fqv();
        switch (fprVar) {
            case FRAMEWORK:
                return fqvVar;
            case GCA:
                return fppVar;
            default:
                String strValueOf = String.valueOf(fprVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
                sb.append("Unknown muxer type: ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
        }
    }
}
