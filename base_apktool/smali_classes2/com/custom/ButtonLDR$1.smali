.class Lcom/custom/ButtonLDR$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/ButtonLDR;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/custom/ButtonLDR;


# direct methods
.method constructor <init>(Lcom/custom/ButtonLDR;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/ButtonLDR$1;->this$0:Lcom/custom/ButtonLDR;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 6

    sget v2, Lcom/custom/ButtonLDR;->SelState:I

    add-int/lit8 v2, v2, 0x1

    rem-int/lit8 v2, v2, 0x2

    sput v2, Lcom/custom/ButtonLDR;->SelState:I

    const-string v1, "pref_enable_ldr_key"

    invoke-static {v1, v2}, Lcom/Helper;->setValue(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v3, p0, Lcom/custom/ButtonLDR$1;->this$0:Lcom/custom/ButtonLDR;

    invoke-virtual {v3, v0}, Lcom/custom/ButtonLDR;->UpdateUi(Landroid/content/Context;)V

    return-void
.end method
