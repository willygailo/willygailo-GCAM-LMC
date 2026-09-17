package defpackage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class dgu extends ContentProvider {
    public abstract void a(PrintWriter printWriter);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support delete");
    }

    @Override // android.content.ContentProvider
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            Arrays.asList(strArr);
            a(printWriter);
        } catch (Exception e) {
            printWriter.flush();
            e.printStackTrace(printWriter);
            printWriter.flush();
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "text/plain";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support insert");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support query");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support update");
    }
}
