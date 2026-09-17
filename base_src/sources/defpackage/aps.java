package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class aps {
    protected final Context a;
    public final Object b = new Object();
    public final Set c = new LinkedHashSet();
    public Object d;
    protected final aso e;

    static {
        kus.g("ConstraintTracker");
    }

    public aps(Context context, aso asoVar) {
        this.a = context.getApplicationContext();
        this.e = asoVar;
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    public final void f(apa apaVar) {
        synchronized (this.b) {
            if (this.c.remove(apaVar) && this.c.isEmpty()) {
                e();
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 == obj || (obj2 != null && obj2.equals(obj))) {
                return;
            }
            this.d = obj;
            this.e.c.execute(new apr(this, new ArrayList(this.c)));
        }
    }
}
