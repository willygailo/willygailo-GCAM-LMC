package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class kjo extends ksg {
    public kjo() {
        super(Looper.getMainLooper());
    }

    public kjo(Looper looper) {
        super(looper);
    }

    public final void a(kiw kiwVar, kiv kivVar) {
        ThreadLocal threadLocal = BasePendingResult.c;
        sendMessage(obtainMessage(1, new Pair(kiwVar, kivVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                Pair pair = (Pair) message.obj;
                kiw kiwVar = (kiw) pair.first;
                kiv kivVar = (kiv) pair.second;
                try {
                    kiwVar.a(kivVar);
                    return;
                } catch (RuntimeException e) {
                    BasePendingResult.i(kivVar);
                    throw e;
                }
            case 2:
                ((BasePendingResult) message.obj).h(Status.d);
                return;
            default:
                int i = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
                return;
        }
    }
}
