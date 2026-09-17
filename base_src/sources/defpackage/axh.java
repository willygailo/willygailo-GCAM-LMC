package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class axh {
    private static final axo a = new axo("CamSet");
    protected final Map d;
    protected final List e;
    protected final List f;
    protected boolean g;
    protected int h;
    protected int i;
    protected int j;
    protected axn k;
    public int l;
    protected axn m;
    protected byte n;
    protected int o;
    protected float p;
    public int q;
    public awu r;
    public awv s;
    public aww t;
    protected awx u;
    protected boolean v;
    protected boolean w;
    protected boolean x;
    protected boolean y;
    public axn z;

    protected axh() {
        this.d = new TreeMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
    }

    protected axh(axh axhVar) {
        TreeMap treeMap = new TreeMap();
        this.d = treeMap;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        treeMap.putAll(axhVar.d);
        arrayList.addAll(axhVar.e);
        arrayList2.addAll(axhVar.f);
        this.g = axhVar.g;
        this.h = axhVar.h;
        this.i = axhVar.i;
        this.j = axhVar.j;
        axn axnVar = axhVar.k;
        this.k = axnVar == null ? null : new axn(axnVar);
        this.l = axhVar.l;
        axn axnVar2 = axhVar.m;
        this.m = axnVar2 != null ? new axn(axnVar2) : null;
        this.n = axhVar.n;
        this.o = axhVar.o;
        this.p = axhVar.p;
        this.q = axhVar.q;
        this.r = axhVar.r;
        this.s = axhVar.s;
        this.t = axhVar.t;
        this.u = axhVar.u;
        this.v = axhVar.v;
        this.w = axhVar.w;
        this.x = axhVar.x;
        this.y = axhVar.y;
        this.z = axhVar.z;
    }

    public abstract axh a();

    public void d() {
        this.p = 1.0f;
    }

    public final axn e() {
        return new axn(this.m);
    }

    public final axn f() {
        return new axn(this.k);
    }

    public final List g() {
        return new ArrayList(this.f);
    }

    public final List h() {
        return new ArrayList(this.e);
    }

    public final void i(int i) {
        if (i <= 0 || i > 100) {
            axp.c(a, "Ignoring JPEG quality that falls outside the expected range");
        } else {
            this.n = (byte) i;
        }
    }

    public final void j(int i, int i2) {
        int i3 = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        this.i = i3;
        this.h = i;
        this.j = -1;
    }

    public final void k(axn axnVar) {
        if (this.g) {
            axp.c(a, "Attempt to change photo size while locked");
        } else {
            this.m = new axn(axnVar);
        }
    }

    public final void l(axn axnVar) {
        if (this.g) {
            axp.c(a, "Attempt to change preview size while locked");
        } else {
            this.k = new axn(axnVar);
        }
    }
}
