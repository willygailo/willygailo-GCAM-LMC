package defpackage;

import android.app.job.JobParameters;
import com.google.android.apps.camera.brella.mediastore.MediaListeningService;

/* JADX INFO: loaded from: classes.dex */
public final class ceg implements phh {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ MediaListeningService b;

    public ceg(MediaListeningService mediaListeningService, JobParameters jobParameters) {
        this.b = mediaListeningService;
        this.a = jobParameters;
    }

    @Override // defpackage.phh
    public final void a(Throwable th) {
        int i = MediaListeningService.c;
        MediaListeningService.a(this.b.getApplicationContext());
        this.b.jobFinished(this.a, false);
    }

    @Override // defpackage.phh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i = MediaListeningService.c;
        MediaListeningService.a(this.b.getApplicationContext());
        this.b.jobFinished(this.a, false);
    }
}
