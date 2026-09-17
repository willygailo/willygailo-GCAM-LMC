package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import j$.util.StringJoiner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cef {
    public static final String[] a = {"_id"};
    public final Context b;
    public final cdf c;
    private final ExecutorService d;

    public cef(Context context, ExecutorService executorService, cdf cdfVar) {
        this.b = context;
        this.d = executorService;
        this.c = cdfVar;
    }

    public final ojc a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.size() != MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPathSegments().size() + 1) {
            return oih.a;
        }
        ohh.t(pathSegments);
        return ojc.i((String) ohh.t(pathSegments));
    }

    public final pht b(final List list) {
        pht phtVarI = pgb.i(pho.q(pgb.h(pho.q(pgb.h(pho.q(plk.aa(new pgj() { // from class: cec
            @Override // defpackage.pgj
            public final pht a() {
                cef cefVar = this.a;
                List list2 = list;
                ContentResolver contentResolver = cefVar.b.getContentResolver();
                HashMap map = new HashMap();
                String[] strArr = new String[list2.size()];
                StringJoiner stringJoiner = new StringJoiner(" ");
                stringJoiner.add("_id");
                if (list2.size() == 1) {
                    stringJoiner.add("= ?");
                    strArr[0] = (String) list2.get(0);
                } else {
                    stringJoiner.add(" IN ");
                    StringJoiner stringJoiner2 = new StringJoiner(",", "(", ")");
                    for (int i = 0; i < list2.size(); i++) {
                        stringJoiner2.add("?");
                        strArr[i] = (String) list2.get(i);
                    }
                    stringJoiner.add(stringJoiner2.toString());
                }
                ojd ojdVarA = ojd.a(stringJoiner.toString(), strArr);
                Cursor cursorQuery = contentResolver.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cef.a, (String) ojdVarA.a, (String[]) ojdVarA.b, null);
                if (cursorQuery != null) {
                    while (cursorQuery.moveToNext()) {
                        try {
                            String string = cursorQuery.getString(0);
                            cei ceiVarA = cej.a();
                            ceiVarA.d(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.parseInt(string)));
                            ceiVarA.b(false);
                            ceiVarA.c(string);
                            map.put(string, ceiVarA.a());
                        } catch (Throwable th) {
                            try {
                                cursorQuery.close();
                            } catch (Throwable th2) {
                            }
                            throw th;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return plk.V(map);
            }
        }, this.d)), new oiu() { // from class: ceb
            @Override // defpackage.oiu
            public final Object a(Object obj) {
                List<String> list2 = list;
                Map map = (Map) obj;
                opc opcVarD = ope.D();
                for (String str : list2) {
                    if (map.containsKey(str)) {
                        opcVarD.d((cej) map.get(str));
                    } else {
                        cei ceiVarA = cej.a();
                        ceiVarA.d(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, Integer.parseInt(str)));
                        ceiVarA.b(true);
                        ceiVarA.c(str);
                        opcVarD.d(ceiVarA.a());
                    }
                }
                return opcVarD.f();
            }
        }, this.d)), bxe.h, this.d)), new pgk() { // from class: cee
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                return this.a.c.h(((ope) obj).v());
            }
        }, this.d);
        final cdf cdfVar = this.c;
        cdfVar.getClass();
        return pgb.i(phtVarI, new pgk() { // from class: ced
            @Override // defpackage.pgk
            public final pht a(Object obj) {
                return cdfVar.e((ope) obj);
            }
        }, this.d);
    }
}
