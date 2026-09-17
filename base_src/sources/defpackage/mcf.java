package defpackage;

import android.content.Context;
import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public enum mcf {
    DCIM,
    PICTURES,
    MOVIES,
    APP_DATA,
    APP_CACHE;

    public final File a(Context context) {
        switch (this) {
            case DCIM:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            case PICTURES:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            case MOVIES:
                return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
            case APP_DATA:
                return context.getFilesDir();
            case APP_CACHE:
                return context.getCacheDir();
            default:
                String strValueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                sb.append("Unknown MediaDirectory ");
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final boolean b() {
        switch (this) {
            case DCIM:
            case PICTURES:
            case MOVIES:
                return true;
            default:
                return false;
        }
    }

    public final boolean c(String str) {
        switch (this) {
            case DCIM:
                return mip.K(str) || mip.L(str);
            case PICTURES:
                return mip.K(str);
            case MOVIES:
                return mip.L(str);
            case APP_DATA:
            case APP_CACHE:
                return true;
            default:
                return false;
        }
    }
}
