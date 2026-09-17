package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class vn extends qnp implements qmj {
    final /* synthetic */ vo a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(vo voVar, int i) {
        super(0);
        this.b = i;
        this.a = voVar;
    }

    public final Set a() {
        switch (this.b) {
            case 0:
                try {
                    String str = "Camera-" + this.a.a + "#physicalCameraIds";
                    vo voVar = this.a;
                    try {
                        Trace.beginSection(str);
                        Set<String> setC = vk.c(voVar.b);
                        ArrayList arrayList = new ArrayList(qmd.B(setC));
                        for (String str2 : setC) {
                            str2.getClass();
                            arrayList.add(ve.a(str2));
                        }
                        return qmd.y(arrayList);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e) {
                    return qkz.a;
                }
            case 1:
                try {
                    String str3 = "Camera-" + this.a.a + "#keys";
                    vo voVar2 = this.a;
                    try {
                        Trace.beginSection(str3);
                        List<CameraCharacteristics.Key<?>> keys = voVar2.b.getKeys();
                        if (keys == null) {
                            keys = qkx.a;
                        }
                        return qmd.y(keys);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e2) {
                    return qkz.a;
                }
            case 2:
                try {
                    String str4 = "Camera-" + this.a.a + "#availablePhysicalCameraRequestKeys";
                    vo voVar3 = this.a;
                    try {
                        Trace.beginSection(str4);
                        Iterable iterableA = vk.a(voVar3.b);
                        if (iterableA == null) {
                            iterableA = qkx.a;
                        }
                        return qmd.y(iterableA);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e3) {
                    return qkz.a;
                }
            case 3:
                try {
                    String str5 = "Camera-" + this.a.a + "#availableCaptureRequestKeys";
                    vo voVar4 = this.a;
                    try {
                        Trace.beginSection(str5);
                        List<CaptureRequest.Key<?>> availableCaptureRequestKeys = voVar4.b.getAvailableCaptureRequestKeys();
                        if (availableCaptureRequestKeys == null) {
                            availableCaptureRequestKeys = qkx.a;
                        }
                        return qmd.y(availableCaptureRequestKeys);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e4) {
                    return qkz.a;
                }
            case 4:
                try {
                    String str6 = "Camera-" + this.a.a + "#availableCaptureResultKeys";
                    vo voVar5 = this.a;
                    try {
                        Trace.beginSection(str6);
                        List<CaptureResult.Key<?>> availableCaptureResultKeys = voVar5.b.getAvailableCaptureResultKeys();
                        if (availableCaptureResultKeys == null) {
                            availableCaptureResultKeys = qkx.a;
                        }
                        return qmd.y(availableCaptureResultKeys);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e5) {
                    return qkz.a;
                }
            default:
                try {
                    String str7 = "Camera-" + this.a.a + "#availableSessionKeys";
                    vo voVar6 = this.a;
                    try {
                        Trace.beginSection(str7);
                        Iterable iterableB = vk.b(voVar6.b);
                        if (iterableB == null) {
                            iterableB = qkx.a;
                        }
                        return qmd.y(iterableB);
                    } finally {
                        Trace.endSection();
                    }
                } catch (AssertionError e6) {
                    return qkz.a;
                }
        }
    }

    @Override // defpackage.qmj
    public final /* synthetic */ Object invoke() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return a();
    }
}
