package defpackage;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes.dex */
public final class avq extends axh {
    private static final axo a = new axo("AndCamSet");

    public avq(avq avqVar) {
        super(avqVar);
    }

    public avq(awy awyVar, Camera.Parameters parameters) {
        awu awuVarA;
        awv awvVarA;
        aww awwVarA;
        if (parameters == null) {
            axp.c(a, "Settings ctor requires a non-null Camera.Parameters.");
            return;
        }
        hq hqVar = awyVar.w;
        this.g = false;
        Camera.Size previewSize = parameters.getPreviewSize();
        l(new axn(previewSize.width, previewSize.height));
        int previewFrameRate = parameters.getPreviewFrameRate();
        if (previewFrameRate > 0) {
            this.j = previewFrameRate;
            this.i = previewFrameRate;
            this.h = previewFrameRate;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        j(iArr[0], iArr[1]);
        this.l = parameters.getPreviewFormat();
        if (awyVar.d(awt.ZOOM)) {
            this.p = parameters.getZoomRatios().get(parameters.getZoom()).intValue() / 100.0f;
        } else {
            this.p = 1.0f;
        }
        this.q = parameters.getExposureCompensation();
        String flashMode = parameters.getFlashMode();
        if (flashMode == null) {
            awuVarA = awu.values()[0];
        } else {
            try {
                awuVarA = awu.a(hq.c(flashMode));
            } catch (IllegalArgumentException e) {
                awuVarA = awu.values()[0];
            }
        }
        this.r = awuVarA;
        String focusMode = parameters.getFocusMode();
        if (focusMode == null) {
            awvVarA = awv.values()[0];
        } else {
            try {
                awvVarA = awv.a(hq.c(focusMode));
            } catch (IllegalArgumentException e2) {
                awvVarA = awv.values()[0];
            }
        }
        this.s = awvVarA;
        String sceneMode = parameters.getSceneMode();
        if (sceneMode == null) {
            awwVarA = aww.values()[0];
        } else {
            try {
                awwVarA = aww.a(hq.c(sceneMode));
            } catch (IllegalArgumentException e3) {
                awwVarA = aww.values()[0];
            }
        }
        this.t = awwVarA;
        awyVar.d(awt.VIDEO_STABILIZATION);
        this.y = "true".equals(parameters.get("recording-hint"));
        i(parameters.getJpegQuality());
        Camera.Size pictureSize = parameters.getPictureSize();
        k(new axn(pictureSize.width, pictureSize.height));
        this.o = parameters.getPictureFormat();
    }

    @Override // defpackage.axh
    public final axh a() {
        return new avq(this);
    }
}
