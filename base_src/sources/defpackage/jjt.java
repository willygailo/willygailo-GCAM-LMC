package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class jjt implements jli {
    final /* synthetic */ jjv a;

    public jjt(jjv jjvVar) {
        this.a = jjvVar;
    }

    @Override // defpackage.jli
    public final void onShutterButtonClick() {
        synchronized (this.a.b) {
            for (jli jliVar : this.a.c) {
                if (this.a.f.h) {
                    jliVar.onShutterButtonLongPressUnlock();
                } else {
                    jliVar.onShutterButtonClick();
                }
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterButtonDown() {
        synchronized (this.a.b) {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterButtonDown();
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterButtonLongPressRelease() {
        synchronized (this.a.b) {
            this.a.a.setVisualFeedbackForEnableState(true);
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterButtonLongPressRelease();
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterButtonLongPressUnlock() {
        synchronized (this.a.b) {
            this.a.a.setVisualFeedbackForEnableState(true);
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterButtonLongPressUnlock();
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterButtonLongPressed() {
        synchronized (this.a.b) {
            this.a.a.setVisualFeedbackForEnableState(false);
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterButtonLongPressed();
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterButtonPressedStateChanged(boolean z) {
        synchronized (this.a.b) {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterButtonPressedStateChanged(z);
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterTouch(jrw jrwVar) {
        synchronized (this.a.b) {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterTouch(jrwVar);
            }
        }
    }

    @Override // defpackage.jli
    public final void onShutterTouchStart() {
        synchronized (this.a.b) {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((jli) it.next()).onShutterTouchStart();
            }
        }
    }
}
