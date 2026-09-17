package android.support.wearable.complications.rendering;

import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.si;
import defpackage.sr;

/* JADX INFO: loaded from: classes.dex */
public class ComplicationStyle$Builder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new si(4);
    public int a;
    public Drawable b;
    public int c;
    public int d;
    public Typeface e;
    public Typeface f;
    public int g;
    public int h;
    public ColorFilter i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    private int t;

    public ComplicationStyle$Builder() {
        this.a = -16777216;
        this.b = null;
        this.c = -1;
        this.d = -3355444;
        this.e = sr.a;
        this.f = sr.a;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.t = 1;
        this.l = 3;
        this.m = 3;
        this.n = Integer.MAX_VALUE;
        this.o = 1;
        this.p = 2;
        this.q = -1;
        this.r = -3355444;
        this.s = -3355444;
    }

    public ComplicationStyle$Builder(Parcel parcel) {
        this.a = -16777216;
        this.b = null;
        this.c = -1;
        this.d = -3355444;
        this.e = sr.a;
        this.f = sr.a;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.t = 1;
        this.l = 3;
        this.m = 3;
        this.n = Integer.MAX_VALUE;
        this.o = 1;
        this.p = 2;
        this.q = -1;
        this.r = -3355444;
        this.s = -3355444;
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.a = bundle.getInt("background_color");
        this.c = bundle.getInt("text_color");
        this.d = bundle.getInt("title_color");
        this.e = Typeface.defaultFromStyle(bundle.getInt("text_style", 0));
        this.f = Typeface.defaultFromStyle(bundle.getInt("title_style", 0));
        this.g = bundle.getInt("text_size");
        this.h = bundle.getInt("title_size");
        this.j = bundle.getInt("icon_color");
        this.k = bundle.getInt("border_color");
        this.t = bundle.getInt("border_style");
        this.l = bundle.getInt("border_dash_width");
        this.m = bundle.getInt("border_dash_gap");
        this.n = bundle.getInt("border_radius");
        this.o = bundle.getInt("border_width");
        this.p = bundle.getInt("ranged_value_ring_width");
        this.q = bundle.getInt("ranged_value_primary_color");
        this.r = bundle.getInt("ranged_value_secondary_color");
        this.s = bundle.getInt("highlight_color");
    }

    public ComplicationStyle$Builder(ComplicationStyle$Builder complicationStyle$Builder) {
        this.a = -16777216;
        this.b = null;
        this.c = -1;
        this.d = -3355444;
        this.e = sr.a;
        this.f = sr.a;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.t = 1;
        this.l = 3;
        this.m = 3;
        this.n = Integer.MAX_VALUE;
        this.o = 1;
        this.p = 2;
        this.q = -1;
        this.r = -3355444;
        this.s = -3355444;
        this.a = complicationStyle$Builder.a;
        this.b = complicationStyle$Builder.b;
        this.c = complicationStyle$Builder.c;
        this.d = complicationStyle$Builder.d;
        this.e = complicationStyle$Builder.e;
        this.f = complicationStyle$Builder.f;
        this.g = complicationStyle$Builder.g;
        this.h = complicationStyle$Builder.h;
        this.i = complicationStyle$Builder.i;
        this.j = complicationStyle$Builder.j;
        this.k = complicationStyle$Builder.k;
        this.t = complicationStyle$Builder.t;
        this.l = complicationStyle$Builder.l;
        this.m = complicationStyle$Builder.m;
        this.n = complicationStyle$Builder.n;
        this.o = complicationStyle$Builder.o;
        this.p = complicationStyle$Builder.p;
        this.q = complicationStyle$Builder.q;
        this.r = complicationStyle$Builder.r;
        this.s = complicationStyle$Builder.s;
    }

    public ComplicationStyle$Builder(sr srVar) {
        this.a = -16777216;
        this.b = null;
        this.c = -1;
        this.d = -3355444;
        this.e = sr.a;
        this.f = sr.a;
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
        this.i = null;
        this.j = -1;
        this.k = -1;
        this.t = 1;
        this.l = 3;
        this.m = 3;
        this.n = Integer.MAX_VALUE;
        this.o = 1;
        this.p = 2;
        this.q = -1;
        this.r = -3355444;
        this.s = -3355444;
        this.a = srVar.b;
        this.b = srVar.c;
        this.c = srVar.d;
        this.d = srVar.e;
        this.e = srVar.f;
        this.f = srVar.g;
        this.g = srVar.h;
        this.h = srVar.i;
        this.i = srVar.j;
        this.j = srVar.k;
        this.k = srVar.l;
        this.t = srVar.m;
        this.l = srVar.n;
        this.m = srVar.o;
        this.n = srVar.p;
        this.o = srVar.q;
        this.p = srVar.r;
        this.q = srVar.s;
        this.r = srVar.t;
        this.s = srVar.u;
    }

    public final sr a() {
        return new sr(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.t, this.n, this.o, this.l, this.m, this.p, this.q, this.r, this.s);
    }

    public final void b(int i) {
        if (i == 1) {
            this.t = 1;
        } else if (i == 2) {
            this.t = 2;
        } else {
            this.t = 0;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("background_color", this.a);
        bundle.putInt("text_color", this.c);
        bundle.putInt("title_color", this.d);
        bundle.putInt("text_style", this.e.getStyle());
        bundle.putInt("title_style", this.f.getStyle());
        bundle.putInt("text_size", this.g);
        bundle.putInt("title_size", this.h);
        bundle.putInt("icon_color", this.j);
        bundle.putInt("border_color", this.k);
        bundle.putInt("border_style", this.t);
        bundle.putInt("border_dash_width", this.l);
        bundle.putInt("border_dash_gap", this.m);
        bundle.putInt("border_radius", this.n);
        bundle.putInt("border_width", this.o);
        bundle.putInt("ranged_value_ring_width", this.p);
        bundle.putInt("ranged_value_primary_color", this.q);
        bundle.putInt("ranged_value_secondary_color", this.r);
        bundle.putInt("highlight_color", this.s);
        parcel.writeBundle(bundle);
    }
}
