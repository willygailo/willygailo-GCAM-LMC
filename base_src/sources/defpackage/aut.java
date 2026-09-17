package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aut extends axh {
    public static final axo a = new axo("AndCam2Set");
    private final CaptureRequest.Builder A;
    private final Rect B;
    public final axr b;
    public final Rect c;

    public aut(CameraDevice cameraDevice, Rect rect, axn axnVar, axn axnVar2) throws CameraAccessException {
        if (cameraDevice == null) {
            throw new NullPointerException("camera must not be null");
        }
        if (rect == null) {
            throw new NullPointerException("activeArray must not be null");
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
        this.A = builderCreateCaptureRequest;
        this.b = new axr();
        this.B = rect;
        this.c = new Rect(0, 0, rect.width(), rect.height());
        this.g = false;
        Range range = (Range) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE);
        if (range != null) {
            j(((Integer) range.getLower()).intValue(), ((Integer) range.getUpper()).intValue());
        }
        l(axnVar);
        k(axnVar2);
        this.n = ((Byte) m(CaptureRequest.JPEG_QUALITY, (byte) 0)).byteValue();
        this.p = 1.0f;
        this.q = ((Integer) m(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, 0)).intValue();
        Integer num = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_MODE);
        awu awuVar = null;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    awuVar = awu.OFF;
                    break;
                case 2:
                    awuVar = awu.AUTO;
                    break;
                case 3:
                    awuVar = ((Integer) builderCreateCaptureRequest.get(CaptureRequest.FLASH_MODE)).intValue() != 2 ? awu.ON : awu.TORCH;
                    break;
                case 4:
                    awuVar = awu.RED_EYE;
                    break;
            }
        }
        this.r = awuVar;
        Integer num2 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AF_MODE);
        if (num2 != null) {
            this.s = aus.a(num2.intValue());
        }
        Integer num3 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_SCENE_MODE);
        if (num3 != null) {
            this.t = aus.b(num3.intValue());
        }
        Integer num4 = (Integer) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AWB_MODE);
        if (num4 != null) {
            this.u = aus.c(num4.intValue());
        }
        this.v = ((Integer) m(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0)).intValue() == 1;
        this.w = ((Boolean) m(CaptureRequest.CONTROL_AE_LOCK, false)).booleanValue();
        this.x = ((Boolean) m(CaptureRequest.CONTROL_AWB_LOCK, false)).booleanValue();
        Size size = (Size) builderCreateCaptureRequest.get(CaptureRequest.JPEG_THUMBNAIL_SIZE);
        if (size != null) {
            this.z = new axn(size.getWidth(), size.getHeight());
        }
    }

    public aut(aut autVar) {
        super(autVar);
        this.A = autVar.A;
        this.b = new axr(autVar.b);
        this.B = autVar.B;
        this.c = new Rect(autVar.c);
    }

    private final Object m(CaptureRequest.Key key, Object obj) {
        Object obj2 = this.A.get(key);
        if (obj2 != null) {
            return obj2;
        }
        this.A.set(key, obj);
        return obj;
    }

    private static final int n(double d, int i) {
        return (int) Math.min(Math.max(d, 0.0d), i);
    }

    @Override // defpackage.axh
    public final axh a() {
        return new aut(this);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (r7.i == ((java.lang.Integer) r1.getUpper()).intValue()) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r1.intValue() == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        if (r7.z.a() == r1.getHeight()) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.hardware.camera2.CaptureRequest.Key r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aut.b(android.hardware.camera2.CaptureRequest$Key, java.lang.Object):void");
    }

    public final MeteringRectangle[] c(List list) {
        if (list.size() <= 0) {
            return null;
        }
        MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[list.size()];
        int i = 0;
        while (i < list.size()) {
            Camera.Area area = (Camera.Area) list.get(i);
            Rect rect = area.rect;
            int i2 = rect.left;
            int i3 = rect.top;
            int i4 = rect.right;
            int i5 = rect.bottom;
            int i6 = this.c.left;
            double dWidth = this.c.width();
            double d = i2 + 1000;
            Double.isNaN(d);
            Double.isNaN(dWidth);
            int iN = i6 + n(dWidth * (d / 2000.0d), this.c.width() - 1);
            int i7 = this.c.top;
            double dHeight = this.c.height();
            double d2 = i3 + 1000;
            Double.isNaN(d2);
            Double.isNaN(dHeight);
            int iN2 = i7 + n(dHeight * (d2 / 2000.0d), this.c.height() - 1);
            int i8 = this.c.left;
            int iWidth = this.c.width();
            int iWidth2 = this.c.width();
            double d3 = iWidth;
            double d4 = i4 + 1000;
            Double.isNaN(d4);
            Double.isNaN(d3);
            int iN3 = n(d3 * (d4 / 2000.0d), iWidth2 - 1);
            int i9 = this.c.top;
            int iHeight = this.c.height();
            int iHeight2 = this.c.height();
            double d5 = iHeight;
            MeteringRectangle[] meteringRectangleArr2 = meteringRectangleArr;
            double d6 = i5 + 1000;
            Double.isNaN(d6);
            Double.isNaN(d5);
            meteringRectangleArr2[i] = new MeteringRectangle(iN, iN2, (i8 + iN3) - iN, (i9 + n(d5 * (d6 / 2000.0d), iHeight2 - 1)) - iN2, area.weight);
            i++;
            meteringRectangleArr = meteringRectangleArr2;
        }
        return meteringRectangleArr;
    }

    @Override // defpackage.axh
    public final void d() {
        float f;
        float fHeight;
        this.p = 1.0f;
        this.c.set(0, 0, n(this.B.width() / this.p, this.B.width()), n(this.B.height() / this.p, this.B.height()));
        this.c.offsetTo((this.B.width() - this.c.width()) / 2, (this.B.height() - this.c.height()) / 2);
        Rect rect = this.c;
        axn axnVar = this.k;
        int iWidth = rect.width();
        int iHeight = rect.height();
        float fB = axnVar.b() / axnVar.a();
        if (fB < iWidth / iHeight) {
            fHeight = rect.height();
            f = fB * fHeight;
        } else {
            float fWidth = rect.width();
            float f2 = fWidth / fB;
            f = fWidth;
            fHeight = f2;
        }
        Matrix matrix = new Matrix();
        RectF rectF = new RectF(0.0f, 0.0f, f, fHeight);
        matrix.setTranslate(rect.exactCenterX(), rect.exactCenterY());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.mapRect(rectF);
        rectF.roundOut(new Rect());
    }
}
