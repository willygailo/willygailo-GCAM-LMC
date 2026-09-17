package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.kno;
import defpackage.kpf;
import defpackage.kpk;
import defpackage.kqa;
import defpackage.mip;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class GoogleHelp extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kpk();
    boolean A;
    boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    kpf s;
    List t;
    boolean u;
    ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    @Deprecated
    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, kpf kpfVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            kpf kpfVar2 = new kpf();
            kpfVar2.a = i4;
            this.s = kpfVar2;
        } else {
            this.s = kpfVar == null ? new kpf() : kpfVar;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
    }

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, kpf kpfVar, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings) {
        this(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, kpfVar, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6);
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
    }

    public final void a(int i, String str, Intent intent) {
        this.r.add(new kqa(i, str, intent));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cA(parcel, 1, this.a);
        mip.cI(parcel, 2, this.b);
        mip.cH(parcel, 3, this.c, i);
        mip.cC(parcel, 4, this.d);
        mip.cw(parcel, 5, this.h);
        mip.cw(parcel, 6, this.i);
        mip.cK(parcel, 7, this.j);
        mip.cC(parcel, 10, this.k);
        mip.cH(parcel, 11, this.l, i);
        mip.cI(parcel, 14, this.p);
        mip.cH(parcel, 15, this.q, i);
        mip.cM(parcel, 16, this.r);
        mip.cA(parcel, 17, 0);
        mip.cM(parcel, 18, this.t);
        mip.cD(parcel, 19, this.m);
        mip.cA(parcel, 20, this.n);
        mip.cA(parcel, 21, this.o);
        mip.cw(parcel, 22, this.u);
        mip.cH(parcel, 23, this.v, i);
        mip.cH(parcel, 25, this.s, i);
        mip.cI(parcel, 28, this.e);
        mip.cH(parcel, 31, this.w, i);
        mip.cA(parcel, 32, this.x);
        mip.cH(parcel, 33, this.y, i);
        mip.cI(parcel, 34, this.f);
        mip.cH(parcel, 35, this.g, i);
        mip.cA(parcel, 36, this.z);
        mip.cw(parcel, 37, this.A);
        mip.cw(parcel, 38, this.B);
        mip.cA(parcel, 39, this.C);
        mip.cI(parcel, 40, this.D);
        mip.cw(parcel, 41, this.E);
        mip.cI(parcel, 42, this.F);
        mip.cw(parcel, 43, this.G);
        mip.cH(parcel, 44, this.H, i);
        mip.cv(parcel, iCt);
    }
}
