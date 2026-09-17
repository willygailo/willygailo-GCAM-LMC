.class Lcom/custom/ButtonPAT$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/custom/ButtonPAT;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/custom/ButtonPAT;


# direct methods
.method constructor <init>(Lcom/custom/ButtonPAT;)V
    .locals 0

    iput-object p1, p0, Lcom/custom/ButtonPAT$2;->this$1:Lcom/custom/ButtonPAT;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    invoke-static {}, Lcom/Helper;->onRestart()V

    return-void
.end method
