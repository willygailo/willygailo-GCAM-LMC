package defpackage;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class fpe implements iho {
    private static final ouj a = ouj.h("com/google/android/apps/camera/microvideo/ScanAndPublishPendingVideosBehavior");
    private final Context c;
    private final mbj d;
    private final fjs e;
    private final boolean g;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final long f = (System.currentTimeMillis() / 1000) - 5;

    public fpe(Context context, mbj mbjVar, ddf ddfVar, fjs fjsVar) {
        this.c = context;
        this.d = mbjVar;
        this.e = fjsVar;
        this.g = ddfVar.k(ddr.y);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            if (this.b.getAndSet(true)) {
                return;
            }
            ContentResolver contentResolver = this.c.getContentResolver();
            String packageName = this.c.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-match-pending", 3);
            long j = this.f;
            StringBuilder sb = new StringBuilder(60);
            sb.append("owner_package_name = ? AND date_added < ");
            sb.append(j);
            bundle.putString("android:query-arg-sql-selection", sb.toString());
            bundle.putStringArray("android:query-arg-sql-selection-args", new String[]{packageName});
            Cursor cursorQuery = contentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "date_added"}, bundle, null);
            try {
                if (cursorQuery == null) {
                    ((oug) ((oug) a.c()).G(1839)).o("Got null cursor while restoring videos");
                    return;
                }
                while (cursorQuery.moveToNext()) {
                    int i = cursorQuery.getInt(0);
                    long j2 = cursorQuery.getLong(1);
                    if (this.g) {
                        parcelFileDescriptorOpenFileDescriptor = this.c.getContentResolver().openFileDescriptor(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i), "r", null);
                        if (parcelFileDescriptorOpenFileDescriptor == null) {
                            ((oug) ((oug) a.c()).G(1843)).p("Could not inspect video id %d as openFileDescriptor returned null", i);
                        } else {
                            long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                            if (statSize >= 200000) {
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                    try {
                                        if (mkz.c(fileInputStream).f("mdat").a.g()) {
                                            fileInputStream.close();
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } else {
                                            ((oug) ((oug) a.c()).G(1841)).p("Not restoring video id %d since it does not have an mdat box", i);
                                            fileInputStream.close();
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            fileInputStream.close();
                                        } catch (Throwable th2) {
                                        }
                                        throw th;
                                    }
                                } catch (mky e) {
                                    ((oug) ((oug) ((oug) a.c()).h(e)).G(1840)).p("Not restoring video id %d due to invalid boxes", i);
                                }
                                if (cursorQuery != null) {
                                    try {
                                        cursorQuery.close();
                                    } catch (Throwable th3) {
                                    }
                                }
                            }
                            ((oug) ((oug) a.c()).G(1842)).J(i, statSize);
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                    }
                    DateFormat dateFormat = this.d.j;
                    synchronized (dateFormat) {
                        str = dateFormat.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j2)));
                    }
                    String str2 = this.d.c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 9 + String.valueOf(str).length());
                    sb2.append(str2);
                    sb2.append(str);
                    sb2.append(".RESTORED");
                    String string = sb2.toString();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_pending", (Integer) 0);
                    contentValues.put("_display_name", string);
                    contentResolver.update(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i), contentValues, null, null);
                    ((oug) ((oug) a.c()).G(1838)).p("Published still-pending video id %s", i);
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j2;
                    fjs fjsVar = this.e;
                    poy poyVarM = pbz.d.m();
                    if (poyVarM.c) {
                        poyVarM.m();
                        poyVarM.c = false;
                    }
                    pbz pbzVar = (pbz) poyVarM.b;
                    int i2 = pbzVar.a | 1;
                    pbzVar.a = i2;
                    pbzVar.b = seconds;
                    pbzVar.c = 3;
                    pbzVar.a = i2 | 2;
                    fjsVar.g((pbz) poyVarM.j());
                }
                cursorQuery.close();
            } catch (Throwable th4) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th5) {
                    }
                }
                throw th4;
            } finally {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th6) {
            ((oug) ((oug) ((oug) a.b()).h(th6)).G((char) 1837)).o("Failed to publish still-pending videos");
        }
    }
}
