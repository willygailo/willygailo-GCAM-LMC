.class LMC/UI/Button/LDR$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LMC/UI/Button/LDR;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:LMC/UI/Button/LDR;


# direct methods
.method constructor <init>(LMC/UI/Button/LDR;)V
    .locals 0

    iput-object p1, p0, LMC/UI/Button/LDR$1;->this$0:LMC/UI/Button/LDR;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    sget v2, LMC/UI/Button/LDR;->SelState:I

    add-int/lit8 v2, v2, 0x1

    rem-int/lit8 v2, v2, 0x2

    sput v2, LMC/UI/Button/LDR;->SelState:I

    const-string v1, "pref_enable_ldr_key"

    invoke-static {v1, v2}, Lcom/Fix/Pref;->setValue(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LMC/hslh;->HapticFeedback(Landroid/content/Context;)V

    iget-object v3, p0, LMC/UI/Button/LDR$1;->this$0:LMC/UI/Button/LDR;

    invoke-virtual {v3, v0}, LMC/UI/Button/LDR;->UpdateUi(Landroid/content/Context;)V

    return-void
.end method
