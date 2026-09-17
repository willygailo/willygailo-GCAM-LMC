package defpackage;

import android.media.AudioAttributes;
import android.media.SoundPool;

/* JADX INFO: loaded from: classes2.dex */
public final class hrf implements pys {
    private final /* synthetic */ int a;

    public hrf(int i) {
        this.a = i;
    }

    public static hqb a() {
        return new hqb();
    }

    @Override // defpackage.qkg
    public final /* synthetic */ Object get() {
        switch (this.a) {
            case 0:
                return new hrd();
            case 1:
                return a();
            case 2:
                return new lce(false);
            case 3:
                return new lce(false);
            case 4:
                return new lce(false);
            case 5:
                return new lce("");
            case 6:
                return new lce(false);
            case 7:
                return new huq();
            case 8:
                iqn iqnVar = iqn.MANUAL_FPS_30_1X;
                qmd.ae(iqnVar);
                return iqnVar;
            case 9:
                return new hsv(new lce(Integer.valueOf(hti.e.g)));
            case 10:
                return new ghf(new lce(1));
            case 11:
                return new hey();
            case 12:
                return oih.a;
            case 13:
                return new hwp();
            case 14:
                return pih.f();
            case 15:
                return pih.f();
            case 16:
                return new hxj();
            case 17:
                return new mip();
            case 18:
                SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).setFlags(1).build()).setMaxStreams(3).build();
                qmd.ae(soundPoolBuild);
                return soundPoolBuild;
            case 19:
                return new ihn();
            default:
                return new mip();
        }
    }
}
