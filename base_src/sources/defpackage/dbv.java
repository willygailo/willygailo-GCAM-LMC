package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.GoogleCameraEngR18F1.R;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class dbv extends iam {
    public final Context a;
    public final hnx b;
    public final fjs c;
    public final dbx d;
    public final boolean e;
    public final View.OnClickListener f;
    public final View.OnClickListener g;
    public ojc h;
    private final Resources j;
    private final dqx k;

    public dbv(dbx dbxVar, Context context, hnx hnxVar, ojc ojcVar, fjs fjsVar, ScheduledExecutorService scheduledExecutorService, ddf ddfVar) {
        super(scheduledExecutorService);
        this.f = new dbu(this, 1);
        this.g = new dbu(this, 0);
        this.h = oih.a;
        this.d = dbxVar;
        this.a = context;
        this.j = context.getResources();
        this.c = fjsVar;
        obr.aQ(true);
        this.k = (dqx) ((ojj) ojcVar).a;
        this.b = hnxVar;
        this.e = ddfVar.k(dcv.l);
        ddi ddiVar = ddl.a;
        ddfVar.b();
    }

    @Override // defpackage.iam
    protected final ial d() {
        iak iakVarA = ial.a();
        iaw iawVarA = iax.a();
        iawVarA.b = this.j.getString(R.string.selfie_angle_message);
        iawVarA.c = this.j.getDrawable(R.drawable.quantum_ic_aspect_ratio_white_24, null);
        final dbx dbxVar = this.d;
        dbxVar.getClass();
        final int i = 1;
        iawVarA.g = new Runnable() { // from class: dbt
            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        dbxVar.b();
                        break;
                    default:
                        dbxVar.a();
                        break;
                }
            }
        };
        iawVarA.d(6000L);
        iawVarA.h = new Runnable(this) { // from class: dbs
            public final /* synthetic */ dbv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        dbv dbvVar = this.a;
                        if (dbvVar.h.g() && dbvVar.e) {
                            dbw dbwVar = (dbw) dbvVar.h.c();
                            View.OnClickListener onClickListener = dbvVar.g;
                            View.OnClickListener onClickListener2 = dbvVar.f;
                            FrameLayout frameLayout = new FrameLayout(dbwVar.b);
                            View.inflate(dbwVar.b, true != dbwVar.c.k(ddl.ay) ? R.layout.selfie_angle_bottom_sheet_legacy : R.layout.selfie_angle_bottom_sheet, frameLayout);
                            Button button = (Button) frameLayout.findViewById(R.id.selfie_angle_bottom_sheet_setting_button);
                            Button button2 = (Button) frameLayout.findViewById(R.id.selfie_angle_bottom_sheet_turn_off_button);
                            button.setOnClickListener(onClickListener2);
                            button2.setOnClickListener(onClickListener);
                            dbwVar.a.f(4, R.string.selfie_angle_bottom_sheet_title, frameLayout);
                            break;
                        }
                        break;
                    default:
                        dbv dbvVar2 = this.a;
                        dbvVar2.d.c();
                        dbvVar2.c.l();
                        break;
                }
            }
        };
        final int i2 = 0;
        iawVarA.d = new Runnable(this) { // from class: dbs
            public final /* synthetic */ dbv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        dbv dbvVar = this.a;
                        if (dbvVar.h.g() && dbvVar.e) {
                            dbw dbwVar = (dbw) dbvVar.h.c();
                            View.OnClickListener onClickListener = dbvVar.g;
                            View.OnClickListener onClickListener2 = dbvVar.f;
                            FrameLayout frameLayout = new FrameLayout(dbwVar.b);
                            View.inflate(dbwVar.b, true != dbwVar.c.k(ddl.ay) ? R.layout.selfie_angle_bottom_sheet_legacy : R.layout.selfie_angle_bottom_sheet, frameLayout);
                            Button button = (Button) frameLayout.findViewById(R.id.selfie_angle_bottom_sheet_setting_button);
                            Button button2 = (Button) frameLayout.findViewById(R.id.selfie_angle_bottom_sheet_turn_off_button);
                            button.setOnClickListener(onClickListener2);
                            button2.setOnClickListener(onClickListener);
                            dbwVar.a.f(4, R.string.selfie_angle_bottom_sheet_title, frameLayout);
                            break;
                        }
                        break;
                    default:
                        dbv dbvVar2 = this.a;
                        dbvVar2.d.c();
                        dbvVar2.c.l();
                        break;
                }
            }
        };
        final dbx dbxVar2 = this.d;
        dbxVar2.getClass();
        iawVarA.i = new Runnable() { // from class: dbt
            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        dbxVar2.b();
                        break;
                    default:
                        dbxVar2.a();
                        break;
                }
            }
        };
        iakVarA.a = iawVarA.a();
        return iakVarA.a();
    }

    @Override // defpackage.iam
    protected final boolean e(lzv lzvVar) {
        if (this.k.e()) {
            return false;
        }
        this.d.d(ftm.a(this.k.d()).b);
        return this.d.f();
    }

    @Override // defpackage.iam, defpackage.iat
    public final void u() {
        super.u();
        this.d.e();
        if (this.h.g() && this.e) {
            ((dbw) this.h.c()).a();
        }
    }
}
