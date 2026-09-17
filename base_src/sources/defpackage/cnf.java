package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.SystemClock;
import com.google.lens.sdk.LensApi;

/* JADX INFO: loaded from: classes.dex */
final class cnf extends BroadcastReceiver {
    final /* synthetic */ cng a;

    public cnf(cng cngVar) {
        this.a = cngVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (this.a.e) {
            String action = intent.getAction();
            if (!this.a.j && action != null) {
                if (action.equals("android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                    switch (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)) {
                        case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                            ((oug) ((oug) cng.a.c()).G(537)).o("receive SCO_AUDIO_STATE_ERROR");
                            AudioManager audioManager = this.a.c;
                            audioManager.getClass();
                            audioManager.stopBluetoothSco();
                            break;
                        case 0:
                            cng cngVar = this.a;
                            cngVar.l = 3;
                            int i = cngVar.m;
                            if (i == 0) {
                                throw null;
                            }
                            if (i == 5) {
                                ((oug) ((oug) cng.a.c()).G(540)).o("Retry to connect");
                                cng cngVar2 = this.a;
                                lda ldaVar = cngVar2.g;
                                ldaVar.getClass();
                                cngVar2.a((String) ldaVar.fA());
                                return;
                            }
                            if (i == 1) {
                                ((oug) ((oug) cng.a.c()).G(539)).o("Disconnected from system, stop bluetooth sco");
                                AudioManager audioManager2 = this.a.c;
                                audioManager2.getClass();
                                audioManager2.stopBluetoothSco();
                            }
                            lda ldaVar2 = this.a.h;
                            ldaVar2.getClass();
                            ldaVar2.fB(false);
                            this.a.m = 1;
                            break;
                            break;
                        case 1:
                            SystemClock.uptimeMillis();
                            cng cngVar3 = this.a;
                            cngVar3.l = 5;
                            int i2 = cngVar3.m;
                            if (i2 == 0) {
                                throw null;
                            }
                            if (i2 == 3) {
                                ((oug) ((oug) cng.a.c()).G(542)).o("Retry to disconnect");
                                this.a.b();
                                return;
                            } else {
                                lda ldaVar3 = cngVar3.h;
                                ldaVar3.getClass();
                                ldaVar3.fB(true);
                                this.a.m = 1;
                            }
                            break;
                            break;
                        case 2:
                            this.a.l = 4;
                            break;
                    }
                }
            }
        }
    }
}
