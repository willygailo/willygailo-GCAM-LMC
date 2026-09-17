package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class ihj implements DialogInterface.OnDismissListener, iwg {
    public final Context a;
    public final iwh b;
    public final Uri c;
    public final ihg d;
    public final ScheduledExecutorService e;
    public ScheduledFuture f;
    public final jts g;
    private final Executor h;

    public ihj(iwh iwhVar, Uri uri, Context context, jts jtsVar, ihg ihgVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.g = jtsVar;
        this.b = iwhVar;
        this.c = uri;
        this.d = ihgVar;
        this.h = executor;
        this.e = scheduledExecutorService;
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            return;
        }
        this.f.cancel(false);
    }

    public final void b() {
        mip.ca(this.g.a(this.c), new ihh(this, 1), this.h);
    }

    @Override // defpackage.iwg
    public final void c() {
        if (this.b.k()) {
            this.b.b();
            this.b.g();
        }
    }

    public final void d(String str) {
        this.b.e(str);
    }

    public final void e() {
        this.b.c(this);
        mip.ca(this.g.a(this.c), new ihh(this, 0), this.h);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.b.g();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.b.j();
        a();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.b.l();
        this.b.g();
    }
}
