.class final Lcom/longtap/aftime/switch$1;
.super Ljava/lang/Object;
.source "switch.java"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/longtap/aftime/switch;->setLongClickListener(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field private final this$0:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/longtap/aftime/switch$1;->this$0:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public getKeyValue(Ljava/lang/String;)I
    .locals 3

    iget-object v0, p0, Lcom/longtap/aftime/switch$1;->this$0:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :goto_0
    return v1
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 5

    const/4 v4, 0x1

    iget-object v1, p0, Lcom/longtap/aftime/switch$1;->this$0:Landroid/content/Context;

    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    sget v4, Lcom/Helper;->sFront:I

    if-eqz v4, :cond_0

    const-string v2, "Autofocus lock time"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v3, "pref_focus_lock_time_key"

    invoke-virtual {p0, v3}, Lcom/longtap/aftime/switch$1;->getKeyValue(Ljava/lang/String;)I

    move-result v2

    new-instance v3, Lcom/longtap/aftime/switch$2;

    invoke-direct {v3, v1}, Lcom/longtap/aftime/switch$2;-><init>(Landroid/content/Context;)V

    const v4, 0x7f03004b

    :goto_0
    invoke-virtual {v0, v4, v2, v3}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems(IILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v4, 0x7f1400d4

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    const/4 v4, 0x1

    return v4

    :cond_0
    const-string v2, "Autofocus lock time"

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v3, "pref_focus_lock_time_key"

    invoke-static {v3}, Lcom/SDE/LensValue;->SetLensValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/longtap/aftime/switch$1;->getKeyValue(Ljava/lang/String;)I

    move-result v2

    new-instance v3, Lcom/longtap/aftime/switch$2;

    invoke-direct {v3, v1}, Lcom/longtap/aftime/switch$2;-><init>(Landroid/content/Context;)V

    const v4, 0x7f03004b

    goto :goto_0
.end method
