package defpackage;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class dxd implements dwz {
    private final dxp a;

    public dxd(dxp dxpVar) {
        this.a = dxpVar;
    }

    @Override // defpackage.dwz
    public final Cursor a(Uri uri, String[] strArr) {
        long jA = enl.A(uri);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"special_type_id"});
        ojc ojcVarA = this.a.a(jA);
        if (ojcVarA.g() && !((dxh) ojcVarA.c()).equals(dxh.NONE)) {
            matrixCursor.addRow(new Object[]{((dxh) ojcVarA.c()).c()});
        }
        if (ojcVarA.g()) {
            ojcVarA.c();
        }
        return matrixCursor;
    }
}
