package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class aws {
    private static final axo a = new axo("CamAgntFact");
    private static final String b = axq.a();
    private static awr c;
    private static awr d;
    private static int e;
    private static int f;

    public static synchronized awr a(Context context) {
        if (c() == 2) {
            if (c == null) {
                c = new avo();
                e = 1;
            } else {
                e++;
            }
            return c;
        }
        if (d == null) {
            d = new aur(context);
            f = 1;
        } else {
            f++;
        }
        return d;
    }

    public static synchronized void b() {
        awr awrVar;
        if (c() == 2) {
            int i = e - 1;
            e = i;
            if (i == 0 && (awrVar = c) != null) {
                awrVar.g(true);
                axk axkVar = ((avo) awrVar).f;
                synchronized (axkVar.b) {
                    axkVar.b = true;
                }
                synchronized (axkVar.a) {
                    axkVar.a.notifyAll();
                }
                ((avo) awrVar).e.b();
                c = null;
            }
        } else {
            int i2 = f - 1;
            f = i2;
            if (i2 == 0 && d != null) {
                d = null;
            }
        }
    }

    private static int c() {
        String str = b;
        if (str.equals("1")) {
            axp.e(a);
            return 2;
        }
        if (!str.equals("2")) {
            return 2;
        }
        axp.e(a);
        return 3;
    }
}
