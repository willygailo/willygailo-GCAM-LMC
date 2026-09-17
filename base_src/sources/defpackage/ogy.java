package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class ogy implements ohe {
    public Optional a = Optional.empty();
    private final Optional b;
    private final int c;

    public ogy(int i, Optional optional) {
        this.c = i;
        this.b = optional;
    }

    @Override // defpackage.ohe
    public final void a(final byte[] bArr) {
        final int i = 1;
        if (this.c == 1) {
            this.b.ifPresent(new Consumer() { // from class: ogx
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i) {
                        case 0:
                            byte[] bArr2 = bArr;
                            try {
                                ((OutputStream) obj).write(bArr2);
                            } catch (IOException e) {
                                ((oug) ((oug) ((oug) ohb.a.b()).h(e)).G(3685)).p("Failed to write %d bytes of processed audio to the output stream.", bArr2.length);
                                return;
                            }
                            break;
                        default:
                            ((mip) obj).q(bArr);
                            break;
                    }
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    switch (i) {
                        case 0:
                            break;
                    }
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        } else {
            final int i2 = 0;
            this.a.ifPresent(new Consumer() { // from class: ogx
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i2) {
                        case 0:
                            byte[] bArr2 = bArr;
                            try {
                                ((OutputStream) obj).write(bArr2);
                            } catch (IOException e) {
                                ((oug) ((oug) ((oug) ohb.a.b()).h(e)).G(3685)).p("Failed to write %d bytes of processed audio to the output stream.", bArr2.length);
                                return;
                            }
                            break;
                        default:
                            ((mip) obj).q(bArr);
                            break;
                    }
                }

                @Override // j$.util.function.Consumer
                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    switch (i2) {
                        case 0:
                            break;
                    }
                    return Consumer.CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.ohe
    public final void b(final int i) {
        this.b.ifPresent(new Consumer() { // from class: ogw
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                ((mip) obj).s(i);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ohe
    public final void c() {
        if (this.c == 1) {
            this.b.ifPresent(new gui(11));
        }
    }

    @Override // defpackage.ohe
    public final void d() {
        if (this.c == 1) {
            this.b.ifPresent(new gui(12));
        }
    }
}
