package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.util.SparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class kde {
    private static final SparseArray a;
    private static final int[] b;

    static {
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.append(0, "com.google.android.camera.experimental2015.ExperimentalKeys");
        sparseArray.append(1, "com.google.android.camera.experimental2016.ExperimentalKeys");
        sparseArray.append(2, "com.google.android.camera.experimental2017.ExperimentalKeys");
        sparseArray.append(3, "com.google.android.camera.experimental2018.ExperimentalKeys");
        sparseArray.append(4, "com.google.android.camera.experimental2019.ExperimentalKeys");
        sparseArray.append(5, "com.google.android.camera.experimental2020_midyear.ExperimentalKeys");
        sparseArray.append(6, "com.google.android.camera.experimental2020.ExperimentalKeys");
        sparseArray.append(7, "com.google.android.camera.experimental2021.ExperimentalKeys");
        b = f();
    }

    public static void a(ImageReader imageReader) {
        imageReader.discardFreeBuffers();
    }

    public static void b(CameraCaptureSession cameraCaptureSession, List list) throws CameraAccessException {
        cameraCaptureSession.finalizeOutputConfigurations(list);
    }

    public static void c(OutputConfiguration outputConfiguration, Surface surface) {
        outputConfiguration.addSurface(surface);
    }

    public static void d(MediaRecorder mediaRecorder, int i, int i2) {
        mediaRecorder.setVideoEncodingProfileLevel(i, i2);
    }

    public static boolean e(int i) {
        return Arrays.binarySearch(b, i) >= 0;
    }

    private static int[] f() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = a;
            if (i2 >= sparseArray.size()) {
                break;
            }
            try {
                Class.forName((String) sparseArray.valueAt(i2));
                arrayList.add(Integer.valueOf(sparseArray.keyAt(i2)));
            } catch (ClassNotFoundException e) {
            } catch (NoClassDefFoundError e2) {
            }
            i2++;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i3 = 0;
        while (i < size) {
            iArr[i3] = ((Integer) arrayList.get(i)).intValue();
            i++;
            i3++;
        }
        Arrays.sort(iArr);
        return iArr;
    }
}
