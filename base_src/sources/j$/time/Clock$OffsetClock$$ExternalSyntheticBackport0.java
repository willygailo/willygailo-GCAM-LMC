package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class Clock$OffsetClock$$ExternalSyntheticBackport0 {
    public static /* synthetic */ long m(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
