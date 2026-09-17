package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class aqv extends aia {
    public aqv(aii aiiVar) {
        super(aiiVar);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.aia
    public final /* bridge */ /* synthetic */ void b(ake akeVar, Object obj) throws Throwable {
        int i;
        int i2;
        Throwable th;
        String str;
        String str2;
        aqt aqtVar = (aqt) obj;
        String str3 = aqtVar.a;
        if (str3 == null) {
            akeVar.f(1);
        } else {
            akeVar.g(1, str3);
        }
        akeVar.e(2, gh.j(aqtVar.p));
        String str4 = aqtVar.b;
        if (str4 == null) {
            akeVar.f(3);
        } else {
            akeVar.g(3, str4);
        }
        String str5 = aqtVar.c;
        if (str5 == null) {
            akeVar.f(4);
        } else {
            akeVar.g(4, str5);
        }
        byte[] bArrC = amq.c(aqtVar.d);
        if (bArrC == null) {
            akeVar.f(5);
        } else {
            akeVar.c(5, bArrC);
        }
        byte[] bArrC2 = amq.c(aqtVar.e);
        if (bArrC2 == null) {
            akeVar.f(6);
        } else {
            akeVar.c(6, bArrC2);
        }
        akeVar.e(7, aqtVar.f);
        akeVar.e(8, aqtVar.g);
        akeVar.e(9, aqtVar.h);
        akeVar.e(10, aqtVar.j);
        int i3 = aqtVar.q;
        int i4 = i3 - 1;
        byte[] byteArray = null;
        objectOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        if (i3 == 0) {
            throw null;
        }
        int i5 = 0;
        switch (i4) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Could not convert ");
                switch (i3) {
                    case 1:
                        str2 = "EXPONENTIAL";
                        break;
                    default:
                        str2 = "LINEAR";
                        break;
                }
                sb.append((Object) str2);
                sb.append(" to int");
                throw new IllegalArgumentException(sb.toString());
        }
        akeVar.e(11, i);
        akeVar.e(12, aqtVar.k);
        akeVar.e(13, aqtVar.l);
        akeVar.e(14, aqtVar.m);
        akeVar.e(15, aqtVar.n);
        akeVar.e(16, aqtVar.o ? 1L : 0L);
        int i6 = aqtVar.r;
        int i7 = i6 - 1;
        if (i6 == 0) {
            throw null;
        }
        switch (i7) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not convert ");
                switch (i6) {
                    case 1:
                        str = "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
                        break;
                    default:
                        str = "DROP_WORK_REQUEST";
                        break;
                }
                sb2.append((Object) str);
                sb2.append(" to int");
                throw new IllegalArgumentException(sb2.toString());
        }
        akeVar.e(17, i2);
        aml amlVar = aqtVar.i;
        if (amlVar == null) {
            akeVar.f(18);
            akeVar.f(19);
            akeVar.f(20);
            akeVar.f(21);
            akeVar.f(22);
            akeVar.f(23);
            akeVar.f(24);
            akeVar.f(25);
            return;
        }
        int i8 = amlVar.i;
        int i9 = i8 - 1;
        if (i8 == 0) {
            throw null;
        }
        switch (i9) {
            case 0:
                break;
            case 1:
                i5 = 1;
                break;
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 3;
                break;
            case 4:
                i5 = 4;
                break;
            default:
                if (i8 != 6) {
                    throw new IllegalArgumentException("Could not convert " + ((Object) ge.c(i8)) + " to int");
                }
                i5 = 5;
                break;
                break;
        }
        akeVar.e(18, i5);
        akeVar.e(19, amlVar.b ? 1L : 0L);
        akeVar.e(20, amlVar.c ? 1L : 0L);
        akeVar.e(21, amlVar.d ? 1L : 0L);
        akeVar.e(22, amlVar.e ? 1L : 0L);
        akeVar.e(23, amlVar.f);
        akeVar.e(24, amlVar.g);
        amn amnVar = amlVar.h;
        if (amnVar.a() != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(amnVar.a());
                        for (amm ammVar : amnVar.a) {
                            objectOutputStream2.writeUTF(ammVar.a.toString());
                            objectOutputStream2.writeBoolean(ammVar.b);
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        objectOutputStream = objectOutputStream2;
                        try {
                            e.printStackTrace();
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e3) {
                                    e3.printStackTrace();
                                }
                            }
                            byteArrayOutputStream.close();
                        } catch (Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                try {
                                    objectOutputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            try {
                                byteArrayOutputStream.close();
                                throw th;
                            } catch (IOException e5) {
                                e5.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        byteArrayOutputStream.close();
                        throw th;
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th4) {
                th = th4;
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (byteArray == null) {
            akeVar.f(25);
        } else {
            akeVar.c(25, byteArray);
        }
    }

    @Override // defpackage.aiy
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
