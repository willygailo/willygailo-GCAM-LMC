package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes3.dex */
public final class fw {
    static boolean a(View view) {
        return view.hasOnClickListeners();
    }

    public static void b(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof fr) {
            ((fr) viewParent).a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof fs) {
            ((fs) viewParent).f(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof fr) {
            ((fr) viewParent).b(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                viewParent.onNestedScroll(view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof fr) {
            ((fr) viewParent).c(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof fr) {
            ((fr) viewParent).d(view, i);
            return;
        }
        if (i == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public static boolean g(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public static boolean h(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof fr) {
            return ((fr) viewParent).e(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    public static aig i(Context context, Class cls, String str) {
        if (str.trim().length() != 0) {
            return new aig(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static Object j(Class cls) {
        String str;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str2 = canonicalName.replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str2;
            } else {
                str = name + "." + str2;
            }
            return Class.forName(str, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str2 + " does not exist");
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    public static void k(ddj ddjVar, ddf ddfVar, lzi lziVar, dei deiVar, hwx hwxVar) {
        ddjVar.m(dcs.e, Float.valueOf(1.3229325E7f));
        ddjVar.m(dcs.f, Float.valueOf(3.807744E7f));
        dep depVar = (dep) ddjVar;
        depVar.s(ddl.aR, true);
        ddg ddgVar = ddl.K;
        boolean z = lziVar.k || lziVar.j;
        depVar.s(ddgVar, z);
        depVar.s(ddl.aV, true);
        ddjVar.l(ddl.m, -1);
        ddjVar.m(ddl.bm, Float.valueOf(1.580689f));
        depVar.s(ddl.aB, false);
        depVar.q(ddl.ag, true);
        ddjVar.l(ddl.c, 2);
        depVar.s(ddl.aZ, true);
        depVar.s(dde.f, true);
        depVar.s(dcz.c, true);
        depVar.s(ddd.a, true);
        depVar.s(ddd.b, true);
        depVar.s(ddd.c, true);
        depVar.s(dcu.E, true);
        depVar.s(dcu.G, true);
        depVar.s(dcu.ag, true);
        depVar.s(dcu.P, true);
        depVar.s(dcu.L, true);
        depVar.s(dcu.T, true);
        depVar.s(dcu.U, true);
        depVar.s(dcu.Z, false);
        ddg ddgVar2 = dcu.A;
        Float fValueOf = Float.valueOf(7.0f);
        ddjVar.m(ddgVar2, fValueOf);
        ddjVar.m(dcu.B, fValueOf);
        ddjVar.l(ddm.b, 2);
        ddjVar.l(ddm.c, 2);
        depVar.s(ddt.e, deiVar.b(dei.FISHFOOD));
        depVar.s(ddm.aa, true);
        depVar.s(ddm.ab, true);
        depVar.s(ddm.aj, true);
        depVar.s(ddm.an, true);
        depVar.s(ddm.L, false);
        depVar.s(ddm.K, false);
        depVar.s(ddx.C, true);
        ddjVar.m(ddq.b, Float.valueOf(2.948064E7f));
        ddjVar.m(ddq.c, Float.valueOf(2.380845E7f));
        depVar.s(dde.h, true);
        depVar.s(ddp.x, false);
        hwxVar.b(107703678L);
        depVar.q(ddr.f, false);
        depVar.s(ddr.q, true);
        depVar.s(ddr.j, false);
        depVar.s(ddr.t, true);
        depVar.s(dds.q, true);
        depVar.s(dds.O, true);
        depVar.s(dds.N, true);
        depVar.s(dds.P, false);
        depVar.s(dds.r, false);
        depVar.s(dds.l, true);
        depVar.s(dds.g, true);
        depVar.s(dds.h, true);
        depVar.s(dds.e, true);
        depVar.s(dds.f, true);
        depVar.s(dds.G, true);
        deiVar.b(dei.FISHFOOD);
        ddjVar.l(ddu.b, Integer.valueOf(((Integer) ddfVar.a(ddu.c).c()).intValue() * 4));
        depVar.s(ddu.k, false);
        depVar.s(ddu.l, true);
        int i = dct.a;
        depVar.s(ddx.w, true);
        depVar.s(ddx.v, true);
        depVar.s(ddx.D, true);
        ddjVar.l(ddx.c, 2016);
        ddjVar.l(ddx.d, 1508);
        ddjVar.l(ddx.e, 0);
        depVar.s(ddx.s, true);
        ddjVar.l(ddx.b, 3000);
        depVar.s(ddy.c, true);
        ddjVar.l(ddy.a, 1);
        depVar.s(ddl.T, true);
        depVar.s(ddl.U, lziVar.k);
        depVar.s(ddl.V, true);
        ddi ddiVar = dee.a;
        deiVar.b(dei.FISHFOOD);
        int i2 = ddb.a;
        depVar.s(ddm.ap, true);
        depVar.s(ddm.aq, true);
        depVar.s(ddm.ar, true);
        deiVar.b(dei.DOGFOOD);
    }
}
