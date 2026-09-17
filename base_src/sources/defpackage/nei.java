package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class nei {
    public final Context g;
    private final ojz k;
    private final ojz l;
    private final ojc m;
    public static final Object a = new Object();
    public static Context b = null;
    private static volatile nei h = null;
    public static volatile boolean c = false;
    public static volatile Exception d = null;
    public static volatile boolean e = false;
    public static volatile Exception f = null;
    private static volatile nei i = null;
    private static final ojz j = obr.au(fob.j);

    public nei(Context context) {
        ojz ojzVar = j;
        ojz ojzVarAu = obr.au(new ndq(context, 2));
        ojc ojcVarI = ojc.i(new nfv(ojzVar));
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ojzVar.getClass();
        ojzVarAu.getClass();
        this.g = applicationContext;
        this.k = obr.au(ojzVar);
        this.l = obr.au(ojzVarAu);
        this.m = ojcVarI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nei a(Context context) {
        neh nehVar;
        nei neiVar = h;
        if (neiVar == null) {
            synchronized (a) {
                neiVar = h;
                if (neiVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        Object applicationContext2 = applicationContext.getApplicationContext();
                        if (!(applicationContext2 instanceof pyo)) {
                            String strValueOf = String.valueOf(applicationContext2.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 72);
                            sb.append("Given application context does not implement GeneratedComponentManager: ");
                            sb.append(strValueOf);
                            throw new IllegalStateException(sb.toString());
                        }
                        try {
                            nehVar = (neh) neh.class.cast(((pyo) applicationContext2).a());
                            ojc ojcVarA = oih.a;
                            if (nehVar != null) {
                                ojcVarA = nehVar.a();
                            } else if (applicationContext instanceof neh) {
                                ojcVarA = ((neh) applicationContext).a();
                            }
                            nei neiVar2 = ojcVarA.g() ? (nei) ojcVarA.c() : new nei(applicationContext);
                            h = neiVar2;
                            neiVar = neiVar2;
                        } catch (ClassCastException e2) {
                            throw new IllegalStateException("Failed to get an entry point. Did you mark your interface with @SingletonEntryPoint?", e2);
                        }
                    } catch (IllegalStateException e3) {
                        nehVar = null;
                    }
                }
            }
        }
        return neiVar;
    }

    public final ngf b() {
        return (ngf) ((ojj) this.m).a;
    }

    public final phw c() {
        return (phw) this.k.a();
    }

    public final ney d() {
        return (ney) this.l.a();
    }
}
