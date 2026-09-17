package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ccg implements pgj {
    public final /* synthetic */ ccn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ccg(ccn ccnVar, int i) {
        this.b = i;
        this.a = ccnVar;
    }

    @Override // defpackage.pgj
    public final pht a() {
        switch (this.b) {
            case 0:
                SQLiteDatabase readableDatabase = this.a.b.getReadableDatabase();
                try {
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("SELECT ");
                    sb.append("photo_mode");
                    sb.append(", COUNT(*) FROM ");
                    sb.append("metadata");
                    sb.append(" GROUP BY ");
                    sb.append("photo_mode");
                    Cursor cursorRawQuery = readableDatabase.rawQuery(sb.toString(), null);
                    try {
                        HashMap map = new HashMap();
                        while (cursorRawQuery.moveToNext()) {
                            map.put(Integer.valueOf(cursorRawQuery.getInt(0)), Integer.valueOf(cursorRawQuery.getInt(1)));
                        }
                        pht phtVarV = plk.V(map);
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        if (readableDatabase != null) {
                            readableDatabase.close();
                        }
                        return phtVarV;
                    } catch (Throwable th) {
                        if (cursorRawQuery != null) {
                            try {
                                cursorRawQuery.close();
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (readableDatabase != null) {
                        try {
                            readableDatabase.close();
                            break;
                        } catch (Throwable th4) {
                        }
                    }
                    throw th3;
                }
            default:
                SQLiteDatabase readableDatabase2 = this.a.b.getReadableDatabase();
                try {
                    Cursor cursorQuery = readableDatabase2.query(true, "media_record", new String[]{"source_id"}, null, null, null, null, null, null);
                    try {
                        cursorQuery.getCount();
                        opc opcVarD = ope.D();
                        while (cursorQuery.moveToNext()) {
                            opcVarD.d(cursorQuery.getString(cursorQuery.getColumnIndex("source_id")));
                        }
                        pht phtVarV2 = plk.V(opcVarD.f());
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (readableDatabase2 != null) {
                            readableDatabase2.close();
                        }
                        return phtVarV2;
                    } catch (Throwable th5) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                                break;
                            } catch (Throwable th6) {
                            }
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (readableDatabase2 != null) {
                        try {
                            readableDatabase2.close();
                            break;
                        } catch (Throwable th8) {
                        }
                    }
                    throw th7;
                }
        }
    }
}
