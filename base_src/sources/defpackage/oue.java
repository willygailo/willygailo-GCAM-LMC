package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oue {
    public final ovr a;

    protected oue(ovr ovrVar) {
        this.a = ovrVar;
    }

    public static void e(String str, ovq ovqVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date(TimeUnit.NANOSECONDS.toMillis(ovqVar.e()))));
        sb.append(": logging error [");
        ous ousVarF = ovqVar.f();
        if (ousVarF != ous.a) {
            sb.append(ousVarF.b());
            sb.append('.');
            sb.append(ousVarF.d());
            sb.append(':');
            sb.append(ousVarF.a());
        }
        sb.append("]: ");
        sb.append(str);
        System.err.println(sb);
        System.err.flush();
    }

    public abstract ova a(Level level);

    public final ova b() {
        return a(Level.SEVERE);
    }

    public final ova c() {
        return a(Level.WARNING);
    }

    protected final String d() {
        return this.a.a();
    }

    protected final boolean f(Level level) {
        return this.a.d(level);
    }
}
