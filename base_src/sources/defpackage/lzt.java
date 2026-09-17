package defpackage;

import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class lzt implements lzp {
    protected final lzp c;

    public lzt(lzp lzpVar) {
        this.c = lzpVar;
    }

    @Override // defpackage.lzp
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.lzp
    public final String b() {
        return this.c.b();
    }

    @Override // defpackage.lzp
    public final void c(lzz lzzVar) {
        this.c.c(lzzVar);
    }

    @Override // defpackage.lzp, defpackage.lie, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    @Override // defpackage.lzp
    public final void d(List list, lzn lznVar, Handler handler) {
        this.c.d(list, lznVar, handler);
    }

    @Override // defpackage.lzp
    public final void e(List list, lzn lznVar, Handler handler) {
        this.c.e(list, lznVar, handler);
    }

    @Override // defpackage.lzp
    public final void f(List list, lzn lznVar, Handler handler) {
        this.c.f(list, lznVar, handler);
    }

    @Override // defpackage.lzp
    public final void g(int i) {
        this.c.g(i);
    }

    @Override // defpackage.lzp
    public final luz h(int i) {
        return this.c.h(i);
    }
}
