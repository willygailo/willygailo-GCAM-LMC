package defpackage;

import android.graphics.Rect;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.BufferUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.GrayReadViewU8;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.YuvReadView;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class edo implements mad {
    public final List a;
    public final YuvReadView b;
    private final long c;

    public edo(YuvReadView yuvReadView, long j) {
        ByteBuffer byteBufferB;
        ByteBuffer byteBufferB2;
        boolean z = yuvReadView.d() == 1 || yuvReadView.d() == 2;
        obr.aG(z, "Format of yuvReadView can only be NV12 or NV21!");
        GrayReadViewU8 grayReadViewU8 = new GrayReadViewU8(GcamModuleJNI.YuvReadView_luma_read_view(yuvReadView.a, yuvReadView));
        InterleavedReadViewU8 interleavedReadViewU8 = new InterleavedReadViewU8(GcamModuleJNI.YuvReadView_chroma_read_view(yuvReadView.a, yuvReadView));
        int iA = (int) (((long) (grayReadViewU8.a() * (GcamModuleJNI.GrayReadViewU8_width(grayReadViewU8.a, grayReadViewU8) - 1))) + 1 + ((long) (grayReadViewU8.b() * (GcamModuleJNI.GrayReadViewU8_height(grayReadViewU8.a, grayReadViewU8) - 1))));
        int iE = (int) (((long) (interleavedReadViewU8.e() * (interleavedReadViewU8.d() - 1))) + 1 + ((long) (interleavedReadViewU8.f() * (interleavedReadViewU8.c() - 1))) + ((long) (interleavedReadViewU8.a() * (interleavedReadViewU8.b() - 1))));
        long jGrayReadViewU8_data = GcamModuleJNI.GrayReadViewU8_data(grayReadViewU8.a, grayReadViewU8);
        ByteBuffer byteBufferB3 = BufferUtils.b(pjk.a(jGrayReadViewU8_data == 0 ? null : new pjk(jGrayReadViewU8_data)), iA);
        if (yuvReadView.d() == 1) {
            byteBufferB = BufferUtils.b(pjk.a(interleavedReadViewU8.g()), iE);
            byteBufferB2 = BufferUtils.b(pjk.a(interleavedReadViewU8.g()) + ((long) interleavedReadViewU8.a()), iE);
        } else {
            ByteBuffer byteBufferB4 = BufferUtils.b(pjk.a(interleavedReadViewU8.g()), iE);
            byteBufferB = BufferUtils.b(pjk.a(interleavedReadViewU8.g()) + ((long) interleavedReadViewU8.a()), iE);
            byteBufferB2 = byteBufferB4;
        }
        this.c = j;
        this.b = yuvReadView;
        this.a = Arrays.asList(new lvd(byteBufferB3, grayReadViewU8.b(), grayReadViewU8.a(), 1), new lvd(byteBufferB, interleavedReadViewU8.f(), interleavedReadViewU8.e(), 1), new lvd(byteBufferB2, interleavedReadViewU8.f(), interleavedReadViewU8.e(), 1));
    }

    @Override // defpackage.mad
    public final int a() {
        return 35;
    }

    @Override // defpackage.mad
    public final int b() {
        return this.b.b();
    }

    @Override // defpackage.mad
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.mad
    public final long d() {
        return this.c;
    }

    @Override // defpackage.mad
    public final Rect e() {
        return new Rect(0, 0, c(), b());
    }

    @Override // defpackage.mad
    public final HardwareBuffer f() {
        return null;
    }

    @Override // defpackage.mad
    public final List g() {
        return this.a;
    }

    @Override // defpackage.mad
    public final void h(Rect rect) {
    }

    @Override // defpackage.mad
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.lzl
    public final kkm j() {
        return kkm.b();
    }
}
