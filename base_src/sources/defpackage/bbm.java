package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bbm implements Runnable, Comparable, bbg, bmk {
    private int A;
    private int B;
    public aya d;
    public azp e;
    public ayc f;
    public int g;
    public int h;
    public bbr i;
    public azt j;
    public bbj k;
    public int l;
    public boolean m;
    public azp n;
    public volatile bbh o;
    public volatile boolean p;
    public int q;
    public final bbw r;
    private final fc t;
    private Thread u;
    private azp v;
    private Object w;
    private bac x;
    private volatile boolean y;
    private boolean z;
    public final bbi a = new bbi();
    private final List s = new ArrayList();
    private final fuo C = fuo.d();
    public final bbk b = new bbk();
    public final bbl c = new bbl();

    public bbm(bbw bbwVar, fc fcVar) {
        this.r = bbwVar;
        this.t = fcVar;
    }

    private final int g() {
        return this.f.ordinal();
    }

    private final bbh h() {
        int i = this.A;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                return new bcm(this.a, this);
            case 2:
                bbi bbiVar = this.a;
                return new bbd(bbiVar.e(), bbiVar, this);
            case 3:
                return new bcr(this.a, this);
            case 4:
            default:
                String strE = vk.e(i);
                StringBuilder sb = new StringBuilder(strE.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(strE);
                throw new IllegalStateException(sb.toString());
            case 5:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:192:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01c1 A[LOOP:1: B:26:0x0076->B:83:0x01c1, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
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
    private final void i() {
        boolean z;
        bcl bclVarD;
        List list;
        int i;
        int i2;
        int i3;
        List list2;
        int i4;
        bcl bclVarB;
        azx azxVar;
        int iB;
        azw azwVarJ;
        boolean z2;
        bcl bclVar;
        azp bbeVar;
        try {
            bac bacVar = this.x;
            Object obj = this.w;
            int i5 = this.B;
            if (obj == null) {
                bacVar.d();
                bclVarD = null;
            } else {
                try {
                    blz.b();
                    bcj bcjVarB = this.a.b(obj.getClass());
                    azt aztVar = this.j;
                    int i6 = 4;
                    boolean z3 = i5 == 4 || this.a.q;
                    Boolean bool = (Boolean) aztVar.b(bhe.d);
                    if (bool == null) {
                        aztVar = new azt();
                        aztVar.c(this.j);
                        aztVar.d(bhe.d, Boolean.valueOf(z3));
                    } else if (bool.booleanValue() && !z3) {
                        z3 = false;
                        aztVar = new azt();
                        aztVar.c(this.j);
                        aztVar.d(bhe.d, Boolean.valueOf(z3));
                    }
                    bae baeVarA = this.d.c.a(obj);
                    try {
                        int i7 = this.g;
                        int i8 = this.h;
                        List list3 = (List) bcjVarB.a.a();
                        aae.s(list3);
                        try {
                            int size = bcjVarB.b.size();
                            int i9 = 0;
                            bcl bclVarA = null;
                            while (true) {
                                if (i9 < size) {
                                    bbn bbnVar = (bbn) bcjVarB.b.get(i9);
                                    try {
                                        List list4 = (List) bbnVar.b.a();
                                        aae.s(list4);
                                        i2 = i9;
                                        i3 = size;
                                        list2 = list3;
                                        i4 = i8;
                                        try {
                                            bcl bclVarA2 = bbnVar.a(baeVarA, i7, i8, aztVar, list4);
                                            try {
                                                try {
                                                    bbnVar.b.b(list4);
                                                    Class<?> cls = bclVarA2.c().getClass();
                                                    if (i5 != i6) {
                                                        azx azxVarA = this.a.a(cls);
                                                        azxVar = azxVarA;
                                                        bclVarB = azxVarA.b(this.d, bclVarA2, this.g, this.h);
                                                    } else {
                                                        bclVarB = bclVarA2;
                                                        azxVar = null;
                                                    }
                                                    if (!bclVarA2.equals(bclVarB)) {
                                                        bclVarA2.e();
                                                    }
                                                    if (this.a.c.c.f.j(bclVarB.b()) != null) {
                                                        azwVarJ = this.a.c.c.f.j(bclVarB.b());
                                                        if (azwVarJ == null) {
                                                            throw new ayg(bclVarB.b());
                                                        }
                                                        iB = azwVarJ.b();
                                                        list = list2;
                                                        try {
                                                            list.add(e);
                                                            if (bclVarA != null) {
                                                                i9 = i2 + 1;
                                                                list3 = list;
                                                                size = i3;
                                                                i8 = i4;
                                                                i5 = i;
                                                                i6 = 4;
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            bcjVarB.a.b(list);
                                                            throw th;
                                                        }
                                                    } else {
                                                        iB = 3;
                                                        azwVarJ = null;
                                                    }
                                                    bbi bbiVar = this.a;
                                                    azp azpVar = this.n;
                                                    List listF = bbiVar.f();
                                                    int size2 = listF.size();
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 < size2) {
                                                            int i11 = size2;
                                                            if (((bff) listF.get(i10)).a.equals(azpVar)) {
                                                                z2 = true;
                                                            } else {
                                                                i10++;
                                                                size2 = i11;
                                                            }
                                                        } else {
                                                            z2 = false;
                                                        }
                                                    }
                                                    if (!this.i.d(!z2, i5, iB)) {
                                                        i = i5;
                                                        bclVar = bclVarB;
                                                    } else {
                                                        if (azwVarJ == null) {
                                                            throw new ayg(bclVarB.c().getClass());
                                                        }
                                                        switch (iB - 1) {
                                                            case 0:
                                                                bbeVar = new bbe(this.n, this.e);
                                                                i = i5;
                                                                break;
                                                            default:
                                                                i = i5;
                                                                try {
                                                                    bbeVar = new bcn(this.a.c(), this.n, this.e, this.g, this.h, azxVar, cls, this.j);
                                                                } catch (bcg e) {
                                                                    e = e;
                                                                    list = list2;
                                                                    list.add(e);
                                                                }
                                                                break;
                                                        }
                                                        bck bckVarD = bck.d(bclVarB);
                                                        bbk bbkVar = this.b;
                                                        bbkVar.a = bbeVar;
                                                        bbkVar.b = azwVarJ;
                                                        bbkVar.c = bckVarD;
                                                        bclVar = bckVarD;
                                                    }
                                                    bclVarA = bbnVar.a.a(bclVar, aztVar);
                                                    list = list2;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    list = list2;
                                                    bcjVarB.a.b(list);
                                                    throw th;
                                                }
                                            } catch (bcg e2) {
                                                e = e2;
                                                i = i5;
                                            }
                                            if (bclVarA != null) {
                                                i9 = i2 + 1;
                                                list3 = list;
                                                size = i3;
                                                i8 = i4;
                                                i5 = i;
                                                i6 = 4;
                                            }
                                        } catch (Throwable th3) {
                                            bbnVar.b.b(list4);
                                            throw th3;
                                        }
                                    } catch (bcg e3) {
                                        e = e3;
                                        i = i5;
                                        i2 = i9;
                                        i3 = size;
                                        list2 = list3;
                                        i4 = i8;
                                    }
                                } else {
                                    list = list3;
                                }
                            }
                            if (bclVarA == null) {
                                throw new bcg(bcjVarB.c, new ArrayList(list));
                            }
                            bcjVarB.a.b(list);
                            baeVarA.b();
                            bacVar.d();
                            bclVarD = bclVarA;
                        } catch (Throwable th4) {
                            th = th4;
                            list = list3;
                        }
                    } catch (Throwable th5) {
                        baeVarA.b();
                        throw th5;
                    }
                } catch (Throwable th6) {
                    bacVar.d();
                    throw th6;
                }
            }
            z = false;
        } catch (bcg e4) {
            z = false;
            e4.b(this.v, this.B, null);
            this.s.add(e4);
            bclVarD = null;
        }
        if (bclVarD == null) {
            k();
            return;
        }
        int i12 = this.B;
        if (bclVarD instanceof bch) {
            ((bch) bclVarD).d();
        }
        bck bckVar = z;
        if (this.b.a()) {
            bclVarD = bck.d(bclVarD);
            bckVar = bclVarD;
        }
        l();
        bbj bbjVar = this.k;
        synchronized (bbjVar) {
            ((bcc) bbjVar).e = bclVarD;
            ((bcc) bbjVar).k = i12;
        }
        synchronized (bbjVar) {
            ((bcc) bbjVar).n.c();
            if (((bcc) bbjVar).j) {
                ((bcc) bbjVar).e.e();
                ((bcc) bbjVar).e();
            } else {
                if (((bcc) bbjVar).a.e()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (((bcc) bbjVar).f) {
                    throw new IllegalStateException("Already have resource");
                }
                ((bcc) bbjVar).i = new bce(((bcc) bbjVar).e, ((bcc) bbjVar).c, ((bcc) bbjVar).b, ((bcc) bbjVar).l);
                ((bcc) bbjVar).f = true;
                bcb<bca> bcbVarC = ((bcc) bbjVar).a.c();
                ((bcc) bbjVar).d(bcbVarC.a() + 1);
                ((bcc) bbjVar).m.b((bcc) bbjVar, ((bcc) bbjVar).b, ((bcc) bbjVar).i);
                for (bca bcaVar : bcbVarC) {
                    bcaVar.b.execute(new bbz((bcc) bbjVar, bcaVar.a, 0));
                }
                ((bcc) bbjVar).c();
            }
        }
        this.A = 5;
        try {
            if (this.b.a()) {
                bbk bbkVar2 = this.b;
                try {
                    this.r.a().b(bbkVar2.a, new bbf(bbkVar2.b, bbkVar2.c, this.j));
                    bbkVar2.c.g();
                } catch (Throwable th7) {
                    bbkVar2.c.g();
                    throw th7;
                }
            }
            if (bckVar != 0) {
                bckVar.g();
            }
            if (this.c.b()) {
                a();
            }
        } catch (Throwable th8) {
            if (bckVar != 0) {
                bckVar.g();
            }
            throw th8;
        }
    }

    private final void j() {
        l();
        bcg bcgVar = new bcg("Failed to load resource", new ArrayList(this.s));
        bbj bbjVar = this.k;
        synchronized (bbjVar) {
            ((bcc) bbjVar).g = bcgVar;
        }
        synchronized (bbjVar) {
            ((bcc) bbjVar).n.c();
            if (((bcc) bbjVar).j) {
                ((bcc) bbjVar).e();
            } else {
                if (((bcc) bbjVar).a.e()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (((bcc) bbjVar).h) {
                    throw new IllegalStateException("Already failed once");
                }
                ((bcc) bbjVar).h = true;
                azp azpVar = ((bcc) bbjVar).b;
                bcb<bca> bcbVarC = ((bcc) bbjVar).a.c();
                ((bcc) bbjVar).d(bcbVarC.a() + 1);
                bcc bccVar = (bcc) bbjVar;
                bccVar.m.b(bccVar, azpVar, null);
                for (bca bcaVar : bcbVarC) {
                    bcaVar.b.execute(new bbz(bccVar, bcaVar.a, 1));
                }
                bccVar.c();
            }
        }
        if (this.c.c()) {
            a();
        }
    }

    private final void k() {
        this.u = Thread.currentThread();
        blz.b();
        boolean zC = false;
        while (!this.p && this.o != null && !(zC = this.o.c())) {
            this.A = c(this.A);
            this.o = h();
            if (this.A == 4) {
                b();
                return;
            }
        }
        if ((this.A == 6 || this.p) && !zC) {
            j();
        }
    }

    private final void l() {
        Throwable th;
        this.C.c();
        if (!this.y) {
            this.y = true;
            return;
        }
        if (this.s.isEmpty()) {
            th = null;
        } else {
            List list = this.s;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public final void a() {
        this.c.a();
        bbk bbkVar = this.b;
        bbkVar.a = null;
        bbkVar.b = null;
        bbkVar.c = null;
        bbi bbiVar = this.a;
        bbiVar.c = null;
        bbiVar.d = null;
        bbiVar.m = null;
        bbiVar.g = null;
        bbiVar.j = null;
        bbiVar.h = null;
        bbiVar.n = null;
        bbiVar.i = null;
        bbiVar.o = null;
        bbiVar.a.clear();
        bbiVar.k = false;
        bbiVar.b.clear();
        bbiVar.l = false;
        this.y = false;
        this.d = null;
        this.e = null;
        this.j = null;
        this.f = null;
        this.k = null;
        this.A = 0;
        this.o = null;
        this.u = null;
        this.n = null;
        this.w = null;
        this.B = 0;
        this.x = null;
        this.p = false;
        this.s.clear();
        this.t.b(this);
    }

    @Override // defpackage.bbg
    public final void b() {
        this.q = 2;
        this.k.a(this);
    }

    public final int c(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                if (this.i.b()) {
                    return 2;
                }
                return c(2);
            case 1:
                if (this.i.a()) {
                    return 3;
                }
                return c(3);
            case 2:
                return this.m ? 6 : 4;
            case 3:
            case 5:
                return 6;
            case 4:
            default:
                String strE = vk.e(i);
                StringBuilder sb = new StringBuilder(strE.length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(strE);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        bbm bbmVar = (bbm) obj;
        int iG = g() - bbmVar.g();
        return iG == 0 ? this.l - bbmVar.l : iG;
    }

    @Override // defpackage.bbg
    public final void d(azp azpVar, Exception exc, bac bacVar, int i) {
        bacVar.d();
        bcg bcgVar = new bcg("Fetching data failed", Collections.singletonList(exc));
        bcgVar.b(azpVar, i, bacVar.a());
        this.s.add(bcgVar);
        if (Thread.currentThread() == this.u) {
            k();
        } else {
            this.q = 2;
            this.k.a(this);
        }
    }

    @Override // defpackage.bbg
    public final void e(azp azpVar, Object obj, bac bacVar, int i, azp azpVar2) {
        this.n = azpVar;
        this.w = obj;
        this.x = bacVar;
        this.B = i;
        this.v = azpVar2;
        this.z = azpVar != this.a.e().get(0);
        if (Thread.currentThread() == this.u) {
            i();
        } else {
            this.q = 3;
            this.k.a(this);
        }
    }

    @Override // defpackage.bmk
    public final fuo f() {
        return this.C;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        bac bacVar = this.x;
        try {
            try {
                try {
                    if (this.p) {
                        j();
                        if (bacVar == null) {
                            return;
                        }
                    } else {
                        int i = this.q;
                        int i2 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        switch (i2) {
                            case 0:
                                this.A = c(1);
                                this.o = h();
                                k();
                                break;
                            case 1:
                                k();
                                break;
                            case 2:
                                i();
                                break;
                            default:
                                switch (i) {
                                    case 1:
                                        str = "INITIALIZE";
                                        break;
                                    case 2:
                                        str = "SWITCH_TO_SOURCE_SERVICE";
                                        break;
                                    default:
                                        str = "DECODE_DATA";
                                        break;
                                }
                                StringBuilder sb = new StringBuilder(str.length() + 25);
                                sb.append("Unrecognized run reason: ");
                                sb.append(str);
                                throw new IllegalStateException(sb.toString());
                        }
                        if (bacVar == null) {
                            return;
                        }
                    }
                    bacVar.d();
                } catch (bbc e) {
                    throw e;
                }
            } catch (Throwable th) {
                if (this.A != 5) {
                    this.s.add(th);
                    j();
                }
                if (!this.p) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (bacVar != null) {
                bacVar.d();
            }
            throw th2;
        }
    }
}
