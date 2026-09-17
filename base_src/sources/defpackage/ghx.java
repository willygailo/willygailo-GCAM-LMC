package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ghx extends lwe implements lvp {
    public ghx(lvp lvpVar) {
        super(lvpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return obr.bc(i(), ((ghx) obj).i());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{i()});
    }
}
