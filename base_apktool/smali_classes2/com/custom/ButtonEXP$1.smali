.class Lcom/custom/ButtonEXP$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/ButtonEXP;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/custom/ButtonEXP;


# direct methods
.method constructor <init>(Lcom/custom/ButtonEXP;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/ButtonEXP$1;->this$0:Lcom/custom/ButtonEXP;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    sget v2, Lcom/custom/ButtonEXP;->SelState:I

    add-int/lit8 v2, v2, 0x1

    rem-int/lit8 v2, v2, 0x2

    sput v2, Lcom/custom/ButtonEXP;->SelState:I

    const-string v1, "auto_exp_key"

    invoke-static {v1, v2}, Lcom/Helper;->setValue(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v3, p0, Lcom/custom/ButtonEXP$1;->this$0:Lcom/custom/ButtonEXP;

    invoke-virtual {v3, v0}, Lcom/custom/ButtonEXP;->UpdateUi(Landroid/content/Context;)V

    return-void
.end method
