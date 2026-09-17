package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* JADX INFO: loaded from: classes.dex */
public final class bat implements baw {
    private static final String[] a = {"_data"};
    private final ContentResolver b;

    public bat(ContentResolver contentResolver) {
        this.b = contentResolver;
    }

    @Override // defpackage.baw
    public final Cursor a(Uri uri) {
        return this.b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
