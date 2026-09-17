package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.Face;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final class fws {
    public final AccessibilityManager a;
    public final dnj b;
    public final fvx c;
    public final gvb d;
    public final ghx e;

    public fws(AccessibilityManager accessibilityManager, dnj dnjVar, ghx ghxVar, gvb gvbVar, fvx fvxVar, enl enlVar, ddf ddfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        accessibilityManager.getClass();
        this.a = accessibilityManager;
        dnjVar.getClass();
        this.b = dnjVar;
        ghxVar.getClass();
        this.e = ghxVar;
        gvbVar.getClass();
        this.d = gvbVar;
        this.c = fvxVar;
        enlVar.getClass();
        ddi ddiVar = ddl.a;
        ddfVar.c();
    }

    public final lie a(lco lcoVar, lar larVar) {
        return lcoVar.a(new lij() { // from class: fwp
            @Override // defpackage.lij
            public final void fB(Object obj) {
                boolean z;
                boolean z2;
                int iC;
                int iC2;
                String string;
                String strConcat;
                fws fwsVar = this.a;
                gnq gnqVar = (gnq) obj;
                if (fwsVar.a.isEnabled()) {
                    Face[] faceArr = gnqVar.a;
                    hjy[] hjyVarArr = new hjy[faceArr.length];
                    for (int i = 0; i < faceArr.length; i++) {
                        hjyVarArr[i] = new hjy(-1, faceArr[i].getBounds(), faceArr[i].getScore(), null, null, null);
                    }
                    Rect rect = (Rect) fwsVar.e.l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    Integer num = (Integer) fwsVar.e.l(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
                    if (rect == null || num == null) {
                        return;
                    }
                    dnj dnjVar = fwsVar.b;
                    int iF = fwsVar.e.f();
                    int i2 = fwsVar.d.c().e;
                    int iIntValue = num.intValue();
                    lwd lwdVar = fwsVar.c.b;
                    lwd lwdVar2 = lwd.FRONT;
                    if (iF == 0 || iF == 90 || iF == 180) {
                        z = true;
                    } else if (iF == 270) {
                        iF = 270;
                        z = true;
                    } else {
                        z = false;
                    }
                    obr.aI(z, "Invalid sensor orientation: %s", iF);
                    boolean z3 = i2 == 0 || i2 == 90 || i2 == 180 || i2 == 270;
                    obr.aI(z3, "Invalid device orientation: %s", i2);
                    hjy[] hjyVarArr2 = hjyVarArr;
                    if (dnjVar.f) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j = dnjVar.d;
                        boolean z4 = j == -1 || jCurrentTimeMillis - j > 3000;
                        int length = hjyVarArr2.length;
                        if (length > 0) {
                            z2 = true;
                        } else if (dnjVar.e != 0) {
                            length = 0;
                            z2 = true;
                        } else {
                            length = 0;
                            z2 = false;
                        }
                        if (z4 && z2) {
                            dnjVar.e = length;
                            dnjVar.d = jCurrentTimeMillis;
                            if (length != 1) {
                                if (length == iIntValue) {
                                    dnjVar.b.announceForAccessibility(dnjVar.a.getString(R.string.max_face_announcement, Integer.valueOf(length)));
                                    return;
                                } else {
                                    dnjVar.b.announceForAccessibility(dnjVar.a.getResources().getQuantityString(R.plurals.number_of_faces_announcement, length, Integer.valueOf(length)));
                                    return;
                                }
                            }
                            View view = dnjVar.b;
                            Context context = dnjVar.a;
                            Object[] objArr = new Object[3];
                            objArr[0] = 1;
                            hjy hjyVar = hjyVarArr2[0];
                            int iCenterX = hjyVar.a.centerX();
                            int iCenterY = hjyVar.a.centerY();
                            int iWidth = rect.width();
                            int iHeight = rect.height();
                            int i3 = (i2 + iF) % 360;
                            if (lwdVar == lwdVar2) {
                                int i4 = iF % 180;
                                if (i4 == 0) {
                                    iCenterX = iWidth - iCenterX;
                                } else if (i4 != 0) {
                                    iCenterY = iHeight - iCenterY;
                                }
                            }
                            switch (i3) {
                                case 0:
                                    iC = dnj.c(iCenterX, iWidth, 3);
                                    iC2 = dnj.c(iCenterY, iHeight, 3);
                                    break;
                                case com.google.android.apps.camera.bottombar.R.styleable.AppCompatTheme_popupWindowStyle /* 90 */:
                                    iC = dnj.c(iHeight - iCenterY, iHeight, 3);
                                    iC2 = dnj.c(iCenterX, iWidth, 3);
                                    break;
                                case 180:
                                    iC = dnj.c(iWidth - iCenterX, iWidth, 3);
                                    iC2 = dnj.c(iHeight - iCenterY, iHeight, 3);
                                    break;
                                case 270:
                                    iC = dnj.c(iCenterY, iHeight, 3);
                                    iC2 = dnj.c(iWidth - iCenterX, iWidth, 3);
                                    break;
                                default:
                                    StringBuilder sb = new StringBuilder(90);
                                    sb.append("Invalid sensor rotation. Display orientation: ");
                                    sb.append(i2);
                                    sb.append(", Sensor orientation: ");
                                    sb.append(iF);
                                    throw new IllegalStateException(sb.toString());
                            }
                            objArr[1] = dnjVar.a.getString(dnjVar.c[iC2][iC]);
                            float fWidth = hjyVarArr2[0].a.width();
                            float fWidth2 = rect.width();
                            if (fWidth2 == 0.0f || fWidth / fWidth2 < 0.05f) {
                                string = dnjVar.a.getString(R.string.face_size_tiny);
                            } else {
                                int iC3 = (dnj.c((int) fWidth, (int) fWidth2, 10) * 10) + 10;
                                if (iC3 >= 50) {
                                    String strValueOf = String.valueOf(dnjVar.a.getString(R.string.face_very_close));
                                    strConcat = strValueOf.length() != 0 ? ". ".concat(strValueOf) : new String(". ");
                                } else if (iC3 < 30 || lwdVar != lwdVar2) {
                                    strConcat = "";
                                } else {
                                    String strValueOf2 = String.valueOf(dnjVar.a.getString(R.string.face_in_selfie_range));
                                    strConcat = strValueOf2.length() != 0 ? ". ".concat(strValueOf2) : new String(". ");
                                }
                                String strValueOf3 = String.valueOf(dnjVar.a.getString(R.string.face_size_percent_screen, Integer.valueOf(iC3)));
                                String strValueOf4 = String.valueOf(strConcat);
                                string = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                            }
                            objArr[2] = string;
                            view.announceForAccessibility(context.getString(R.string.detailed_face_announcement, objArr));
                        }
                    }
                }
            }
        }, larVar);
    }
}
