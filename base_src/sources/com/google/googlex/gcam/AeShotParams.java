package com.google.googlex.gcam;

import com.Fix.Pref;
import com.Helper;

/* JADX INFO: loaded from: classes.dex */
public class AeShotParams {
    public transient long a;
    protected transient boolean b;

    public AeShotParams() {
        this(GcamModuleJNI.new_AeShotParams__SWIG_0(), true);
    }

    public AeShotParams(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public final NormalizedRect a() {
        long jAeShotParams_crop_get = GcamModuleJNI.AeShotParams_crop_get(this.a, this);
        if (jAeShotParams_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jAeShotParams_crop_get, false);
    }

    public final NormalizedRect b() {
        long jAeShotParams_merged_crop_get = GcamModuleJNI.AeShotParams_merged_crop_get(this.a, this);
        if (jAeShotParams_merged_crop_get == 0) {
            return null;
        }
        return new NormalizedRect(jAeShotParams_merged_crop_get, false);
    }

    public final WeightedNormalizedRectVector c() {
        long jAeShotParams_weighted_metering_areas_get = GcamModuleJNI.AeShotParams_weighted_metering_areas_get(this.a, this);
        if (jAeShotParams_weighted_metering_areas_get == 0) {
            return null;
        }
        return new WeightedNormalizedRectVector(jAeShotParams_weighted_metering_areas_get);
    }

    public final synchronized void d() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                GcamModuleJNI.delete_AeShotParams(j);
            }
            this.a = 0L;
        }
    }

    public final void e(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_crop_set(this.a, this, NormalizedRect.a(normalizedRect), normalizedRect);
    }

    public final void f(float f) {
        GcamModuleJNI.AeShotParams_exposure_compensation_set(this.a, this, f);
    }

    protected final void finalize() {
        d();
    }

    public final void g(NormalizedRect normalizedRect) {
        GcamModuleJNI.AeShotParams_merged_crop_set(this.a, this, NormalizedRect.a(normalizedRect), normalizedRect);
    }

    public final void h(boolean z) {
        GcamModuleJNI.AeShotParams_relighting_expected_set(this.a, this, z);
    }

    public final void i(int i) {
        if (Pref.MenuValue("pref_upscaleon_key") != 0) {
            int upscale = Helper.getUpscale();
            if (upscale != 0) {
                i = (i * upscale) / 10;
            }
            GcamModuleJNI.AeShotParams_target_height_set(this.a, this, i);
        }
    }

    public final void j(int i) {
        int upscale = Helper.getUpscale();
        if (upscale != 0) {
            i = (i * upscale) / 10;
        }
        GcamModuleJNI.AeShotParams_target_width_set(this.a, this, i);
    }

    public final void k(int i) {
        GcamModuleJNI.AeShotParams_ux_mode_set(this.a, this, i);
    }
}
