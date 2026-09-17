package defpackage;

import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class mgc implements mgk, mgg {
    private final mgb a;
    private final Context b;
    private final odu c;

    public mgc(odu oduVar, mgb mgbVar, Context context, byte[] bArr, byte[] bArr2) {
        this.c = oduVar;
        this.a = mgbVar;
        this.b = context;
    }

    @Override // defpackage.mgg
    public final Intent a() {
        Intent intent = new Intent("android.intent.action.INSERT");
        this.b.grantUriPermission("com.google.android.calendar", CalendarContract.Events.CONTENT_URI, 1);
        intent.setData(CalendarContract.Events.CONTENT_URI);
        if (this.a.b.equals(mga.BARHOPPER) && this.a.d.g()) {
            mih mihVar = (mih) this.a.d.c();
            if (mihVar.f == null || mihVar.g == null) {
                intent.putExtra("allDay", true);
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.clear();
                mig migVar = mihVar.f;
                if (migVar == null) {
                    migVar = mig.h;
                }
                int i = migVar.a;
                mig migVar2 = mihVar.f;
                if (migVar2 == null) {
                    migVar2 = mig.h;
                }
                int i2 = migVar2.b;
                mig migVar3 = mihVar.f;
                if (migVar3 == null) {
                    migVar3 = mig.h;
                }
                int i3 = migVar3.c;
                mig migVar4 = mihVar.f;
                if (migVar4 == null) {
                    migVar4 = mig.h;
                }
                int i4 = migVar4.d;
                mig migVar5 = mihVar.f;
                if (migVar5 == null) {
                    migVar5 = mig.h;
                }
                int i5 = migVar5.e;
                mig migVar6 = mihVar.f;
                if (migVar6 == null) {
                    migVar6 = mig.h;
                }
                calendar.set(i, i2, i3, i4, i5, migVar6.f);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.clear();
                mig migVar7 = mihVar.g;
                if (migVar7 == null) {
                    migVar7 = mig.h;
                }
                int i6 = migVar7.a;
                mig migVar8 = mihVar.g;
                if (migVar8 == null) {
                    migVar8 = mig.h;
                }
                int i7 = migVar8.b;
                mig migVar9 = mihVar.g;
                if (migVar9 == null) {
                    migVar9 = mig.h;
                }
                int i8 = migVar9.c;
                mig migVar10 = mihVar.g;
                if (migVar10 == null) {
                    migVar10 = mig.h;
                }
                int i9 = migVar10.d;
                mig migVar11 = mihVar.g;
                if (migVar11 == null) {
                    migVar11 = mig.h;
                }
                int i10 = migVar11.e;
                mig migVar12 = mihVar.g;
                if (migVar12 == null) {
                    migVar12 = mig.h;
                }
                calendar2.set(i6, i7, i8, i9, i10, migVar12.f);
                if (calendar.get(11) == 0 && calendar.get(12) == 0 && calendar2.get(11) == 23 && calendar2.get(12) == 59) {
                    intent.putExtra("allDay", true);
                }
                intent.putExtra("beginTime", calendar.getTimeInMillis()).putExtra("endTime", calendar2.getTimeInMillis());
            }
            if (!mihVar.a.isEmpty()) {
                intent.putExtra("title", mihVar.a);
            }
            if (!mihVar.b.isEmpty()) {
                intent.putExtra("description", mihVar.b);
            }
            if (!mihVar.c.isEmpty()) {
                intent.putExtra("eventLocation", mihVar.c);
            }
            if (!mihVar.e.isEmpty()) {
                intent.putExtra("availability", mihVar.e);
            }
        } else {
            nmk.a.c(this, "Unable to convert date object", new Object[0]);
        }
        return intent;
    }

    @Override // defpackage.mgk
    public final void b() {
        this.c.b(a());
    }
}
