package defpackage;

import android.hardware.HardwareBuffer;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.hardware.SensorManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class lww implements lxb {
    public final lis a;
    private final SensorManager c;
    private final Set d = new HashSet();
    public lwv b = null;

    public lww(SensorManager sensorManager, lis lisVar) {
        this.c = sensorManager;
        this.a = lisVar.a("DirectGyro");
    }

    private final synchronized void c() {
        this.a.b("Shutting down gyro direct channel");
        lwv lwvVar = this.b;
        if (lwvVar == null) {
            this.a.h("Failed to stop direct gyro provider: Already stopped");
            return;
        }
        if (lwvVar.b.configure(lwvVar.c, 0) == 0) {
            this.a.d("Failed to stop direct gyro provider: Unable to configure gyro direct channel.");
        } else {
            this.a.b("Stopped gyro direct channel successfully.");
        }
        lwvVar.b.close();
        lwvVar.a.a();
        this.b = null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c2 A[Catch: all -> 0x00d0, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000c, B:9:0x001f, B:11:0x0025, B:14:0x002e, B:20:0x0048, B:28:0x0066, B:29:0x0070, B:36:0x0083, B:43:0x00a6, B:49:0x00b6, B:51:0x00c2, B:52:0x00c5, B:54:0x00c7), top: B:62:0x0001, inners: #4 }] */
    private final synchronized void d() {
        this.a.b("Starting up gyro direct channel");
        if (this.b != null) {
            this.a.h("Failed to start direct gyro provider: Already running.");
            return;
        }
        try {
            HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(624000, 1, 33, 1, 25165827L);
            if (hardwareBufferCreate == null) {
                this.a.d("Failed to start direct gyro provider: Hardware Buffer returned null.");
                return;
            }
            lxh lxhVar = new lxh(hardwareBufferCreate);
            SensorDirectChannel sensorDirectChannelCreateDirectChannel = null;
            try {
                try {
                    lwx lwxVar = new lwx(lxhVar);
                    try {
                        sensorDirectChannelCreateDirectChannel = this.c.createDirectChannel(hardwareBufferCreate);
                        if (sensorDirectChannelCreateDirectChannel == null) {
                            try {
                                this.a.d("Failed to start direct gyro provider: Creating direct channel returned null");
                                this.a.b("Closing hardware buffer");
                                lxhVar.a();
                                return;
                            } catch (Throwable th) {
                                th = th;
                                this.a.e("Failed to start direct gyro provider: Creating direct channel threw an exception.", th);
                                this.a.b("Closing hardware buffer");
                                lxhVar.a();
                                if (sensorDirectChannelCreateDirectChannel != null) {
                                    sensorDirectChannelCreateDirectChannel.close();
                                }
                            }
                        }
                        Sensor defaultSensor = this.c.getDefaultSensor(4);
                        if (defaultSensor == null) {
                            this.a.d("Failed to start direct gyro provider: Getting default sensor returned null.");
                            this.a.b("Closing hardware buffer");
                            lxhVar.a();
                        } else if (sensorDirectChannelCreateDirectChannel.configure(defaultSensor, 2) != 0) {
                            this.a.b("Started gyro direct channel successfully");
                            this.b = new lwv(lxhVar, sensorDirectChannelCreateDirectChannel, defaultSensor, lwxVar);
                            return;
                        } else {
                            this.a.d("Failed to start direct gyro provider: Unable to configure gyro direct channel.");
                            this.a.b("Closing hardware buffer");
                            lxhVar.a();
                        }
                        sensorDirectChannelCreateDirectChannel.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    this.a.b("Closing hardware buffer");
                    lxhVar.a();
                    if (0 != 0) {
                        sensorDirectChannelCreateDirectChannel.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                this.a.b("Closing hardware buffer");
                lxhVar.a();
                if (0 != 0) {
                    sensorDirectChannelCreateDirectChannel.close();
                }
                throw th;
            }
        } catch (IllegalArgumentException e) {
            this.a.e("Failed to start direct gyro provider: Creating the hardware buffer threw an IllegalArgumentException exception.", e);
        }
    }

    @Override // defpackage.lxb
    public final synchronized lxa a(String str) {
        if (this.d.isEmpty()) {
            d();
        } else {
            for (lxa lxaVar : this.d) {
                if (str.equals(lxaVar.a())) {
                    lis lisVar = this.a;
                    String strA = lxaVar.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 63);
                    sb.append("Fast gyro provider session existed for: ");
                    sb.append(strA);
                    sb.append(". No new session added.");
                    lisVar.b(sb.toString());
                    return lxaVar;
                }
            }
        }
        if (this.b == null) {
            this.a.d("Failed to open new direct gyro session: Hardware was null.");
            return null;
        }
        lwu lwuVar = new lwu(this, str);
        this.d.add(lwuVar);
        lis lisVar2 = this.a;
        String strValueOf = String.valueOf(lwuVar.a);
        lisVar2.b(strValueOf.length() != 0 ? "Fast gyro provider session added for: ".concat(strValueOf) : new String("Fast gyro provider session added for: "));
        return lwuVar;
    }

    public final synchronized void b(lxa lxaVar) {
        if (this.d.remove(lxaVar)) {
            lis lisVar = this.a;
            String str = ((lwu) lxaVar).a;
            int size = this.d.size();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82);
            sb.append("Fast gyro provider session closed for: ");
            sb.append(str);
            sb.append(" Remaining number of sessions = ");
            sb.append(size);
            lisVar.b(sb.toString());
        }
        if (this.d.isEmpty()) {
            c();
        }
    }

    protected final synchronized void finalize() {
        lwv lwvVar = this.b;
        if (lwvVar != null) {
            if (lwvVar.b.configure(lwvVar.c, 0) == 0) {
                this.a.d("Failed to stop direct gyro provider in finalizer: Unable to configure gyro direct channel.");
            }
            lwvVar.b.close();
            lwvVar.a.a();
            this.a.h("Gyro direct channel reference potentially leaked and was closed in finalizer.");
            this.b = null;
        }
    }
}
