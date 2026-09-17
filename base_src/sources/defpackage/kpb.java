package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kpb extends kno {
    public static final Parcelable.Creator CREATOR = new kpc();
    public String a;
    public Bundle b;
    public String c;
    public final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    public String g;
    public List h;
    public boolean i;
    public kpf j;
    public kpe k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    long p;

    public kpb(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, kpf kpfVar, kpe kpeVar, boolean z2, Bitmap bitmap, String str5, boolean z3, long j) {
        this.a = str;
        this.b = bundle != null ? bundle : new Bundle();
        this.c = str2;
        this.d = applicationErrorReport != null ? applicationErrorReport : new ApplicationErrorReport();
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list != null ? list : new ArrayList();
        this.i = z;
        this.j = kpfVar;
        this.k = kpeVar;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        kpc.a(this, parcel, i);
    }
}
