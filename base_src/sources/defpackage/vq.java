package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vq {
    public final wn a;
    public final Object b;
    public List c;
    private final qkg d;

    public vq(qkg qkgVar, wn wnVar) {
        qkgVar.getClass();
        wnVar.getClass();
        this.d = qkgVar;
        this.a = wnVar;
        this.b = new Object();
    }

    public final List a() {
        List list;
        String[] cameraIdList;
        synchronized (this.b) {
            list = this.c;
        }
        if (list != null && !list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = null;
        try {
            cameraIdList = ((CameraManager) this.d.get()).getCameraIdList();
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList!", e);
            cameraIdList = null;
        }
        if (cameraIdList != null && cameraIdList.length == 0) {
            Log.w("CXCP", "Failed to query CameraManager#getCameraIdList: No values returned.");
        }
        if (cameraIdList != null) {
            ArrayList arrayList2 = new ArrayList(cameraIdList.length);
            for (String str : cameraIdList) {
                str.getClass();
                arrayList2.add(ve.a(str));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? qkx.a : arrayList;
    }
}
