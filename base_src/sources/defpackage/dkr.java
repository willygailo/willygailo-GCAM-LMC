package defpackage;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.PixelRect;

/* JADX INFO: loaded from: classes.dex */
public final class dkr {
    public static void a() {
        lil.a(dkr.class);
    }

    public static boolean b(lwd lwdVar, hsr hsrVar) {
        return lwdVar == lwd.FRONT || hsrVar == hsr.PORTRAIT;
    }

    public static Point c(Point point, mmf mmfVar, Rect rect) {
        int iHeight;
        float fB = mmfVar.b() / mmfVar.a();
        int iWidth = rect.width();
        int iHeight2 = rect.height();
        int iWidth2 = rect.width();
        int iHeight3 = rect.height();
        float f = iWidth / iHeight2;
        int iWidth3 = 0;
        if (fB < f) {
            iWidth2 = (int) (rect.height() * fB);
            iWidth3 = (int) ((rect.width() - iWidth2) * 0.5f);
            iHeight = 0;
        } else {
            iHeight3 = (int) (rect.width() / fB);
            iHeight = (int) ((rect.height() - iHeight3) * 0.5f);
        }
        return new Point((((point.x - rect.left) - iWidth3) * mmfVar.b()) / iWidth2, (((point.y - rect.top) - iHeight) * mmfVar.a()) / iHeight3);
    }

    public static Point d(Point point, MeshWarp meshWarp) {
        if (meshWarp == null || meshWarp.a() == 0 || meshWarp.b() == 0) {
            return point;
        }
        int iA = meshWarp.a();
        int iB = meshWarp.b();
        long jMeshWarp_mesh_warp_crop_region_get = GcamModuleJNI.MeshWarp_mesh_warp_crop_region_get(meshWarp.a, meshWarp);
        PixelRect pixelRect = jMeshWarp_mesh_warp_crop_region_get == 0 ? null : new PixelRect(jMeshWarp_mesh_warp_crop_region_get, false);
        FloatVector floatVectorC = meshWarp.c();
        PointF pointF = new PointF((point.x - pixelRect.a()) / GcamModuleJNI.PixelRect_width(pixelRect.a, pixelRect), (point.y - pixelRect.b()) / GcamModuleJNI.PixelRect_height(pixelRect.a, pixelRect));
        float fMin = Math.min(Math.max(pointF.x * iA, 0.0f), iA - 1);
        float fMin2 = Math.min(Math.max(pointF.y * iB, 0.0f), iB - 1);
        double d = fMin;
        int iFloor = (int) Math.floor(d);
        int iCeil = (int) Math.ceil(d);
        double d2 = fMin2;
        int iFloor2 = (int) Math.floor(d2);
        double dCeil = Math.ceil(d2);
        int i = iFloor2 * iA;
        int i2 = i + iFloor;
        int i3 = i2 + i2;
        Point point2 = new Point(i3, i3 + 1);
        int i4 = i + iCeil;
        int i5 = i4 + i4;
        Point point3 = new Point(i5, i5 + 1);
        int i6 = ((int) dCeil) * iA;
        int i7 = i6 + iFloor;
        int i8 = i7 + i7;
        Point point4 = new Point(i8, i8 + 1);
        int i9 = i6 + iCeil;
        int i10 = i9 + i9;
        Point point5 = new Point(i10, i10 + 1);
        PointF pointF2 = new PointF(floatVectorC.a(point2.x), floatVectorC.a(point2.y));
        PointF pointF3 = new PointF(floatVectorC.a(point3.x), floatVectorC.a(point3.y));
        PointF pointF4 = new PointF(floatVectorC.a(point4.x), floatVectorC.a(point4.y));
        PointF pointF5 = new PointF(floatVectorC.a(point5.x), floatVectorC.a(point5.y));
        float f = fMin - iFloor;
        float f2 = fMin2 - iFloor2;
        float f3 = 1.0f - f;
        float f4 = 1.0f - f2;
        return new Point((int) ((((pointF5.x * f) + (pointF4.x * f3)) * f2) + (((pointF3.x * f) + (pointF2.x * f3)) * f4)), (int) ((f * ((pointF5.y * f2) + (pointF3.y * f4))) + (f3 * ((f2 * pointF4.y) + (f4 * pointF2.y)))));
    }
}
