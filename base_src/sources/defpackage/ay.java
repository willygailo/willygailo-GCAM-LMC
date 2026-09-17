package defpackage;

import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class ay extends dd implements cs {
    final cu a;
    boolean b;
    int c;

    public ay(cu cuVar) {
        cuVar.e();
        cf cfVar = cuVar.j;
        if (cfVar != null) {
            cfVar.c.getClassLoader();
        }
        this.c = -1;
        this.a = cuVar;
    }

    final void a(int i) {
        if (this.j) {
            if (cu.Q(2)) {
                String str = "Bump nesting in " + this + " by " + i;
            }
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                dc dcVar = (dc) this.d.get(i2);
                bu buVar = dcVar.b;
                if (buVar != null) {
                    buVar.x += i;
                    if (cu.Q(2)) {
                        String str2 = "Bump nesting of " + dcVar.b + " to " + dcVar.b.x;
                    }
                }
            }
        }
    }

    @Override // defpackage.dd
    public final void b() {
        o();
        this.a.C(this, false);
    }

    @Override // defpackage.dd
    public final void c(int i, bu buVar, String str, int i2) {
        String str2 = buVar.T;
        if (str2 != null) {
            adl.a(buVar, str2);
        }
        Class<?> cls = buVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = buVar.E;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + buVar + ": was " + buVar.E + " now " + str);
            }
            buVar.E = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + buVar + " with tag " + str + " to container view with no id");
            }
            int i3 = buVar.C;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + buVar + ": was " + buVar.C + " now " + i);
            }
            buVar.C = i;
            buVar.D = i;
        }
        k(new dc(i2, buVar));
        buVar.y = this.a;
    }

    public final void d(String str, PrintWriter printWriter) {
        e(str, printWriter, true);
    }

    public final void e(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.m != 0 || this.n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.m));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.n);
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.o));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.p);
            }
        }
        if (this.d.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            dc dcVar = (dc) this.d.get(i);
            switch (dcVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + dcVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(dcVar.b);
            if (z) {
                if (dcVar.d != 0 || dcVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(dcVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(dcVar.e));
                }
                if (dcVar.f != 0 || dcVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(dcVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(dcVar.g));
                }
            }
        }
    }

    @Override // defpackage.cs
    public final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        if (cu.Q(2)) {
            String str = "Run: " + this;
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.j) {
            return true;
        }
        cu cuVar = this.a;
        if (cuVar.b == null) {
            cuVar.b = new ArrayList();
        }
        cuVar.b.add(this);
        return true;
    }

    @Override // defpackage.dd
    public final void g() {
        i(false);
    }

    @Override // defpackage.dd
    public final void h() {
        i(true);
    }

    final void i(boolean z) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (cu.Q(2)) {
            String str = "Commit: " + this;
            PrintWriter printWriter = new PrintWriter(new dh());
            d("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.j) {
            this.c = this.a.f.getAndIncrement();
        } else {
            this.c = -1;
        }
        this.a.B(this, z);
    }

    @Override // defpackage.dd
    public final void j(bu buVar) {
        cu cuVar = buVar.y;
        if (cuVar == null || cuVar == this.a) {
            k(new dc(3, buVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + buVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.l != null) {
            sb.append(" ");
            sb.append(this.l);
        }
        sb.append("}");
        return sb.toString();
    }
}
