package com;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public class CameraAPI2Keys {
    public static final CaptureRequest.Key<Float> LENS_APERTURE = new CaptureRequest.Key<>("android.lens.aperture", Float.TYPE);
    public static final CaptureRequest.Key<Integer> CONTROL_LIVE_HDR_LEVEL = new CaptureRequest.Key<>("samsung.android.control.liveHdrLevel", Integer.TYPE);
    public static final CaptureRequest.Key<Integer> CONTROL_LIVE_HDR_MODE = new CaptureRequest.Key<>("samsung.android.control.liveHdrMode", Integer.TYPE);
    public static final CaptureRequest.Key<Integer> CONTROL_METERING_MODE = new CaptureRequest.Key<>("samsung.android.control.meteringMode", Integer.TYPE);

    public static <T> OutputConfiguration createOutputConfiguration(Size size, Class<T> cls) {
        return new OutputConfiguration(size, cls);
    }

    public static int getLibraryVersion() {
        return 1;
    }
}
