package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class awy {
    public static final axo a = new axo("CamCapabs");
    public final ArrayList b;
    public final ArrayList c;
    protected final TreeSet d;
    protected final ArrayList e;
    public final ArrayList f;
    protected final TreeSet g;
    public final EnumSet h;
    protected final EnumSet i;
    protected final EnumSet j;
    protected final EnumSet k;
    protected final EnumSet l;
    protected axn m;
    protected int n;
    protected int o;
    protected float p;
    protected int q;
    protected int r;
    protected int s;
    protected float t;
    public float u;
    protected float v;
    public final hq w;

    public awy(awy awyVar) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.c = arrayList2;
        TreeSet treeSet = new TreeSet();
        this.d = treeSet;
        ArrayList arrayList3 = new ArrayList();
        this.e = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f = arrayList4;
        TreeSet treeSet2 = new TreeSet();
        this.g = treeSet2;
        EnumSet enumSetNoneOf = EnumSet.noneOf(aww.class);
        this.h = enumSetNoneOf;
        EnumSet enumSetNoneOf2 = EnumSet.noneOf(awu.class);
        this.i = enumSetNoneOf2;
        EnumSet enumSetNoneOf3 = EnumSet.noneOf(awv.class);
        this.j = enumSetNoneOf3;
        EnumSet enumSetNoneOf4 = EnumSet.noneOf(awx.class);
        this.k = enumSetNoneOf4;
        EnumSet enumSetNoneOf5 = EnumSet.noneOf(awt.class);
        this.l = enumSetNoneOf5;
        arrayList.addAll(awyVar.b);
        arrayList2.addAll(awyVar.c);
        treeSet.addAll(awyVar.d);
        arrayList3.addAll(awyVar.e);
        arrayList4.addAll(awyVar.f);
        treeSet2.addAll(awyVar.g);
        enumSetNoneOf.addAll(awyVar.h);
        enumSetNoneOf2.addAll(awyVar.i);
        enumSetNoneOf3.addAll(awyVar.j);
        enumSetNoneOf4.addAll(awyVar.k);
        enumSetNoneOf5.addAll(awyVar.l);
        this.m = awyVar.m;
        this.o = awyVar.o;
        this.n = awyVar.n;
        this.p = awyVar.p;
        this.q = awyVar.q;
        this.r = awyVar.r;
        this.s = awyVar.s;
        this.t = awyVar.t;
        this.u = awyVar.u;
        this.v = awyVar.v;
        this.w = awyVar.w;
    }

    public awy(hq hqVar, byte[] bArr) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new TreeSet();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new TreeSet();
        this.h = EnumSet.noneOf(aww.class);
        this.i = EnumSet.noneOf(awu.class);
        this.j = EnumSet.noneOf(awv.class);
        this.k = EnumSet.noneOf(awx.class);
        this.l = EnumSet.noneOf(awt.class);
        this.w = hqVar;
    }

    public final boolean d(awt awtVar) {
        return awtVar != null && this.l.contains(awtVar);
    }

    public final boolean e(awu awuVar) {
        return awuVar != null && this.i.contains(awuVar);
    }

    public final boolean f(awv awvVar) {
        return awvVar != null && this.j.contains(awvVar);
    }
}
