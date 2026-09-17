package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.media.MediaActionSound;
import android.os.Handler;
import android.os.HandlerThread;
import com.eszdman;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class aur extends awr {
    public static final axo a = new axo("AndCam2AgntImp");
    public final aup b;
    public final axi c;
    public final eszdman cameraManager2;
    public final axk d;
    public final CameraManager e;
    public final MediaActionSound f;
    public axg g;
    public final List h;
    private final HandlerThread j;
    private int k;

    public aur(Context context) {
        HandlerThread handlerThread = new HandlerThread("Camera2 Handler Thread");
        this.j = handlerThread;
        handlerThread.start();
        aup aupVar = new aup(this, handlerThread.getLooper());
        this.b = aupVar;
        this.g = new axg(aupVar);
        this.c = new axi();
        axk axkVar = new axk(aupVar, handlerThread);
        this.d = axkVar;
        axkVar.start();
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        this.e = cameraManager;
        this.cameraManager2 = new eszdman(cameraManager);
        MediaActionSound mediaActionSound = new MediaActionSound();
        this.f = mediaActionSound;
        mediaActionSound.load(0);
        this.k = 0;
        this.h = new ArrayList();
        h();
    }

    private final void h() {
        try {
            String[] cameraIdList = this.cameraManager2.getCameraIdList();
            HashSet hashSet = new HashSet(Arrays.asList(cameraIdList));
            for (int i = 0; i < this.h.size(); i++) {
                if (!hashSet.contains(this.h.get(i))) {
                    this.h.set(i, null);
                    this.k--;
                }
            }
            hashSet.removeAll(this.h);
            for (String str : cameraIdList) {
                if (hashSet.contains(str)) {
                    this.h.add(str);
                    this.k++;
                }
            }
        } catch (CameraAccessException e) {
            axp.b(a, "Could not get device listing from camera subsystem", e);
        }
    }

    @Override // defpackage.awr
    protected final Handler a() {
        return this.b;
    }

    @Override // defpackage.awr
    public final axa b() {
        h();
        return new aub(this.e, (String[]) this.h.toArray(new String[0]));
    }

    @Override // defpackage.awr
    public final axg c() {
        return this.g;
    }

    @Override // defpackage.awr
    protected final axi d() {
        return this.c;
    }

    @Override // defpackage.awr
    public final axk e() {
        return this.d;
    }

    @Override // defpackage.awr
    public final void f(axg axgVar) {
        this.g = axgVar;
    }
}
