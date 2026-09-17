package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class lfz {
    private final pih a = pih.f();

    private final void b() {
        try {
            this.a.get(700L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("AuViEncoderStop", "Error getting last video frame timestamp.", e);
        }
    }

    private static boolean c(long j, AtomicLong atomicLong) {
        return atomicLong.get() <= 0 || j - atomicLong.get() <= 3000000;
    }

    public final void a(int i, long j, AtomicLong atomicLong, pht phtVar) {
        String.format("%s Waiting for EOS at: %d, frames at: %d", mip.bB(i), Long.valueOf(SystemClock.uptimeMillis() * 1000), Long.valueOf(atomicLong.get()));
        try {
            String strBB = mip.bB(i);
            atomicLong.get();
            strBB.length();
            if (atomicLong.get() > 0 && !c(j, atomicLong)) {
                throw new TimeoutException(String.format("%s not waiting for last frame to arrive. [stop us: %d, last frame us: %d]", mip.bB(i), Long.valueOf(j), Long.valueOf(atomicLong.get())));
            }
            phtVar.get(700L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("AuViEncoderStop", String.format("%s Failed waiting for eos, stream may have stopped early (last frame: %d)", mip.bB(i), Long.valueOf(atomicLong.get())));
            c(j, atomicLong);
        }
        if (i == 2) {
            this.a.o(Long.valueOf(atomicLong.get()));
        } else {
            b();
        }
        String.format("Last %s frame timestamp: %d", mip.bB(i), Long.valueOf(atomicLong.get()));
    }
}
