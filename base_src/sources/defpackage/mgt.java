package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mgt {
    private mhe a;
    private List b;
    private mgw c;

    public final mgu a() {
        List list;
        mgw mgwVar;
        mhe mheVar = this.a;
        if (mheVar != null && (list = this.b) != null && (mgwVar = this.c) != null) {
            return new mgu(mheVar, list, mgwVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" linkDataResult");
        }
        if (this.b == null) {
            sb.append(" linkChipResult");
        }
        if (this.c == null) {
            sb.append(" linkChipResultMetadata");
        }
        String strValueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(strValueOf);
        throw new IllegalStateException(sb2.toString());
    }

    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null linkChipResult");
        }
        this.b = list;
    }

    public final void c(mgw mgwVar) {
        if (mgwVar == null) {
            throw new NullPointerException("Null linkChipResultMetadata");
        }
        this.c = mgwVar;
    }

    public final void d(mhe mheVar) {
        if (mheVar == null) {
            throw new NullPointerException("Null linkDataResult");
        }
        this.a = mheVar;
    }
}
