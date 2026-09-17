package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class r {

    @Deprecated
    public final q a;

    @Deprecated
    public final q b;

    @Deprecated
    public r(q qVar, q qVar2) {
        if (qVar.b == qVar2.b) {
            this.a = qVar;
            this.b = qVar2;
            return;
        }
        String strValueOf = String.valueOf(qVar);
        String strValueOf2 = String.valueOf(qVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 55 + String.valueOf(strValueOf2).length());
        sb.append("Ranges must have the same number of visible decimals: ");
        sb.append(strValueOf);
        sb.append("~");
        sb.append(strValueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        String string;
        String strValueOf = String.valueOf(this.a);
        q qVar = this.b;
        if (qVar == this.a) {
            string = "";
        } else {
            String strValueOf2 = String.valueOf(qVar);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf2).length() + 1);
            sb.append("~");
            sb.append(strValueOf2);
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + String.valueOf(string).length());
        sb2.append(strValueOf);
        sb2.append(string);
        return sb2.toString();
    }
}
