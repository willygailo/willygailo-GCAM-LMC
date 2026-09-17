package com;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class SmootherChaikin {
    SmootherChaikin() {
    }

    public static PointF P2F(float f, float f2, float f3) {
        float f4 = f3 / 100.0f;
        return new PointF(f * f4, f4 * ((0.25f * f2) + f));
    }

    public static double[] convertToDoubleArray(List<Double> list) {
        if (list == null) {
            return null;
        }
        double[] dArr = new double[list.size()];
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public static List<Double> convertToDoubleList(List<PointF> list, float f) {
        if (list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(Double.valueOf(Math.min(1.0f, Math.max(0.0f, ((PointF) arrayList.get(i)).y / f))));
        }
        return arrayList2;
    }

    public static List<PointF> getCurveSmoothingChaikin(List<PointF> list, float f, int i, float f2) {
        if (list.size() < 3) {
            return null;
        }
        if (i < 1) {
            i = 1;
        }
        float fMax = (Math.max(0.0f, Math.min(1.0f, f)) * 0.4f) + 0.05f;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        List<PointF> smootherChaikin = arrayList;
        for (int i2 = 0; i2 < i; i2++) {
            smootherChaikin = getSmootherChaikin(smootherChaikin, fMax);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(smootherChaikin.get(0));
        PointF pointF = smootherChaikin.get(smootherChaikin.size() - 1);
        float f3 = smootherChaikin.get(0).x;
        float f4 = smootherChaikin.get(0).y;
        while (smootherChaikin.size() != 0) {
            PointF pointF2 = smootherChaikin.get(0);
            if (pointF2.x >= f2) {
                break;
            }
            if (pointF2.x < f3 + 1.0f) {
                smootherChaikin.remove(0);
            } else {
                float f5 = (pointF2.y - f4) / (pointF2.x - f3);
                float fFloor = (float) Math.floor(pointF2.x);
                f4 += f5 * (fFloor - f3);
                arrayList2.add(new PointF(fFloor, f4));
                f3 = fFloor;
            }
        }
        while (arrayList2.size() < ((int) f2)) {
            arrayList2.add(pointF);
        }
        float f6 = (pointF.y - ((PointF) arrayList2.get(arrayList2.size() - 1)).y) / (f2 - 1.0f);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            arrayList2.set(i3, new PointF(((PointF) arrayList2.get(i3)).x, ((PointF) arrayList2.get(i3)).y + (i3 * f6)));
        }
        return arrayList2;
    }

    private static List<PointF> getSmootherChaikin(List<PointF> list, float f) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        arrayList.add(list.get(0));
        while (i < list.size() - 1) {
            PointF pointF = list.get(i);
            int i2 = i + 1;
            PointF pointF2 = list.get(i2);
            float f2 = pointF.x;
            float f3 = pointF.y;
            float f4 = pointF2.x - f2;
            float f5 = pointF2.y - f3;
            float f6 = (f5 * f) + f3;
            float f7 = 1.0f - f;
            float f8 = f3 + (f5 * f7);
            PointF pointF3 = new PointF((f4 * f) + f2, f6);
            PointF pointF4 = new PointF(f2 + (f4 * f7), f8);
            if (i > 0) {
                arrayList.add(pointF3);
            }
            if (i < list.size() - 2) {
                arrayList.add(pointF4);
            }
            i = i2;
        }
        arrayList.add(list.get(list.size() - 1));
        return arrayList;
    }
}
