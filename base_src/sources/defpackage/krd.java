package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
public final class krd {
    private final oke a;
    private final long b;
    private final krg c;
    private final krf d;

    public krd(krg krgVar, krf krfVar, oke okeVar) {
        this.c = krgVar;
        this.d = krfVar;
        this.a = okeVar;
        this.b = okeVar.a();
    }

    public final void a(String str) {
        Status status = new Status(8, str);
        long jA = this.a.a() - this.b;
        try {
            krf krfVar = this.d;
            Parcel parcelA = krfVar.a();
            bmp.c(parcelA, status);
            parcelA.writeLong(jA);
            krfVar.z(3, parcelA);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextFailure AIDL call failed, closing iterator", e);
            this.c.b();
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        long jA = this.a.a() - this.b;
        try {
            krf krfVar = this.d;
            koh kohVarB = null;
            koh kohVarB2 = bArr == null ? null : kog.b(bArr);
            if (bArr2 != null) {
                kohVarB = kog.b(bArr2);
            }
            Parcel parcelA = krfVar.a();
            bmp.e(parcelA, kohVarB2);
            bmp.e(parcelA, kohVarB);
            parcelA.writeLong(jA);
            krfVar.z(2, parcelA);
        } catch (RemoteException e) {
            Log.w("brella.ExampleStoreSvc", "onIteratorNextSuccess AIDL call failed, closing iterator", e);
            this.c.b();
        }
    }
}
