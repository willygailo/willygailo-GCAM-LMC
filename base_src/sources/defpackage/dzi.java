package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GeometricCalibrationVector;
import com.google.googlex.gcam.MeshWarp;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: loaded from: classes.dex */
final class dzi implements ebo {
    final /* synthetic */ int a;
    final /* synthetic */ gog b;
    final /* synthetic */ dzr c;

    public dzi(dzr dzrVar, int i, gog gogVar) {
        this.c = dzrVar;
        this.a = i;
        this.b = gogVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    @Override // defpackage.ebo
    public final void r(edd eddVar, Bitmap bitmap, ShotMetadata shotMetadata) {
        int i;
        this.c.i.e("PostviewRgbCallback");
        if (this.c.f.c()) {
            FrameMetadata frameMetadataF = shotMetadata.f();
            long jFrameMetadata_geometric_calibration_get = GcamModuleJNI.FrameMetadata_geometric_calibration_get(frameMetadataF.a, frameMetadataF);
            GeometricCalibrationVector geometricCalibrationVector = jFrameMetadata_geometric_calibration_get == 0 ? null : new GeometricCalibrationVector(jFrameMetadata_geometric_calibration_get, false);
            if (GcamModuleJNI.GeometricCalibrationVector_isEmpty(geometricCalibrationVector.a, geometricCalibrationVector)) {
                FrameMetadata frameMetadataF2 = shotMetadata.f();
                long jFrameMetadata_mesh_warp_get = GcamModuleJNI.FrameMetadata_mesh_warp_get(frameMetadataF2.a, frameMetadataF2);
                FloatVector floatVectorC = (jFrameMetadata_mesh_warp_get != 0 ? new MeshWarp(jFrameMetadata_mesh_warp_get, false) : null).c();
                if (!GcamModuleJNI.FloatVector_isEmpty(floatVectorC.a, floatVectorC)) {
                    ((hli) this.c.f.b()).c(bitmap, shotMetadata);
                }
            } else {
                ((hli) this.c.f.b()).c(bitmap, shotMetadata);
            }
        }
        dzr dzrVar = this.c;
        Bitmap bitmapA = dzrVar.g.a(bitmap, this.a, dzrVar.l.k());
        if (bitmapA.equals(bitmap) && (i = this.a) != 0 && bitmap != null) {
            bitmapA = dzr.a(bitmap, i);
        }
        hsa hsaVar = this.b.b;
        hsaVar.U(bitmapA, 0);
        hsaVar.W(bitmapA);
        this.c.i.f();
    }
}
