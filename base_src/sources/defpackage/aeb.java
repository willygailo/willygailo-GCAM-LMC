package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aeb {
    public aea a;
    private uw b;
    private final WeakReference c;
    private int d;
    private boolean e;
    private boolean f;
    private ArrayList g;

    public aeb() {
        new AtomicReference();
    }

    public aeb(aee aeeVar) {
        new AtomicReference();
        this.b = new uw();
        this.d = 0;
        this.e = false;
        this.f = false;
        this.g = new ArrayList();
        this.c = new WeakReference(aeeVar);
        this.a = aea.INITIALIZED;
    }

    static aea a(aea aeaVar, aea aeaVar2) {
        return (aeaVar2 == null || aeaVar2.compareTo(aeaVar) >= 0) ? aeaVar : aeaVar2;
    }

    public static void f(String str) {
        if (ut.f().g()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private final aea g(aed aedVar) {
        uw uwVar = this.b;
        aea aeaVar = null;
        uz uzVar = uwVar.c(aedVar) ? ((uz) uwVar.a.get(aedVar)).d : null;
        aea aeaVar2 = uzVar != null ? ((aef) uzVar.b).a : null;
        if (!this.g.isEmpty()) {
            ArrayList arrayList = this.g;
            aeaVar = (aea) arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.a, aeaVar2), aeaVar);
    }

    private final void h(aea aeaVar) {
        if (this.a == aeaVar) {
            return;
        }
        this.a = aeaVar;
        if (this.e || this.d != 0) {
            this.f = true;
            return;
        }
        this.e = true;
        k();
        this.e = false;
    }

    private final void i() {
        ArrayList arrayList = this.g;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void j(aea aeaVar) {
        this.g.add(aeaVar);
    }

    private final void k() {
        aea aeaVar;
        aea aeaVar2;
        aee aeeVar = (aee) this.c.get();
        if (aeeVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            uw uwVar = this.b;
            if (uwVar.e == 0 || ((aeaVar = ((aef) uwVar.b.b).a) == (aeaVar2 = ((aef) uwVar.c.b).a) && this.a == aeaVar2)) {
                break;
            }
            this.f = false;
            if (this.a.compareTo(aeaVar) < 0) {
                uw uwVar2 = this.b;
                uy uyVar = new uy(uwVar2.c, uwVar2.b);
                uwVar2.d.put(uyVar, false);
                while (uyVar.hasNext() && !this.f) {
                    uz uzVar = (uz) uyVar.next();
                    aef aefVar = (aef) uzVar.b;
                    while (aefVar.a.compareTo(this.a) > 0 && !this.f && this.b.c((aed) uzVar.a)) {
                        adz adzVarA = adz.a(aefVar.a);
                        if (adzVarA == null) {
                            throw new IllegalStateException("no event down from " + aefVar.a);
                        }
                        j(adzVarA.c());
                        aefVar.a(aeeVar, adzVarA);
                        i();
                    }
                }
            }
            uz uzVar2 = this.b.c;
            if (!this.f && uzVar2 != null && this.a.compareTo(((aef) uzVar2.b).a) > 0) {
                va vaVarE = this.b.e();
                while (vaVarE.hasNext() && !this.f) {
                    uz uzVar3 = (uz) vaVarE.next();
                    aef aefVar2 = (aef) uzVar3.b;
                    while (aefVar2.a.compareTo(this.a) < 0 && !this.f && this.b.c((aed) uzVar3.a)) {
                        j(aefVar2.a);
                        adz adzVarB = adz.b(aefVar2.a);
                        if (adzVarB == null) {
                            throw new IllegalStateException("no event up from " + aefVar2.a);
                        }
                        aefVar2.a(aeeVar, adzVarB);
                        i();
                    }
                }
            }
        }
        this.f = false;
    }

    public final void b(aed aedVar) {
        Object obj;
        aee aeeVar;
        f("addObserver");
        aef aefVar = new aef(aedVar, this.a == aea.DESTROYED ? aea.DESTROYED : aea.INITIALIZED);
        uw uwVar = this.b;
        uz uzVarA = uwVar.a(aedVar);
        if (uzVarA != null) {
            obj = uzVarA.b;
        } else {
            uwVar.a.put(aedVar, uwVar.d(aedVar, aefVar));
            obj = null;
        }
        if (((aef) obj) == null && (aeeVar = (aee) this.c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            aea aeaVarG = g(aedVar);
            this.d++;
            while (aefVar.a.compareTo(aeaVarG) < 0 && this.b.c(aedVar)) {
                j(aefVar.a);
                adz adzVarB = adz.b(aefVar.a);
                if (adzVarB == null) {
                    throw new IllegalStateException("no event up from " + aefVar.a);
                }
                aefVar.a(aeeVar, adzVarB);
                i();
                aeaVarG = g(aedVar);
            }
            if (!z) {
                k();
            }
            this.d--;
        }
    }

    public final void c(adz adzVar) {
        f("handleLifecycleEvent");
        h(adzVar.c());
    }

    public final void d(aed aedVar) {
        f("removeObserver");
        this.b.b(aedVar);
    }

    public final void e(aea aeaVar) {
        f("setCurrentState");
        h(aeaVar);
    }
}
