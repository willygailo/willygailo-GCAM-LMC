package defpackage;

import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dwx implements dwz {
    private final UriMatcher a;
    private final dxp b;
    private final dwu c;

    public dwx(dwu dwuVar, UriMatcher uriMatcher, dxp dxpVar) {
        this.c = dwuVar;
        this.a = uriMatcher;
        this.b = dxpVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x00ae  */
    @Override // defpackage.dwz
    public final Cursor a(Uri uri, String[] strArr) {
        List<dws> listC;
        strArr.getClass();
        String[] strArr2 = strArr;
        switch (this.a.match(uri)) {
            case 7:
                listC = this.c.c();
                break;
            case 8:
                long jA = enl.A(uri);
                listC = new ArrayList();
                ojc ojcVarA = this.c.a(jA);
                if (ojcVarA.g()) {
                    listC.add((dws) ojcVarA.c());
                }
                break;
            default:
                String strValueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 18);
                sb.append("Unrecognized uri: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr2);
        for (dws dwsVar : listC) {
            Object[] objArr = new Object[strArr2.length];
            StringBuilder sb2 = new StringBuilder("{");
            int i = 0;
            while (true) {
                int length = strArr2.length;
                if (i < length) {
                    String str = strArr2[i];
                    switch (str) {
                        case "media_store_id":
                            objArr[i] = Long.valueOf(dwsVar.a.a);
                            break;
                        case "progress_status":
                            objArr[i] = Integer.valueOf(dwsVar.f());
                            break;
                        case "progress_percentage":
                            objArr[i] = dwsVar.b();
                            break;
                        case "special_type_id":
                            ojc ojcVarA2 = this.b.a(dwsVar.a.a);
                            obr.aG(ojcVarA2.g(), "media store id is not found in locating its special type.");
                            objArr[i] = ((dxh) ojcVarA2.c()).c();
                            break;
                        default:
                            String strValueOf2 = String.valueOf(str);
                            throw new IllegalArgumentException(strValueOf2.length() != 0 ? "invalid projection: ".concat(strValueOf2) : new String("invalid projection: "));
                    }
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(objArr[i]);
                    if (i < length - 1) {
                        sb2.append(", ");
                    }
                    i++;
                }
            }
            sb2.append("}");
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }
}
