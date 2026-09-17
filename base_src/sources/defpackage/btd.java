package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.service.voice.VoiceInteractionService;

/* JADX INFO: loaded from: classes.dex */
public final class btd implements btg {
    private static final ComponentName a = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.voiceinteraction.GsaVoiceInteractionService");
    private final Context b;
    private final lda c;

    public btd(Context context, lda ldaVar) {
        this.b = context;
        this.c = ldaVar;
    }

    @Override // defpackage.btg
    public final void a() {
        System.currentTimeMillis();
        Intent intent = new Intent();
        intent.addFlags(268468224);
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivityFromDeeplink"));
        boolean z = false;
        if (this.b.getPackageManager().resolveActivity(intent, 0) != null && VoiceInteractionService.isActiveService(this.b, a)) {
            z = true;
        }
        System.currentTimeMillis();
        this.c.fB(Boolean.valueOf(z));
    }
}
