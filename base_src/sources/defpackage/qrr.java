package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qrr extends qve implements qrb {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        boolean z = true;
        for (qvh qvhVarL = (qvh) k(); !qno.c(qvhVarL, this); qvhVarL = qvhVarL.l()) {
            if (qvhVarL instanceof qrk) {
                qrk qrkVar = (qrk) qvhVarL;
                if (!z) {
                    sb.append(", ");
                }
                sb.append(qrkVar);
                z = false;
            }
        }
        sb.append("]");
        String string = sb.toString();
        string.getClass();
        return string;
    }

    @Override // defpackage.qrb
    public final qrr gZ() {
        return this;
    }

    @Override // defpackage.qrb
    public final boolean ha() {
        return true;
    }

    @Override // defpackage.qvh
    public final String toString() {
        return qql.a ? c("Active") : super.toString();
    }
}
