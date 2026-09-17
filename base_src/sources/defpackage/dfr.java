package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import j$.time.Instant;
import j$.util.function.Function;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class dfr {
    public static final /* synthetic */ int e = 0;
    private final ContentResolver g;
    private final String h;
    private final ddf i;
    private static final ouj f = ouj.h("com/google/android/apps/camera/data/MediaStoreDataLoader");
    static final String a = String.format(Locale.US, "CASE WHEN %s IS NULL THEN %s ELSE %s / 1000 END DESC, %s DESC", "datetaken", "date_modified", "datetaken", "_id");
    static final String b = String.format(Locale.US, "%s LIKE ? AND (%s > ? OR (%s > ? AND (%s = ? OR %s / 1000 = ? / 1000)))", "relative_path", "datetaken", "date_modified", "datetaken", "datetaken");
    static final String[] c = {"_id", "title", "mime_type", "datetaken", "date_modified", "orientation", "width", "height", "is_pending"};
    static final String[] d = {"_id"};

    public dfr(ContentResolver contentResolver, mbj mbjVar, ddf ddfVar) {
        this.g = contentResolver;
        this.h = Paths.get(Environment.DIRECTORY_DCIM, mbjVar.n, "%").toString();
        this.i = ddfVar;
    }

    static Uri a(long j, boolean z) {
        return (z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI).buildUpon().appendPath(String.valueOf(j)).build();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009d  */
    public final dfn b(Cursor cursor) {
        lig ligVarH;
        InputStream inputStreamOpenInputStream;
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("datetaken"));
        long j3 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
        Instant instantOfEpochSecond = Instant.ofEpochSecond(j3);
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
        Uri uriA = a(j, mip.L(string2));
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        int i3 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        if (i3 == 0) {
            ddf ddfVar = this.i;
            ddi ddiVar = ddl.a;
            ddfVar.e();
            if ("image/jpeg".equals(string2) || "image/bmp".equals(string2) || "image/gif".equals(string2) || "image/png".equals(string2) || "image/webp".equals(string2)) {
                try {
                    inputStreamOpenInputStream = this.g.openInputStream(uriA);
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        inputStreamOpenInputStream.getClass();
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        ligVarH = lig.h(options.outWidth, options.outHeight);
                        inputStreamOpenInputStream.close();
                        int i4 = ligVarH.a;
                        i3 = ligVarH.b;
                        i2 = i4;
                    } catch (Throwable th) {
                        if (inputStreamOpenInputStream == null) {
                            throw th;
                        }
                        try {
                            inputStreamOpenInputStream.close();
                            throw th;
                        } catch (Throwable th2) {
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                    ((oug) ((oug) ((oug) f.c()).h(e2)).G((char) 743)).o("Exception in getting dimensions by BitmapFactory.");
                    ligVarH = lig.h(0, 0);
                }
            }
        } else if (i2 == 0) {
            i2 = 0;
            ddf ddfVar2 = this.i;
            ddi ddiVar2 = ddl.a;
            ddfVar2.e();
            if ("image/jpeg".equals(string2)) {
                inputStreamOpenInputStream = this.g.openInputStream(uriA);
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                inputStreamOpenInputStream.getClass();
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                ligVarH = lig.h(options2.outWidth, options2.outHeight);
                inputStreamOpenInputStream.close();
                int i5 = ligVarH.a;
                i3 = ligVarH.b;
                i2 = i5;
            } else {
                inputStreamOpenInputStream = this.g.openInputStream(uriA);
                BitmapFactory.Options options3 = new BitmapFactory.Options();
                options3.inJustDecodeBounds = true;
                inputStreamOpenInputStream.getClass();
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options3);
                ligVarH = lig.h(options3.outWidth, options3.outHeight);
                inputStreamOpenInputStream.close();
                int i6 = ligVarH.a;
                i3 = ligVarH.b;
                i2 = i6;
            }
        }
        lig ligVarH2 = lig.h(i2, i3);
        int i7 = cursor.getInt(cursor.getColumnIndexOrThrow("is_pending"));
        obr.aq(i7 == 0, "Item is still pending. Perhaps scan failed, look for MediaProvider logs: %s", uriA);
        obr.aq(!oje.d(string), "Item has empty title. Perhaps scan failed, look for MediaProvider logs: %s", uriA);
        obr.aq(j3 > 0, "Item has unset DATE_MODIFIED. Perhaps scan failed, look for MediaProvider logs: %s", uriA);
        if (j2 <= 0) {
            throw new okf(obr.aw("Item has unset DATE_TAKEN (%s). Perhaps scan failed, look for MediaProvider logs: %s", Long.valueOf(j2), uriA));
        }
        obr.as(i2 > 0 && i3 > 0, "Item has invalid dimensions (%s). Perhaps scan failed, look for MediaProvider logs: %s", ligVarH2, uriA);
        dfn dfnVarK = dfo.k();
        dfnVarK.b(j);
        dfnVarK.h(string);
        dfnVarK.f(string2);
        dfnVarK.c(instantOfEpochMilli);
        dfnVarK.e(instantOfEpochSecond);
        dfnVarK.i(uriA);
        dfnVarK.d(i7 != 0);
        dfnVarK.b = ligVarH2;
        dfnVarK.g(i);
        return dfnVarK;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:15:0x0024 A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x000d, B:6:0x0013, B:18:0x002f, B:15:0x0024), top: B:37:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #2 {all -> 0x001b, blocks: (B:4:0x000d, B:6:0x0013, B:18:0x002f, B:15:0x0024), top: B:37:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:22:0x003c A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:22:0x003c, B:25:0x004a, B:26:0x0060), top: B:34:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004a A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {all -> 0x0061, blocks: (B:22:0x003c, B:25:0x004a, B:26:0x0060), top: B:34:0x003a }] */
    final dfo c(Uri uri, hsp hspVar) throws Throwable {
        boolean z;
        String string;
        Object objValueOf;
        Cursor cursor = null;
        Cursor cursorQuery = this.g.query(uri, c, null, null);
        if (cursorQuery == null) {
            z = false;
            string = "null";
            if (cursorQuery == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(cursorQuery.getCount());
            }
            if (cursorQuery == null) {
                string = Arrays.toString(cursorQuery.getColumnNames());
                cursor = cursorQuery;
            }
            if (z) {
                throw new IllegalArgumentException(obr.aw("Uri %s for shot(%s) not found in MediaStore. ContentResolver returned the cursor with count=%s, columns=%s", uri, hspVar, objValueOf, string));
            }
            dfn dfnVarB = b(cursorQuery);
            dfnVarB.a = hspVar;
            dfo dfoVarA = dfnVarB.a();
            cursorQuery.close();
            return dfoVarA;
        }
        try {
            if (cursorQuery.moveToFirst() && cursorQuery.getCount() == 1) {
                z = true;
            } else {
                z = false;
            }
            string = "null";
            if (cursorQuery == null) {
                objValueOf = "null";
            } else {
                objValueOf = Integer.valueOf(cursorQuery.getCount());
            }
            if (cursorQuery == null) {
                string = Arrays.toString(cursorQuery.getColumnNames());
                cursor = cursorQuery;
            }
            try {
                if (z) {
                    throw new IllegalArgumentException(obr.aw("Uri %s for shot(%s) not found in MediaStore. ContentResolver returned the cursor with count=%s, columns=%s", uri, hspVar, objValueOf, string));
                }
                dfn dfnVarB2 = b(cursorQuery);
                dfnVarB2.a = hspVar;
                dfo dfoVarA2 = dfnVarB2.a();
                cursorQuery.close();
                return dfoVarA2;
            } catch (Throwable th) {
                th = th;
                cursorQuery = cursor;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Throwable th3) {
            }
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:? A[SYNTHETIC] */
    public final List d(Uri uri, String[] strArr, long j, long j2, int i, Function function) {
        boolean z = strArr == d || strArr == c;
        obr.aG(z, "Invalid projection specified.");
        Cursor cursorQuery = this.g.query(uri, strArr, b, new String[]{this.h, Long.toString(j), Long.toString(j2), Long.toString(j), Long.toString(j)}, a);
        try {
            ooh oohVarE = oom.e();
            if (cursorQuery != null) {
                int i2 = i;
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= 0 || !cursorQuery.moveToNext()) {
                        break;
                    }
                    try {
                        oohVarE.g(function.apply(cursorQuery));
                    } catch (okf e2) {
                        ((oug) ((oug) ((oug) f.b()).h(e2)).G(746)).o("QueryAfter gets exception in transforming a cursor.");
                        ddf ddfVar = this.i;
                        ddi ddiVar = ddl.a;
                        ddfVar.e();
                    }
                    i2 = i3;
                    if (cursorQuery != null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            oom oomVarF = oohVarE.f();
            int i4 = ((orr) oomVarF).c;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return oomVarF;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                throw th2;
            }
            cursorQuery.close();
            throw th2;
        }
    }

    final List e(Instant instant, Instant instant2, final boolean z) {
        return d(z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, d, instant.minusMillis(1L).toEpochMilli(), instant2.minusSeconds(1L).getEpochSecond(), Integer.MAX_VALUE, new Function() { // from class: dfq
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                boolean z2 = z;
                Cursor cursor = (Cursor) obj;
                int i = dfr.e;
                return dfr.a(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), z2);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        });
    }
}
