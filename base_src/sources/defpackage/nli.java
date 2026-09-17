package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class nli {
    public nmf a;
    private List b;

    public final nlp a() {
        List list;
        nmf nmfVar = this.a;
        if (nmfVar != null && (list = this.b) != null) {
            return new nlp(nmfVar, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" textWordBoxes");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null textWordBoxes");
        }
        this.b = list;
    }
}
