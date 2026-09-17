package com.google.android.apps.camera.stats.timing;

import defpackage.iiz;
import defpackage.ijf;
import defpackage.ijq;
import defpackage.ijr;
import defpackage.ijs;
import defpackage.ljf;
import defpackage.lji;
import defpackage.mcx;

/* JADX INFO: loaded from: classes.dex */
public class CameraActivityTiming extends ijs {
    public static final ijr a;
    public static final ijr b;
    public boolean c;
    public final iiz d;
    public final ljf e;
    public lji f;
    public lji g;
    public lji h;
    public lji i;

    static {
        ijq ijqVarA = ijr.a();
        ijqVarA.b(false);
        a = ijqVarA.a();
        b = j;
    }

    public CameraActivityTiming(long j, mcx mcxVar, iiz iizVar, ljf ljfVar) {
        super(mcxVar, j, ijf.values());
        this.c = false;
        this.i = lji.b;
        this.d = iizVar;
        this.e = ljfVar;
        this.f = ljfVar.a("FirstPreviewFrame");
        this.h = ljfVar.a("ShutterButtonEnabled");
        this.g = ljfVar.a("FirstFrameReceived");
    }

    @Override // defpackage.ijs
    public final void a() {
        super.a();
        this.c = false;
    }

    public final void c() {
        this.c = true;
    }

    public final boolean d() {
        for (ijf ijfVar : ijf.values()) {
            if (ijfVar.s && !l(ijfVar)) {
                return false;
            }
        }
        return true;
    }

    public long getActivityInitializedNs() {
        return g(ijf.ACTIVITY_INITIALIZED);
    }

    public long getActivityOnCreateEndNs() {
        return g(ijf.ACTIVITY_ONCREATE_END);
    }

    public long getActivityOnCreateStartNs() {
        return g(ijf.ACTIVITY_ONCREATE_START);
    }

    public long getActivityOnResumeEndNs() {
        return g(ijf.ACTIVITY_ONRESUME_END);
    }

    public long getActivityOnResumeStartNs() {
        return g(ijf.ACTIVITY_ONRESUME_START);
    }

    public long getActivityOnStartStartNs() {
        return g(ijf.ACTIVITY_ONSTART_START);
    }

    public long getFirstPreviewFrameReceivedNs() {
        return g(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_RECEIVED);
    }

    public long getFirstPreviewFrameRenderedNs() {
        return g(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED);
    }

    public long getFirstVfePreviewFrameRenderedNs() {
        return g(ijf.ACTIVITY_FIRST_PREVIEW_FRAME_VFE_RENDERED);
    }

    public long getPermissionStartupTaskTimeEndNs() {
        return g(ijf.PERMISSIONS_STARTUP_TASK_END);
    }

    public long getPermissionStartupTaskTimeStartNs() {
        return g(ijf.PERMISSIONS_STARTUP_TASK_START);
    }

    public long getShutterButtonFirstDrawnNs() {
        return g(ijf.ACTIVITY_SHUTTER_BUTTON_DRAWN);
    }

    public long getShutterButtonFirstEnabledNs() {
        return g(ijf.ACTIVITY_SHUTTER_BUTTON_ENABLED);
    }

    public long getWaitForCameraDevicesTaskTimeEndNs() {
        return g(ijf.WAIT_FOR_CAMERA_DEVICES_TASK_END);
    }

    public long getWaitForCameraDevicesTaskTimeStartNs() {
        return g(ijf.WAIT_FOR_CAMERA_DEVICES_TASK_START);
    }

    public void recordActivityOnCreateStart(long j) {
        k(ijf.ACTIVITY_ONCREATE_START, j, a);
    }
}
