package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class pxs implements Parcelable {
    public int l;
    public int n;
    public int p;
    public int r;
    public int t;
    public static final ArrayDeque j = new ArrayDeque();
    public static final Object k = new Object();
    public static final Parcelable.Creator CREATOR = new laa(9);
    public pxn[] m = new pxn[16];
    public pxp[] o = new pxp[16];
    public pxt[] q = new pxt[16];
    public pxv[] s = new pxv[16];
    public pyb[] u = new pyb[16];

    public pxs() {
        for (int i = 0; i < 16; i++) {
            this.m[i] = new pxn();
            this.o[i] = new pxp();
            this.q[i] = new pxt();
            this.s[i] = new pxv();
            this.u[i] = new pyb();
        }
        b();
    }

    static void f(int i, int i2, pxq[] pxqVarArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            pxqVarArr[i3].e = i;
        }
    }

    protected static final void g(int i) {
        if (i < 0 || i >= 16) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Invalid event count: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void b() {
        this.l = 0;
        this.n = 0;
        this.p = 0;
        this.r = 0;
        this.t = 0;
    }

    public void c(Parcel parcel) {
        parcel.readInt();
        int i = parcel.readInt();
        this.l = i;
        g(i);
        for (int i2 = 0; i2 < this.l; i2++) {
            this.m[i2].a(parcel);
        }
        int i3 = parcel.readInt();
        this.n = i3;
        g(i3);
        for (int i4 = 0; i4 < this.n; i4++) {
            this.o[i4].a(parcel);
        }
        int i5 = parcel.readInt();
        this.p = i5;
        g(i5);
        for (int i6 = 0; i6 < this.p; i6++) {
            this.q[i6].a(parcel);
        }
        int i7 = parcel.readInt();
        this.r = i7;
        g(i7);
        for (int i8 = 0; i8 < this.r; i8++) {
            this.s[i8].a(parcel);
        }
        int i9 = parcel.readInt();
        this.t = i9;
        g(i9);
        for (int i10 = 0; i10 < this.t; i10++) {
            this.u[i10].a(parcel);
        }
    }

    public void d() {
        b();
        synchronized (k) {
            ArrayDeque arrayDeque = j;
            if (!arrayDeque.contains(this)) {
                arrayDeque.add(this);
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e(int i) {
        f(i, this.l, this.m);
        f(i, this.n, this.o);
        f(i, this.p, this.q);
        f(i, this.r, this.s);
        f(i, this.t, this.u);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
        parcel.writeInt(this.l);
        for (int i2 = 0; i2 < this.l; i2++) {
            this.m[i2].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.n);
        for (int i3 = 0; i3 < this.n; i3++) {
            this.o[i3].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.p);
        for (int i4 = 0; i4 < this.p; i4++) {
            this.q[i4].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.r);
        for (int i5 = 0; i5 < this.r; i5++) {
            this.s[i5].writeToParcel(parcel, i);
        }
        parcel.writeInt(this.t);
        for (int i6 = 0; i6 < this.t; i6++) {
            this.u[i6].writeToParcel(parcel, i);
        }
    }
}
