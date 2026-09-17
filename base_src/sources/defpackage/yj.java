package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class yj {
    public int b;
    public boolean c;
    public final yk d;
    public yj e;
    public yf h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public yj(yk ykVar, int i) {
        this.d = ykVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        yj yjVar;
        if (this.d.ag == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (yjVar = this.e) == null || yjVar.d.ag != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, zf zfVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                wk.a(((yj) it.next()).d, i, arrayList, zfVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        yj yjVar = this.e;
        if (yjVar != null && (hashSet = yjVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        yj yjVar;
        HashSet<yj> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        for (yj yjVar2 : hashSet) {
            switch (yjVar2.i - 1) {
                case 1:
                    yjVar = yjVar2.d.L;
                    break;
                case 2:
                    yjVar = yjVar2.d.M;
                    break;
                case 3:
                    yjVar = yjVar2.d.J;
                    break;
                case 4:
                    yjVar = yjVar2.d.K;
                    break;
                default:
                    yjVar = null;
                    break;
            }
            if (yjVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        yf yfVar = this.h;
        if (yfVar == null) {
            this.h = new yf(1);
        } else {
            yfVar.c();
        }
    }

    public final void j(yj yjVar, int i, int i2) {
        if (yjVar == null) {
            d();
            return;
        }
        this.e = yjVar;
        if (yjVar.a == null) {
            yjVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        String str2 = this.d.ah;
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}
