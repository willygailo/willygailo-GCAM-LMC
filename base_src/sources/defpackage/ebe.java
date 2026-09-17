package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.PhysicalStabilityParams;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.ViewfinderResults;

/* JADX INFO: loaded from: classes.dex */
public interface ebe {
    public static final jti a = new jti(100.0f);

    boolean A(lzv lzvVar);

    Bitmap B(mad madVar, lzv lzvVar, gqt gqtVar, ojc ojcVar, ojc ojcVar2, ojc ojcVar3, ojc ojcVar4);

    boolean C(int i, lzv lzvVar, mad madVar, mad madVar2, lzv lzvVar2, mad madVar3);

    int a(lzv lzvVar);

    ead b();

    ecc c(mad madVar, lzv lzvVar, lig ligVar);

    edd d(int i, hsp hspVar, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar);

    edd e(int i, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar);

    edd f(int i, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar, int i2, boolean z, int i3, ojc ojcVar);

    edd g(int i, gog gogVar, PostviewParams postviewParams, gqt gqtVar, lzv lzvVar, int i2, int i3, boolean z);

    AeResults h(ecc eccVar);

    BurstSpec i(edd eddVar, mad madVar, lzv lzvVar);

    BurstSpec j(edd eddVar, mad madVar, lzv lzvVar, boolean z, Boolean bool);

    FrameMetadata k(lzv lzvVar, GyroSampleVector gyroSampleVector);

    GyroSampleVector l(lzv lzvVar);

    PhysicalStabilityParams m(int i);

    ViewfinderResults n(int i);

    void o(edd eddVar);

    void p(edd eddVar, int i, lzv lzvVar, int i2, mad madVar, mad madVar2);

    void q(edd eddVar, int i, lzv lzvVar, int i2, mad madVar, mad madVar2, ojc ojcVar);

    void r(int i, mad madVar, lzv lzvVar);

    void s(edd eddVar);

    void t(edd eddVar, BurstSpec burstSpec);

    void u(edd eddVar);

    void v(int i);

    void w(int i);

    boolean x(lzv lzvVar);

    boolean y(edd eddVar);

    boolean z(edd eddVar);
}
