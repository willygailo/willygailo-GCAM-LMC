package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class kdt {
    public final kdx b;

    protected kdt(kdx kdxVar) {
        this.b = kdxVar;
    }

    private static String a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        return obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    protected static String l(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strA = a(obj);
        String strA2 = a(obj2);
        String strA3 = a(obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strA)) {
            sb.append(str2);
            sb.append(strA);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strA2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strA2);
        }
        if (!TextUtils.isEmpty(strA3)) {
            sb.append(str3);
            sb.append(strA3);
        }
        return sb.toString();
    }

    public static final void x() {
    }

    protected final Context d() {
        return this.b.a;
    }

    protected final kdo e() {
        return this.b.a();
    }

    protected final kds f() {
        return this.b.b();
    }

    protected final ken g() {
        return this.b.c;
    }

    protected final ker h() {
        kdx kdxVar = this.b;
        kdx.f(kdxVar.e);
        return kdxVar.e;
    }

    protected final kfa i() {
        return this.b.d();
    }

    protected final kff j() {
        kdx kdxVar = this.b;
        kdx.f(kdxVar.f);
        return kdxVar.f;
    }

    protected final kfn k() {
        return this.b.e();
    }

    public final void m(String str, Object obj) {
        w(3, str, obj, null, null);
    }

    public final void n(String str) {
        w(6, str, null, null, null);
    }

    public final void o(String str, Object obj) {
        w(6, str, obj, null, null);
    }

    public final void p(String str, Object obj, Object obj2) {
        w(6, str, obj, obj2, null);
    }

    public final void q(String str) {
        w(2, str, null, null, null);
    }

    public final void r(String str, Object obj) {
        w(2, str, obj, null, null);
    }

    public final void s(String str, Object obj, Object obj2) {
        w(2, str, obj, obj2, null);
    }

    public final void t(String str) {
        w(5, str, null, null, null);
    }

    public final void u(String str, Object obj) {
        w(5, str, obj, null, null);
    }

    public final void v(String str, Object obj, Object obj2) {
        w(5, str, obj, obj2, null);
    }

    public final void w(int i, String str, Object obj, Object obj2, Object obj3) {
        kfa kfaVar = this.b.d;
        if (kfaVar == null) {
            String str2 = (String) keu.b.a();
            if (Log.isLoggable(str2, i)) {
                Log.println(i, str2, l(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String str3 = (String) keu.b.a();
        if (Log.isLoggable(str3, i)) {
            Log.println(i, str3, kfa.l(str, obj, obj2, obj3));
        }
        if (i >= 5) {
            kfaVar.c(i, str, obj, obj2, obj3);
        }
    }

    protected final void y() {
    }
}
