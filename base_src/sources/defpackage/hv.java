package defpackage;

import android.os.Message;
import android.view.View;
import android.widget.Button;

/* JADX INFO: loaded from: classes2.dex */
final class hv implements View.OnClickListener {
    final /* synthetic */ ic a;

    public hv(ic icVar) {
        this.a = icVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        ic icVar = this.a;
        Message messageObtain = null;
        if (view == icVar.j && (message2 = icVar.l) != null) {
            messageObtain = Message.obtain(message2);
        } else if (view != icVar.m || (message = icVar.o) == null) {
            Button button = icVar.p;
        } else {
            messageObtain = Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        ic icVar2 = this.a;
        icVar2.H.obtainMessage(1, icVar2.b).sendToTarget();
    }
}
