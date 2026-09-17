package defpackage;

import android.hardware.Camera;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class avp extends awy {
    private yc x;
    private yc y;

    static {
        new axo("AndCamCapabs");
    }

    public avp(Camera.Parameters parameters) {
        super(new hq(), null);
        this.x = new yc(5);
        this.y = new yc(6);
        this.o = parameters.getMaxExposureCompensation();
        this.n = parameters.getMinExposureCompensation();
        this.p = parameters.getExposureCompensationStep();
        this.q = parameters.getMaxNumDetectedFaces();
        this.s = parameters.getMaxNumMeteringAreas();
        this.m = new axn(parameters.getPreferredPreviewSizeForVideo());
        this.d.addAll(parameters.getSupportedPreviewFormats());
        this.g.addAll(parameters.getSupportedPictureFormats());
        this.u = parameters.getHorizontalViewAngle();
        this.v = parameters.getVerticalViewAngle();
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            this.b.addAll(supportedPreviewFpsRange);
        }
        Collections.sort(this.b, this.x);
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (Camera.Size size : supportedPreviewSizes) {
                this.c.add(new axn(size.width, size.height));
            }
        }
        Collections.sort(this.c, this.y);
        List<Camera.Size> supportedVideoSizes = parameters.getSupportedVideoSizes();
        if (supportedVideoSizes != null) {
            for (Camera.Size size2 : supportedVideoSizes) {
                this.e.add(new axn(size2.width, size2.height));
            }
        }
        Collections.sort(this.e, this.y);
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        if (supportedPictureSizes != null) {
            for (Camera.Size size3 : supportedPictureSizes) {
                this.f.add(new axn(size3.width, size3.height));
            }
        }
        Collections.sort(this.f, this.y);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String str : supportedSceneModes) {
                if ("auto".equals(str)) {
                    this.h.add(aww.AUTO);
                } else if ("action".equals(str)) {
                    this.h.add(aww.ACTION);
                } else if ("barcode".equals(str)) {
                    this.h.add(aww.BARCODE);
                } else if ("beach".equals(str)) {
                    this.h.add(aww.BEACH);
                } else if ("candlelight".equals(str)) {
                    this.h.add(aww.CANDLELIGHT);
                } else if ("fireworks".equals(str)) {
                    this.h.add(aww.FIREWORKS);
                } else if ("hdr".equals(str)) {
                    this.h.add(aww.HDR);
                } else if ("landscape".equals(str)) {
                    this.h.add(aww.LANDSCAPE);
                } else if ("night".equals(str)) {
                    this.h.add(aww.NIGHT);
                } else if ("night-portrait".equals(str)) {
                    this.h.add(aww.NIGHT_PORTRAIT);
                } else if ("party".equals(str)) {
                    this.h.add(aww.PARTY);
                } else if ("portrait".equals(str)) {
                    this.h.add(aww.PORTRAIT);
                } else if ("snow".equals(str)) {
                    this.h.add(aww.SNOW);
                } else if ("sports".equals(str)) {
                    this.h.add(aww.SPORTS);
                } else if ("steadyphoto".equals(str)) {
                    this.h.add(aww.STEADYPHOTO);
                } else if ("sunset".equals(str)) {
                    this.h.add(aww.SUNSET);
                } else if ("theatre".equals(str)) {
                    this.h.add(aww.THEATRE);
                }
            }
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes == null) {
            this.i.add(awu.NO_FLASH);
        } else {
            for (String str2 : supportedFlashModes) {
                if ("auto".equals(str2)) {
                    this.i.add(awu.AUTO);
                } else if ("off".equals(str2)) {
                    this.i.add(awu.OFF);
                } else if ("on".equals(str2)) {
                    this.i.add(awu.ON);
                } else if ("red-eye".equals(str2)) {
                    this.i.add(awu.RED_EYE);
                } else if ("torch".equals(str2)) {
                    this.i.add(awu.TORCH);
                }
            }
        }
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null) {
            for (String str3 : supportedFocusModes) {
                if ("auto".equals(str3)) {
                    this.j.add(awv.AUTO);
                } else if ("continuous-picture".equals(str3)) {
                    this.j.add(awv.CONTINUOUS_PICTURE);
                } else if ("continuous-video".equals(str3)) {
                    this.j.add(awv.CONTINUOUS_VIDEO);
                } else if ("edof".equals(str3)) {
                    this.j.add(awv.EXTENDED_DOF);
                } else if ("fixed".equals(str3)) {
                    this.j.add(awv.FIXED);
                } else if ("infinity".equals(str3)) {
                    this.j.add(awv.INFINITY);
                } else if ("macro".equals(str3)) {
                    this.j.add(awv.MACRO);
                }
            }
        }
        List<String> supportedFocusModes2 = parameters.getSupportedFocusModes();
        if (supportedFocusModes2 != null) {
            for (String str4 : supportedFocusModes2) {
                if ("auto".equals(str4)) {
                    this.k.add(awx.AUTO);
                } else if ("cloudy-daylight".equals(str4)) {
                    this.k.add(awx.CLOUDY_DAYLIGHT);
                } else if ("daylight".equals(str4)) {
                    this.k.add(awx.DAYLIGHT);
                } else if ("fluorescent".equals(str4)) {
                    this.k.add(awx.FLUORESCENT);
                } else if ("incandescent".equals(str4)) {
                    this.k.add(awx.INCANDESCENT);
                } else if ("shade".equals(str4)) {
                    this.k.add(awx.SHADE);
                } else if ("twilight".equals(str4)) {
                    this.k.add(awx.TWILIGHT);
                } else if ("warm-fluorescent".equals(str4)) {
                    this.k.add(awx.WARM_FLUORESCENT);
                }
            }
        }
        if (parameters.isZoomSupported()) {
            this.t = parameters.getZoomRatios().get(parameters.getMaxZoom()).intValue() / 100.0f;
            this.l.add(awt.ZOOM);
        }
        if (parameters.isVideoSnapshotSupported()) {
            this.l.add(awt.VIDEO_SNAPSHOT);
        }
        if (parameters.isAutoExposureLockSupported()) {
            this.l.add(awt.AUTO_EXPOSURE_LOCK);
        }
        if (parameters.isAutoWhiteBalanceLockSupported()) {
            this.l.add(awt.AUTO_WHITE_BALANCE_LOCK);
        }
        if (f(awv.AUTO)) {
            int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
            this.r = maxNumFocusAreas;
            if (maxNumFocusAreas > 0) {
                this.l.add(awt.FOCUS_AREA);
            }
        }
        if (this.s > 0) {
            this.l.add(awt.METERING_AREA);
        }
    }

    public avp(avp avpVar) {
        super(avpVar);
        this.x = new yc(5);
        this.y = new yc(6);
    }
}
