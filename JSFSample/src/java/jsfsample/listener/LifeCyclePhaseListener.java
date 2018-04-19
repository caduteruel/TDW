package jsfsample.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCyclePhaseListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent pe) {
        System.out.println("AFTER: "+pe.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent pe) {
        System.out.println("BEFORE: "+pe.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE; 
    }
    
}
