package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class iax {
    public final long a;
    public final boolean b;
    public final String c;
    public final Drawable d;
    public final Runnable e;
    public final Runnable f;
    public final String g;
    public final Runnable h;
    public final Runnable i;
    public final Runnable j;
    public final Runnable k;
    public final boolean l;

    public iax() {
    }

    public iax(long j, boolean z, String str, Drawable drawable, Runnable runnable, Runnable runnable2, String str2, Runnable runnable3, Runnable runnable4, Runnable runnable5, Runnable runnable6, boolean z2) {
        this.a = j;
        this.b = z;
        this.c = str;
        this.d = drawable;
        this.e = runnable;
        this.f = runnable2;
        this.g = str2;
        this.h = runnable3;
        this.i = runnable4;
        this.j = runnable5;
        this.k = runnable6;
        this.l = z2;
    }

    public static iaw a() {
        iaw iawVar = new iaw();
        iawVar.d(0L);
        iawVar.a = false;
        iawVar.c(false);
        return iawVar;
    }

    public final iaw b() {
        return new iaw(this);
    }

    public final boolean equals(Object obj) {
        String str;
        Drawable drawable;
        Runnable runnable;
        Runnable runnable2;
        String str2;
        Runnable runnable3;
        Runnable runnable4;
        Runnable runnable5;
        Runnable runnable6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iax)) {
            return false;
        }
        iax iaxVar = (iax) obj;
        return this.a == iaxVar.a && this.b == iaxVar.b && ((str = this.c) != null ? str.equals(iaxVar.c) : iaxVar.c == null) && ((drawable = this.d) != null ? drawable.equals(iaxVar.d) : iaxVar.d == null) && ((runnable = this.e) != null ? runnable.equals(iaxVar.e) : iaxVar.e == null) && ((runnable2 = this.f) != null ? runnable2.equals(iaxVar.f) : iaxVar.f == null) && ((str2 = this.g) != null ? str2.equals(iaxVar.g) : iaxVar.g == null) && ((runnable3 = this.h) != null ? runnable3.equals(iaxVar.h) : iaxVar.h == null) && ((runnable4 = this.i) != null ? runnable4.equals(iaxVar.i) : iaxVar.i == null) && ((runnable5 = this.j) != null ? runnable5.equals(iaxVar.j) : iaxVar.j == null) && ((runnable6 = this.k) != null ? runnable6.equals(iaxVar.k) : iaxVar.k == null) && this.l == iaxVar.l;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        String str = this.c;
        int iHashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Drawable drawable = this.d;
        int iHashCode2 = (iHashCode ^ (drawable == null ? 0 : drawable.hashCode())) * 1000003;
        Runnable runnable = this.e;
        int iHashCode3 = (iHashCode2 ^ (runnable == null ? 0 : runnable.hashCode())) * (-721379959);
        Runnable runnable2 = this.f;
        int iHashCode4 = (iHashCode3 ^ (runnable2 == null ? 0 : runnable2.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * (-721379959);
        Runnable runnable3 = this.h;
        int iHashCode6 = (iHashCode5 ^ (runnable3 == null ? 0 : runnable3.hashCode())) * 1000003;
        Runnable runnable4 = this.i;
        int iHashCode7 = (iHashCode6 ^ (runnable4 == null ? 0 : runnable4.hashCode())) * 1000003;
        Runnable runnable5 = this.j;
        int iHashCode8 = (iHashCode7 ^ (runnable5 == null ? 0 : runnable5.hashCode())) * 1000003;
        Runnable runnable6 = this.k;
        return ((iHashCode8 ^ (runnable6 != null ? runnable6.hashCode() : 0)) * 1000003) ^ (true == this.l ? 1231 : 1237);
    }

    public final String toString() {
        long j = this.a;
        boolean z = this.b;
        String str = this.c;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(this.e);
        String strValueOf3 = String.valueOf((Object) null);
        String strValueOf4 = String.valueOf(this.f);
        String str2 = this.g;
        String strValueOf5 = String.valueOf(this.h);
        String strValueOf6 = String.valueOf(this.i);
        String strValueOf7 = String.valueOf(this.j);
        String strValueOf8 = String.valueOf(this.k);
        boolean z2 = this.l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(strValueOf).length();
        int length3 = String.valueOf(strValueOf2).length();
        int length4 = String.valueOf(strValueOf3).length();
        int length5 = String.valueOf(strValueOf4).length();
        int length6 = String.valueOf(str2).length();
        int length7 = String.valueOf((Object) null).length();
        int length8 = String.valueOf(strValueOf5).length();
        int length9 = String.valueOf(strValueOf6).length();
        StringBuilder sb = new StringBuilder(length + 332 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + String.valueOf(strValueOf7).length() + String.valueOf(strValueOf8).length());
        sb.append("SmartsSuggestion{timeoutMillis=");
        sb.append(j);
        sb.append(", autoHideOnClick=");
        sb.append(z);
        sb.append(", text=");
        sb.append(str);
        sb.append(", icon=");
        sb.append(strValueOf);
        sb.append(", onChipClickListener=");
        sb.append(strValueOf2);
        sb.append(", button=");
        sb.append(strValueOf3);
        sb.append(", onButtonClickListener=");
        sb.append(strValueOf4);
        sb.append(", chipContentDescription=");
        sb.append(str2);
        sb.append(", buttonContentDescription=null, onDismissButtonClickListener=");
        sb.append(strValueOf5);
        sb.append(", onSuggestionDisplayedListener=");
        sb.append(strValueOf6);
        sb.append(", onSuggestionHiddenListener=");
        sb.append(strValueOf7);
        sb.append(", onSuggestionTimeoutListener=");
        sb.append(strValueOf8);
        sb.append(", sticky=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
