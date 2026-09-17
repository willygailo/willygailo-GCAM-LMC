package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import com.google.android.GoogleCameraEngR18F1.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class cu {
    private uk A;
    private uk B;
    private boolean C;
    private ArrayList D;
    private ArrayList E;
    private ArrayList F;
    private final Runnable G;
    private final d H;
    ArrayList b;
    public ue d;
    public final cj g;
    public final CopyOnWriteArrayList h;
    int i;
    public cf j;
    public cb k;
    public bu l;
    bu m;
    public uk n;
    ArrayDeque o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public cw t;
    private boolean v;
    private ArrayList w;
    private final ce z;
    private final ArrayList u = new ArrayList();
    public final db a = new db();
    public final ch c = new ch(this);
    public final uc e = new uc(this);
    public final AtomicInteger f = new AtomicInteger();
    private final Map x = DesugarCollections.synchronizedMap(new HashMap());
    private final Map y = DesugarCollections.synchronizedMap(new HashMap());

    public cu() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.g = new cj(this);
        this.h = new CopyOnWriteArrayList();
        this.i = -1;
        this.z = new cl(this);
        this.H = new d();
        this.o = new ArrayDeque();
        this.G = new cm(this);
    }

    public static boolean Q(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static final boolean U(bu buVar) {
        boolean z = buVar.J;
        db dbVar = buVar.A.a;
        ArrayList<bu> arrayList = new ArrayList();
        for (da daVar : dbVar.b.values()) {
            if (daVar != null) {
                arrayList.add(daVar.c);
            } else {
                arrayList.add(null);
            }
        }
        boolean zU = false;
        for (bu buVar2 : arrayList) {
            if (buVar2 != null) {
                zU = U(buVar2);
            }
            if (zU) {
                return true;
            }
        }
        return false;
    }

    static final boolean V(bu buVar) {
        return buVar == null || buVar.y == null || V(buVar.B);
    }

    static final void X(bu buVar) {
        if (Q(2)) {
            String str = "show: " + buVar;
        }
        if (buVar.F) {
            buVar.F = false;
            buVar.Q = !buVar.Q;
        }
    }

    private final ViewGroup aa(bu buVar) {
        ViewGroup viewGroup = buVar.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (buVar.D > 0 && this.k.b()) {
            View viewA = this.k.a(buVar.D);
            if (viewA instanceof ViewGroup) {
                return (ViewGroup) viewA;
            }
        }
        return null;
    }

    private final Set ab() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.e().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((da) it.next()).c.L;
            if (viewGroup != null) {
                Z();
                hashSet.add(dq.g(viewGroup));
            }
        }
        return hashSet;
    }

    private final void ac() {
        if (S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void ad() {
        this.v = false;
        this.E.clear();
        this.D.clear();
    }

    private final void ae() {
        if (this.C) {
            this.C = false;
            ak();
        }
    }

    private final void af() {
        Iterator it = ab().iterator();
        while (it.hasNext()) {
            ((dq) it.next()).c();
        }
    }

    private final void ag(boolean z) {
        if (this.v) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.j == null) {
            if (!this.s) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.j.d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            ac();
        }
        if (this.D == null) {
            this.D = new ArrayList();
            this.E = new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:191:0x0508  */
    /* JADX WARN: Code duplicated, block: B:215:0x0584  */
    /* JADX WARN: Code duplicated, block: B:55:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    /* JADX WARN: Type inference failed for: r6v63 */
    /* JADX WARN: Type inference failed for: r6v64, types: [bu] */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r6v79 */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v83 */
    private final void ah(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z;
        Iterator it;
        dq dqVar;
        Iterator it2;
        boolean z2;
        ViewGroup viewGroup;
        int i3;
        ?? r6;
        byte[] bArr;
        ArrayList arrayList3 = arrayList;
        boolean z3 = ((ay) arrayList3.get(i)).s;
        ArrayList arrayList4 = this.F;
        if (arrayList4 == null) {
            this.F = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.F.addAll(this.a.f());
        int i4 = i;
        boolean z4 = false;
        ?? r7 = this.m;
        while (true) {
            byte[] bArr2 = null;
            if (i4 >= i2) {
                this.F.clear();
                if (!z3 && this.i > 0) {
                    for (int i5 = i; i5 < i2; i5++) {
                        ArrayList arrayList5 = ((ay) arrayList.get(i5)).d;
                        int size = arrayList5.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            bu buVar = ((dc) arrayList5.get(i6)).b;
                            if (buVar != null && buVar.y != null) {
                                this.a.i(g(buVar));
                            }
                        }
                    }
                }
                for (int i7 = i; i7 < i2; i7++) {
                    ay ayVar = (ay) arrayList.get(i7);
                    if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                        ayVar.a(-1);
                        for (int size2 = ayVar.d.size() - 1; size2 >= 0; size2--) {
                            dc dcVar = (dc) ayVar.d.get(size2);
                            bu buVar2 = dcVar.b;
                            if (buVar2 != null) {
                                buVar2.s = false;
                                buVar2.T(true);
                                switch (ayVar.i) {
                                    case 4097:
                                        i3 = 8194;
                                        break;
                                    case 4099:
                                        i3 = 4099;
                                        break;
                                    case 4100:
                                        i3 = 8197;
                                        break;
                                    case 8194:
                                        i3 = 4097;
                                        break;
                                    case 8197:
                                        i3 = 4100;
                                        break;
                                    default:
                                        i3 = 0;
                                        break;
                                }
                                buVar2.S(i3);
                                buVar2.U(ayVar.r, ayVar.q);
                            }
                            switch (dcVar.a) {
                                case 1:
                                    buVar2.P(dcVar.d, dcVar.e, dcVar.f, dcVar.g);
                                    ayVar.a.I(buVar2, true);
                                    ayVar.a.G(buVar2);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + dcVar.a);
                                case 3:
                                    buVar2.P(dcVar.d, dcVar.e, dcVar.f, dcVar.g);
                                    ayVar.a.f(buVar2);
                                    break;
                                case 4:
                                    buVar2.P(dcVar.d, dcVar.e, dcVar.f, dcVar.g);
                                    cu cuVar = ayVar.a;
                                    X(buVar2);
                                    break;
                                case 5:
                                    buVar2.P(dcVar.d, dcVar.e, dcVar.f, dcVar.g);
                                    ayVar.a.I(buVar2, true);
                                    ayVar.a.D(buVar2);
                                    break;
                                case 6:
                                    buVar2.P(dcVar.d, dcVar.e, dcVar.f, dcVar.g);
                                    ayVar.a.k(buVar2);
                                    break;
                                case 7:
                                    buVar2.P(dcVar.d, dcVar.e, dcVar.f, dcVar.g);
                                    ayVar.a.I(buVar2, true);
                                    ayVar.a.l(buVar2);
                                    break;
                                case 8:
                                    ayVar.a.K(null);
                                    break;
                                case 9:
                                    ayVar.a.K(buVar2);
                                    break;
                                case 10:
                                    ayVar.a.J(buVar2, dcVar.h);
                                    break;
                            }
                        }
                    } else {
                        ayVar.a(1);
                        int size3 = ayVar.d.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            dc dcVar2 = (dc) ayVar.d.get(i8);
                            bu buVar3 = dcVar2.b;
                            if (buVar3 != null) {
                                buVar3.s = false;
                                buVar3.T(false);
                                buVar3.S(ayVar.i);
                                buVar3.U(ayVar.q, ayVar.r);
                            }
                            switch (dcVar2.a) {
                                case 1:
                                    buVar3.P(dcVar2.d, dcVar2.e, dcVar2.f, dcVar2.g);
                                    ayVar.a.I(buVar3, false);
                                    ayVar.a.f(buVar3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + dcVar2.a);
                                case 3:
                                    buVar3.P(dcVar2.d, dcVar2.e, dcVar2.f, dcVar2.g);
                                    ayVar.a.G(buVar3);
                                    break;
                                case 4:
                                    buVar3.P(dcVar2.d, dcVar2.e, dcVar2.f, dcVar2.g);
                                    ayVar.a.D(buVar3);
                                    break;
                                case 5:
                                    buVar3.P(dcVar2.d, dcVar2.e, dcVar2.f, dcVar2.g);
                                    ayVar.a.I(buVar3, false);
                                    cu cuVar2 = ayVar.a;
                                    X(buVar3);
                                    break;
                                case 6:
                                    buVar3.P(dcVar2.d, dcVar2.e, dcVar2.f, dcVar2.g);
                                    ayVar.a.l(buVar3);
                                    break;
                                case 7:
                                    buVar3.P(dcVar2.d, dcVar2.e, dcVar2.f, dcVar2.g);
                                    ayVar.a.I(buVar3, false);
                                    ayVar.a.k(buVar3);
                                    break;
                                case 8:
                                    ayVar.a.K(buVar3);
                                    break;
                                case 9:
                                    ayVar.a.K(null);
                                    break;
                                case 10:
                                    ayVar.a.J(buVar3, dcVar2.i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i9 = i; i9 < i2; i9++) {
                    ay ayVar2 = (ay) arrayList.get(i9);
                    if (zBooleanValue) {
                        for (int size4 = ayVar2.d.size() - 1; size4 >= 0; size4--) {
                            bu buVar4 = ((dc) ayVar2.d.get(size4)).b;
                            if (buVar4 != null) {
                                g(buVar4).d();
                            }
                        }
                    } else {
                        ArrayList arrayList6 = ayVar2.d;
                        int size5 = arrayList6.size();
                        for (int i10 = 0; i10 < size5; i10++) {
                            bu buVar5 = ((dc) arrayList6.get(i10)).b;
                            if (buVar5 != null) {
                                g(buVar5).d();
                            }
                        }
                    }
                }
                E(this.i, true);
                HashSet hashSet = new HashSet();
                for (int i11 = i; i11 < i2; i11++) {
                    ArrayList arrayList7 = ((ay) arrayList.get(i11)).d;
                    int size6 = arrayList7.size();
                    for (int i12 = 0; i12 < size6; i12++) {
                        bu buVar6 = ((dc) arrayList7.get(i12)).b;
                        if (buVar6 != null && (viewGroup = buVar6.L) != null) {
                            hashSet.add(dq.b(viewGroup, this));
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    dq dqVar2 = (dq) it3.next();
                    dqVar2.d = zBooleanValue;
                    synchronized (dqVar2.b) {
                        dqVar2.d();
                        for (int size7 = dqVar2.b.size() - 1; size7 >= 0; size7--) {
                            dp dpVar = (dp) dqVar2.b.get(size7);
                            int iN = d.n(dpVar.a.M);
                            if (dpVar.e == 2 && iN != 2) {
                                br brVar = dpVar.a.P;
                            }
                        }
                    }
                    if (gl.U(dqVar2.a)) {
                        synchronized (dqVar2.b) {
                            if (dqVar2.b.isEmpty()) {
                                z = zBooleanValue;
                                it = it3;
                            } else {
                                ArrayList<dp> arrayList8 = new ArrayList(dqVar2.c);
                                dqVar2.c.clear();
                                for (dp dpVar2 : arrayList8) {
                                    if (Q(2)) {
                                        String str = "SpecialEffectsController: Cancelling operation " + dpVar2;
                                    }
                                    dpVar2.d();
                                    if (!dpVar2.d) {
                                        dqVar2.c.add(dpVar2);
                                    }
                                }
                                dqVar2.d();
                                ArrayList<dp> arrayList9 = new ArrayList(dqVar2.b);
                                dqVar2.b.clear();
                                dqVar2.c.addAll(arrayList9);
                                Iterator it4 = arrayList9.iterator();
                                while (it4.hasNext()) {
                                    ((dp) it4.next()).b();
                                }
                                boolean z5 = dqVar2.d;
                                dp dpVar3 = null;
                                dp dpVar4 = null;
                                for (dp dpVar5 : arrayList9) {
                                    int iN2 = d.n(dpVar5.a.M);
                                    int i13 = dpVar5.e;
                                    int i14 = i13 - 1;
                                    if (i13 == 0) {
                                        throw null;
                                    }
                                    switch (i14) {
                                        case 0:
                                        case 2:
                                        case 3:
                                            if (iN2 == 2 && dpVar3 == null) {
                                                dpVar3 = dpVar5;
                                            }
                                            break;
                                        case 1:
                                            if (iN2 != 2) {
                                                dpVar4 = dpVar5;
                                            }
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                if (Q(2)) {
                                    String str2 = "Executing operations from " + dpVar3 + " to " + dpVar4;
                                }
                                ArrayList arrayList10 = new ArrayList();
                                ArrayList<bk> arrayList11 = new ArrayList();
                                ArrayList arrayList12 = new ArrayList(arrayList9);
                                for (dp dpVar6 : arrayList9) {
                                    boolean z6 = zBooleanValue;
                                    aax aaxVar = new aax();
                                    dpVar6.e(aaxVar);
                                    arrayList10.add(new bi(dpVar6, aaxVar, z5));
                                    aax aaxVar2 = new aax();
                                    dpVar6.e(aaxVar2);
                                    if (z5) {
                                        if (dpVar6 == dpVar3) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                    } else if (dpVar6 == dpVar4) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    arrayList11.add(new bk(dpVar6, aaxVar2, z5, z2));
                                    dpVar6.c(new bc(arrayList12, dpVar6));
                                    zBooleanValue = z6;
                                    it3 = it3;
                                }
                                z = zBooleanValue;
                                it = it3;
                                HashMap map = new HashMap();
                                for (bk bkVar : arrayList11) {
                                    if (!bkVar.c()) {
                                        bkVar.a(bkVar.c);
                                        bkVar.a(bkVar.d);
                                    }
                                }
                                for (bk bkVar2 : arrayList11) {
                                    map.put(bkVar2.a, false);
                                    bkVar2.b();
                                }
                                boolean zContainsValue = map.containsValue(true);
                                ViewGroup viewGroup2 = dqVar2.a;
                                Context context = viewGroup2.getContext();
                                ArrayList arrayList13 = new ArrayList();
                                Iterator it5 = arrayList10.iterator();
                                boolean z7 = false;
                                while (it5.hasNext()) {
                                    bi biVar = (bi) it5.next();
                                    if (biVar.c()) {
                                        biVar.b();
                                        dqVar = dqVar2;
                                        it2 = it5;
                                    } else {
                                        it2 = it5;
                                        bz bzVarA = biVar.a(context);
                                        if (bzVarA == null) {
                                            biVar.b();
                                            dqVar = dqVar2;
                                        } else {
                                            Animator animator = bzVarA.b;
                                            if (animator == null) {
                                                arrayList13.add(biVar);
                                                dqVar = dqVar2;
                                            } else {
                                                dp dpVar7 = biVar.a;
                                                bu buVar7 = dpVar7.a;
                                                dqVar = dqVar2;
                                                if (Boolean.TRUE.equals(map.get(dpVar7))) {
                                                    if (Q(2)) {
                                                        String str3 = "Ignoring Animator set on " + buVar7 + " as this Fragment was involved in a Transition.";
                                                    }
                                                    biVar.b();
                                                } else {
                                                    boolean z8 = dpVar7.e == 3;
                                                    if (z8) {
                                                        arrayList12.remove(dpVar7);
                                                    }
                                                    View view = buVar7.M;
                                                    viewGroup2.startViewTransition(view);
                                                    animator.addListener(new bd(viewGroup2, view, z8, dpVar7, biVar));
                                                    animator.setTarget(view);
                                                    animator.start();
                                                    if (Q(2)) {
                                                        String str4 = "Animator from operation " + dpVar7 + " has started.";
                                                    }
                                                    biVar.b.a(new be(animator, dpVar7));
                                                    it5 = it2;
                                                    dqVar2 = dqVar;
                                                    z7 = true;
                                                }
                                            }
                                        }
                                    }
                                    it5 = it2;
                                    dqVar2 = dqVar;
                                }
                                dq dqVar3 = dqVar2;
                                int i15 = 0;
                                for (int size8 = arrayList13.size(); i15 < size8; size8 = size8) {
                                    bi biVar2 = (bi) arrayList13.get(i15);
                                    dp dpVar8 = biVar2.a;
                                    bu buVar8 = dpVar8.a;
                                    if (zContainsValue) {
                                        if (Q(2)) {
                                            String str5 = "Ignoring Animation set on " + buVar8 + " as Animations cannot run alongside Transitions.";
                                        }
                                        biVar2.b();
                                    } else if (z7) {
                                        if (Q(2)) {
                                            String str6 = "Ignoring Animation set on " + buVar8 + " as Animations cannot run alongside Animators.";
                                        }
                                        biVar2.b();
                                    } else {
                                        View view2 = buVar8.M;
                                        bz bzVarA2 = biVar2.a(context);
                                        ew.c(bzVarA2);
                                        Animation animation = bzVarA2.a;
                                        ew.c(animation);
                                        if (dpVar8.e != 1) {
                                            view2.startAnimation(animation);
                                            biVar2.b();
                                        } else {
                                            viewGroup2.startViewTransition(view2);
                                            ca caVar = new ca(animation, viewGroup2, view2);
                                            caVar.setAnimationListener(new bg(dpVar8, viewGroup2, view2, biVar2));
                                            view2.startAnimation(caVar);
                                            if (Q(2)) {
                                                String str7 = "Animation from operation " + dpVar8 + " has started.";
                                            }
                                        }
                                        biVar2.b.a(new bh(view2, viewGroup2, biVar2, dpVar8));
                                    }
                                    i15++;
                                }
                                int size9 = arrayList12.size();
                                for (int i16 = 0; i16 < size9; i16++) {
                                    dq.f((dp) arrayList12.get(i16));
                                }
                                arrayList12.clear();
                                if (Q(2)) {
                                    String str8 = "Completed executing operations from " + dpVar3 + " to " + dpVar4;
                                }
                                dqVar3.d = false;
                            }
                        }
                        zBooleanValue = z;
                        it3 = it;
                    } else {
                        dqVar2.c();
                        dqVar2.d = false;
                    }
                }
                for (int i17 = i; i17 < i2; i17++) {
                    ay ayVar3 = (ay) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue() && ayVar3.c >= 0) {
                        ayVar3.c = -1;
                    }
                }
                return;
            }
            ay ayVar4 = (ay) arrayList3.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                ArrayList arrayList14 = this.F;
                int size10 = ayVar4.d.size() - 1;
                while (size10 >= 0) {
                    r6 = r7;
                    dc dcVar3 = (dc) ayVar4.d.get(size10);
                    switch (dcVar3.a) {
                        case 1:
                        case 7:
                            arrayList14.remove(dcVar3.b);
                            break;
                        case 3:
                        case 6:
                            arrayList14.add(dcVar3.b);
                            break;
                        case 8:
                            r6 = 0;
                            break;
                        case 9:
                            r6 = dcVar3.b;
                            break;
                        case 10:
                            dcVar3.i = dcVar3.h;
                            break;
                    }
                    size10--;
                    r6 = r6;
                }
            } else {
                ArrayList arrayList15 = this.F;
                int i18 = 0;
                r6 = r7;
                while (i18 < ayVar4.d.size()) {
                    dc dcVar4 = (dc) ayVar4.d.get(i18);
                    switch (dcVar4.a) {
                        case 1:
                        case 7:
                            arrayList15.add(dcVar4.b);
                            break;
                        case 2:
                            bu buVar9 = dcVar4.b;
                            int i19 = buVar9.D;
                            int size11 = arrayList15.size() - 1;
                            boolean z9 = false;
                            r6 = r6;
                            while (size11 >= 0) {
                                bu buVar10 = (bu) arrayList15.get(size11);
                                if (buVar10.D != i19) {
                                    i19 = i19;
                                } else if (buVar10 == buVar9) {
                                    i19 = i19;
                                    z9 = true;
                                } else {
                                    if (buVar10 == r6) {
                                        bArr = null;
                                        ayVar4.d.add(i18, new dc(9, buVar10, null));
                                        i18++;
                                        r6 = 0;
                                    } else {
                                        bArr = null;
                                        r6 = r6;
                                    }
                                    dc dcVar5 = new dc(3, buVar10, bArr);
                                    dcVar5.d = dcVar4.d;
                                    dcVar5.f = dcVar4.f;
                                    dcVar5.e = dcVar4.e;
                                    dcVar5.g = dcVar4.g;
                                    ayVar4.d.add(i18, dcVar5);
                                    arrayList15.remove(buVar10);
                                    i18++;
                                }
                                size11--;
                                i19 = i19;
                                r6 = r6;
                            }
                            if (z9) {
                                ayVar4.d.remove(i18);
                                i18--;
                            } else {
                                dcVar4.a = 1;
                                dcVar4.c = true;
                                arrayList15.add(buVar9);
                            }
                            break;
                        case 3:
                        case 6:
                            arrayList15.remove(dcVar4.b);
                            bu buVar11 = dcVar4.b;
                            if (buVar11 == r6) {
                                ayVar4.d.add(i18, new dc(9, buVar11));
                                i18++;
                                r6 = bArr2;
                            }
                            break;
                        case 8:
                            ayVar4.d.add(i18, new dc(9, r6, bArr2));
                            dcVar4.c = true;
                            i18++;
                            r6 = dcVar4.b;
                            break;
                    }
                    i18++;
                    bArr2 = null;
                    r6 = r6;
                }
            }
            if (z4) {
                r6 = r7;
                z4 = true;
            } else {
                r6 = r7;
                if (ayVar4.j) {
                    r6 = r7;
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            i4++;
            arrayList3 = arrayList;
            r7 = r6;
        }
    }

    private final void ai(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((ay) arrayList.get(i)).s) {
                if (i2 != i) {
                    ah(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((ay) arrayList.get(i2)).s) {
                        i2++;
                    }
                }
                ah(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            ah(arrayList, arrayList2, i2, size);
        }
    }

    private final void aj(bu buVar) {
        ViewGroup viewGroupAa = aa(buVar);
        if (viewGroupAa == null || buVar.n() + buVar.o() + buVar.p() + buVar.q() <= 0) {
            return;
        }
        if (viewGroupAa.getTag(R.id.visible_removing_fragment_view_tag) == null) {
            viewGroupAa.setTag(R.id.visible_removing_fragment_view_tag, buVar);
        }
        ((bu) viewGroupAa.getTag(R.id.visible_removing_fragment_view_tag)).T(buVar.V());
    }

    private final void ak() {
        for (da daVar : this.a.e()) {
            bu buVar = daVar.c;
            if (buVar.N) {
                if (this.v) {
                    this.C = true;
                } else {
                    buVar.N = false;
                    daVar.d();
                }
            }
        }
    }

    public final void A(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        db dbVar = this.a;
        String str3 = str + "    ";
        if (!dbVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (da daVar : dbVar.b.values()) {
                printWriter.print(str);
                if (daVar != null) {
                    bu buVar = daVar.c;
                    printWriter.println(buVar);
                    buVar.F(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = dbVar.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                bu buVar2 = (bu) dbVar.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(buVar2.toString());
            }
        }
        ArrayList arrayList = this.w;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                bu buVar3 = (bu) this.w.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(buVar3.toString());
            }
        }
        ArrayList arrayList2 = this.b;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                ay ayVar = (ay) this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(ayVar.toString());
                ayVar.d(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f.get());
        synchronized (this.u) {
            int size4 = this.u.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (cs) this.u.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.j);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.k);
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.l);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.i);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.q);
        printWriter.print(" mStopped=");
        printWriter.print(this.r);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.s);
        if (this.p) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.p);
        }
    }

    final void B(cs csVar, boolean z) {
        if (!z) {
            if (this.j == null) {
                if (!this.s) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            ac();
        }
        synchronized (this.u) {
            if (this.j == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.u.add(csVar);
            synchronized (this.u) {
                if (this.u.size() == 1) {
                    this.j.d.removeCallbacks(this.G);
                    this.j.d.post(this.G);
                    L();
                }
            }
        }
    }

    final void C(cs csVar, boolean z) {
        if (z && (this.j == null || this.s)) {
            return;
        }
        ag(z);
        csVar.f(this.D, this.E);
        this.v = true;
        try {
            ai(this.D, this.E);
            ad();
            L();
            ae();
            this.a.h();
        } catch (Throwable th) {
            ad();
            throw th;
        }
    }

    final void D(bu buVar) {
        if (Q(2)) {
            String str = "hide: " + buVar;
        }
        if (buVar.F) {
            return;
        }
        buVar.F = true;
        buVar.Q = true ^ buVar.Q;
        aj(buVar);
    }

    final void E(int i, boolean z) {
        cf cfVar;
        if (this.j == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.i) {
            this.i = i;
            db dbVar = this.a;
            ArrayList arrayList = dbVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                da daVar = (da) dbVar.b.get(((bu) arrayList.get(i2)).k);
                if (daVar != null) {
                    daVar.d();
                }
            }
            for (da daVar2 : dbVar.b.values()) {
                if (daVar2 != null) {
                    daVar2.d();
                    bu buVar = daVar2.c;
                    if (buVar.r && !buVar.X()) {
                        boolean z2 = buVar.s;
                        dbVar.j(daVar2);
                    }
                }
            }
            ak();
            if (this.p && (cfVar = this.j) != null && this.i == 7) {
                ((bx) cfVar).a.d();
                this.p = false;
            }
        }
    }

    final void F() {
        if (this.j == null) {
            return;
        }
        this.q = false;
        this.r = false;
        this.t.g = false;
        for (bu buVar : this.a.f()) {
            if (buVar != null) {
                buVar.A.F();
            }
        }
    }

    final void G(bu buVar) {
        if (Q(2)) {
            String str = "remove: " + buVar + " nesting=" + buVar.x;
        }
        boolean z = !buVar.X();
        if (!buVar.G || z) {
            this.a.k(buVar);
            if (U(buVar)) {
                this.p = true;
            }
            buVar.r = true;
            aj(buVar);
        }
    }

    final void H(Parcelable parcelable) {
        cv cvVar;
        ArrayList arrayList;
        da daVar;
        if (parcelable == null || (arrayList = (cvVar = (cv) parcelable).a) == null) {
            return;
        }
        db dbVar = this.a;
        dbVar.c.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cy cyVar = (cy) arrayList.get(i);
            dbVar.c.put(cyVar.b, cyVar);
        }
        this.a.b.clear();
        ArrayList arrayList2 = cvVar.b;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cy cyVarC = this.a.c((String) arrayList2.get(i2), null);
            if (cyVarC != null) {
                bu buVar = (bu) this.t.b.get(cyVarC.b);
                if (buVar != null) {
                    if (Q(2)) {
                        String str = "restoreSaveState: re-attaching retained " + buVar;
                    }
                    daVar = new da(this.g, this.a, buVar, cyVarC);
                } else {
                    daVar = new da(this.g, this.a, this.j.c.getClassLoader(), e(), cyVarC);
                }
                bu buVar2 = daVar.c;
                buVar2.y = this;
                if (Q(2)) {
                    String str2 = "restoreSaveState: active (" + buVar2.k + "): " + buVar2;
                }
                daVar.e(this.j.c.getClassLoader());
                this.a.i(daVar);
                daVar.d = this.i;
            }
        }
        for (bu buVar3 : new ArrayList(this.t.b.values())) {
            if (!this.a.l(buVar3.k)) {
                if (Q(2)) {
                    String str3 = "Discarding retained Fragment " + buVar3 + " that was not found in the set of active Fragments " + cvVar.b;
                }
                this.t.d(buVar3);
                buVar3.y = this;
                da daVar2 = new da(this.g, this.a, buVar3);
                daVar2.d = 1;
                daVar2.d();
                buVar3.r = true;
                daVar2.d();
            }
        }
        db dbVar2 = this.a;
        ArrayList<String> arrayList3 = cvVar.c;
        dbVar2.a.clear();
        if (arrayList3 != null) {
            for (String str4 : arrayList3) {
                bu buVarA = dbVar2.a(str4);
                if (buVarA == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str4 + ")");
                }
                if (Q(2)) {
                    String str5 = "restoreSaveState: added (" + str4 + "): " + buVarA;
                }
                dbVar2.g(buVarA);
            }
        }
        az[] azVarArr = cvVar.d;
        if (azVarArr != null) {
            this.b = new ArrayList(azVarArr.length);
            int i3 = 0;
            while (true) {
                az[] azVarArr2 = cvVar.d;
                if (i3 >= azVarArr2.length) {
                    break;
                }
                az azVar = azVarArr2[i3];
                ay ayVar = new ay(this);
                int i4 = 0;
                int i5 = 0;
                while (i4 < azVar.a.length) {
                    dc dcVar = new dc();
                    int i6 = i4 + 1;
                    dcVar.a = azVar.a[i4];
                    if (Q(2)) {
                        String str6 = "Instantiate " + ayVar + " op #" + i5 + " base fragment #" + azVar.a[i6];
                    }
                    dcVar.h = aea.values()[azVar.c[i5]];
                    dcVar.i = aea.values()[azVar.d[i5]];
                    int[] iArr = azVar.a;
                    int i7 = i6 + 1;
                    dcVar.c = iArr[i6] != 0;
                    int i8 = i7 + 1;
                    int i9 = iArr[i7];
                    dcVar.d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr[i8];
                    dcVar.e = i11;
                    int i12 = i10 + 1;
                    int i13 = iArr[i10];
                    dcVar.f = i13;
                    int i14 = iArr[i12];
                    dcVar.g = i14;
                    ayVar.e = i9;
                    ayVar.f = i11;
                    ayVar.g = i13;
                    ayVar.h = i14;
                    ayVar.k(dcVar);
                    i5++;
                    i4 = i12 + 1;
                }
                ayVar.i = azVar.e;
                ayVar.l = azVar.f;
                ayVar.j = true;
                ayVar.m = azVar.h;
                ayVar.n = azVar.i;
                ayVar.o = azVar.j;
                ayVar.p = azVar.k;
                ayVar.q = azVar.l;
                ayVar.r = azVar.m;
                ayVar.s = azVar.n;
                ayVar.c = azVar.g;
                for (int i15 = 0; i15 < azVar.b.size(); i15++) {
                    String str7 = (String) azVar.b.get(i15);
                    if (str7 != null) {
                        ((dc) ayVar.d.get(i15)).b = b(str7);
                    }
                }
                ayVar.a(1);
                if (Q(2)) {
                    String str8 = "restoreAllState: back stack #" + i3 + " (index " + ayVar.c + "): " + ayVar;
                    PrintWriter printWriter = new PrintWriter(new dh());
                    ayVar.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(ayVar);
                i3++;
            }
        } else {
            this.b = null;
        }
        this.f.set(cvVar.e);
        String str9 = cvVar.f;
        if (str9 != null) {
            bu buVarB = b(str9);
            this.m = buVarB;
            t(buVarB);
        }
        ArrayList arrayList4 = cvVar.g;
        if (arrayList4 != null) {
            for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                this.x.put((String) arrayList4.get(i16), (bb) cvVar.h.get(i16));
            }
        }
        ArrayList arrayList5 = cvVar.i;
        if (arrayList5 != null) {
            for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                Bundle bundle = (Bundle) cvVar.j.get(i17);
                bundle.setClassLoader(this.j.c.getClassLoader());
                this.y.put((String) arrayList5.get(i17), bundle);
            }
        }
        this.o = new ArrayDeque(cvVar.k);
    }

    final void I(bu buVar, boolean z) {
        ViewGroup viewGroupAa = aa(buVar);
        if (viewGroupAa == null || !(viewGroupAa instanceof cc)) {
            return;
        }
        ((cc) viewGroupAa).a = !z;
    }

    final void J(bu buVar, aea aeaVar) {
        if (buVar.equals(b(buVar.k)) && (buVar.z == null || buVar.y == this)) {
            buVar.U = aeaVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + buVar + " is not an active fragment of FragmentManager " + this);
    }

    final void K(bu buVar) {
        if (buVar == null || (buVar.equals(b(buVar.k)) && (buVar.z == null || buVar.y == this))) {
            bu buVar2 = this.m;
            this.m = buVar;
            t(buVar2);
            t(this.m);
            return;
        }
        throw new IllegalArgumentException("Fragment " + buVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void L() {
        synchronized (this.u) {
            if (!this.u.isEmpty()) {
                this.e.a = true;
                return;
            }
            uc ucVar = this.e;
            ArrayList arrayList = this.b;
            ucVar.a = arrayList != null && arrayList.size() > 0 && R(this.l);
        }
    }

    final boolean M(MenuItem menuItem) {
        if (this.i <= 0) {
            return false;
        }
        for (bu buVar : this.a.f()) {
            if (buVar != null && !buVar.F && buVar.A.M(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean N(Menu menu, MenuInflater menuInflater) {
        if (this.i <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (bu buVar : this.a.f()) {
            if (buVar != null && V(buVar) && !buVar.F && buVar.A.N(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(buVar);
                z = true;
            }
        }
        if (this.w != null) {
            for (int i = 0; i < this.w.size(); i++) {
                bu buVar2 = (bu) this.w.get(i);
                if (arrayList != null) {
                    arrayList.contains(buVar2);
                }
            }
        }
        this.w = arrayList;
        return z;
    }

    final boolean O(MenuItem menuItem) {
        if (this.i <= 0) {
            return false;
        }
        for (bu buVar : this.a.f()) {
            if (buVar != null && !buVar.F && buVar.A.O(menuItem)) {
                return true;
            }
        }
        return false;
    }

    final boolean P(Menu menu) {
        boolean z = false;
        if (this.i <= 0) {
            return false;
        }
        for (bu buVar : this.a.f()) {
            if (buVar != null && V(buVar) && !buVar.F && buVar.A.P(menu)) {
                z = true;
            }
        }
        return z;
    }

    final boolean R(bu buVar) {
        if (buVar == null) {
            return true;
        }
        cu cuVar = buVar.y;
        return buVar.equals(cuVar.m) && R(cuVar.l);
    }

    public final boolean S() {
        return this.q || this.r;
    }

    public final boolean T() {
        Y(false);
        ag(true);
        bu buVar = this.m;
        if (buVar != null && buVar.y().T()) {
            return true;
        }
        boolean zW = W(this.D, this.E, -1, 0);
        if (zW) {
            this.v = true;
            try {
                ai(this.D, this.E);
                ad();
            } catch (Throwable th) {
                ad();
                throw th;
            }
        }
        L();
        ae();
        this.a.h();
        return zW;
    }

    final boolean W(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int size;
        ArrayList arrayList3 = this.b;
        if (arrayList3 == null || arrayList3.isEmpty()) {
            size = -1;
        } else if (i < 0) {
            size = i2 != 0 ? 0 : this.b.size() - 1;
        } else {
            int size2 = this.b.size() - 1;
            while (size2 >= 0 && i != ((ay) this.b.get(size2)).c) {
                size2--;
            }
            if (size2 < 0) {
                size = size2;
            } else if (i2 != 0) {
                while (size2 > 0) {
                    int i3 = size2 - 1;
                    if (i != ((ay) this.b.get(i3)).c) {
                        break;
                    }
                    size2 = i3;
                }
                size = size2;
            } else {
                size = size2 == this.b.size() + (-1) ? -1 : size2 + 1;
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.b.size() - 1; size3 >= size; size3--) {
            arrayList.add((ay) this.b.remove(size3));
            arrayList2.add(true);
        }
        return true;
    }

    public final void Y(boolean z) {
        ag(z);
        while (true) {
            ArrayList arrayList = this.D;
            ArrayList arrayList2 = this.E;
            synchronized (this.u) {
                if (this.u.isEmpty()) {
                    break;
                }
                try {
                    int size = this.u.size();
                    boolean zF = false;
                    for (int i = 0; i < size; i++) {
                        zF |= ((cs) this.u.get(i)).f(arrayList, arrayList2);
                    }
                    this.u.clear();
                    this.j.d.removeCallbacks(this.G);
                    if (!zF) {
                        break;
                    }
                    this.v = true;
                    try {
                        ai(this.D, this.E);
                        ad();
                    } catch (Throwable th) {
                        ad();
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.u.clear();
                    this.j.d.removeCallbacks(this.G);
                    throw th2;
                }
            }
        }
        L();
        ae();
        this.a.h();
    }

    final d Z() {
        bu buVar = this.l;
        return buVar != null ? buVar.y.Z() : this.H;
    }

    final Parcelable a() {
        int i;
        az[] azVarArr;
        ArrayList arrayList;
        int size;
        for (dq dqVar : ab()) {
        }
        af();
        Y(true);
        this.q = true;
        this.t.g = true;
        db dbVar = this.a;
        ArrayList arrayList2 = new ArrayList(dbVar.b.size());
        Iterator it = dbVar.b.values().iterator();
        while (true) {
            azVarArr = null;
            azVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            da daVar = (da) it.next();
            if (daVar != null) {
                bu buVar = daVar.c;
                cy cyVar = new cy(buVar);
                bu buVar2 = daVar.c;
                if (buVar2.f < 0 || cyVar.m != null) {
                    cyVar.m = buVar2.g;
                } else {
                    Bundle bundle = new Bundle();
                    bu buVar3 = daVar.c;
                    buVar3.f(bundle);
                    buVar3.X.c(bundle);
                    Parcelable parcelableA = buVar3.A.a();
                    if (parcelableA != null) {
                        bundle.putParcelable("android:support:fragments", parcelableA);
                    }
                    daVar.a.j(daVar.c, bundle, false);
                    Bundle bundle2 = true != bundle.isEmpty() ? bundle : null;
                    if (daVar.c.M != null) {
                        daVar.f();
                    }
                    if (daVar.c.h != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putSparseParcelableArray("android:view_state", daVar.c.h);
                    }
                    if (daVar.c.i != null) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBundle("android:view_registry_state", daVar.c.i);
                    }
                    if (!daVar.c.O) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        bundle2.putBoolean("android:user_visible_hint", daVar.c.O);
                    }
                    cyVar.m = bundle2;
                    if (daVar.c.n != null) {
                        if (cyVar.m == null) {
                            cyVar.m = new Bundle();
                        }
                        cyVar.m.putString("android:target_state", daVar.c.n);
                        int i2 = daVar.c.o;
                        if (i2 != 0) {
                            cyVar.m.putInt("android:target_req_state", i2);
                        }
                    }
                }
                daVar.b.c(daVar.c.k, cyVar);
                arrayList2.add(buVar.k);
                if (Q(2)) {
                    String str = "Saved state of " + buVar + ": " + buVar.g;
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(this.a.c.values());
        if (arrayList3.isEmpty()) {
            return null;
        }
        db dbVar2 = this.a;
        synchronized (dbVar2.a) {
            if (dbVar2.a.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(dbVar2.a.size());
                for (bu buVar4 : dbVar2.a) {
                    arrayList.add(buVar4.k);
                    if (Q(2)) {
                        String str2 = "saveAllState: adding fragment (" + buVar4.k + "): " + buVar4;
                    }
                }
            }
        }
        ArrayList arrayList4 = this.b;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            azVarArr = new az[size];
            for (i = 0; i < size; i++) {
                azVarArr[i] = new az((ay) this.b.get(i));
                if (Q(2)) {
                    String str3 = "saveAllState: adding back stack #" + i + ": " + this.b.get(i);
                }
            }
        }
        cv cvVar = new cv();
        cvVar.a = arrayList3;
        cvVar.b = arrayList2;
        cvVar.c = arrayList;
        cvVar.d = azVarArr;
        cvVar.e = this.f.get();
        bu buVar5 = this.m;
        if (buVar5 != null) {
            cvVar.f = buVar5.k;
        }
        cvVar.g.addAll(this.x.keySet());
        cvVar.h.addAll(this.x.values());
        cvVar.i.addAll(this.y.keySet());
        cvVar.j.addAll(this.y.values());
        cvVar.k = new ArrayList(this.o);
        return cvVar;
    }

    final bu b(String str) {
        return this.a.a(str);
    }

    public final bu c(int i) {
        db dbVar = this.a;
        for (int size = dbVar.a.size() - 1; size >= 0; size--) {
            bu buVar = (bu) dbVar.a.get(size);
            if (buVar != null && buVar.C == i) {
                return buVar;
            }
        }
        for (da daVar : dbVar.b.values()) {
            if (daVar != null) {
                bu buVar2 = daVar.c;
                if (buVar2.C == i) {
                    return buVar2;
                }
            }
        }
        return null;
    }

    public final bu d(String str) {
        db dbVar = this.a;
        for (int size = dbVar.a.size() - 1; size >= 0; size--) {
            bu buVar = (bu) dbVar.a.get(size);
            if (buVar != null && str.equals(buVar.E)) {
                return buVar;
            }
        }
        for (da daVar : dbVar.b.values()) {
            if (daVar != null) {
                bu buVar2 = daVar.c;
                if (str.equals(buVar2.E)) {
                    return buVar2;
                }
            }
        }
        return null;
    }

    public final ce e() {
        bu buVar = this.l;
        return buVar != null ? buVar.y.e() : this.z;
    }

    final da f(bu buVar) {
        String str = buVar.T;
        if (str != null) {
            adl.a(buVar, str);
        }
        if (Q(2)) {
            String str2 = "add: " + buVar;
        }
        da daVarG = g(buVar);
        buVar.y = this;
        this.a.i(daVarG);
        if (!buVar.G) {
            this.a.g(buVar);
            buVar.r = false;
            if (buVar.M == null) {
                buVar.Q = false;
            }
            if (U(buVar)) {
                this.p = true;
            }
        }
        return daVarG;
    }

    final da g(bu buVar) {
        da daVarD = this.a.d(buVar.k);
        if (daVarD != null) {
            return daVarD;
        }
        da daVar = new da(this.g, this.a, buVar);
        daVar.e(this.j.c.getClassLoader());
        daVar.d = this.i;
        return daVar;
    }

    public final dd h() {
        return new ay(this);
    }

    public final void i(cx cxVar) {
        this.h.add(cxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [aee] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r5v0, types: [aey, cf, cx] */
    /* JADX WARN: Type inference failed for: r5v8, types: [ajo, cf] */
    final void j(cf cfVar, cb cbVar, bu buVar) {
        String str;
        if (this.j != null) {
            throw new IllegalStateException("Already attached");
        }
        this.j = cfVar;
        this.k = cbVar;
        this.l = buVar;
        if (buVar != null) {
            i(new cn());
        } else if (cfVar instanceof cx) {
            i(cfVar);
        }
        if (this.l != null) {
            L();
        }
        if (cfVar instanceof uf) {
            ue ueVar = ((bx) cfVar).a.h;
            this.d = ueVar;
            ?? r0 = buVar != null ? buVar : cfVar;
            uc ucVar = this.e;
            aeb aebVarC = r0.C();
            if (aebVarC.a != aea.DESTROYED) {
                ucVar.a(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(ueVar, aebVarC, ucVar));
            }
        }
        if (buVar != null) {
            cw cwVar = buVar.y.t;
            cw cwVar2 = (cw) cwVar.c.get(buVar.k);
            if (cwVar2 == null) {
                cwVar2 = new cw(cwVar.e);
                cwVar.c.put(buVar.k, cwVar2);
            }
            this.t = cwVar2;
        } else if (cfVar instanceof aey) {
            aih aihVarAg = cfVar.ag();
            aev aevVar = cw.a;
            aihVarAg.getClass();
            this.t = (cw) aas.c(cw.class, aihVarAg, aevVar);
        } else {
            this.t = new cw(false);
        }
        this.t.g = S();
        this.a.d = this.t;
        ?? r5 = this.j;
        if ((r5 instanceof ajo) && buVar == null) {
            ajm ajmVarD = r5.D();
            ajmVarD.b("android:support:fragments", new ajl() { // from class: ck
                @Override // defpackage.ajl
                public final Bundle a() {
                    cu cuVar = this.a;
                    Bundle bundle = new Bundle();
                    Parcelable parcelableA = cuVar.a();
                    if (parcelableA != null) {
                        bundle.putParcelable("android:support:fragments", parcelableA);
                    }
                    return bundle;
                }
            });
            Bundle bundleA = ajmVarD.a("android:support:fragments");
            if (bundleA != null) {
                H(bundleA.getParcelable("android:support:fragments"));
            }
        }
        cf cfVar2 = this.j;
        if (cfVar2 instanceof un) {
            um umVar = ((bx) cfVar2).a.i;
            if (buVar != null) {
                str = buVar.k + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.n = umVar.a(str2 + "StartActivityForResult", new ur(), new co(this, 1));
            this.A = umVar.a(str2 + "StartIntentSenderForResult", new cq(), new co(this, 0));
            this.B = umVar.a(str2 + "RequestPermissions", new uq(), new cp(this));
        }
    }

    final void k(bu buVar) {
        if (Q(2)) {
            String str = "attach: " + buVar;
        }
        if (buVar.G) {
            buVar.G = false;
            if (buVar.q) {
                return;
            }
            this.a.g(buVar);
            if (Q(2)) {
                String str2 = "add from attach: " + buVar;
            }
            if (U(buVar)) {
                this.p = true;
            }
        }
    }

    final void l(bu buVar) {
        if (Q(2)) {
            String str = "detach: " + buVar;
        }
        if (buVar.G) {
            return;
        }
        buVar.G = true;
        if (buVar.q) {
            if (Q(2)) {
                String str2 = "remove from detach: " + buVar;
            }
            this.a.k(buVar);
            if (U(buVar)) {
                this.p = true;
            }
            aj(buVar);
        }
    }

    final void m() {
        this.q = false;
        this.r = false;
        this.t.g = false;
        y(4);
    }

    final void n(Configuration configuration) {
        for (bu buVar : this.a.f()) {
            if (buVar != null) {
                buVar.onConfigurationChanged(configuration);
                buVar.A.n(configuration);
            }
        }
    }

    final void o() {
        this.q = false;
        this.r = false;
        this.t.g = false;
        y(1);
    }

    final void p() {
        this.s = true;
        Y(true);
        af();
        cf cfVar = this.j;
        if (cfVar instanceof aey ? this.a.d.f : true ^ ((Activity) cfVar.c).isChangingConfigurations()) {
            Iterator it = this.x.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((bb) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.a.d.b((String) it2.next());
                }
            }
        }
        y(-1);
        this.j = null;
        this.k = null;
        this.l = null;
        if (this.d != null) {
            Iterator it3 = this.e.b.iterator();
            while (it3.hasNext()) {
                ((tu) it3.next()).b();
            }
            this.d = null;
        }
        uk ukVar = this.n;
        if (ukVar != null) {
            ukVar.a();
            this.A.a();
            this.B.a();
        }
    }

    final void q() {
        for (bu buVar : this.a.f()) {
            if (buVar != null) {
                buVar.onLowMemory();
                buVar.A.q();
            }
        }
    }

    final void r(boolean z) {
        for (bu buVar : this.a.f()) {
            if (buVar != null) {
                buVar.A.r(z);
            }
        }
    }

    final void s(Menu menu) {
        if (this.i <= 0) {
            return;
        }
        for (bu buVar : this.a.f()) {
            if (buVar != null && !buVar.F) {
                buVar.A.s(menu);
            }
        }
    }

    public final void t(bu buVar) {
        if (buVar == null || !buVar.equals(b(buVar.k))) {
            return;
        }
        boolean zR = buVar.y.R(buVar);
        Boolean bool = buVar.p;
        if (bool == null || bool.booleanValue() != zR) {
            buVar.p = Boolean.valueOf(zR);
            cu cuVar = buVar.A;
            cuVar.L();
            cuVar.t(cuVar.m);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        bu buVar = this.l;
        if (buVar != null) {
            sb.append(buVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.l)));
            sb.append("}");
        } else {
            cf cfVar = this.j;
            if (cfVar != null) {
                sb.append(cfVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.j)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    final void u() {
        y(5);
    }

    final void v(boolean z) {
        for (bu buVar : this.a.f()) {
            if (buVar != null) {
                buVar.A.v(z);
            }
        }
    }

    final void w() {
        this.q = false;
        this.r = false;
        this.t.g = false;
        y(7);
    }

    final void x() {
        this.q = false;
        this.r = false;
        this.t.g = false;
        y(5);
    }

    public final void y(int i) {
        try {
            this.v = true;
            for (da daVar : this.a.b.values()) {
                if (daVar != null) {
                    daVar.d = i;
                }
            }
            E(i, false);
            Iterator it = ab().iterator();
            while (it.hasNext()) {
                ((dq) it.next()).c();
            }
            this.v = false;
            Y(true);
        } catch (Throwable th) {
            this.v = false;
            throw th;
        }
    }

    final void z() {
        this.r = true;
        this.t.g = true;
        y(4);
    }
}
