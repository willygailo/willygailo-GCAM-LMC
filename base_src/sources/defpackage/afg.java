package defpackage;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class afg extends afh {
    public volatile aff a;
    private Executor i;
    private volatile aff j;

    public afg(Context context) {
        super(context);
    }

    public abstract Object a();

    final void b() {
        if (this.j != null || this.a == null) {
            return;
        }
        boolean z = this.a.a;
        if (this.i == null) {
            this.i = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        aff affVar = this.a;
        Executor executor = this.i;
        if (affVar.f == 1) {
            affVar.f = 2;
            executor.execute(affVar.c);
            return;
        }
        int i = affVar.f;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            case 2:
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            default:
                throw new IllegalStateException("We should never reach this state");
        }
    }

    @Override // defpackage.afh
    protected final void c() {
        f();
        this.a = new aff(this);
        b();
    }

    final void d(aff affVar) {
        if (this.j == affVar) {
            SystemClock.uptimeMillis();
            this.j = null;
            b();
        }
    }

    @Override // defpackage.afh
    @Deprecated
    public final void e(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.b);
        printWriter.print(" mListener=");
        printWriter.println(this.h);
        if (this.d || this.g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.d);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.g);
            printWriter.print(" mProcessingChange=");
            printWriter.println(false);
        }
        if (this.e || this.f) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.e);
            printWriter.print(" mReset=");
            printWriter.println(this.f);
        }
        if (this.a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            boolean z = this.a.a;
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            boolean z2 = this.j.a;
            printWriter.println(false);
        }
    }

    @Override // defpackage.afh
    public final void f() {
        if (this.a != null) {
            if (!this.d) {
                this.g = true;
            }
            if (this.j != null) {
                boolean z = this.a.a;
                this.a = null;
                return;
            }
            boolean z2 = this.a.a;
            aff affVar = this.a;
            affVar.d.set(true);
            if (affVar.c.cancel(false)) {
                this.j = this.a;
            }
            this.a = null;
        }
    }
}
