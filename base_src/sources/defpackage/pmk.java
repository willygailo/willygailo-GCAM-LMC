package defpackage;

import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pmk implements mfm {
    public final /* synthetic */ LensApi.LensAvailabilityCallback a;
    private final /* synthetic */ int b;

    public /* synthetic */ pmk(LensApi.LensAvailabilityCallback lensAvailabilityCallback, int i) {
        this.b = i;
        this.a = lensAvailabilityCallback;
    }

    @Override // defpackage.mfm
    public final void a(int i) {
        switch (this.b) {
            case 0:
                LensApi.LensAvailabilityCallback lensAvailabilityCallback = this.a;
                int i2 = i - 2;
                int i3 = LensApi.d;
                if (i == 0) {
                    throw null;
                }
                lensAvailabilityCallback.onAvailabilityStatusFetched(i2);
                return;
            default:
                LensApi.LensAvailabilityCallback lensAvailabilityCallback2 = this.a;
                int i4 = i - 2;
                int i5 = LensApi.d;
                if (i == 0) {
                    throw null;
                }
                lensAvailabilityCallback2.onAvailabilityStatusFetched(i4);
                return;
        }
    }
}
