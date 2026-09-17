package defpackage;

import android.util.AndroidRuntimeException;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class act implements ace {
    public static final acs a = new ack();
    public static final acs b = new acl();
    public static final acs c = new acm();
    public static final acs d = new acn();
    public static final acs e = new aco();
    public static final acs f = new acp();
    public static final acs g = new aci();
    public float h;
    float i;
    boolean j;
    final Object k;
    final acw l;
    public boolean m;
    public float n;
    public float o;
    public final ArrayList p;
    private long q;
    private final float r;
    private final ArrayList s;
    private ach t;

    public act(hle hleVar, byte[] bArr) {
        this.h = 0.0f;
        this.i = Float.MAX_VALUE;
        this.j = false;
        this.m = false;
        this.n = Float.MAX_VALUE;
        this.o = -3.4028235E38f;
        this.q = 0L;
        this.s = new ArrayList();
        this.p = new ArrayList();
        this.k = null;
        this.l = new acj(hleVar, null);
        this.r = 1.0f;
    }

    public act(Object obj, acw acwVar) {
        this.h = 0.0f;
        this.i = Float.MAX_VALUE;
        this.j = false;
        this.m = false;
        this.n = Float.MAX_VALUE;
        this.o = -3.4028235E38f;
        this.q = 0L;
        this.s = new ArrayList();
        this.p = new ArrayList();
        this.k = obj;
        this.l = acwVar;
        this.r = (acwVar == d || acwVar == e || acwVar == f) ? 0.1f : acwVar == g ? 0.00390625f : (acwVar == b || acwVar == c) ? 0.002f : 1.0f;
    }

    private static void j(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // defpackage.ace
    public final void a(long j) {
        long j2 = this.q;
        this.q = j;
        if (j2 == 0) {
            d(this.i);
            return;
        }
        boolean zF = f(j - j2);
        float fMin = Math.min(this.i, this.n);
        this.i = fMin;
        float fMax = Math.max(fMin, this.o);
        this.i = fMax;
        d(fMax);
        if (zF) {
            i();
        }
    }

    final float b() {
        return this.r * 0.75f;
    }

    public final ach c() {
        if (this.t == null) {
            if (ach.a.get() == null) {
                ach.a.set(new ach(new acg()));
            }
            this.t = (ach) ach.a.get();
        }
        return this.t;
    }

    final void d(float f2) {
        this.l.b(this.k, f2);
        for (int i = 0; i < this.p.size(); i++) {
            if (this.p.get(i) != null) {
                jfw jfwVar = (jfw) this.p.get(i);
                float f3 = this.i;
                jfx jfxVar = jfwVar.a;
                jfxVar.c.setScrollX((int) f3);
                ModeSwitcher modeSwitcher = jfxVar.c;
                jfs jfsVar = modeSwitcher.c;
                jrl jrlVarB = modeSwitcher.b();
                if (jfsVar.h != jfsVar.b.get(jrlVarB)) {
                    jfsVar.d(jrlVarB);
                }
            }
        }
        j(this.p);
    }

    public void e() {
        if (!c().a()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.m) {
            return;
        }
        this.m = true;
        if (!this.j) {
            this.i = this.l.a(this.k);
        }
        float f2 = this.i;
        if (f2 > this.n || f2 < this.o) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ach achVarC = c();
        if (achVarC.c.size() == 0) {
            achVarC.h.a(achVarC.e);
        }
        if (achVarC.c.contains(this)) {
            return;
        }
        achVarC.c.add(this);
    }

    public abstract boolean f(long j);

    public final void g(acr acrVar) {
        if (this.s.contains(acrVar)) {
            return;
        }
        this.s.add(acrVar);
    }

    public final void h(float f2) {
        this.i = f2;
        this.j = true;
    }

    public final void i() {
        this.m = false;
        ach achVarC = c();
        achVarC.b.remove(this);
        int iIndexOf = achVarC.c.indexOf(this);
        if (iIndexOf >= 0) {
            achVarC.c.set(iIndexOf, null);
            achVarC.g = true;
        }
        this.q = 0L;
        this.j = false;
        for (int i = 0; i < this.s.size(); i++) {
            if (this.s.get(i) != null) {
                ((acr) this.s.get(i)).a();
            }
        }
        j(this.s);
    }
}
