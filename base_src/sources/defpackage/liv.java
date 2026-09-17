package defpackage;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public final class liv extends Handler {
    public static final liv a = new liv();
    private final lar b = lar.b;

    private liv() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        final Throwable thrown = logRecord.getThrown();
        final String message = logRecord.getMessage();
        if (thrown != null) {
            this.b.execute(new Runnable() { // from class: lit
                @Override // java.lang.Runnable
                public final void run() {
                    String str = message;
                    Throwable th = thrown;
                    if (str == null) {
                        throw new liu(th);
                    }
                    throw new liu(str, th);
                }
            });
        }
    }
}
