package defpackage;

import com.google.android.GoogleCameraEngR18F1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eyy implements Runnable {
    public final /* synthetic */ eza a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ eyy(eza ezaVar, float f, int i) {
        this.c = i;
        this.a = ezaVar;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                eza ezaVar = this.a;
                float f = this.b;
                ovd ovdVar = ovl.a;
                ezaVar.a(f);
                ezaVar.a.j.b();
                if (f == 1.0f) {
                    ezaVar.a.h.n();
                    ezaVar.a.i.b(R.raw.camera_shutter);
                }
                break;
            default:
                this.a.F(this.b, -1L);
                break;
        }
    }
}
