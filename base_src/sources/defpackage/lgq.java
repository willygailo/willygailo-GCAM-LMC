package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioRouting;
import android.os.Handler;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
final class lgq implements lxl {
    private final mrp a;

    public lgq(mrp mrpVar) {
        this.a = mrpVar;
    }

    @Override // defpackage.lxl
    public final int a() {
        return ((mrq) this.a).a.getRecordingState();
    }

    @Override // android.media.AudioRouting
    public final void addOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener, Handler handler) {
        this.a.addOnRoutingChangedListener(onRoutingChangedListener, handler);
    }

    @Override // defpackage.lxl
    public final AudioFormat b() {
        return this.a.a();
    }

    @Override // defpackage.lxl
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.lxl, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.lxl
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.lxl
    public final lgp e(ByteBuffer byteBuffer, int i) {
        mro mroVarB = this.a.b(byteBuffer, i);
        if (mroVarB == null) {
            return null;
        }
        return new lgp(mroVarB);
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getPreferredDevice() {
        return this.a.getPreferredDevice();
    }

    @Override // android.media.AudioRouting
    public final AudioDeviceInfo getRoutedDevice() {
        return this.a.getRoutedDevice();
    }

    @Override // android.media.AudioRouting
    public final void removeOnRoutingChangedListener(AudioRouting.OnRoutingChangedListener onRoutingChangedListener) {
        this.a.removeOnRoutingChangedListener(onRoutingChangedListener);
    }

    @Override // android.media.AudioRouting
    public final boolean setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        return this.a.setPreferredDevice(audioDeviceInfo);
    }
}
