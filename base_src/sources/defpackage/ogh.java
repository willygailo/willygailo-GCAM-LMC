package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ogh {
    private final xf a;
    public boolean b = false;

    public ogh(xf xfVar) {
        this.a = xfVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (ogh oghVar = this; oghVar != null; oghVar = null) {
            for (int i = 0; i < oghVar.a.j; i++) {
                sb.append(this.a.i(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
