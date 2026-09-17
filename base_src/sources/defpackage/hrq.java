package defpackage;

import j$.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hrq implements Runnable {
    public final /* synthetic */ hrx a;
    public final /* synthetic */ hsp b;
    private final /* synthetic */ int c;

    public /* synthetic */ hrq(hrx hrxVar, hsp hspVar, int i) {
        this.c = i;
        this.a = hrxVar;
        this.b = hspVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.c) {
            case 0:
                hrx hrxVar = this.a;
                final hsp hspVar = this.b;
                final int i = 0;
                hrxVar.b(new Consumer() { // from class: hrm
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i) {
                            case 0:
                                ((hsb) obj).j(hspVar);
                                break;
                            case 1:
                                ((hsb) obj).q(hspVar);
                                break;
                            case 2:
                                ((hsb) obj).l(hspVar);
                                break;
                            default:
                                ((hsb) obj).w(hspVar);
                                break;
                        }
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                }, hspVar);
                break;
            case 1:
                hrx hrxVar2 = this.a;
                final hsp hspVar2 = this.b;
                final int i2 = 1;
                hrxVar2.d(new Consumer() { // from class: hrm
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i2) {
                            case 0:
                                ((hsb) obj).j(hspVar2);
                                break;
                            case 1:
                                ((hsb) obj).q(hspVar2);
                                break;
                            case 2:
                                ((hsb) obj).l(hspVar2);
                                break;
                            default:
                                ((hsb) obj).w(hspVar2);
                                break;
                        }
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        switch (i2) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                });
                break;
            case 2:
                hrx hrxVar3 = this.a;
                final hsp hspVar3 = this.b;
                final int i3 = 2;
                hrxVar3.b(new Consumer() { // from class: hrm
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i3) {
                            case 0:
                                ((hsb) obj).j(hspVar3);
                                break;
                            case 1:
                                ((hsb) obj).q(hspVar3);
                                break;
                            case 2:
                                ((hsb) obj).l(hspVar3);
                                break;
                            default:
                                ((hsb) obj).w(hspVar3);
                                break;
                        }
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        switch (i3) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                }, hspVar3);
                break;
            default:
                hrx hrxVar4 = this.a;
                final hsp hspVar4 = this.b;
                final int i4 = 3;
                hrxVar4.b(new Consumer() { // from class: hrm
                    @Override // j$.util.function.Consumer
                    public final void accept(Object obj) {
                        switch (i4) {
                            case 0:
                                ((hsb) obj).j(hspVar4);
                                break;
                            case 1:
                                ((hsb) obj).q(hspVar4);
                                break;
                            case 2:
                                ((hsb) obj).l(hspVar4);
                                break;
                            default:
                                ((hsb) obj).w(hspVar4);
                                break;
                        }
                    }

                    @Override // j$.util.function.Consumer
                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        switch (i4) {
                            case 0:
                                break;
                            case 1:
                                break;
                            case 2:
                                break;
                        }
                        return Consumer.CC.$default$andThen(this, consumer);
                    }
                }, hspVar4);
                break;
        }
    }
}
