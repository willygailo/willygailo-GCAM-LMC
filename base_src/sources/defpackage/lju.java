package defpackage;

import android.hardware.camera2.CameraAccessException;

/* JADX INFO: loaded from: classes2.dex */
public enum lju {
    CAMERA_OPEN_TIMEOUT(-12),
    CAMERAS_NOT_ENUMERATED(-11),
    CAMERA_SECURITY_EXCEPTION(-10),
    CAMERA_ID_NOT_VALID(-9),
    CAMERA_ACCESS_CAMERA_ERROR(-8),
    CAMERA_ACCESS_CAMERA_DISCONNECTED(-7),
    CAMERA_ACCESS_CAMERA_DISABLED(-6),
    CAMERA_ACCESS_MAX_CAMERAS_IN_USE(-5),
    CAMERA_ACCESS_CAMERA_IN_USE(-4),
    CAMERA_NO_WAKELOCK_ERROR_CODE(-3),
    CAMERA_DISCONNECTED_ERROR_CODE(-2),
    CAMERA_CLOSED_ERROR_CODE(-1),
    CAMERA_ERROR_CODE_UNKNOWN(0),
    CAMERA_DEVICE_ERROR_CAMERA_IN_USE(1),
    CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE(2),
    CAMERA_DEVICE_ERROR_CAMERA_DISABLED(3),
    CAMERA_DEVICE_ERROR_CAMERA_DEVICE(4),
    CAMERA_DEVICE_ERROR_CAMERA_SERVICE(5),
    CAMERA_DEVICE_ERROR_CAMERA_UNKNOWN(6);

    public static final oor t;
    private static final oor v;
    public final int u;

    static {
        lju ljuVar = CAMERA_ACCESS_CAMERA_ERROR;
        lju ljuVar2 = CAMERA_ACCESS_CAMERA_DISCONNECTED;
        lju ljuVar3 = CAMERA_ACCESS_CAMERA_DISABLED;
        lju ljuVar4 = CAMERA_ACCESS_MAX_CAMERAS_IN_USE;
        lju ljuVar5 = CAMERA_ACCESS_CAMERA_IN_USE;
        lju ljuVar6 = CAMERA_DEVICE_ERROR_CAMERA_IN_USE;
        lju ljuVar7 = CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE;
        lju ljuVar8 = CAMERA_DEVICE_ERROR_CAMERA_DISABLED;
        lju ljuVar9 = CAMERA_DEVICE_ERROR_CAMERA_DEVICE;
        lju ljuVar10 = CAMERA_DEVICE_ERROR_CAMERA_SERVICE;
        oon oonVarM = oor.m();
        oonVarM.e(4, ljuVar5);
        oonVarM.e(5, ljuVar4);
        oonVarM.e(1, ljuVar3);
        oonVarM.e(2, ljuVar2);
        oonVarM.e(3, ljuVar);
        v = oonVarM.c();
        oon oonVarM2 = oor.m();
        oonVarM2.e(1, ljuVar6);
        oonVarM2.e(2, ljuVar7);
        oonVarM2.e(3, ljuVar8);
        oonVarM2.e(4, ljuVar9);
        oonVarM2.e(5, ljuVar10);
        t = oonVarM2.c();
    }

    lju(int i) {
        this.u = i;
    }

    public static lju a(int i) {
        lju ljuVar = (lju) v.get(Integer.valueOf(i));
        if (ljuVar != null) {
            return ljuVar;
        }
        throw new IllegalStateException("Unknown Camera Access error code");
    }

    public static lju b(lvu lvuVar) {
        Throwable th = lvuVar.b;
        lju ljuVar = CAMERA_ERROR_CODE_UNKNOWN;
        if (th instanceof CameraAccessException) {
            return a(((CameraAccessException) th).getReason());
        }
        return !(th instanceof IllegalArgumentException) ? ljuVar : CAMERA_DEVICE_ERROR_CAMERA_UNKNOWN;
    }

    public static boolean d(lju ljuVar) {
        return ljuVar.equals(CAMERAS_NOT_ENUMERATED) || ljuVar.equals(CAMERA_ACCESS_CAMERA_ERROR) || ljuVar.equals(CAMERA_DEVICE_ERROR_CAMERA_UNKNOWN);
    }

    public static boolean e(lju ljuVar) {
        return ljuVar.equals(CAMERA_DEVICE_ERROR_CAMERA_DEVICE) || ljuVar.equals(CAMERA_DEVICE_ERROR_CAMERA_SERVICE);
    }

    public final String c() {
        switch (this) {
            case CAMERA_OPEN_TIMEOUT:
                return "Camera open timed out.";
            case CAMERAS_NOT_ENUMERATED:
                return "Unable to connect to any camera";
            case CAMERA_SECURITY_EXCEPTION:
                return "App does not have permission to access camera at the moment";
            case CAMERA_ID_NOT_VALID:
                return "Camera id no longer valid";
            case CAMERA_ACCESS_CAMERA_ERROR:
                return "CameraAccessException - The camera device is currently in the error state.";
            case CAMERA_ACCESS_CAMERA_DISCONNECTED:
                return "CameraAccessException - Camera disconnected";
            case CAMERA_ACCESS_CAMERA_DISABLED:
                return "CameraAccessException - The camera is disabled due to a device policy, and cannot be opened.";
            case CAMERA_ACCESS_MAX_CAMERAS_IN_USE:
                return "CameraAccessException - Maximum cameras in use.";
            case CAMERA_ACCESS_CAMERA_IN_USE:
                return "CameraAccessException - The camera device is in use already.";
            case CAMERA_NO_WAKELOCK_ERROR_CODE:
                return "App is not holding a camera wakelock";
            case CAMERA_DISCONNECTED_ERROR_CODE:
                return "Camera was disconnected";
            case CAMERA_CLOSED_ERROR_CODE:
                return "App closed the camera device";
            case CAMERA_ERROR_CODE_UNKNOWN:
            default:
                int i = this.u;
                StringBuilder sb = new StringBuilder(36);
                sb.append("Unknown failure reason (");
                sb.append(i);
                sb.append(")");
                return sb.toString();
            case CAMERA_DEVICE_ERROR_CAMERA_IN_USE:
                return "Camera is in use (1)";
            case CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE:
                return "Maximum cameras in use (2)";
            case CAMERA_DEVICE_ERROR_CAMERA_DISABLED:
                return "Camera is disabled (3)";
            case CAMERA_DEVICE_ERROR_CAMERA_DEVICE:
                return "Camera encountered a fatal error (4)";
            case CAMERA_DEVICE_ERROR_CAMERA_SERVICE:
                return "Camera service encountered a fatal error (5)";
            case CAMERA_DEVICE_ERROR_CAMERA_UNKNOWN:
                return "Unable to retrieve camera characteristics for unknown device";
        }
    }
}
