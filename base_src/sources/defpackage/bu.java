package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class bu implements ComponentCallbacks, View.OnCreateContextMenuListener, aee, aey, ajo {
    static final Object e = new Object();
    public bu B;
    int C;
    int D;
    String E;
    boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    public boolean K;
    public ViewGroup L;
    public View M;
    boolean N;
    public br P;
    boolean Q;
    public LayoutInflater R;
    boolean S;
    public String T;
    dg V;
    ajn X;
    public final ArrayList Y;
    aeb Z;
    Bundle g;
    SparseArray h;
    Bundle i;
    Boolean j;
    public Bundle l;
    bu m;
    int o;
    boolean q;
    public boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    boolean w;
    int x;
    public cu y;
    public cf z;
    int f = -1;
    String k = UUID.randomUUID().toString();
    String n = null;
    public Boolean p = null;
    cu A = new cu();
    boolean O = true;
    aea U = aea.RESUMED;
    final aen W = new aen();

    public bu() {
        new AtomicInteger();
        this.Y = new ArrayList();
        ah();
    }

    @Deprecated
    public static bu ac(Context context, String str) {
        try {
            try {
                return (bu) ce.a(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassCastException e2) {
                throw new bs("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
            } catch (ClassNotFoundException e3) {
                throw new bs("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
            }
        } catch (IllegalAccessException e4) {
            throw new bs("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (InstantiationException e5) {
            throw new bs("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e5);
        } catch (NoSuchMethodException e6) {
            throw new bs("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e6);
        } catch (InvocationTargetException e7) {
            throw new bs("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e7);
        }
    }

    private final void ah() {
        this.Z = new aeb(this);
        this.X = ajn.a(this);
    }

    private final int k() {
        return (this.U == aea.INITIALIZED || this.B == null) ? this.U.ordinal() : Math.min(this.U.ordinal(), this.B.k());
    }

    private final bu l(boolean z) {
        String str;
        if (z) {
            adl.c(this);
        }
        bu buVar = this.m;
        if (buVar != null) {
            return buVar;
        }
        cu cuVar = this.y;
        if (cuVar == null || (str = this.n) == null) {
            return null;
        }
        return cuVar.b(str);
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public final View B() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // defpackage.aee
    public final aeb C() {
        return this.Z;
    }

    @Override // defpackage.ajo
    public final ajm D() {
        return this.X.a;
    }

    public final String E(int i) {
        return t().getString(i);
    }

    public void F(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.C));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mTag=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.t);
        printWriter.print(" mInLayout=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.F);
        printWriter.print(" mDetached=");
        printWriter.print(this.G);
        printWriter.print(" mMenuVisible=");
        printWriter.print(true);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.H);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.O);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.y);
        }
        if (this.z != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.z);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.B);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.l);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.g);
        }
        if (this.h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.h);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.i);
        }
        bu buVarL = l(false);
        if (buVarL != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(buVarL);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(V());
        if (n() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(n());
        }
        if (o() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(o());
        }
        if (p() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(p());
        }
        if (q() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(q());
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.L);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.M);
        }
        if (r() != null) {
            afa.a(this).d(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.A + ":");
        this.A.A(str + "  ", fileDescriptor, printWriter, strArr);
    }

    final void G() {
        ah();
        this.T = this.k;
        this.k = UUID.randomUUID().toString();
        this.q = false;
        this.r = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.x = 0;
        this.y = null;
        this.A = new cu();
        this.z = null;
        this.C = 0;
        this.D = 0;
        this.E = null;
        this.F = false;
        this.G = false;
    }

    @Deprecated
    public void H(Bundle bundle) {
        this.K = true;
    }

    @Deprecated
    public void I(int i, int i2, Intent intent) {
        if (cu.Q(2)) {
            String str = "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent;
        }
    }

    public void J() {
        this.K = true;
    }

    public void K() {
        this.K = true;
    }

    public void L() {
        this.K = true;
    }

    public void M(View view, Bundle bundle) {
    }

    final void N() {
        M(this.M, this.g);
        this.A.y(2);
    }

    final void O(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.A.H(parcelable);
        this.A.o();
    }

    public final void P(int i, int i2, int i3, int i4) {
        if (this.P == null && i == 0) {
            if (i2 != 0) {
                i = 0;
            } else if (i3 != 0) {
                i = 0;
                i2 = 0;
            } else {
                if (i4 == 0) {
                    return;
                }
                i = 0;
                i2 = 0;
                i3 = 0;
            }
        }
        u().b = i;
        u().c = i2;
        u().d = i3;
        u().e = i4;
    }

    public final void Q(Bundle bundle) {
        cu cuVar = this.y;
        if (cuVar != null && cuVar.S()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.l = bundle;
    }

    final void R(View view) {
        u().m = view;
    }

    final void S(int i) {
        if (this.P == null && i == 0) {
            return;
        }
        u();
        this.P.f = i;
    }

    final void T(boolean z) {
        if (this.P == null) {
            return;
        }
        u().a = z;
    }

    final void U(ArrayList arrayList, ArrayList arrayList2) {
        u();
        br brVar = this.P;
        brVar.g = arrayList;
        brVar.h = arrayList2;
    }

    final boolean V() {
        br brVar = this.P;
        if (brVar == null) {
            return false;
        }
        return brVar.a;
    }

    public final boolean W() {
        return this.z != null && this.q;
    }

    final boolean X() {
        return this.x > 0;
    }

    public final void Y() {
    }

    public final void Z() {
    }

    @Deprecated
    public final LayoutInflater aa() {
        cf cfVar = this.z;
        if (cfVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        bx bxVar = (bx) cfVar;
        LayoutInflater layoutInflaterCloneInContext = bxVar.a.getLayoutInflater().cloneInContext(bxVar.a);
        layoutInflaterCloneInContext.setFactory2(this.A.c);
        return layoutInflaterCloneInContext;
    }

    public final void ab() {
    }

    public final void ad() {
        this.K = true;
        cf cfVar = this.z;
        if ((cfVar == null ? null : cfVar.b) != null) {
            this.K = true;
        }
    }

    @Deprecated
    public final void ae(bu buVar) {
        adl.e(this, buVar);
        cu cuVar = this.y;
        cu cuVar2 = buVar.y;
        if (cuVar != null && cuVar2 != null && cuVar != cuVar2) {
            throw new IllegalArgumentException("Fragment " + buVar + " must share the same FragmentManager to be set as a target fragment");
        }
        for (bu buVarL = buVar; buVarL != null; buVarL = buVarL.l(false)) {
            if (buVarL.equals(this)) {
                throw new IllegalArgumentException("Setting " + buVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (this.y == null || buVar.y == null) {
            this.n = null;
            this.m = buVar;
        } else {
            this.n = buVar.k;
            this.m = null;
        }
        this.o = 0;
    }

    public final LayoutInflater af() {
        LayoutInflater layoutInflaterM = m();
        this.R = layoutInflaterM;
        return layoutInflaterM;
    }

    @Override // defpackage.aey
    public final aih ag() {
        if (this.y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (k() == aea.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        cw cwVar = this.y.t;
        aih aihVar = (aih) cwVar.d.get(this.k);
        if (aihVar != null) {
            return aihVar;
        }
        aih aihVar2 = new aih(null);
        cwVar.d.put(this.k, aihVar2);
        return aihVar2;
    }

    public void e() {
        this.K = true;
    }

    public void f(Bundle bundle) {
    }

    public cb fr() {
        return new bq(this);
    }

    public void g() {
        this.K = true;
    }

    public void gA(Bundle bundle) {
        this.K = true;
        O(bundle);
        cu cuVar = this.A;
        if (cuVar.i > 0) {
            return;
        }
        cuVar.o();
    }

    public void gv(Context context) {
        this.K = true;
        cf cfVar = this.z;
        if ((cfVar == null ? null : cfVar.b) != null) {
            this.K = true;
        }
    }

    public void gw() {
        this.K = true;
    }

    public void h() {
        this.K = true;
    }

    public void i(Bundle bundle) {
        this.K = true;
    }

    public void j(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A.F();
        this.w = true;
        this.V = new dg(ag(), null);
        View viewA = A(layoutInflater, viewGroup, bundle);
        this.M = viewA;
        if (viewA == null) {
            if (this.V.b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
        } else {
            this.V.b();
            aat.c(this.M, this.V);
            aau.b(this.M, this.V);
            fz.d(this.M, this.V);
            this.W.g(this.V);
        }
    }

    public LayoutInflater m() {
        return aa();
    }

    public final int n() {
        br brVar = this.P;
        if (brVar == null) {
            return 0;
        }
        return brVar.b;
    }

    public final int o() {
        br brVar = this.P;
        if (brVar == null) {
            return 0;
        }
        return brVar.c;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        x().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.K = true;
    }

    public final int p() {
        br brVar = this.P;
        if (brVar == null) {
            return 0;
        }
        return brVar.d;
    }

    public final int q() {
        br brVar = this.P;
        if (brVar == null) {
            return 0;
        }
        return brVar.e;
    }

    public final Context r() {
        cf cfVar = this.z;
        if (cfVar == null) {
            return null;
        }
        return cfVar.c;
    }

    public final Context s() {
        Context contextR = r();
        if (contextR != null) {
            return contextR;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.z == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        cu cuVarZ = z();
        if (cuVarZ.n == null) {
            cuVarZ.j.d(intent, i);
            return;
        }
        cuVarZ.o.addLast(new cr(this.k, i));
        uk ukVar = cuVarZ.n;
        Integer num = (Integer) ukVar.c.c.get(ukVar.a);
        if (num != null) {
            ukVar.c.e.add(ukVar.a);
            ukVar.c.d(num.intValue(), ukVar.b, intent);
            return;
        }
        throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + ukVar.b + " and input " + intent + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }

    public final Resources t() {
        return s().getResources();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.k);
        if (this.C != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.C));
        }
        if (this.E != null) {
            sb.append(" tag=");
            sb.append(this.E);
        }
        sb.append(")");
        return sb.toString();
    }

    public final br u() {
        if (this.P == null) {
            this.P = new br();
        }
        return this.P;
    }

    @Deprecated
    public final bu v() {
        return l(true);
    }

    public final by w() {
        cf cfVar = this.z;
        if (cfVar == null) {
            return null;
        }
        return (by) cfVar.b;
    }

    public final by x() {
        by byVarW = w();
        if (byVarW != null) {
            return byVarW;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final cu y() {
        if (this.z != null) {
            return this.A;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final cu z() {
        cu cuVar = this.y;
        if (cuVar != null) {
            return cuVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }
}
