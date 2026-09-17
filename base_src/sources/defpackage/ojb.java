package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ojb {
    public boolean a;
    private final String b;
    private final oja c;
    private oja d;

    public ojb(String str) {
        oja ojaVar = new oja();
        this.c = ojaVar;
        this.d = ojaVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final oja g() {
        oja ojaVar = new oja();
        this.d.c = ojaVar;
        this.d = ojaVar;
        return ojaVar;
    }

    public final void a(Object obj) {
        g().b = obj;
    }

    public final void b(String str, Object obj) {
        oja ojaVarG = g();
        ojaVarG.b = obj;
        ojaVarG.a = str;
    }

    public final void c(String str, Object obj) {
        oiz oizVar = new oiz();
        this.d.c = oizVar;
        this.d = oizVar;
        oizVar.b = obj;
        oizVar.a = str;
    }

    public final void d(String str, float f) {
        c(str, String.valueOf(f));
    }

    public final void e(String str, int i) {
        c(str, String.valueOf(i));
    }

    public final void f(String str, long j) {
        c(str, String.valueOf(j));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (oja ojaVar = this.c.c; ojaVar != null; ojaVar = ojaVar.c) {
            Object obj = ojaVar.b;
            if ((ojaVar instanceof oiz) || obj != null || !z) {
                sb.append(str);
                String str2 = ojaVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String strDeepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
