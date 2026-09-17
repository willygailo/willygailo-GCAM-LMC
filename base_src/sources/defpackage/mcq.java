package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class mcq implements mce {
    private final ContentResolver a;
    private final mcn b;
    private Uri c = Uri.EMPTY;
    private final ContentValues d;
    private final mcc e;

    public mcq(mcn mcnVar, ContentResolver contentResolver, ContentValues contentValues, mcc mccVar) {
        this.b = mcnVar;
        this.a = contentResolver;
        this.d = contentValues;
        this.e = mccVar;
    }

    @Override // defpackage.mcd
    public final long a() {
        if (Uri.EMPTY.equals(this.c)) {
            return -1L;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return -1L;
            }
            try {
                long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                parcelFileDescriptorOpenFileDescriptor.close();
                return statSize;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                }
                throw th;
            }
        } catch (IOException e) {
            return -1L;
        }
    }

    @Override // defpackage.mcd
    public final FileInputStream b() throws FileNotFoundException {
        l();
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "r");
        parcelFileDescriptorOpenFileDescriptor.getClass();
        String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for reading for %s", Integer.valueOf(parcelFileDescriptorOpenFileDescriptor.getFd()), this);
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
    }

    @Override // defpackage.mcd
    public final FileOutputStream c() {
        throw null;
    }

    @Override // defpackage.mcd
    public final void d() throws IOException {
        l();
        if (Uri.EMPTY.equals(this.c)) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "w");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            String strValueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 49);
            sb.append("MediaStore URI created but failed to open fd for ");
            sb.append(strValueOf);
            Log.w("PendingFileObject", sb.toString());
        }
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            parcelFileDescriptorOpenFileDescriptor.close();
        }
    }

    @Override // defpackage.mcd
    public final boolean e() {
        return true;
    }

    @Override // defpackage.mcd
    public final boolean f() {
        return true;
    }

    @Override // defpackage.mcd
    public final FileOutputStream g() throws FileNotFoundException {
        l();
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.a.openFileDescriptor(this.c, "w");
        parcelFileDescriptorOpenFileDescriptor.getClass();
        String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for writing for %s", Integer.valueOf(parcelFileDescriptorOpenFileDescriptor.getFd()), this);
        return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFileDescriptor);
    }

    @Override // defpackage.mce
    public final Uri h() {
        return this.c;
    }

    @Override // defpackage.mce
    public final mcn i() {
        return this.b;
    }

    @Override // defpackage.mce
    public final void j() {
    }

    @Override // defpackage.mce
    public final boolean k() {
        return true;
    }

    final void l() {
        Uri uri;
        if (Uri.EMPTY.equals(this.c)) {
            if (mip.K(this.b.e)) {
                uri = this.e.c;
            } else {
                if (!mip.L(this.b.e)) {
                    String strValueOf = String.valueOf(this.b);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 33);
                    sb.append("Trying to insert non-media file: ");
                    sb.append(strValueOf);
                    throw new IllegalArgumentException(sb.toString());
                }
                uri = this.e.d;
            }
            Uri uriInsert = this.a.insert(uri, this.d);
            uriInsert.getClass();
            this.c = uriInsert;
        }
    }

    public final String toString() {
        return this.b.toString();
    }
}
