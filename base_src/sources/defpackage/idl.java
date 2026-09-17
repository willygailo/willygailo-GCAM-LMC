package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class idl {
    private String a;
    private ope b;
    private ope c;

    public final idm a() {
        ope opeVar;
        ope opeVar2;
        String str = this.a;
        if (str != null && (opeVar = this.b) != null && (opeVar2 = this.c) != null) {
            return new idm(str, opeVar, opeVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" packageName");
        }
        if (this.b == null) {
            sb.append(" photoActivityNames");
        }
        if (this.c == null) {
            sb.append(" videoActivityNames");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null packageName");
        }
        this.a = str;
    }

    public final void c(ope opeVar) {
        if (opeVar == null) {
            throw new NullPointerException("Null photoActivityNames");
        }
        this.b = opeVar;
    }

    public final void d(ope opeVar) {
        if (opeVar == null) {
            throw new NullPointerException("Null videoActivityNames");
        }
        this.c = opeVar;
    }
}
