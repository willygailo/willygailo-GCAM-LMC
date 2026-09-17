package defpackage;

import android.content.ContentValues;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class hse implements phh {
    final /* synthetic */ lif a;
    final /* synthetic */ hsg b;

    public hse(hsg hsgVar, lif lifVar) {
        this.b = hsgVar;
        this.a = lifVar;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        hsg hsgVar = this.b;
        lis lisVar = hsgVar.g;
        String strValueOf = String.valueOf(hsgVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Failed to set progress for ");
        sb.append(strValueOf);
        lisVar.h(sb.toString());
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null && !Uri.EMPTY.equals(uri)) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("progress_status", (Integer) 0);
            contentValues.put("progress_percentage", Integer.valueOf(this.a.e));
            this.b.e.getContentResolver().update(uri, contentValues, null);
            return;
        }
        lis lisVar = this.b.g;
        String strValueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 48);
        sb.append("Skipping progress update for empty or null uri: ");
        sb.append(strValueOf);
        lisVar.h(sb.toString());
    }
}
