package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class jlf implements jli {
    final /* synthetic */ jlh a;

    public jlf(jlh jlhVar) {
        this.a = jlhVar;
    }

    @Override // defpackage.jli
    public final void onShutterButtonClick() {
        synchronized (this.a.b) {
            for (jli jliVar : this.a.c) {
                jrh jrhVar = this.a.f;
                if (jrhVar == null || !jrhVar.h) {
                    jliVar.onShutterButtonClick();
                } else {
                    jliVar.onShutterButtonLongPressUnlock();
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
