package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class nlp {
    public final nmf a;
    public final List b;

    public nlp() {
    }

    public nlp(nmf nmfVar, List list) {
        this.a = nmfVar;
        this.b = list;
    }

    static nli a() {
        return new nli();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nlp) {
            nlp nlpVar = (nlp) obj;
            if (this.a.equals(nlpVar.a) && this.b.equals(nlpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 43 + String.valueOf(strValueOf2).length());
        sb.append("TextAnnotationResult{text=");
        sb.append(strValueOf);
        sb.append(", textWordBoxes=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
