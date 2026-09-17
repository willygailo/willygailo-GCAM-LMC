package defpackage;

import android.media.SoundPool;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class ifu implements SoundPool.OnLoadCompleteListener {
    final /* synthetic */ ifx a;

    public ifu(ifx ifxVar) {
        this.a = ifxVar;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        synchronized (this.a.b) {
            ifx ifxVar = this.a;
            if (ifxVar.d) {
                return;
            }
            synchronized (ifxVar.b) {
                for (int i3 = 0; i3 < ifxVar.c.size(); i3++) {
                    ifw ifwVar = (ifw) ifxVar.c.valueAt(i3);
                    if (ifwVar.b == i) {
                        int i4 = ifwVar.a;
                        int i5 = ifwVar.b;
                        ifwVar.c.o(Boolean.valueOf(i2 == 0));
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder(45);
                sb.append("SoundInfo for sampleId ");
                sb.append(i);
                sb.append(" not found.");
                throw new NoSuchElementException(sb.toString());
            }
        }
    }
}
