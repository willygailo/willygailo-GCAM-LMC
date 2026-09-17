package defpackage;

import android.animation.Animator;
import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ifb implements Consumer {
    public final /* synthetic */ ooh a;

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        this.a.g((Animator) obj);
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
