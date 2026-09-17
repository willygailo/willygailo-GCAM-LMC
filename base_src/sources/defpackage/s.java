package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class s {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private s(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    static s a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : x.e.split(str.substring(7).trim())) {
            if (str2.equals("…")) {
                z = false;
                z2 = true;
            } else if (str2.equals("...")) {
                z = false;
                z2 = true;
            } else {
                if (z2) {
                    String strValueOf = String.valueOf(str2);
                    throw new IllegalArgumentException(strValueOf.length() != 0 ? "Can only have … at the end of samples: ".concat(strValueOf) : new String("Can only have … at the end of samples: "));
                }
                String[] strArrSplit = x.f.split(str2);
                switch (strArrSplit.length) {
                    case 1:
                        q qVar = new q(strArrSplit[0]);
                        b(i, qVar);
                        linkedHashSet.add(new r(qVar, qVar));
                        break;
                    case 2:
                        q qVar2 = new q(strArrSplit[0]);
                        q qVar3 = new q(strArrSplit[1]);
                        b(i, qVar2);
                        b(i, qVar3);
                        linkedHashSet.add(new r(qVar2, qVar3));
                        break;
                    default:
                        String strValueOf2 = String.valueOf(str2);
                        throw new IllegalArgumentException(strValueOf2.length() != 0 ? "Ill-formed number range: ".concat(strValueOf2) : new String("Ill-formed number range: "));
                }
            }
        }
        return new s(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, q qVar) {
        if ((i == 1) == (qVar.b == 0)) {
            return;
        }
        String strValueOf = String.valueOf(qVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
        sb.append("Ill-formed number range: ");
        sb.append(strValueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("@");
        switch (this.c) {
            case 1:
                str = "INTEGER";
                break;
            default:
                str = "DECIMAL";
                break;
        }
        sb.append(str.toLowerCase(Locale.ENGLISH));
        boolean z = true;
        for (r rVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(rVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
