package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class ihg implements DialogInterface.OnDismissListener, View.OnScrollChangeListener, iur {
    public static final /* synthetic */ int e = 0;
    public final ius a;
    public final Context b;
    public ihj c;
    public ihj d;
    private final hug f;
    private final Executor g;
    private final ScheduledExecutorService h;
    private boolean i = false;
    private lic j = lic.CLOCKWISE_0;
    private final jts k;

    public ihg(ius iusVar, Context context, jts jtsVar, Executor executor, ScheduledExecutorService scheduledExecutorService, hug hugVar) {
        this.a = iusVar;
        this.b = context;
        this.k = jtsVar;
        this.g = executor;
        this.h = scheduledExecutorService;
        this.f = hugVar;
    }

    public final void a() {
        lar.a();
        this.f.e(htu.u, true);
        ius iusVar = this.a;
        iusVar.f = this;
        iusVar.e = this;
        View viewInflate = View.inflate(this.b, R.layout.speech_btmsheet_content, null);
        ihj ihjVar = new ihj((iwh) viewInflate.findViewById(R.id.speech_btmsheet_normal_container), Uri.parse("https://www.gstatic.com/aiux/gca/cocktailparty/test_sample10_off.mp4"), this.b, this.k, this, this.g, this.h);
        this.c = ihjVar;
        ihjVar.e();
        ihj ihjVar2 = new ihj((iwh) viewInflate.findViewById(R.id.speech_btmsheet_enhanced_container), Uri.parse("https://www.gstatic.com/aiux/gca/cocktailparty/test_sample10_on.mp4"), this.b, this.k, this, this.g, this.h);
        this.d = ihjVar2;
        ihjVar2.e();
        iusVar.g(10, R.string.speech_btmsheet_title, viewInflate, this, this.b);
    }

    @Override // defpackage.iur
    public final void b(lic licVar) {
        this.i = false;
        this.j = licVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ihj ihjVar = this.c;
        if (ihjVar != null) {
            ihjVar.onDismiss(dialogInterface);
        }
        ihj ihjVar2 = this.d;
        if (ihjVar2 != null) {
            ihjVar2.onDismiss(dialogInterface);
        }
        ius iusVar = this.a;
        iusVar.f = null;
        iusVar.e = null;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(final View view, int i, int i2, int i3, int i4) {
        if ((this.j.equals(lic.CLOCKWISE_90) || this.j.equals(lic.CLOCKWISE_270)) && !this.i) {
            view.postDelayed(new Runnable() { // from class: ihf
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = view;
                    int i5 = ihg.e;
                    view2.scrollTo(0, 0);
                }
            }, 250L);
            this.i = true;
        }
    }
}
