package com.google.vr.cardboard;

import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import defpackage.pwb;
import defpackage.pwc;
import defpackage.pwd;
import defpackage.pwf;
import defpackage.pwg;
import defpackage.pwh;
import defpackage.pwi;
import defpackage.pwk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ExternalSurfaceManager {
    private static final String b = ExternalSurfaceManager.class.getSimpleName();
    public final pwc a;
    private final Object c;
    private volatile pwi d;
    private int e;
    private boolean f;

    public ExternalSurfaceManager(long j) {
        pwc pwcVar = new pwc(j);
        this.c = new Object();
        this.d = new pwi();
        this.e = 1;
        this.a = pwcVar;
    }

    private final int a(int i, int i2, pwg pwgVar, boolean z) {
        int i3;
        synchronized (this.c) {
            pwi pwiVar = new pwi(this.d);
            i3 = this.e;
            this.e = i3 + 1;
            pwiVar.a.put(Integer.valueOf(i3), new pwf(i3, i, i2, pwgVar, z));
            this.d = pwiVar;
        }
        return i3;
    }

    private final void b(pwh pwhVar) {
        pwi pwiVar = this.d;
        if (this.f && !pwiVar.a.isEmpty()) {
            for (pwf pwfVar : pwiVar.a.values()) {
                pwfVar.a();
                pwhVar.a(pwfVar);
            }
        }
        if (pwiVar.b.isEmpty()) {
            return;
        }
        Iterator it = pwiVar.b.values().iterator();
        while (it.hasNext()) {
            ((pwf) it.next()).c(this.a);
        }
    }

    public static native void nativeCallback(long j);

    public static native void nativeUpdateSurface(long j, int i, int i2, long j2, float[] fArr);

    public void consumerAttachToCurrentGLContext() {
        this.f = true;
        pwi pwiVar = this.d;
        if (pwiVar.a.isEmpty()) {
            return;
        }
        Iterator it = pwiVar.a.values().iterator();
        while (it.hasNext()) {
            ((pwf) it.next()).a();
        }
    }

    public void consumerAttachToCurrentGLContext(Map map) {
        this.f = true;
        pwi pwiVar = this.d;
        if (!this.d.a.isEmpty()) {
            for (Integer num : this.d.a.keySet()) {
                if (!map.containsKey(num)) {
                    Log.e(b, String.format("Surface %d's texture ID is not provided, abandoning attaching to current GL context.", num));
                    return;
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (pwiVar.a.containsKey(entry.getKey())) {
                ((pwf) pwiVar.a.get(entry.getKey())).b(((Integer) entry.getValue()).intValue());
            } else {
                Log.e(b, String.format("Surface %d doesn't exist, skip attaching to current GL context.", entry.getKey()));
            }
        }
    }

    public void consumerDetachFromCurrentGLContext() {
        this.f = false;
        pwi pwiVar = this.d;
        if (pwiVar.a.isEmpty()) {
            return;
        }
        for (pwf pwfVar : pwiVar.a.values()) {
            if (pwfVar.i) {
                pwg pwgVar = pwfVar.b;
                if (pwgVar != null) {
                    pwgVar.a();
                }
                pwfVar.g.detachFromGLContext();
                pwfVar.i = false;
            }
        }
    }

    public void consumerUpdateManagedSurfaces() {
        b(new pwb(this, 1));
    }

    public void consumerUpdateManagedSurfacesSequentially() {
        b(new pwb(this, 0));
    }

    public int createExternalSurface() {
        return a(-1, -1, null, false);
    }

    public int createExternalSurface(int i, int i2, Runnable runnable, Runnable runnable2, Handler handler) {
        if (runnable == null || handler == null) {
            throw new IllegalArgumentException("Surface listener and handler must both be non-null for external Surface creation for Java callbacks.");
        }
        return a(i, i2, new pwd(runnable, runnable2, handler), false);
    }

    public int createExternalSurfaceWithNativeCallback(int i, int i2, long j, long j2, boolean z) {
        return a(i, i2, new pwk(j, j2), z);
    }

    public Surface getSurface(int i) {
        pwi pwiVar = this.d;
        HashMap map = pwiVar.a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            pwf pwfVar = (pwf) pwiVar.a.get(numValueOf);
            if (pwfVar.i) {
                return pwfVar.h;
            }
            return null;
        }
        String str = b;
        StringBuilder sb = new StringBuilder(58);
        sb.append("Surface with ID ");
        sb.append(i);
        sb.append(" does not exist, returning null");
        Log.e(str, sb.toString());
        return null;
    }

    public void releaseExternalSurface(int i) {
        synchronized (this.c) {
            pwi pwiVar = new pwi(this.d);
            HashMap map = pwiVar.a;
            Integer numValueOf = Integer.valueOf(i);
            pwf pwfVar = (pwf) map.remove(numValueOf);
            if (pwfVar != null) {
                pwiVar.b.put(numValueOf, pwfVar);
                this.d = pwiVar;
            } else {
                String str = b;
                StringBuilder sb = new StringBuilder(48);
                sb.append("Not releasing nonexistent surface ID ");
                sb.append(i);
                Log.e(str, sb.toString());
            }
        }
    }

    public void shutdown() {
        synchronized (this.c) {
            pwi pwiVar = this.d;
            this.d = new pwi();
            if (!pwiVar.a.isEmpty()) {
                Iterator it = pwiVar.a.entrySet().iterator();
                while (it.hasNext()) {
                    ((pwf) ((Map.Entry) it.next()).getValue()).c(this.a);
                }
            }
            if (!pwiVar.b.isEmpty()) {
                Iterator it2 = pwiVar.b.entrySet().iterator();
                while (it2.hasNext()) {
                    ((pwf) ((Map.Entry) it2.next()).getValue()).c(this.a);
                }
            }
        }
    }
}
