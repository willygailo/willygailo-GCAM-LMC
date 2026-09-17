package defpackage;

/* JADX INFO: loaded from: classes2.dex */
enum inr {
    STATE_UNINITIALIZED(0),
    STATE_PREPARING_ON_START(1),
    STATE_PREPARING_ON_RESUME(17),
    STATE_PREPARING_ON_PREVIEW_STARTED(257),
    STATE_IDLE(273),
    STATE_PRE_RECORDING(4096),
    STATE_RECORDING_PAUSE(65536),
    STATE_RECORDING(1048576),
    STATE_PROCESSING(16777216),
    STATE_RECORDING_ERROR(268435456);

    public final int k;

    inr(int i) {
        this.k = i;
    }

    static boolean a(inr inrVar) {
        return inrVar.equals(STATE_RECORDING_PAUSE) || inrVar.equals(STATE_RECORDING) || inrVar.equals(STATE_RECORDING_ERROR);
    }
}
