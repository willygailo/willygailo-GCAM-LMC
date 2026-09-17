package defpackage;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class hqb implements hsn {
    public final LinkedList a = new LinkedList();

    @Override // defpackage.hsn
    public final void a() {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).a();
            }
        }
    }

    @Override // defpackage.hsn
    public final void b() {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).b();
            }
        }
    }

    @Override // defpackage.hsn
    public final void c(fjz fjzVar) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).c(fjzVar);
            }
        }
    }

    @Override // defpackage.hsn
    public final void d(Bitmap bitmap) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).d(bitmap);
            }
        }
    }

    @Override // defpackage.hsn
    public final void e(ojc ojcVar) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).e(ojcVar);
            }
        }
    }

    @Override // defpackage.hsn
    public final void f(int i, int i2, Throwable th) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).f(i, i2, th);
            }
        }
    }

    @Override // defpackage.hsn
    public final void g(int i, int i2, Throwable th) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).g(i, i2, th);
            }
        }
    }

    @Override // defpackage.hsn
    public final void h(int i, int i2) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).h(i, i2);
            }
        }
    }

    @Override // defpackage.hsn
    public final void i(int i, int i2) {
        synchronized (this.a) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((hsn) it.next()).i(i, i2);
            }
        }
    }
}
