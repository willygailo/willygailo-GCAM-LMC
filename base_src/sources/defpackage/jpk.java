package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class jpk implements pys {
    private final qkg a;
    private final qkg b;
    private final /* synthetic */ int c;

    public jpk(qkg qkgVar, qkg qkgVar2, int i) {
        this.c = i;
        this.a = qkgVar;
        this.b = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, char[] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, float[] fArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, int[] iArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, short[] sArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, boolean[] zArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, byte[][] bArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    public jpk(qkg qkgVar, qkg qkgVar2, int i, char[][] cArr) {
        this.c = i;
        this.b = qkgVar;
        this.a = qkgVar2;
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.c) {
            case 0:
                return new jpj((ivf) this.a.get(), this.b);
            case 1:
                return new jph((cae) this.b.get(), this.a);
            case 2:
                return new jpy(((hlj) this.a).a(), this.b, 1, null);
            case 3:
                return new jpy(((cjc) this.a).a(), this.b, 0);
            case 4:
                return new jpz((jfn) this.a.get(), this.b);
            case 5:
                return new jqk((hjn) this.a.get(), this.b);
            case 6:
                return new jpy(((hlj) this.a).a(), this.b, 2);
            case 7:
                return new jpy(((cjc) this.a).a(), this.b, 3);
            case 8:
                return new jsc(((emg) this.a).get(), ((jrq) this.b).get(), null);
            case 9:
                Context contextA = ((emp) this.b).a();
                Executor executor = (Executor) this.a.get();
                Object systemService = contextA.getSystemService("download");
                systemService.getClass();
                return new jts(new jtt((DownloadManager) systemService, contextA, contextA.getSharedPreferences("PersistSimpleDownloadManager.pref", 0)), executor);
            case 10:
                return new jty(((emd) this.b).get(), (ddf) this.a.get());
            case 11:
                return new jyt((fjs) this.a.get(), ((liq) this.b).get());
            case 12:
                return ((lzh) this.b.get()).g ? ((ljt) this.a).get() : new llf();
            case 13:
                return new lol(((lpl) this.b).get(), (ope) this.a.get());
            case 14:
                return new lpb(new ljl((Executor) this.b.get(), (ljf) this.a.get(), "FrameEventHandler"));
            case 15:
                lap lapVar = (lap) this.a.get();
                return mip.bW(lapVar, "CallbackHndlr");
            case 16:
                ((lpn) this.b).get();
                return new lqp(orx.a, ope.J(CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AE_LOCK, CaptureRequest.CONTROL_AWB_LOCK), orx.a, orx.a, ((liq) this.a).get());
            case 17:
                return new lqn((lap) this.a.get(), ((liq) this.b).get());
            case 18:
                return new lrq((lxv) this.a.get(), (lqk) this.b.get());
            case 19:
                lap lapVar2 = (lap) this.b.get();
                HandlerThread handlerThread = new HandlerThread("Session-Handler", -4);
                handlerThread.start();
                lapVar2.c(new lao(handlerThread));
                return mip.bV(handlerThread.getLooper());
            default:
                return new mip(((lpl) this.b).get());
        }
    }
}
