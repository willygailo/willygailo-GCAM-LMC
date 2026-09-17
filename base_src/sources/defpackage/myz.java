package defpackage;

import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class myz implements Window.OnFrameMetricsAvailableListener {
    private final ojz a = obr.au(new fob(5));
    private final ArrayMap b;

    public myz(ArrayMap arrayMap) {
        this.b = arrayMap;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        int i2;
        int i3;
        if (frameMetrics.getMetric(9) == 1) {
            return;
        }
        int metric = (int) (frameMetrics.getMetric(8) / 1000000);
        int iIntValue = ((Integer) this.a.a()).intValue();
        int metric2 = (int) (frameMetrics.getMetric(13) / 1000000);
        ArrayMap arrayMap = this.b;
        synchronized (arrayMap) {
            int size = arrayMap.size();
            for (int i4 = 0; i4 < size; i4++) {
                mze mzeVar = (mze) arrayMap.valueAt(i4);
                if (metric < 0) {
                    mzeVar.j++;
                } else {
                    mzeVar.i++;
                    if (metric2 > 0) {
                        int i5 = metric - metric2;
                        if (mzeVar.o < i5) {
                            mzeVar.o = i5;
                        }
                        int[] iArr = mzeVar.f;
                        if (i5 < 20) {
                            if (i5 >= -20) {
                                i3 = ((i5 + 20) >> 1) + 12;
                            } else if (i5 >= -30) {
                                i3 = ((i5 + 30) / 5) + 10;
                            } else if (i5 >= -100) {
                                i3 = ((i5 + 100) / 10) + 3;
                            } else {
                                i3 = i5 >= -200 ? ((i5 + 200) / 50) + 1 : 0;
                            }
                        } else if (i5 < 30) {
                            i3 = ((i5 - 20) / 5) + 32;
                        } else if (i5 < 100) {
                            i3 = ((i5 - 30) / 10) + 34;
                        } else if (i5 < 200) {
                            i3 = ((i5 - 50) / 100) + 41;
                        } else {
                            i3 = i5 < 1000 ? ((i5 - 200) / 100) + 43 : 51;
                        }
                        iArr[i3] = iArr[i3] + 1;
                        if (metric > metric2) {
                            mzeVar.g++;
                            mzeVar.l += metric;
                        }
                        if (metric > iIntValue) {
                            mzeVar.h++;
                            mzeVar.m += metric;
                        }
                    } else if (metric > iIntValue) {
                        mzeVar.g++;
                        mzeVar.l += metric;
                    }
                    int[] iArr2 = mzeVar.e;
                    if (metric <= 20) {
                        i2 = metric >= 8 ? (metric >> 1) - 2 : metric >> 2;
                    } else if (metric <= 30) {
                        i2 = (metric / 5) + 4;
                    } else if (metric <= 100) {
                        i2 = (metric / 10) + 7;
                    } else if (metric <= 200) {
                        i2 = (metric / 50) + 15;
                    } else {
                        i2 = metric <= 1000 ? (metric / 100) + 17 : 27;
                    }
                    iArr2[i2] = iArr2[i2] + 1;
                    mzeVar.j += i;
                    if (mzeVar.k < metric) {
                        mzeVar.k = metric;
                    }
                    mzeVar.n += metric;
                }
            }
        }
    }
}
