package defpackage;

import com.google.android.libraries.camera.exif.ExifInterface;

/* JADX INFO: loaded from: classes.dex */
public final class gjx {
    public final long a;
    public final byte[] b;
    public final int c;
    public final ExifInterface d;
    public final lig e;

    private gjx(long j, byte[] bArr, lig ligVar, int i, ExifInterface exifInterface) {
        this.a = j;
        this.b = bArr;
        this.c = i;
        this.e = ligVar;
        this.d = exifInterface;
    }

    public static gjx a(long j, byte[] bArr, lig ligVar, int i, ExifInterface exifInterface, jtx jtxVar) {
        if (jtxVar != null) {
            jtxVar.a(exifInterface);
        }
        return new gjx(j, bArr, ligVar, i, exifInterface);
    }
}
