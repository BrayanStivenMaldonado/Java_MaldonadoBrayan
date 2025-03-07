package ej2;

//En este ejemplo se está incumpliendo el primer pilar de SOLID (SRP)
//ya que la clase AuditTransfMonet lleva a cabo más de una responsabilidad
//como realizar la auditoria y enviar el email de notificación 
//por lo cual se crea una clase separada para que cada una realice una acción por separado.

public class AuditTransfMonet {
    
    private NotificarTransferencia notificarTransferencia; 

    public AuditTransfMonet(NotificarTransferencia notificarTransferencia) {
        this.notificarTransferencia = notificarTransferencia;
    }
    	public void transferenciaRealizada(Transferencia transferencia) {
        if(this.esTransferenciaImportante(transferencia)) {
            String auditor=this.obtenerDireccionMailAuditor();
            String mensaje=this.componerMensajeAviso(transferencia);
            
            notificarTransferencia.EnviarEmail(auditor, mensaje);     
        }
    }
    private boolean esTransferenciaImportante(Transferencia transferencia) {
       return transferencia.importe()>50000;
    }
    private String obtenerDireccionMailAuditor() {
       return "mail-auditor";
    }
    private String componerMensajeAviso(Transferencia transferencia) {
       return "aviso-transferencia-importante";    
    }
}