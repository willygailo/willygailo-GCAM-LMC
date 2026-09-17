package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class bfa implements bac {
    private static final String[] a = {"_data"};
    private final Context b;
    private final Uri c;

    public bfa(Context context, Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.bac
    public final Class a() {
        return File.class;
    }

    @Override // defpackage.bac
    public final void d() {
    }

    @Override // defpackage.bac
    public final void f(ayc aycVar, bab babVar) {
        Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            babVar.b(new File(string));
            return;
        }
        String strValueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 30);
        sb.append("Failed to find file path for: ");
        sb.append(strValueOf);
        babVar.e(new FileNotFoundException(sb.toString()));
    }

    @Override // defpackage.bac
    public final void fu() {
    }

    @Override // defpackage.bac
    public final int g() {
        return 1;
    }
}
