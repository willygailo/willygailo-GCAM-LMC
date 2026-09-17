package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kmz extends bmo implements kna {
    private int a;

    public kmz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    protected kmz(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        mip.dl(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] e(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.kna
    public final int c() {
        return this.a;
    }

    @Override // defpackage.kna
    public final koh d() {
        return kog.b(w());
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kna)) {
            return false;
        }
        try {
            kna knaVar = (kna) obj;
            if (knaVar.c() != this.a) {
                return false;
            }
            return Arrays.equals(w(), (byte[]) kog.c(knaVar.d()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] w();

    @Override // defpackage.bmo
    protected final boolean x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                koh kohVarD = d();
                parcel2.writeNoException();
                bmp.e(parcel2, kohVarD);
                return true;
            case 2:
                int i2 = this.a;
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                return true;
            default:
                return false;
        }
    }
}
