package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class kpd extends kno {
    public static final Parcelable.Creator CREATOR = new sk(20);
    ParcelFileDescriptor a;
    final String b;
    final String c;
    public File d;

    public kpd(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            File file = this.d;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.a = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    Object[] objArr = null;
                    try {
                        try {
                            dataOutputStream.writeInt(objArr.length);
                            dataOutputStream.writeUTF(this.b);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.write((byte[]) null);
                            a(dataOutputStream);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        }
                    } catch (Throwable th) {
                        a(dataOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException e2) {
                    throw new IllegalStateException("Temporary file is somehow already deleted.");
                }
            } catch (IOException e3) {
                throw new IllegalStateException("Could not create temporary file:", e3);
            }
        }
        int iCt = mip.ct(parcel);
        mip.cH(parcel, 2, this.a, i);
        mip.cI(parcel, 3, this.b);
        mip.cI(parcel, 4, this.c);
        mip.cv(parcel, iCt);
    }
}
