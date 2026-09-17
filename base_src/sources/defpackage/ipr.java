package defpackage;

import android.R;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class ipr {
    public static final ouj a = ouj.h("com/google/android/apps/camera/timelapse/TimelapseStateMonitor");
    public final BroadcastReceiver b = new ipq(this);
    public final btt c;
    public final Executor d;
    public final lap e;
    public final lar f;
    public final jhh g;
    public final ilu h;
    public final imt i;
    public final iqj j;
    public ie k;
    public final ikm l;
    public ipc m;
    public final ilx n;

    public ipr(btt bttVar, Executor executor, lap lapVar, lar larVar, jhh jhhVar, ilu iluVar, ikm ikmVar, ilx ilxVar, imt imtVar, iqj iqjVar) {
        this.c = bttVar;
        this.d = executor;
        this.f = larVar;
        this.g = jhhVar;
        this.h = iluVar;
        this.l = ikmVar;
        this.n = ilxVar;
        this.i = imtVar;
        this.e = lapVar;
        this.j = iqjVar;
    }

    final void a(ilv ilvVar, final boolean z) {
        if (ilvVar.c()) {
            return;
        }
        this.f.c(new Runnable() { // from class: ipp
            @Override // java.lang.Runnable
            public final void run() {
                final ipr iprVar = this.a;
                if (z) {
                    final int i = 1;
                    iprVar.k = iprVar.l.c(new DialogInterface.OnClickListener() { // from class: ipk
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            switch (i) {
                                case 0:
                                    iprVar.c.g().d();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    iprVar.c.g().d();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                } else {
                    final int i2 = 0;
                    iprVar.k = iprVar.l.d(new DialogInterface.OnClickListener() { // from class: ipk
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i3) {
                            switch (i2) {
                                case 0:
                                    iprVar.c.g().d();
                                    dialogInterface.dismiss();
                                    break;
                                default:
                                    iprVar.c.g().d();
                                    dialogInterface.dismiss();
                                    break;
                            }
                        }
                    });
                }
                iprVar.k.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: ipl
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        iprVar.k = null;
                    }
                });
                if (iprVar.k.isShowing()) {
                    return;
                }
                iprVar.k.show();
                TextView textView = (TextView) iprVar.k.findViewById(R.id.message);
                textView.getClass();
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        });
        this.m.a.c();
    }
}
