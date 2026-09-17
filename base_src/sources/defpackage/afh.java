package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class afh {
    public int b;
    public final Context c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = true;
    public boolean g = false;
    public afb h;

    public afh(Context context) {
        this.c = context.getApplicationContext();
    }

    public static final String j(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    protected void c() {
    }

    @Deprecated
    public void e(String str, PrintWriter printWriter) {
        throw null;
    }

    public void f() {
        throw null;
    }

    public void g(Object obj) {
        afb afbVar = this.h;
        if (afbVar != null) {
            if (afa.b(2)) {
                String str = "onLoadComplete: " + afbVar;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                afbVar.g(obj);
            } else {
                afbVar.h(obj);
            }
        }
    }

    public void h() {
    }

    public void i() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
