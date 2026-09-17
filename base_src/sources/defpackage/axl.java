package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
class axl extends Handler {
    final LinkedList r;

    public axl(Looper looper) {
        super(looper);
        LinkedList linkedList = new LinkedList();
        this.r = linkedList;
        linkedList.offerLast(-1);
    }

    final String c(int i) {
        String str = new String("HIST") + "_ID" + i;
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            str = str + '_' + ((Integer) it.next()).toString();
        }
        return str + "_HEND";
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        this.r.offerLast(Integer.valueOf(message.what));
        while (this.r.size() > 400) {
            this.r.pollFirst();
        }
    }
}
