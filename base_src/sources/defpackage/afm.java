package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
final class afm extends Handler {
    final /* synthetic */ afp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afm(afp afpVar, Looper looper) {
        super(looper);
        this.a = afpVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        afn[] afnVarArr;
        switch (message.what) {
            case 1:
                afp afpVar = this.a;
                while (true) {
                    synchronized (afpVar.b) {
                        size = afpVar.c.size();
                        if (size <= 0) {
                            return;
                        }
                        afnVarArr = new afn[size];
                        afpVar.c.toArray(afnVarArr);
                        afpVar.c.clear();
                    }
                    for (int i = 0; i < size; i++) {
                        afn afnVar = afnVarArr[i];
                        int size2 = afnVar.b.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            afo afoVar = (afo) afnVar.b.get(i2);
                            if (!afoVar.d) {
                                afoVar.b.onReceive(afpVar.a, afnVar.a);
                            }
                        }
                    }
                }
                break;
            default:
                super.handleMessage(message);
                return;
        }
    }
}
