package defpackage;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes.dex */
final class a implements PrivilegedAction {
    final /* synthetic */ String a = "android.icumessageformat.text.MessagePattern.ApostropheMode";

    @Override // java.security.PrivilegedAction
    public final /* bridge */ /* synthetic */ Object run() {
        return System.getProperty(this.a);
    }
}
