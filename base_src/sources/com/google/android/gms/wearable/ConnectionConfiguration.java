package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kno;
import defpackage.ktu;
import defpackage.mip;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionConfiguration extends kno implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ktu(11);
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public volatile boolean f;
    public volatile String g;
    public boolean h;
    public String i;
    public String j;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return mip.dx(this.a, connectionConfiguration.a) && mip.dx(this.b, connectionConfiguration.b) && mip.dx(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) && mip.dx(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) && mip.dx(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) && mip.dx(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConnectionConfiguration[ ");
        String strValueOf = String.valueOf(this.a);
        sb.append(strValueOf.length() != 0 ? "Name=".concat(strValueOf) : new String("Name="));
        String strValueOf2 = String.valueOf(this.b);
        sb.append(strValueOf2.length() != 0 ? ", Address=".concat(strValueOf2) : new String(", Address="));
        int i = this.c;
        StringBuilder sb2 = new StringBuilder(18);
        sb2.append(", Type=");
        sb2.append(i);
        sb.append(sb2.toString());
        int i2 = this.d;
        StringBuilder sb3 = new StringBuilder(18);
        sb3.append(", Role=");
        sb3.append(i2);
        sb.append(sb3.toString());
        boolean z = this.e;
        StringBuilder sb4 = new StringBuilder(15);
        sb4.append(", Enabled=");
        sb4.append(z);
        sb.append(sb4.toString());
        boolean z2 = this.f;
        StringBuilder sb5 = new StringBuilder(19);
        sb5.append(", IsConnected=");
        sb5.append(z2);
        sb.append(sb5.toString());
        String strValueOf3 = String.valueOf(this.g);
        sb.append(strValueOf3.length() != 0 ? ", PeerNodeId=".concat(strValueOf3) : new String(", PeerNodeId="));
        boolean z3 = this.h;
        StringBuilder sb6 = new StringBuilder(20);
        sb6.append(", BtlePriority=");
        sb6.append(z3);
        sb.append(sb6.toString());
        String strValueOf4 = String.valueOf(this.i);
        sb.append(strValueOf4.length() != 0 ? ", NodeId=".concat(strValueOf4) : new String(", NodeId="));
        String strValueOf5 = String.valueOf(this.j);
        sb.append(strValueOf5.length() != 0 ? ", PackageName=".concat(strValueOf5) : new String(", PackageName="));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iCt = mip.ct(parcel);
        mip.cI(parcel, 2, this.a);
        mip.cI(parcel, 3, this.b);
        mip.cA(parcel, 4, this.c);
        mip.cA(parcel, 5, this.d);
        mip.cw(parcel, 6, this.e);
        mip.cw(parcel, 7, this.f);
        mip.cI(parcel, 8, this.g);
        mip.cw(parcel, 9, this.h);
        mip.cI(parcel, 10, this.i);
        mip.cI(parcel, 11, this.j);
        mip.cv(parcel, iCt);
    }
}
