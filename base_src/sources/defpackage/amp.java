package defpackage;

import androidx.work.CoroutineWorker;
import com.google.android.apps.camera.bottombar.R;

/* JADX INFO: loaded from: classes.dex */
@qlw(b = "androidx.work.CoroutineWorker$startWork$1", c = "CoroutineWorker.kt", d = "invokeSuspend", e = {R.styleable.AppCompatTheme_editTextBackground})
public final class amp extends qmb implements qmy {
    int a;
    final /* synthetic */ CoroutineWorker b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amp(CoroutineWorker coroutineWorker, qlh qlhVar) {
        super(2, qlhVar);
        this.b = coroutineWorker;
    }

    @Override // defpackage.qls
    public final qlh create(Object obj, qlh qlhVar) {
        return new amp(this.b, qlhVar);
    }

    @Override // defpackage.qmy
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((amp) create((qqj) obj, (qlh) obj2)).invokeSuspend(qks.a);
    }

    @Override // defpackage.qls
    public final Object invokeSuspend(Object obj) {
        qlp qlpVar = qlp.COROUTINE_SUSPENDED;
        try {
            switch (this.a) {
                case 0:
                    qmd.M(obj);
                    CoroutineWorker coroutineWorker = this.b;
                    this.a = 1;
                    obj = coroutineWorker.b(this);
                    if (obj == qlpVar) {
                        return qlpVar;
                    }
                    break;
                default:
                    qmd.M(obj);
                    break;
            }
            this.b.b.e((ge) obj);
        } catch (Throwable th) {
            this.b.b.f(th);
        }
        return qks.a;
    }
}
