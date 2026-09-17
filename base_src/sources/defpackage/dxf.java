package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dxf implements dwz {
    private static final ouj a = ouj.h("com/google/android/apps/camera/gallery/query/SpecialTypeMetadataQueryHandler");
    private final Context b;
    private final String c;

    public dxf(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    @Override // defpackage.dwz
    public final Cursor a(Uri uri, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        String[] strArr2 = strArr;
        ojc ojcVarB = dxh.b(Uri.decode(uri.getLastPathSegment()));
        if (!ojcVarB.g()) {
            ((oug) ((oug) a.c()).G(973)).y("Illegal type from uri %s including %s", uri, Arrays.toString(strArr2));
            return null;
        }
        dxh dxhVar = (dxh) ojcVarB.c();
        MatrixCursor matrixCursor = new MatrixCursor(strArr2);
        if (dxhVar == dxh.NONE) {
            return matrixCursor;
        }
        Object[] objArr = new Object[strArr2.length];
        int i = 0;
        for (String str : strArr2) {
            switch (str) {
                case "configuration":
                    objArr[i] = dxhVar.m.e;
                    break;
                case "special_type_name":
                    objArr[i] = this.b.getString(dxhVar.n);
                    break;
                case "special_type_description":
                    objArr[i] = this.b.getString(dxhVar.o);
                    break;
                case "special_type_icon_uri":
                    objArr[i] = new Uri.Builder().scheme("content").authority(this.c).appendPath("icon").appendPath(String.valueOf(dxhVar.p));
                    break;
                case "edit_activity_package_name":
                case "interact_activity_package_name":
                case "launch_activity_package_name":
                    objArr[i] = this.b.getPackageName();
                    break;
            }
            i++;
        }
        Arrays.toString(objArr);
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }
}
