.class Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mdmitriev/auxlenses/AuxButtonsLayout;->lambda$initButtons$0$AuxButtonsLayout(Landroid/widget/Button;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mdmitriev/auxlenses/AuxButtonsLayout;


# direct methods
.method constructor <init>(Lcom/mdmitriev/auxlenses/AuxButtonsLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1;->this$0:Lcom/mdmitriev/auxlenses/AuxButtonsLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic lambda$onClick$0$AuxButtonsLayout$1(Landroid/view/View;Landroid/widget/Button;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/widget/Button;->getId()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    if-ne v0, p1, :cond_1

    iget-object p0, p0, Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1;->this$0:Lcom/mdmitriev/auxlenses/AuxButtonsLayout;

    invoke-virtual {p0, v0}, Lcom/mdmitriev/auxlenses/AuxButtonsLayout;->activateButton(I)V

    invoke-static {}, Lcom/Helper;->onRestart()V

    :cond_1
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1;->this$0:Lcom/mdmitriev/auxlenses/AuxButtonsLayout;

    iget-object v0, v0, Lcom/mdmitriev/auxlenses/AuxButtonsLayout;->buttons:Ljava/util/List;

    new-instance v1, Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1$$Lambda$0;

    invoke-direct {v1, p0, p1}, Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1$$Lambda$0;-><init>(Lcom/mdmitriev/auxlenses/AuxButtonsLayout$1;Landroid/view/View;)V

    invoke-interface {v0, v1}, Ljava/util/List;->forEach(Ljava/util/function/Consumer;)V

    return-void
.end method
