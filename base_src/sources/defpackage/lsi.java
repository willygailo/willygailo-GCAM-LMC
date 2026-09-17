package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class lsi implements lkc, lie {
    private final lso b;
    private final lvs c;
    private final Handler d;
    private final ljf e;
    private final lis f;
    private lsp g;
    private lzp h = null;
    private boolean i = false;
    public final lap a = new lap();

    public lsi(lvs lvsVar, lsp lspVar, lso lsoVar, Handler handler, ljf ljfVar, lis lisVar) {
        this.c = lvsVar;
        this.g = lspVar;
        this.b = lsoVar;
        this.d = handler;
        this.e = ljfVar;
        this.f = lisVar.a("CameraDeviceState");
    }

    @Override // defpackage.lkc
    public final void a() {
        synchronized (this) {
            if (this.i) {
                return;
            }
            this.i = true;
            lis lisVar = this.f;
            String str = this.c.a;
            String strValueOf = String.valueOf(this.g);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(strValueOf).length());
            sb.append("Camera device ");
            sb.append(str);
            sb.append(" closed for ");
            sb.append(strValueOf);
            lisVar.b(sb.toString());
            close();
        }
    }

    @Override // defpackage.lkc
    public final void b() {
        boolean z;
        synchronized (this) {
            z = !this.i;
            this.i = true;
        }
        if (z) {
            lis lisVar = this.f;
            String str = this.c.a;
            String strValueOf = String.valueOf(this.g);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(strValueOf).length());
            sb.append("Camera device ");
            sb.append(str);
            sb.append(" disconnected for ");
            sb.append(strValueOf);
            lisVar.b(sb.toString());
            close();
        }
    }

    @Override // defpackage.lkc
    public final void c(lju ljuVar) {
        boolean z;
        synchronized (this) {
            z = !this.i;
            this.i = true;
        }
        if (z) {
            lis lisVar = this.f;
            String str = this.c.a;
            int i = ljuVar.u;
            String strBo = mip.bo();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(strBo).length());
            sb.append("Camera device ");
            sb.append(str);
            sb.append(" error ");
            sb.append(i);
            sb.append("\n");
            sb.append(strBo);
            lisVar.d(sb.toString());
            close();
        }
    }

    @Override // defpackage.lie, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.i = true;
        }
        this.e.e("cameraDeviceState#close");
        this.g.h();
        this.a.close();
        this.e.f();
    }

    @Override // defpackage.lkc
    public final void d(lzp lzpVar) {
        boolean z;
        synchronized (this) {
            z = this.i;
            if (!z) {
                this.e.e("CameraDevice#onOpened");
                lis lisVar = this.f;
                String strB = lzpVar.b();
                String strValueOf = String.valueOf(this.g);
                StringBuilder sb = new StringBuilder(String.valueOf(strB).length() + 25 + String.valueOf(strValueOf).length());
                sb.append("Camera ");
                sb.append(strB);
                sb.append(" opened. Creating ");
                sb.append(strValueOf);
                lisVar.f(sb.toString());
                obr.ar(this.h == null, "onOpened was invoked more than once!", new Object[0]);
                this.h = lzpVar;
                try {
                    lso lsoVar = this.b;
                    lsp lspVar = this.g;
                    lsoVar.d(lzpVar, lspVar, lspVar.a(), this.d);
                    this.g.g();
                    this.e.f();
                } catch (Throwable th) {
                    this.e.f();
                    throw th;
                }
            }
        }
        if (z) {
            lzpVar.close();
        }
    }

    final synchronized void e(lsp lspVar) {
        lis lisVar = this.f;
        String strValueOf = String.valueOf(this.g);
        String strValueOf2 = String.valueOf(lspVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25 + String.valueOf(strValueOf2).length());
        sb.append("Closing ");
        sb.append(strValueOf);
        sb.append(" and configuring ");
        sb.append(strValueOf2);
        lisVar.f(sb.toString());
        this.g.b();
        this.g = lspVar;
        lzp lzpVar = this.h;
        if (lzpVar == null) {
            this.f.f("CameraDevice is not open yet. Waiting for onOpened.");
        } else {
            this.b.d(lzpVar, lspVar, lspVar.a(), this.d);
            lspVar.g();
        }
    }

    public final synchronized boolean f() {
        return this.a.a();
    }
}
