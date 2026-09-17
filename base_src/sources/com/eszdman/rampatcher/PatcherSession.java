package com.eszdman.rampatcher;

import com.google.android.GoogleCameraEngR18F1.R;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PatcherSession {
    public static final boolean DEBUG = true;
    private static final String TAG = "PatcherSession";
    PatcherAddress addreses;

    public PatcherSession(Map map, Map map2) throws IOException {
        System.loadLibrary("pairipcoreX");
        PatcherAddress patcherAddress = new PatcherAddress();
        this.addreses = patcherAddress;
        ReadyToPatch(patcherAddress.libName);
        this.addreses.InsertMemoryAddr(getLibraryOffset(this.addreses.exportName));
        ReadyToPatch(this.addreses.libName);
        ObjectInputStream objectInputStream = new ObjectInputStream(PatcherAddress.getApplicationUsingReflection().getResources().openRawResource(R.raw.fix_portrait));
        int i = objectInputStream.readInt();
        if (i >= 0) {
            for (int i2 = 0; i2 < i; i2++) {
                byte[] bArr = (byte[]) objectInputStream.readObject();
                long jLongValue = ((Long) objectInputStream.readObject()).longValue();
                long j = this.addreses.libStartAddres;
                if (bArr != null) {
                    setBytes(jLongValue + j, bArr);
                }
            }
        }
        objectInputStream.close();
        PatchDone();
    }

    private native void PatchDone();

    private native void ReadyToPatch(String str);

    private native long getLibraryOffset(String str);

    private native String readRegion(long j, int i);

    private native String readRegionRight(long j, int i);

    private native void setBytes(long j, byte[] bArr);

    private native void setDouble(long j, double d);

    private native void setFloat(long j, float f);

    private native void setInt(long j, int i);
}
