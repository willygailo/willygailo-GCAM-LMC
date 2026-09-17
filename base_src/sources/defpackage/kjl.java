package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: loaded from: classes2.dex */
final class kjl implements Runnable {
    final /* synthetic */ kjm a;
    private final kjk b;

    public kjl(kjm kjmVar, kjk kjkVar) {
        this.a = kjmVar;
        this.b = kjkVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a) {
            khi khiVar = this.b.b;
            if (khiVar.b()) {
                kjm kjmVar = this.a;
                kkn kknVar = kjmVar.f;
                Activity activityL = kjmVar.l();
                PendingIntent pendingIntent = khiVar.d;
                mip.dk(pendingIntent);
                kknVar.startActivityForResult(GoogleApiActivity.a(activityL, pendingIntent, this.b.a, false), 1);
                return;
            }
            kjm kjmVar2 = this.a;
            if (kjmVar2.d.g(kjmVar2.l(), khiVar.c, null) != null) {
                kjm kjmVar3 = this.a;
                khm khmVar = kjmVar3.d;
                Activity activityL2 = kjmVar3.l();
                kjm kjmVar4 = this.a;
                kkn kknVar2 = kjmVar4.f;
                int i = khiVar.c;
                Dialog dialogA = khmVar.a(activityL2, i, new kmk(khmVar.g(activityL2, i, "d"), kknVar2), kjmVar4);
                if (dialogA == null) {
                    return;
                }
                khmVar.b(activityL2, dialogA, "GooglePlayServicesErrorDialog", kjmVar4);
                return;
            }
            if (khiVar.c != 18) {
                this.a.a(khiVar, this.b.a);
                return;
            }
            kjm kjmVar5 = this.a;
            khm khmVar2 = kjmVar5.d;
            Activity activityL3 = kjmVar5.l();
            kjm kjmVar6 = this.a;
            ProgressBar progressBar = new ProgressBar(activityL3, null, R.attr.progressBarStyleLarge);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            AlertDialog.Builder builder = new AlertDialog.Builder(activityL3);
            builder.setView(progressBar);
            builder.setMessage(kmg.b(activityL3, 18));
            builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
            AlertDialog alertDialogCreate = builder.create();
            khmVar2.b(activityL3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", kjmVar6);
            Context applicationContext = this.a.l().getApplicationContext();
            kki kkiVar = new kki(this, alertDialogCreate);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentFilter.addDataScheme("package");
            kkj kkjVar = new kkj(kkiVar);
            applicationContext.registerReceiver(kkjVar, intentFilter);
            kkjVar.a = applicationContext;
            if (khw.e(applicationContext)) {
                return;
            }
            kkiVar.a();
            kkjVar.a();
        }
    }
}
