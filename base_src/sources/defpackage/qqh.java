package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqh extends qlc implements qry {
    public static final qli b = new qli();
    public final long a;

    public qqh(long j) {
        super(b);
        this.a = j;
    }

    @Override // defpackage.qry
    public final /* bridge */ /* synthetic */ Object a(qln qlnVar) {
        qqi qqiVar = (qqi) qlnVar.get(qqi.b);
        String str = qqiVar == null ? "coroutine" : qqiVar.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iK = qno.k(name);
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(" @", iK);
        if (iLastIndexOf < 0) {
            iLastIndexOf = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + iLastIndexOf + 10);
        if (name == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String strSubstring = name.substring(0, iLastIndexOf);
        strSubstring.getClass();
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(str);
        sb.append('#');
        sb.append(this.a);
        String string = sb.toString();
        string.getClass();
        threadCurrentThread.setName(string);
        return name;
    }

    @Override // defpackage.qry
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = (String) obj;
        str.getClass();
        Thread.currentThread().setName(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qqh) && this.a == ((qqh) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "CoroutineId(" + this.a + ')';
    }
}
