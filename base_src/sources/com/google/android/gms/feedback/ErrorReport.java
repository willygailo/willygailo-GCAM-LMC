package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.kpb;
import defpackage.kpd;
import defpackage.kpe;
import defpackage.kpf;
import defpackage.mip;
import defpackage.sk;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ErrorReport extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new sk(19);
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public kpd[] U;
    public String[] V;
    public boolean W;
    public String X;
    public kpf Y;
    public kpe Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, kpd[] kpdVarArr, String[] strArr4, boolean z3, String str29, kpf kpfVar, kpe kpeVar, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = kpdVarArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = kpfVar;
        this.Z = kpeVar;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
    }

    public ErrorReport(kpb kpbVar, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = kpbVar.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = kpbVar.b;
        }
        if (!TextUtils.isEmpty(kpbVar.a)) {
            this.B = kpbVar.a;
        }
        if (!TextUtils.isEmpty(kpbVar.c)) {
            this.b = kpbVar.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = kpbVar.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        kpf kpfVar = kpbVar.j;
        if (kpfVar != null) {
            this.Y = kpfVar;
        }
        if (!TextUtils.isEmpty(kpbVar.e)) {
            this.P = kpbVar.e;
        }
        String str = kpbVar.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(kpbVar.n)) {
            this.ag = kpbVar.n;
        }
        Bitmap bitmap = kpbVar.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = kpbVar.f;
            List list = kpbVar.h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((kpd) it.next()).d = file;
                }
                this.U = (kpd[]) list.toArray(new kpd[0]);
            }
        }
        kpe kpeVar = kpbVar.k;
        if (kpeVar != null) {
            this.Z = kpeVar;
        }
        this.W = kpbVar.i;
        this.ae = kpbVar.l;
        this.E = kpbVar.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 2, this.a, i);
        mip.cI(parcel, 3, this.b);
        mip.cA(parcel, 4, this.c);
        mip.cI(parcel, 5, this.d);
        mip.cI(parcel, 6, this.e);
        mip.cI(parcel, 7, this.f);
        mip.cI(parcel, 8, this.g);
        mip.cI(parcel, 9, this.h);
        mip.cI(parcel, 10, this.i);
        mip.cI(parcel, 11, this.j);
        mip.cA(parcel, 12, this.k);
        mip.cI(parcel, 13, this.l);
        mip.cI(parcel, 14, this.m);
        mip.cI(parcel, 15, this.n);
        mip.cI(parcel, 16, this.o);
        mip.cI(parcel, 17, this.p);
        mip.cJ(parcel, 18, this.q);
        mip.cJ(parcel, 19, this.r);
        mip.cJ(parcel, 20, this.s);
        mip.cI(parcel, 21, this.t);
        mip.cI(parcel, 22, this.u);
        mip.cD(parcel, 23, this.v);
        mip.cA(parcel, 24, this.w);
        mip.cA(parcel, 25, this.x);
        mip.cA(parcel, 26, this.y);
        mip.cA(parcel, 27, this.z);
        mip.cI(parcel, 28, this.A);
        mip.cI(parcel, 29, this.B);
        mip.cI(parcel, 30, this.C);
        mip.cC(parcel, 31, this.D);
        mip.cw(parcel, 32, this.E);
        mip.cA(parcel, 33, this.F);
        mip.cA(parcel, 34, this.G);
        mip.cw(parcel, 35, this.H);
        mip.cI(parcel, 36, this.I);
        mip.cI(parcel, 37, this.J);
        mip.cA(parcel, 38, this.K);
        mip.cI(parcel, 39, this.L);
        mip.cI(parcel, 40, this.M);
        mip.cI(parcel, 41, this.N);
        mip.cI(parcel, 42, this.O);
        mip.cI(parcel, 43, this.P);
        mip.cI(parcel, 44, this.Q);
        mip.cI(parcel, 45, this.R);
        mip.cH(parcel, 46, this.S, i);
        mip.cI(parcel, 47, this.T);
        mip.cL(parcel, 48, this.U, i);
        mip.cJ(parcel, 49, this.V);
        mip.cw(parcel, 50, this.W);
        mip.cI(parcel, 51, this.X);
        mip.cH(parcel, 52, this.Y, i);
        mip.cH(parcel, 53, this.Z, i);
        mip.cI(parcel, 54, this.aa);
        mip.cw(parcel, 55, this.ab);
        mip.cC(parcel, 56, this.ac);
        mip.cM(parcel, 57, this.ad);
        mip.cw(parcel, 58, this.ae);
        mip.cH(parcel, 59, this.af, i);
        mip.cI(parcel, 60, this.ag);
        mip.cK(parcel, 61, this.ah);
        mip.cA(parcel, 62, this.ai);
        mip.cv(parcel, iCt);
    }
}
