package defpackage;

import MC.hslh;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import com.Fix.Pref;
import com.Helper;
import com.SDE.LensValue;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class luw implements lzp {
    private final CameraDevice a;

    public luw(CameraDevice cameraDevice) {
        this.a = cameraDevice;
    }

    @Override // defpackage.lzp
    public final int a() throws llv {
        try {
            return this.a.getCameraAudioRestriction();
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.lzp
    public final String b() {
        return this.a.getId();
    }

    @Override // defpackage.lzp
    public final void c(lzz lzzVar) throws llv {
        try {
            SessionConfiguration sessionConfiguration = new SessionConfiguration(lzzVar.a, obr.am(lzzVar.b, imd.j), lzzVar.c, new lvc(lzzVar.d));
            lzq lzqVar = lzzVar.e;
            if (lzqVar != null) {
                sessionConfiguration.setSessionParameters((CaptureRequest) mip.aS(lzqVar));
            }
            this.a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.lzp, defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.lzp
    public final void d(List list, lzn lznVar, Handler handler) throws llv {
        try {
            this.a.createCaptureSession(list, new lvc(lznVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.lzp
    public final void e(List list, lzn lznVar, Handler handler) throws llv {
        String str;
        try {
            CameraDevice cameraDevice = this.a;
            if (Pref.MenuValue(LensValue.SetLensValueOp("pref_opmodes_key")) != 0) {
                Integer.parseInt(cameraDevice.getId());
                if (Pref.MenuValue("pref_Customop_key") == 0) {
                    if (Helper.sModeTo == jrl.PHOTO) {
                        str = "pref_opmode_normal_key";
                    } else if (Helper.sModeTo == jrl.VIDEO) {
                        str = "pref_opmode_video_key";
                    } else if (Helper.sModeTo == jrl.SLOW_MOTION) {
                        str = "pref_opmode_motion_key";
                    } else if (Helper.sModeTo == jrl.LONG_EXPOSURE) {
                        str = "pref_opmode_night_key";
                    } else if (Helper.sModeTo == jrl.PORTRAIT) {
                        str = "pref_opmode_portrait_key";
                    } else {
                        str = Helper.sModeTo == jrl.UNINITIALIZED ? "pref_opmode_experimental_key" : "pref_opmode_key";
                    }
                } else if (Helper.sModeTo == jrl.PHOTO) {
                    str = "pref_Copmode_normal_key";
                } else if (Helper.sModeTo == jrl.VIDEO) {
                    str = "pref_Copmode_video_key";
                } else if (Helper.sModeTo == jrl.SLOW_MOTION) {
                    str = "pref_Copmode_motion_key";
                } else if (Helper.sModeTo == jrl.LONG_EXPOSURE) {
                    str = "pref_Copmode_night_key";
                } else if (Helper.sModeTo == jrl.PORTRAIT) {
                    str = "pref_Copmode_portrait_key";
                } else {
                    str = Helper.sModeTo == jrl.UNINITIALIZED ? "pref_Copmode_experimental_key" : "pref_Copmode_key";
                }
                int iMenuValue = Pref.MenuValue(LensValue.SetLensValueOp(str));
                if (iMenuValue != 0) {
                    cameraDevice.createCustomCaptureSession(null, mip.aT(list), iMenuValue, new lvc(lznVar), handler);
                    return;
                }
            }
            cameraDevice.createCaptureSessionByOutputConfigurations(mip.aT(list), new lvc(lznVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.lzp
    public final void f(List list, lzn lznVar, Handler handler) throws llv {
        try {
            this.a.createConstrainedHighSpeedCaptureSession(list, new lvc(lznVar), handler);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.lzp
    public final void g(int i) throws llv {
        try {
            this.a.setCameraAudioRestriction(i);
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }

    @Override // defpackage.lzp
    public final luz h(int i) throws llv {
        try {
            return hslh.GetC2apiPref(new luz(this.a.createCaptureRequest(i)));
        } catch (CameraAccessException | IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException e) {
            throw new llv(e);
        }
    }
}
