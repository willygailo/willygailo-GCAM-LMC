package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class dxq implements dxp {
    private final dxl a;
    private final dxr b;

    public dxq(dxl dxlVar, dxr dxrVar) {
        this.a = dxlVar;
        this.b = dxrVar;
    }

    @Override // defpackage.dxp
    public final ojc a(long j) {
        ojc ojcVar;
        ojc ojcVarI;
        ojc ojcVarB;
        ljf ljfVar;
        String string;
        dxl dxlVar = this.a;
        try {
            ojcVar = (ojc) pgb.h(dxlVar.b, new dxj(j), dxlVar.d).get();
        } catch (InterruptedException | ExecutionException e) {
            ojcVar = oih.a;
        }
        if (!ojcVar.g()) {
            dxr dxrVar = this.b;
            dxrVar.c.e("SpecialType");
            try {
                Uri uriBuild = MediaStore.Files.getContentUri("external").buildUpon().appendPath(Long.toString(j)).build();
                uriBuild.getClass();
                Cursor cursorQuery = dxrVar.b.query(uriBuild, new String[]{"_data"}, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    ojcVarI = oih.a;
                } else {
                    try {
                        string = cursorQuery.getString(0);
                    } catch (Exception e2) {
                        ((oug) ((oug) ((oug) dxr.a.b()).h(e2)).G((char) 982)).r("Fail to find the file path for the uri %s", uriBuild);
                        string = null;
                    }
                    cursorQuery.close();
                    ojcVarI = (string != null && new File(string).exists()) ? ojc.i(string) : oih.a;
                }
                if (ojcVarI.g()) {
                    String str = (String) ojcVarI.c();
                    String lowerCase = str.toLowerCase();
                    if (lowerCase.endsWith("jpg") || lowerCase.endsWith("jpeg") || lowerCase.endsWith("dng")) {
                        try {
                            String canonicalPath = new File(str).getCanonicalPath();
                            canonicalPath.getClass();
                            if (!canonicalPath.startsWith(dxrVar.d.b()) && !str.startsWith(dxrVar.e.b())) {
                                ((oug) ((oug) dxr.a.c()).G(979)).r("Ignoring metadata for image that is not in supported location: %s", str);
                                ojcVarB = oih.a;
                                ljfVar = dxrVar.c;
                            } else if (str.toLowerCase().endsWith("dng")) {
                                ojcVarB = oih.a;
                                ljfVar = dxrVar.c;
                            } else {
                                boolean z = dxrVar.f.a;
                                ojcVarB = dxh.b(mde.f(mde.l(str)));
                                ljfVar = dxrVar.c;
                            }
                        } catch (IOException e3) {
                            throw new IllegalStateException("Fails to obtain canonical path", e3);
                        }
                    } else {
                        ((oug) ((oug) dxr.a.c()).G(980)).r("Ignoring metadata for file which is not an image %s", str);
                        ojcVarB = oih.a;
                        ljfVar = dxrVar.c;
                    }
                } else {
                    ((oug) ((oug) dxr.a.c()).G(981)).q("No metadata for %d", j);
                    ojcVarB = oih.a;
                    ljfVar = dxrVar.c;
                }
                ljfVar.f();
                ojcVar = ojcVarB;
                if (ojcVar.g()) {
                    b(j, (dxh) ojcVar.c());
                }
            } catch (Throwable th) {
                dxrVar.c.f();
                throw th;
            }
        }
        if (ojcVar.g()) {
            ojcVar.c();
        }
        return ojcVar;
    }

    @Override // defpackage.dxp
    public final void b(long j, dxh dxhVar) {
        dxl dxlVar = this.a;
        ContentValues contentValues = new ContentValues();
        contentValues.put("media_store_id", Long.valueOf(j));
        contentValues.put("special_type_id", dxhVar.c());
        pgb.h(dxlVar.c, new dxk(contentValues), dxlVar.d);
    }

    @Override // defpackage.dxp
    public final void c(mak makVar, dxh dxhVar) {
        makVar.i();
        String lastPathSegment = makVar.b().getLastPathSegment();
        lastPathSegment.getClass();
        b(Long.parseLong(lastPathSegment), dxhVar);
    }
}
