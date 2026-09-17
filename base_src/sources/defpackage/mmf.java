package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class mmf {
    public final pfc a;

    protected mmf(int[] iArr) {
        obr.aF(true);
        for (int i = 0; i < 2; i++) {
            int i2 = iArr[i];
            if (i2 < 0) {
                StringBuilder sb = new StringBuilder(33);
                sb.append("One dimension is < 0: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a = new pfc(Arrays.copyOf(iArr, 2));
    }

    public static mme d(int i, int i2) {
        return new mme(i, i2);
    }

    public final int a() {
        pfc pfcVar = this.a;
        if (pfcVar.c > 1) {
            return pfcVar.a(1);
        }
        return 1;
    }

    public final int b() {
        return this.a.a(0);
    }

    public final mme c() {
        int i = this.a.c;
        if (i == 2) {
            return d(b(), a());
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Attempting to convert ");
        sb.append(i);
        sb.append("D size to 2D!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mmf) {
            return this.a.equals(((mmf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[2];
        pfc pfcVar = this.a;
        int iA = 0;
        objArr[0] = pfcVar;
        if (pfcVar.c != 0) {
            iA = pfcVar.a(0);
            int i = 1;
            while (true) {
                pfc pfcVar2 = this.a;
                if (i >= pfcVar2.c) {
                    break;
                }
                iA *= pfcVar2.a(i);
                i++;
            }
        }
        objArr[1] = Integer.valueOf(iA);
        return String.format(locale, "Dimensions = %s, Volume = %d)", objArr);
    }
}
