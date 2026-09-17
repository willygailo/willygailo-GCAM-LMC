package defpackage;

import com.google.android.apps.camera.ui.remotecontrol.RemoteControlView;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public final class jit implements elv {
    private final RemoteControlView a;
    private Date b;

    public jit(RemoteControlView remoteControlView) {
        this.a = remoteControlView;
    }

    @Override // defpackage.elv
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.elv
    public final elx b() {
        return elx.NOTIFICATION_CHIP;
    }

    @Override // defpackage.elv
    public final /* synthetic */ Object c() {
        return enl.t();
    }

    @Override // defpackage.elv
    public final /* synthetic */ Runnable d() {
        return null;
    }

    @Override // defpackage.elv
    public final Date e() {
        return this.b;
    }

    @Override // defpackage.elv
    public final void f(Runnable runnable) {
        String strValueOf = String.valueOf(getClass().getName());
        throw new UnsupportedOperationException(strValueOf.length() != 0 ? "Unsupported Operation delayedHide(Runnable) in: ".concat(strValueOf) : new String("Unsupported Operation delayedHide(Runnable) in: "));
    }

    @Override // defpackage.elv
    public final void g() {
        this.a.setVisibility(8);
    }

    @Override // defpackage.elv
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.elv
    public final void i(Date date) {
        this.b = date;
    }

    @Override // defpackage.elv
    public final void j() {
        this.a.setVisibility(0);
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean k() {
        return false;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean l() {
        return false;
    }

    @Override // defpackage.elv
    public final boolean m() {
        return true;
    }

    @Override // defpackage.elv
    public final boolean n() {
        return false;
    }

    @Override // defpackage.elv
    public final /* synthetic */ boolean o() {
        return true;
    }

    @Override // defpackage.elv
    public final int p() {
        return 6;
    }

    @Override // defpackage.elv
    public final /* synthetic */ void q(int i, boolean z, boolean z2) {
    }
}
