package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class lrc {
    public static final Object a = new Object();
    public boolean b;
    public boolean c;
    public boolean d;
    private final lpz f;
    private final lpr g;
    private final lsn h;
    private final lqz i;
    private final lqt j;
    private final lap k;
    private final boolean l;
    private final ljf m;
    private final lis n;
    private Set o;
    public int e = 1;
    private final lrb p = new lrb(this);

    public lrc(loy loyVar, ltv ltvVar, lom lomVar, lqt lqtVar, lsn lsnVar, lqz lqzVar, lpr lprVar, lpz lpzVar, lap lapVar, int i, ljf ljfVar, lis lisVar) {
        char c = 1;
        this.h = lsnVar;
        this.i = lqzVar;
        this.j = lqtVar;
        this.f = lpzVar;
        this.g = lprVar;
        this.k = lapVar;
        final int i2 = 0;
        this.l = i > 1;
        this.m = ljfVar;
        this.o = new HashSet();
        this.n = lisVar.a("RequestQueue");
        final char c2 = c == true ? 1 : 0;
        Runnable runnable = new Runnable(this) { // from class: lra
            public final /* synthetic */ lrc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = true;
                switch (c2) {
                    case 0:
                        lrc lrcVar = this.a;
                        synchronized (lrc.a) {
                            lrcVar.c = true;
                            break;
                        }
                        lrcVar.b();
                        return;
                    case 1:
                        lrc lrcVar2 = this.a;
                        synchronized (lrc.a) {
                            lrcVar2.b = true;
                            break;
                        }
                        lrcVar2.b();
                        return;
                    default:
                        lrc lrcVar3 = this.a;
                        synchronized (lrc.a) {
                            if (lrcVar3.d) {
                                z = false;
                            } else {
                                lrcVar3.b = true;
                            }
                            break;
                        }
                        if (z) {
                            lrcVar3.b();
                            return;
                        }
                        return;
                }
            }
        };
        Runnable runnable2 = new Runnable(this) { // from class: lra
            public final /* synthetic */ lrc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = true;
                switch (i2) {
                    case 0:
                        lrc lrcVar = this.a;
                        synchronized (lrc.a) {
                            lrcVar.c = true;
                            break;
                        }
                        lrcVar.b();
                        return;
                    case 1:
                        lrc lrcVar2 = this.a;
                        synchronized (lrc.a) {
                            lrcVar2.b = true;
                            break;
                        }
                        lrcVar2.b();
                        return;
                    default:
                        lrc lrcVar3 = this.a;
                        synchronized (lrc.a) {
                            if (lrcVar3.d) {
                                z = false;
                            } else {
                                lrcVar3.b = true;
                            }
                            break;
                        }
                        if (z) {
                            lrcVar3.b();
                            return;
                        }
                        return;
                }
            }
        };
        lapVar.c(loyVar.a(runnable));
        ltvVar.b(runnable);
        lomVar.b(runnable);
        lqtVar.c(runnable2);
        final int i3 = 2;
        Runnable runnable3 = new Runnable(this) { // from class: lra
            public final /* synthetic */ lrc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z = true;
                switch (i3) {
                    case 0:
                        lrc lrcVar = this.a;
                        synchronized (lrc.a) {
                            lrcVar.c = true;
                            break;
                        }
                        lrcVar.b();
                        return;
                    case 1:
                        lrc lrcVar2 = this.a;
                        synchronized (lrc.a) {
                            lrcVar2.b = true;
                            break;
                        }
                        lrcVar2.b();
                        return;
                    default:
                        lrc lrcVar3 = this.a;
                        synchronized (lrc.a) {
                            if (lrcVar3.d) {
                                z = false;
                            } else {
                                lrcVar3.b = true;
                            }
                            break;
                        }
                        if (z) {
                            lrcVar3.b();
                            return;
                        }
                        return;
                }
            }
        };
        obr.aR(lqzVar.e == null, "Session closed listener was set multiple times!");
        lqzVar.e = runnable3;
    }

    private final void c(Set set) {
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                lqh lqhVar = (lqh) it.next();
                lis lisVar = this.n;
                String strValueOf = String.valueOf(lqhVar);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17);
                sb.append("Failed to submit ");
                sb.append(strValueOf);
                lisVar.h(sb.toString());
                lqhVar.f();
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void a() {
        int i;
        ltc ltcVar;
        boolean z;
        lsi lsiVar;
        synchronized (this.f) {
            Object obj = a;
            synchronized (obj) {
                if (!this.k.a() && ((this.l || this.f.d(this.g)) && (i = this.e) != 2 && i != 3)) {
                    this.e = 2;
                    this.n.b("RequestQueue startCamera");
                    this.m.e("RequestQueue startCamera");
                    final lsn lsnVar = this.h;
                    if (lsnVar.e.a() || !((lsiVar = lsnVar.j) == null || lsiVar.f())) {
                        ltcVar = lsnVar.h;
                    } else {
                        final lap lapVar = new lap();
                        lsnVar.e.c(new lie() { // from class: lsj
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                lsnVar.i.post(new lsl(lapVar, 0));
                            }
                        });
                        lsi lsiVar2 = new lsi(lsnVar.a.a, lsnVar.a(lsnVar.h, lsnVar.i), lsnVar.c, lsnVar.i, lsnVar.f, lsnVar.g);
                        lkb lkbVar = new lkb(oom.j(oom.n(lsiVar2, lsnVar.k)));
                        lapVar.c(lsiVar2);
                        lsiVar2.a.c(lapVar);
                        final Runnable runnable = new Runnable() { // from class: lsm
                            @Override // java.lang.Runnable
                            public final void run() {
                                lsi lsiVar3;
                                lsn lsnVar2 = lsnVar;
                                if (!lsnVar2.d.g() || (lsiVar3 = lsnVar2.j) == null) {
                                    return;
                                }
                                lsiVar3.e(lsnVar2.a(lsnVar2.h, lsnVar2.i));
                            }
                        };
                        lsnVar.d.b(runnable);
                        lapVar.c(new lie() { // from class: lsk
                            @Override // defpackage.lie, java.lang.AutoCloseable
                            public final void close() {
                                lsn lsnVar2 = lsnVar;
                                Runnable runnable2 = runnable;
                                ltv ltvVar = lsnVar2.d;
                                synchronized (ltvVar.b) {
                                    ltvVar.b.remove(runnable2);
                                }
                            }
                        });
                        lis lisVar = lsnVar.g;
                        String strValueOf = String.valueOf(lsnVar.a.a.a);
                        lisVar.f(strValueOf.length() != 0 ? "Starting Camera ".concat(strValueOf) : new String("Starting Camera "));
                        lsnVar.b.c(lsnVar.a.a, lkbVar);
                        lsnVar.j = lsiVar2;
                        ltcVar = lsnVar.h;
                    }
                    lrb lrbVar = this.p;
                    synchronized (ltcVar) {
                        if (!ltcVar.d) {
                            lrbVar.getClass();
                            ltcVar.e = lrbVar;
                            ltd ltdVar = ltcVar.a;
                            if (ltdVar != null) {
                                lrbVar.a();
                            }
                        }
                    }
                    synchronized (obj) {
                        z = true;
                        if (this.d) {
                            z = false;
                        } else {
                            this.b = true;
                            this.c = true;
                        }
                    }
                    if (z) {
                        b();
                    }
                    this.m.f();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d8  */
    public final void b() {
        boolean z;
        boolean z2;
        Set setA;
        lqx lqxVarA;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        boolean z6 = true;
        while (true) {
            Object obj = a;
            synchronized (obj) {
                if (z5) {
                    if (this.d) {
                        return;
                    }
                }
                z = this.b;
                z2 = this.c;
                if (!z6) {
                    this.d = false;
                    return;
                }
                if (!z && !z2) {
                    this.d = false;
                    return;
                }
                lqz lqzVar = this.i;
                lxn lxnVarB = lqzVar.b.b(1L);
                setA = null;
                if (lxnVarB == null) {
                    lqxVarA = null;
                } else if (lqzVar.a.a()) {
                    lxnVarB.close();
                    lqxVarA = null;
                } else {
                    lap lapVar = lqzVar.a;
                    lqxVarA = lqzVar.f.a(lxnVarB, lqzVar.e, lqzVar.c, ((lrh) lqzVar.d).get());
                    lapVar.c(lqxVarA);
                }
                if (lqxVarA == null) {
                    this.d = false;
                    return;
                } else {
                    this.b = false;
                    this.c = false;
                    this.d = true;
                }
            }
            if (z) {
                try {
                    lpd lpdVarB = lqxVarA.b().b();
                    if (lpdVarB.a().isEmpty()) {
                        z4 = false;
                    } else {
                        synchronized (obj) {
                            try {
                                if (!this.o.equals(lpdVarB.a())) {
                                    lis lisVar = this.n;
                                    String strValueOf = String.valueOf(lpdVarB);
                                    String strValueOf2 = String.valueOf(lpdVarB.a());
                                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 31 + String.valueOf(strValueOf2).length());
                                    sb.append("Set repeating request to ");
                                    sb.append(strValueOf);
                                    sb.append(" with ");
                                    sb.append(strValueOf2);
                                    lisVar.f(sb.toString());
                                    this.o = ope.F(lpdVarB.a());
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        lqxVarA.i(lpdVarB);
                        z4 = true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z3 = false;
                    try {
                        lqxVarA.close();
                    } catch (Throwable th3) {
                    }
                    try {
                        throw th;
                    } catch (llv e) {
                        e = e;
                        this.n.i("Unable to invoke setRepeating, requestProcessor is unavailable", e);
                        c(setA);
                        z6 = z3;
                        z5 = false;
                    }
                }
            } else {
                z4 = false;
            }
            if (z2) {
                try {
                    setA = this.j.a();
                    while (setA != null) {
                        lpc lpcVarB = lqxVarA.b();
                        Iterator it = setA.iterator();
                        while (it.hasNext()) {
                            lpcVarB.f(((lqh) it.next()).c);
                        }
                        lpd lpdVarB2 = lpcVarB.b();
                        if (lpdVarB2.a().isEmpty()) {
                            c(setA);
                        } else {
                            lis lisVar2 = this.n;
                            String strValueOf3 = String.valueOf(lpdVarB2);
                            String strValueOf4 = String.valueOf(lpdVarB2.a());
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf3).length() + 17 + String.valueOf(strValueOf4).length());
                            sb2.append("Submitting ");
                            sb2.append(strValueOf3);
                            sb2.append(" with ");
                            sb2.append(strValueOf4);
                            lisVar2.f(sb2.toString());
                            lqxVarA.j(lpdVarB2, setA);
                            z4 = true;
                        }
                        setA = this.j.a();
                    }
                } catch (Throwable th4) {
                    z3 = z4;
                    th = th4;
                    lqxVarA.close();
                    throw th;
                }
            }
            if (z4) {
                a();
            }
            try {
                lqxVarA.close();
                z6 = z4;
            } catch (llv e2) {
                z3 = z4;
                e = e2;
                this.n.i("Unable to invoke setRepeating, requestProcessor is unavailable", e);
                c(setA);
                z6 = z3;
            }
            z5 = false;
        }
    }
}
