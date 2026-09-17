package defpackage;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.OisSample;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dyt extends mip {
    public static final ouj a = ouj.h("com/google/android/apps/camera/gyro/OisListener");
    public final int b;
    public final Set c;
    private final Executor d;
    private final Set g;

    public dyt(Integer num, Executor executor, Set set, Set set2) {
        this.b = num.intValue();
        this.d = executor;
        this.g = set;
        this.c = set2;
    }

    @Override // defpackage.mip
    public final void b(final lzv lzvVar) {
        this.d.execute(new Runnable() { // from class: dyr
            @Override // java.lang.Runnable
            public final void run() {
                dyt dytVar = this.a;
                lzv lzvVar2 = lzvVar;
                String str = (String) lzvVar2.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                lzr lzrVar = str != null ? (lzr) lzvVar2.g().get(str) : null;
                if (lzrVar == null) {
                    lzrVar = lzvVar2;
                }
                int i = 0;
                switch (dytVar.b) {
                    case 0:
                        if (kcz.e == null || kcz.f == null) {
                            ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 995)).o("Null OIS keys (version: 0)");
                        } else {
                            long[] jArr = (long[]) lzrVar.d(kcz.d);
                            int[] iArr = (int[]) lzrVar.d(kcz.e);
                            int[] iArr2 = (int[]) lzrVar.d(kcz.f);
                            if (jArr == null || iArr == null || iArr2 == null) {
                                ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 999)).o("Null pointer for OIS data. OIS API version: 0");
                            } else {
                                while (i < jArr.length) {
                                    dytVar.h(jArr[i], iArr[i], iArr2[i]);
                                    i++;
                                }
                            }
                        }
                        break;
                    case 1:
                        if (kcz.g == null || kcz.h == null) {
                            ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 996)).o("Null OIS keys (version: 1)");
                        } else {
                            long[] jArr2 = (long[]) lzrVar.d(kcz.d);
                            float[] fArr = (float[]) lzrVar.d(kcz.g);
                            float[] fArr2 = (float[]) lzrVar.d(kcz.h);
                            if (jArr2 == null || fArr == null || fArr2 == null) {
                                ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 1000)).o("Null pointer for OIS data. OIS API version: 1");
                            } else {
                                while (i < jArr2.length) {
                                    dytVar.h(jArr2[i], fArr[i], fArr2[i]);
                                    i++;
                                }
                            }
                        }
                        break;
                    case 2:
                        if (CaptureResult.STATISTICS_OIS_SAMPLES == null) {
                            ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 997)).o("Null OIS key (version: 2)");
                        } else {
                            OisSample[] oisSampleArr = (OisSample[]) lzrVar.d(CaptureResult.STATISTICS_OIS_SAMPLES);
                            if (oisSampleArr == null) {
                                ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 1001)).o("Null pointer for OIS data. OIS API version: 2");
                                Long l = (Long) lzrVar.d(CaptureResult.SENSOR_TIMESTAMP);
                                dytVar.h(l == null ? 0L : l.longValue(), 0.0f, 0.0f);
                            } else {
                                int length = oisSampleArr.length;
                                while (i < length) {
                                    OisSample oisSample = oisSampleArr[i];
                                    dytVar.h(oisSample.getTimestamp(), oisSample.getXshift(), oisSample.getYshift());
                                    i++;
                                }
                            }
                        }
                        break;
                    case 3:
                        if (kdd.r == null || kdd.s == null) {
                            ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 998)).o("Null OIS keys (version: 3)");
                        } else {
                            long[] jArr3 = (long[]) lzrVar.d(kdd.q);
                            int[] iArr3 = (int[]) lzrVar.d(kdd.r);
                            int[] iArr4 = (int[]) lzrVar.d(kdd.s);
                            if (jArr3 == null || iArr3 == null || iArr4 == null) {
                                ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G((char) 1002)).o("Null pointer for OIS data. OIS API version: 3");
                            } else {
                                while (i < jArr3.length) {
                                    dytVar.h(jArr3[i], iArr3[i], iArr4[i]);
                                    i++;
                                }
                            }
                        }
                        break;
                    default:
                        ((oug) ((oug) ((oug) dyt.a.b()).H(TimeUnit.MILLISECONDS)).G(994)).p("Invalid OIS API version: %d", dytVar.b);
                        break;
                }
                Iterator it = dytVar.c.iterator();
                while (it.hasNext()) {
                    ((mip) it.next()).b(lzvVar2);
                }
            }
        });
    }

    public final void h(long j, float f, float f2) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dys) it.next()).a(j, f, f2);
        }
    }
}
